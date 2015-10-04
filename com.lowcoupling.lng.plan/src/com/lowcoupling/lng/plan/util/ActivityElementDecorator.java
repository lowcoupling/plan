package com.lowcoupling.lng.plan.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.osgi.service.prefs.Preferences;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.emf.ecore.EObject;

import com.lowcoupling.lng.plan.plan.Activity;
import com.lowcoupling.lng.plan.plan.ActivityElement;
import com.lowcoupling.lng.plan.plan.ActivityGroup;
import com.lowcoupling.lng.plan.plan.CheckPoint;
import com.lowcoupling.lng.plan.plan.Project;
import com.lowcoupling.lng.plan.validation.PlanJavaValidator;

public class ActivityElementDecorator {

	private ActivityElement element;
	
	public ActivityElement getActivityElement(){
		return element;
	}
	public ActivityElementDecorator(ActivityElement activity){
		this.element = activity;

	}
	
//	public String getName(){
//		if (element.getLongName()!=""){
//			return element.getLongName();
//		}else{
//			return element.getName();
//		}
//	}

	public String getFullQualifiedName(){
		EObject container = element.eContainer();
		String qualifiedName=element.getName();;
		while ( !(container instanceof Project) && (container !=null)){
			if(container instanceof ActivityGroup){
				qualifiedName= ((ActivityGroup)container).getName()+"."+qualifiedName;
			}
			container = container.eContainer();
		}
		if (container instanceof Project){
			qualifiedName= ((Project)container).getName()+"."+qualifiedName;
			//Collection<Project> plans = PlanUtil.getInstance().getRelatedPlans((Project)container);
		}
		return qualifiedName;
	}
	public Calendar getStartByCalendar(){
		Calendar start = GregorianCalendar.getInstance();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		if (element instanceof Activity){
			Activity activity = (Activity)element;
			if(activity.getStart()!=null){
				try {
					start.setTime(formatter.parse(activity.getStart()));
				} catch (ParseException e) {
					e.printStackTrace();
				}	
			}else{
				PlanJavaValidator validator = new PlanJavaValidator();
				if (validator.checkForLoops(activity)) return null;
				start = (new ActivityElementDecorator((ActivityElement)activity.getAfter())).getEndByCalendar();
				start.add(Calendar.DAY_OF_MONTH, activity.getOffset());
			}
		}else if (element instanceof ActivityGroup){
			ActivityGroup group  = (ActivityGroup)element;
			ActivityGroupDecorator dec = new ActivityGroupDecorator(group);
			start = (new ActivityElementDecorator(dec.getFirstActivity())).getStartByCalendar();
		}else if (element instanceof CheckPoint){
			CheckPoint checkpoint = (CheckPoint)element;
			if(checkpoint.getEnd()!=null){
			try {
				start.setTime(formatter.parse(checkpoint.getEnd()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}else{
				PlanJavaValidator validator = new PlanJavaValidator();
				if (validator.checkForLoops(checkpoint)) return null;
				start = (new ActivityElementDecorator((ActivityElement)checkpoint.getAfter())).getEndByCalendar();
				start.add(Calendar.DAY_OF_MONTH, checkpoint.getOffset());
			}
		}
		return start;
	}
	public Calendar getEndByCalendar(){
		Calendar start = this.getStartByCalendar();
		Calendar end = GregorianCalendar.getInstance();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		if (element instanceof Activity){
			Activity activity = (Activity)element;
		try {
			if (activity.getEnd()!=null){
				end.setTime(formatter.parse(activity.getEnd()));
			}else{
				end.setTime(start.getTime());
				addWorkingDays(end,activity.getDuration()-1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		}else if (element instanceof ActivityGroup){
			ActivityGroup group  = (ActivityGroup)element; 
			ActivityGroupDecorator dec = new ActivityGroupDecorator(group);
			end = (new ActivityElementDecorator(dec.getLastActivity())).getEndByCalendar();
		
		}else if (element instanceof CheckPoint){
			CheckPoint checkpoint = (CheckPoint)element;
			if(checkpoint.getEnd()!=null){
			try {
				end.setTime(formatter.parse(checkpoint.getEnd()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}else{
					PlanJavaValidator validator = new PlanJavaValidator();
					if (validator.checkForLoops(checkpoint)) return null;
					end = (new ActivityElementDecorator((ActivityElement)checkpoint.getAfter())).getEndByCalendar();
					end.add(Calendar.DAY_OF_MONTH, checkpoint.getOffset());
				}
		}
		return end;
	}

	public Calendar addWorkingDays(Calendar start, int days){
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
		Preferences preferences = (Preferences) ConfigurationScope.INSTANCE.getNode("org.mdpm.lng.plan.preferences");
		boolean sundayWorking = !preferences.getBoolean("sunday",true);
		boolean mondayWorking = !preferences.getBoolean("monday",false);
		boolean tuesdayWorking = !preferences.getBoolean("tuesday",false);
		boolean wednesdayWorking = !preferences.getBoolean("wednesday",false);
		boolean thursdayWorking = !preferences.getBoolean("thursday",false);
		boolean fridayWorking = !preferences.getBoolean("friday",false);
		boolean saturdayWorking = !preferences.getBoolean("saturday",true);
		while(days>0){
			start.add(Calendar.DATE, 1);
			boolean extraNonWorkingDay = false;
			String datesStr = preferences.get("dates","");
			String[] datesArray = datesStr.split(",");
			for (int k=0; k<datesArray.length; k++){
				if(!datesArray[k].equals("")){
					Calendar nwd = GregorianCalendar.getInstance(); 
					try {
						nwd.setTime(formatter.parse(datesArray[k]));
					} catch (ParseException e) {
						e.printStackTrace();
					}
					if (start.getTime().equals(nwd.getTime())){
						//System.out.println("##");
						extraNonWorkingDay=true;
						continue;
					}
				}
			}
			if(!extraNonWorkingDay){
				int wd = start.get(Calendar.DAY_OF_WEEK);
				if ((wd==Calendar.SUNDAY) && sundayWorking)days=days-1;
				if ((wd==Calendar.MONDAY) && mondayWorking) days=days-1;
				if ((wd==Calendar.TUESDAY) && tuesdayWorking) days=days-1;
				if ((wd==Calendar.WEDNESDAY) && wednesdayWorking) days=days-1;
				if ((wd==Calendar.THURSDAY) && thursdayWorking) days=days-1;
				if ((wd==Calendar.FRIDAY) && fridayWorking) days=days-1;
				if ((wd==Calendar.SATURDAY) && saturdayWorking) days=days-1;
			}
		}

		return start;
	}

	 

 
	 

	 
	public String getStart() {
		if (element instanceof Activity){
			return ((Activity)element).getStart();
		}
		else if (element instanceof ActivityGroup){
			ActivityGroup group  = (ActivityGroup)element;
		}else if (element instanceof CheckPoint){
			CheckPoint checkpoint = (CheckPoint)element;
			return checkpoint.getEnd();
			
		}
		return "";
	}

 

	public String getEnd() {
		if (element instanceof Activity){
			return ((Activity)element).getEnd();
		}
		else if (element instanceof ActivityGroup){
			ActivityGroup group  = (ActivityGroup)element;
		}else if (element instanceof CheckPoint){
			CheckPoint checkpoint = (CheckPoint)element;
			return checkpoint.getEnd();
			
		}
		return "";
	}

	 

	 

	 

	 
 
	 
}
