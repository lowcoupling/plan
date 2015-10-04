package com.lowcoupling.lng.plan.ui.preferences;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class NWDays extends PreferencePage implements IWorkbenchPreferencePage {

	class DateSelectionAdapter extends SelectionAdapter{
		public String dateString;
		public DateTime calendar;
		private Shell shell;
		public DateSelectionAdapter(DateTime _calendar, Shell _shell){
			calendar =_calendar;
			shell = _shell;
		}
		public void widgetSelected (SelectionEvent e) {
			dateString = "'"+calendar.getDay()+"/"+calendar.getMonth()+1+"/"+calendar.getYear()+"'";
			shell.dispose();
		}
	}
	
	class AddDateSelection extends SelectionAdapter{
		List dateList;
		public AddDateSelection(List list){
			dateList = list;
		}
		@Override
		public void widgetSelected(SelectionEvent e) {
			//Display display  = Display.getCurrent();
			IWorkbench workbench    = PlatformUI.getWorkbench();
			IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			Shell ns  = window.getShell();
			CalendarDialog dg = new CalendarDialog(ns);
			dg.create();
			if (dg.open() == Window.OK) {
			if(!dg.getDateString().equals("")){
				dateList.add(dg.getDateString());
			}
			}
		}
	}
	
	class RemoveDateSelection extends SelectionAdapter{
		List dateList;
		public RemoveDateSelection(List list){
			dateList = list;
		}
		@Override
		public void widgetSelected(SelectionEvent e) {
			//Display display  = Display.getCurrent();
			dateList.remove(dateList.getSelectionCount()-1);
		}
	}
	
	private Button sunday;
	private Button monday;
	private Button tuesday;
	private Button wednesday;
	private Button thursday;
	private Button friday;
	private Button saturday;
	private List dates;
	
	
	public NWDays() {
	}

	public NWDays(String title) {
		super(title);
	}

	public NWDays(String title, ImageDescriptor image) {
		super(title, image);
	}

	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout compositeLayout = new GridLayout();
		compositeLayout.numColumns = 4;
		compositeLayout.horizontalSpacing = 30;
		compositeLayout.verticalSpacing = 10;
		compositeLayout.marginHeight = 10;
		compositeLayout.marginWidth = 30;
		composite.setLayout(compositeLayout);
		GridData compositeData = new GridData(GridData.FILL);
		compositeData.grabExcessHorizontalSpace = false;
		composite.setLayoutData(compositeData);
		
		
		Preferences preferences = ConfigurationScope.INSTANCE.getNode("org.mdpm.lng.plan.preferences");
		 
		Label lb = new Label(composite, SWT.BORDER);
		 lb.setText("Please check the non working days of the week");
		 GridData oneElementData = new GridData();
		 oneElementData.horizontalSpan = 4;
		 oneElementData.verticalSpan = 1;
		 oneElementData.horizontalAlignment = SWT.FILL;
		 oneElementData.grabExcessHorizontalSpace = false;
		 oneElementData.verticalAlignment = SWT.FILL;
		 oneElementData.grabExcessVerticalSpace = false;
		 lb.setLayoutData(oneElementData);	
		 
		 sunday = new Button(composite, SWT.CHECK);
		 sunday.setText("Sunday");
		 sunday.setSelection(preferences.getBoolean("sunday", true));
		  
		 monday = new Button(composite, SWT.CHECK);
		 monday.setText("Monday");
		 monday.setSelection(preferences.getBoolean("monday", false));
				
		 tuesday = new Button(composite, SWT.CHECK);
		 tuesday.setText("Tuesday");
		 tuesday.setSelection(preferences.getBoolean("tuesday", false));
				
		 wednesday = new Button(composite, SWT.CHECK);
		 wednesday.setText("Wednesday");
		 wednesday.setSelection(preferences.getBoolean("wednesday", false));
		
				
		 thursday = new Button(composite, SWT.CHECK);
		 thursday.setText("Thursday");
		 thursday.setSelection(preferences.getBoolean("thursday", false));
				
		 friday = new Button(composite, SWT.CHECK);
		 friday.setText("Friday");
		 friday.setSelection(preferences.getBoolean("friday", false));
			
		 saturday = new Button(composite, SWT.CHECK);
		 saturday.setText("Saturday");
		 saturday.setSelection(preferences.getBoolean("saturday", true));
			
		 
		//  list.setBounds (list.getLocation().x+100, list.getLocation().y, 200, 100);
		 lb = new Label(composite, SWT.BORDER);
		 lb.setText("Please choose extra non working days of the year");
		 lb.setLayoutData(oneElementData);
		 
		 GridData listData = new GridData();
		 listData.horizontalSpan = 3;
		 listData.verticalSpan = 10;
		 listData.horizontalAlignment = SWT.FILL;
		 listData.grabExcessHorizontalSpace = false;
		 listData.verticalAlignment = SWT.FILL;
		 dates = new List (composite, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		 dates.setBounds(100,100,300,150);
		 dates.setLayoutData(listData);
		 String datesStr = preferences.get("dates","");
		 String[] datesArray = datesStr.split(",");
		 for (int k=0; k<datesArray.length; k++){
			 if(!datesArray[k].equals(""))
			 dates.add(datesArray[k]);
		 }
		 
		 Button bt = new Button(composite,SWT.PUSH);
		 bt.addSelectionListener(new AddDateSelection(dates));
		 
		 bt.setText(" Add  ");
		 bt = new Button(composite,SWT.PUSH);
		 bt.setText("Remove");
		 bt.addSelectionListener(new RemoveDateSelection(dates));
		return composite;
	}
	
	@Override
	public boolean performOk() {
		Preferences preferences = ConfigurationScope.INSTANCE.getNode("org.mdpm.lng.plan.preferences");
		preferences.putBoolean("sunday", sunday.getSelection());
		preferences.putBoolean("monday", monday.getSelection());
		preferences.putBoolean("tuesday", tuesday.getSelection());
		preferences.putBoolean("wednesday", wednesday.getSelection());
		preferences.putBoolean("thursday", thursday.getSelection());
		preferences.putBoolean("friday", friday.getSelection());
		preferences.putBoolean("saturday", saturday.getSelection());
		String tmp="";
		if(dates.getItemCount()>0){
		for (int k=0; k<dates.getItemCount();k++){
			tmp = tmp+dates.getItem(k)+",";
		}
		}
	    preferences.put("dates",tmp);
		//preferences.put
		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		return super.performOk();
	}

}
