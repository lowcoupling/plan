package com.lowcoupling.plan.ui.ganttview.views;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.nebula.widgets.ganttchart.DefaultSettings;
import org.eclipse.nebula.widgets.ganttchart.GanttChart;
import org.eclipse.nebula.widgets.ganttchart.GanttEvent;
import org.eclipse.nebula.widgets.ganttchart.GanttSection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.CheckMode;
import org.osgi.framework.Bundle;

import com.lowcoupling.mdpm.commons.util.PlanUtil;
import com.lowcoupling.lng.plan.plan.Activity;
import com.lowcoupling.lng.plan.plan.ActivityElement;
import com.lowcoupling.lng.plan.plan.ActivityGroup;
import com.lowcoupling.lng.plan.plan.CheckPoint;
import com.lowcoupling.lng.plan.plan.Program;
import com.lowcoupling.lng.plan.plan.Project;
import com.lowcoupling.lng.plan.util.ActivityElementDecorator;
import com.lowcoupling.lng.plan.validation.PlanJavaValidator;

public class GanttView extends ViewPart implements ISelectionListener{

	public static final String ID = "com.lowcoupling.plan.ui.ganttview.views.GanttView";
	private GanttChart ganttChart = null;
	private XtextEditor editor;
	private Action zoomIn, zoomOut, export;



	public XtextEditor getEditor() {
		return editor;
	}

	/**
	 * The constructor.
	 */
	public GanttView() {
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().removeSelectionListener(this);

	}

	public void createPartControl(Composite parent) {
		DefaultSettings settings = new DefaultSettings(){@Override
			public boolean drawGanttSectionBarToBottom() {
			return true;
		}    @Override
		public final boolean drawFillsToBottomWhenUsingGanttSections() {
			return true;
		}};

		ganttChart = new GanttChart(parent, SWT.MULTI, settings);
		ganttChart.addGanttEventListener(new GanttEventListener());
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().addSelectionListener(this);
		ganttChart.getGanttComposite().addMouseWheelListener(new GanttMouseListener(ganttChart));	
		EObject eobject= null;
		IEditorPart ie = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		editor = (XtextEditor)ie;
		if(editor==null){
			System.out.println("null editor");
		}else{
			eobject = editor.getDocument().readOnly(
					new IUnitOfWork<EObject, XtextResource>() {
						public EObject exec(XtextResource resource) throws Exception {

							EObject eObject = resource.getContents().get(0);
							return eObject;
						}
					});
		}
		createActions();
		createToolBar();


		if (eobject instanceof Program){
			//System.out.println("Program selected");
			Program plans = (Program)eobject;	
			Collection<Project> projects = new ArrayList<Project> ();
			projects.addAll(plans.getReferencedProjects());
			projects.addAll(plans.getProjects());
			LinkedHashMap<String,GanttEvent> eventsMap= updateContents(projects);
			Activity fact= PlanUtil.getInstance().getFirstActivity((Program)eobject, true);
			ActivityElementDecorator dec= new ActivityElementDecorator(fact);
			GanttEvent evt = eventsMap.get(dec.getFullQualifiedName());
			if(evt!=null) ganttChart.getGanttComposite().jumpToEvent(evt, true, 0);

		}

		if (eobject instanceof Project){
			Collection<Project> plans = PlanUtil.getInstance().getRelatedPlans((Project)eobject);
			LinkedHashMap<String,GanttEvent> eventsMap= updateContents(plans);
			//eventsMap.get((new ActivityElementDecorator( 
			Activity fact= PlanUtil.getInstance().getFirstActivity((Project)eobject, true);
			ActivityElementDecorator dec= new ActivityElementDecorator(fact);
			GanttEvent evt = eventsMap.get(dec.getFullQualifiedName());
			if(evt!=null) ganttChart.getGanttComposite().jumpToEvent(evt, true, 0);

		}

		if (eobject instanceof ActivityGroup){
			ActivityGroup group = (ActivityGroup)eobject;
		}
		if (eobject instanceof ActivityElement){
			ActivityElement element = (ActivityElement)eobject;
			String qualifiedName =(new ActivityElementDecorator(element)).getFullQualifiedName();

			//System.out.println("==>selected "+qualifiedName);
			Collection<Project> plans = PlanUtil.getInstance().getRelatedPlans(PlanUtil.getInstance().getPlan(element));
			LinkedHashMap<String,GanttEvent> eventsMap = updateContents(plans);
			GanttEvent event= eventsMap.get(qualifiedName);
			if(event==null){
				//System.out.println("QUALIFIED NAME "+qualifiedName);
			}
			//ganttChart.getGanttComposite().showEvent(event, SWT.CENTER);
			event.setStatusColor(new org.eclipse.swt.graphics.Color(Display.getCurrent(),0,0,200));

		}
	}

	public LinkedHashMap<String,GanttEvent> updateContents(Collection<Project> plans){
		ganttChart.getGanttComposite().clearChart();
		LinkedHashMap<String,GanttEvent> eventsMap = new LinkedHashMap<String, GanttEvent>();
		Iterator<Project> planIterator = plans.iterator();
		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			EList<ActivityElement> activities = plan.getActivities();
			handlePlan(plan,activities,eventsMap);
		}
		planIterator  = plans.iterator();
		//it does it again to manage all the dependencies among plans
		//in this way also cross plans dependencies can be take into account
		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			EList<ActivityElement> activities = plan.getActivities();
			handleDependencies(plan,activities,eventsMap,null);
		}
		return eventsMap;
	}

	public GanttEvent handleActivity(ActivityElement element, Project plan, GanttSection gs, String qualifiedName, LinkedHashMap<String,GanttEvent>tmpEventsMap){
		GanttEvent evt = null;
		if(element instanceof Activity){	
			Activity act = (Activity)element;
			ActivityElementDecorator activity  = new ActivityElementDecorator(act);
			Calendar start = activity.getStartByCalendar();
			Calendar end = activity.getEndByCalendar();
			String name="";
			if (act.getLongName()!=null){
				name=act.getLongName();
			}else{
				name=act.getName();
			}
			evt= new GanttEvent(ganttChart, name, start, end,act.getCompleteness());	
			gs.addGanttEvent(evt);
			tmpEventsMap.put(qualifiedName+"."+element.getName(), evt);
			//System.out.println("name: "+qualifiedName+"."+element.getName());
		}else if (element instanceof CheckPoint){
			CheckPoint checkPoint = (CheckPoint)element;
			Calendar start = GregorianCalendar.getInstance();
			String name="";
			if (checkPoint.getLongName()!=null){
				name=checkPoint.getLongName();
			}else{
				name=checkPoint.getName();
			}
			start = (new ActivityElementDecorator(element)).getStartByCalendar();
			Calendar end = GregorianCalendar.getInstance();
			end = (new ActivityElementDecorator(element)).getEndByCalendar();
			evt= new GanttEvent(ganttChart, name, start, end, checkPoint.getCompleteness());
			evt.setCheckpoint(true);
			gs.addGanttEvent(evt);
			tmpEventsMap.put(qualifiedName+"."+element.getName(), evt);
			//System.out.println("name: "+qualifiedName+"."+element.getName());
		}else if (element instanceof ActivityGroup){
			ActivityGroup group = (ActivityGroup)element;
			String name="";
			if (group.getLongName()!=null){
				name=group.getLongName();
			}else{
				name=group.getName();
			}
			GanttEvent scope = new GanttEvent(ganttChart,name);
			Iterator<ActivityElement>activityIterator = group.getActivities().iterator();
			tmpEventsMap.put(qualifiedName+"."+scope.getName(), scope);
			//System.out.println("name: "+qualifiedName+"."+scope.getName());
			gs.addGanttEvent(scope);
			qualifiedName= qualifiedName+"."+scope.getName();
			while(activityIterator.hasNext()){
				ActivityElement activity = activityIterator.next();
				GanttEvent innerEvent = handleActivity(activity,plan,gs,qualifiedName,tmpEventsMap);
				if(innerEvent!=null){
					if(scope!=null){
						scope.addScopeEvent(innerEvent);
					}else{
					}
				}else{
				}
			}

			return scope;

		}
		return evt;
	}
	public void handlePlan(Project plan,EList<ActivityElement> activities, LinkedHashMap<String,GanttEvent>eventsMap){
		PlanJavaValidator validator = new PlanJavaValidator();
		Iterator<EObject> contents = plan.eAllContents();
		while(contents.hasNext()){
			EObject element = (EObject) contents.next();
			if (element instanceof ActivityGroup){
				if (validator.checkNestedGroups((ActivityGroup)element)){
					return;
				}
			}
			if (element instanceof ActivityElement){
				if (validator.checkForLoops((ActivityElement)element)){
					return;
				}
			}
		}
		contents = plan.eAllContents();
		Iterator<ActivityElement> activityIterator = activities.iterator();
		String name ="";
		if (plan.getLongName()!=null){
			name = plan.getLongName();
		}else{
			name = plan.getName();
		}
		GanttSection gs = new GanttSection(ganttChart, name);
		LinkedHashMap<String,GanttEvent> tmpEventsMap = new LinkedHashMap<String, GanttEvent>();
		while(activityIterator.hasNext()){
			ActivityElement element = activityIterator.next();
			GanttEvent evt = handleActivity(element,plan,gs,plan.getName(),tmpEventsMap);
		}
		Iterator<GanttEvent> events  = tmpEventsMap.values().iterator();
		eventsMap.putAll(tmpEventsMap);

	}

	private void handleDependencies(Project plan,EList<ActivityElement> activities, LinkedHashMap<String,GanttEvent>eventsMap,GanttEvent scope){
		Iterator<ActivityElement> activityIterator = activities.iterator();
		while(activityIterator.hasNext()){
			ActivityElement element = activityIterator.next();
			Iterator<ActivityElement> dependencies=element.getDependencies().iterator();
			EObject container = element.eContainer();
			String elementQualifiedName=element.getName();;
			while ( !(container instanceof Project) && (container !=null)){
				if(container instanceof ActivityGroup){
					elementQualifiedName= ((ActivityGroup)container).getName()+"."+elementQualifiedName;
				}
				container = container.eContainer();
			}
			if (container instanceof Project){
				elementQualifiedName= ((Project)container).getName()+"."+elementQualifiedName;
			}
			while(dependencies.hasNext()){
				ActivityElement dependency = (ActivityElement) dependencies.next();
				container = dependency.eContainer();
				String dependencyQualifiedName=dependency.getName();;
				while ( !(container instanceof Project) && (container !=null)){
					if(container instanceof ActivityGroup){
						dependencyQualifiedName= ((ActivityGroup)container).getName()+"."+dependencyQualifiedName;
					}
					container = container.eContainer();
				}
				if (container instanceof Project){
					dependencyQualifiedName= ((Project)container).getName()+"."+dependencyQualifiedName;
				}

				GanttEvent targetEvent = (GanttEvent) eventsMap.get(dependencyQualifiedName);
				if(targetEvent!=null){
					GanttEvent dependentEvent = eventsMap.get(elementQualifiedName);
					ganttChart.addConnection(targetEvent, dependentEvent);
				}
			}
			if (element instanceof ActivityGroup){
				handleDependencies(plan,((ActivityGroup)element).getActivities(),eventsMap,scope);
			}
		}
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		ganttChart.getGanttComposite().setFocus();
	}


	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		EObject eobject = null;
		if(selection != null && !selection.isEmpty()){

			if (selection instanceof ITextSelection){
				final ITextSelection textSel = (ITextSelection) selection;
				IEditorPart ie = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				editor = (XtextEditor)ie;
				if(editor==null){
					System.out.println("null editor");
				}else{

					eobject = editor.getDocument().readOnly(
							new IUnitOfWork<EObject, XtextResource>() {
								public EObject exec(XtextResource resource) throws Exception {
									EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();
									EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, textSel.getOffset());
									return eObject;
								}
							});
				}
			}
			//System.out.println("eobject "+eobject.getClass().getName());
			if (selection instanceof IStructuredSelection) {
				Object first = ((IStructuredSelection)selection).getFirstElement();
				if (first!=null && first instanceof EObjectNode){
					EObjectNode enode = (EObjectNode)first;
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource inResource = resourceSet.getResource(enode.getEObjectURI(),true);
					//System.out.println(inResource);
					eobject = (EObject)inResource.getEObject(enode.getEObjectURI().fragment());
				}
			}
			if (eobject instanceof Program){
				//System.out.println("Program selected");
				Program plans = (Program)eobject;	
				Collection<Project> projects = new ArrayList<Project> ();
				projects.addAll(plans.getReferencedProjects());
				projects.addAll(plans.getProjects());
				updateContents(projects);
			}

			if (eobject instanceof Project){
				Collection<Project> plans = PlanUtil.getInstance().getRelatedPlans((Project)eobject);
				updateContents(plans);
			}

			if (eobject instanceof ActivityGroup){
				@SuppressWarnings("unused")
				ActivityGroup group = (ActivityGroup)eobject;

			}
			if (eobject instanceof ActivityElement){
				ActivityElement element = (ActivityElement)eobject;
				String qualifiedName =(new ActivityElementDecorator(element)).getFullQualifiedName();

				//System.out.println("==>selected "+qualifiedName);
				Collection<Project> plans = PlanUtil.getInstance().getRelatedPlans(PlanUtil.getInstance().getPlan(element));
				LinkedHashMap<String,GanttEvent> eventsMap = updateContents(plans);
				GanttEvent event= eventsMap.get(qualifiedName);
				if(event==null){
					//System.out.println("QUALIFIED NAME "+qualifiedName);
				}
				//ganttChart.getGanttComposite().showEvent(event, SWT.CENTER);
				event.setStatusColor(new org.eclipse.swt.graphics.Color(Display.getCurrent(),0,0,200));

			}

		}
		ganttChart.getGanttComposite().jumpToEarliestEvent();
	}



	class GanttMouseListener implements MouseWheelListener{
		private GanttChart ganttChart;
		public GanttMouseListener(GanttChart gantt){
			ganttChart= gantt;
		}
		@Override
		public void mouseScrolled(MouseEvent e) {
			// TODO Auto-generated method stub
			if(ganttChart!=null){
				if(e.count>0){
					ganttChart.getGanttComposite().zoomIn();
				}else{
					ganttChart.getGanttComposite().zoomOut();
				}
			}
		}

	}
	class ZoomInAction extends Action{
		private GanttChart  ganttChart;
		public ZoomInAction(GanttChart gantt){

			super("Zoom in");
			Bundle bundle = Platform.getBundle("com.lowcoupling.plan.commons");
			Path path = new Path("icons/zoomIn.png");
			URL fileURL = FileLocator.find(bundle, path, null);
			ImageDescriptor img = ImageDescriptor.createFromURL(fileURL);
			this.setImageDescriptor(img);
			this.ganttChart = gantt;
		}
		public void run() { 
			ganttChart.getGanttComposite().zoomIn();
		}
	}
	class ZoomOutAction extends Action{
		private GanttChart  ganttChart;
		public ZoomOutAction(GanttChart gantt){
			super("Zoom out");
			Bundle bundle = Platform.getBundle("com.lowcoupling.plan.commons");
			Path path = new Path("icons/zoomOut.png");
			URL fileURL = FileLocator.find(bundle, path, null);
			ImageDescriptor img = ImageDescriptor.createFromURL(fileURL);
			this.setImageDescriptor(img);
			this.ganttChart = gantt;
		}
		public void run() { 
			ganttChart.getGanttComposite().zoomOut();
		}
	}

	class ExportAction extends Action{
		private GanttChart  ganttChart;
		public ExportAction(GanttChart gantt){
			super("Export");
			Bundle bundle = Platform.getBundle("com.lowcoupling.plan.commons");
			Path path = new Path("icons/export.gif");
			URL fileURL = FileLocator.find(bundle, path, null);
			ImageDescriptor img = ImageDescriptor.createFromURL(fileURL);
			this.setImageDescriptor(img); 
			this.ganttChart = gantt;
		}
		public void run() { 
			//new Rectangle(0,0,640,480)
			Image img = ganttChart.getGanttComposite().getImage();
			FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell(),SWT.SAVE);
			// Set the text
			fileDialog.setText("Select File");
			// Set filter on .txt files
			fileDialog.setFilterExtensions(new String[] { "*.png" });
			// Put in a readable name for the filter
			// fileDialog.setFilterNames(new String[] { "Textfiles(*.txt)" });
			// Open Dialog and save result of selection
			String selected = fileDialog.open();
			//System.out.println("SELECTED: "+selected);
			ImageLoader loader = new ImageLoader();
			loader.data = new ImageData[] {img.getImageData()};
			loader.save(selected, SWT.IMAGE_PNG);

		}
	}

	private void createActions() {
		zoomIn = new ZoomInAction(ganttChart);
		zoomOut = new ZoomOutAction(ganttChart);
		export = new ExportAction(ganttChart);
	}

	private void createToolBar(){  
		IToolBarManager toolbarMGR = getViewSite().getActionBars().getToolBarManager();  

		toolbarMGR.add(zoomIn);  
		toolbarMGR.add(zoomOut); 
		toolbarMGR.add(export); 

	}
}