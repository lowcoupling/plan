package com.lowcoupling.lng.plan.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class PlanEditor extends XtextEditor {
	class PlanSelectionChangeListener implements ISelectionChangedListener{
		private XtextEditor editor=null;
		public XtextEditor getEditor() {
			return editor;
		}
		public void setEditor(XtextEditor editor) {
			this.editor = editor;
		}
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			ISelection selection = event.getSelection();
			EObject eobject = null;
			if (selection instanceof ITextSelection){
				final ITextSelection textSel = (ITextSelection) selection;
				IEditorPart ie = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				editor = (XtextEditor)ie;
				if(editor==null){
					System.out.println("null editor");
				}else{
			    /*      
				eobject = editor.getDocument().readOnly(
						 new IUnitOfWork<EObject, XtextResource>() {
			                    public EObject exec(XtextResource resource) throws Exception {
			                    	EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();
			                        EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, textSel.getOffset());
			                        //System.out.println("XXX "+eObject.getClass().getName());
			     
			                       return eObject;
			                    }
			        });
			    */
				//System.out.println(">>> Select Object: "+eobject.getClass().getName());
				}
			}
		}
		  
	  }
	 private PlanSelectionChangeListener listener;

	@SuppressWarnings("restriction")
	
	  @Override
	  public void createPartControl(Composite parent) {
		  super.createPartControl(parent);
			// TODO Auto-generated constructor stub
		    //listener = (ISelectionChangedListener) getEditorSite().getPage().findViewReference("com.lowcoupling.mdpm.lng.plan.ganttview.views.GanttView");
		   listener = new PlanSelectionChangeListener();
		    getSelectionProvider().addSelectionChangedListener(listener);
		    listener.setEditor(this);
	
	    //mylistener = new MySelectionChangeListener(this);
	    //mylistener.install(getSelectionProvider());
	  }

	  @Override
	  public void dispose() {
		listener.setEditor(null);
	   // mylistener.uninstall(getSelectionProvider());
	    super.dispose();
	  }
	}