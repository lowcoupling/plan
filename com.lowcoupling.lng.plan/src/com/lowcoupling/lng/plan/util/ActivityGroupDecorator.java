package com.lowcoupling.lng.plan.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.lowcoupling.lng.plan.plan.Activity;
import com.lowcoupling.lng.plan.plan.ActivityElement;
import com.lowcoupling.lng.plan.plan.ActivityGroup;
import com.lowcoupling.lng.plan.plan.CheckPoint;

public class ActivityGroupDecorator extends ActivityElementDecorator {
	private ActivityGroup group;

	public ActivityGroupDecorator(ActivityGroup group){
		super(group);
		this.group = group;
	}
	public Map<String, ActivityElement> getAllActivities(){
		Iterator<ActivityElement> activities = group.getActivities().iterator();
		LinkedHashMap<String, ActivityElement> activityElements = new LinkedHashMap<String,ActivityElement>();
		while(activities.hasNext()){
			ActivityElement element = (ActivityElement)activities.next();
			if(element instanceof Activity || element instanceof CheckPoint){
				activityElements.put( (new ActivityElementDecorator(element)).getFullQualifiedName(), element);
			}else if( element instanceof ActivityGroup){
				activityElements.putAll((new ActivityGroupDecorator((ActivityGroup)element)).getAllActivities());
			}
		}
		return activityElements;

	}

	public Activity getFirstActivity(){
		Iterator<ActivityElement> activities = getAllActivities().values().iterator();
		ActivityElementDecorator first = null;
		while(activities.hasNext()){
			ActivityElement element = activities.next();
			if (element instanceof Activity){
				Activity act = (Activity)element;
				ActivityElementDecorator activity = new ActivityElementDecorator(act);
				if (first!=null){

					if(activity.getStartByCalendar().before(first.getStart())){
						first = activity;
					}

				}else{
					first = activity;
				}
			}
		}
		return (Activity)first.getActivityElement();
	}
	
	public Activity getLastActivity(){
		//Calendar calendar = GregorianCalendar.getInstance();
		//DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Iterator<ActivityElement> activities = getAllActivities().values().iterator();
		ActivityElementDecorator  last = null;
		while(activities.hasNext()){
			ActivityElement element = activities.next();
			if (element instanceof Activity){
				Activity act = (Activity)element;
				ActivityElementDecorator activity = new ActivityElementDecorator(act);
				if (last!=null){
					if(last.getEndByCalendar().before(activity.getEndByCalendar())){
						last = activity;
					}
				}else{
					last = activity;
				}
			}
		}
		return (Activity)last.getActivityElement();
	}
}
