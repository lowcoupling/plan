package com.lowcoupling.lng.plan.ui.preferences;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Shell;

public class CalendarDialog extends TitleAreaDialog {

	private DateTime calendar;
	private String dateString="";
	public CalendarDialog(Shell ns) {
		super(ns);
	}
	@Override
	 public void create() {
	    super.create();
	    // Set the title
	    setHelpAvailable(false);
	   // setTitle("c");
	  }
	
	@Override
	 protected Control createDialogArea(Composite parent) {
		    //GridLayout layout = new GridLayout();
		    //layout.numColumns = 1;
			Composite composite = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout();
		    layout.numColumns = 2;
		    composite.setLayout(layout);
		  
	        calendar = new DateTime (parent, SWT.CALENDAR);
	    	 // DateSelectionAdapter ds = new DateSelectionAdapter (calendar,ns); 
	    	  //calendar.addSelectionListener(ds);
			return composite;
	    	  
	 }
	@Override
	  protected void createButtonsForButtonBar(Composite parent) {
		 GridData gridData = new GridData();
		    gridData.verticalAlignment = GridData.FILL;
		    gridData.horizontalSpan = 3;
		    gridData.grabExcessHorizontalSpace = true;
		    gridData.grabExcessVerticalSpace = true;
		    gridData.horizontalAlignment = SWT.CENTER;

		    parent.setLayoutData(gridData);
		    // Create Add button
		    // Own method as we need to overview the SelectionAdapter
		    createOkButton(parent, OK, "Add", true);
		    // Add a SelectionListener

		    // Create Cancel button
		    Button cancelButton = 
		        createButton(parent, CANCEL, "Cancel", false);
		    // Add a SelectionListener
		    cancelButton.addSelectionListener(new SelectionAdapter() {
		      public void widgetSelected(SelectionEvent e) {
		        setReturnCode(CANCEL);
		        close();
		      }
		    });
	}
	
	protected Button createOkButton(Composite parent, int id, 
		      String label,
		      boolean defaultButton) {
		    // increment the number of columns in the button bar
		    ((GridLayout) parent.getLayout()).numColumns++;
		    Button button = new Button(parent, SWT.PUSH);
		    button.setText(label);
		    button.setFont(JFaceResources.getDialogFont());
		    button.setData(new Integer(id));
		    button.addSelectionListener(new SelectionAdapter() {
		      public void widgetSelected(SelectionEvent event) {
		          okPressed();
		       
		      }
		    });
		    if (defaultButton) {
		      Shell shell = parent.getShell();
		      if (shell != null) {
		        shell.setDefaultButton(button);
		      }
		    }
		    setButtonLayoutData(button);
		    return button;
		  }
	
	@Override
	  protected boolean isResizable() {
	    return true;
	  }
	@Override
	protected void okPressed() {
		dateString = calendar.getDay()+"/"+calendar.getMonth()+1+"/"+calendar.getYear();
		
		super.okPressed();
	}
	public String getDateString(){
		return dateString;
	}
}
