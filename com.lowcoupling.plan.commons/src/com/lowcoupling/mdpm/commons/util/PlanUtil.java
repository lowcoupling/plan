package com.lowcoupling.mdpm.commons.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.joda.time.DateTime;
import org.joda.time.Interval;

import com.lowcoupling.lng.plan.plan.Activity;
import com.lowcoupling.lng.plan.plan.ActivityElement;
import com.lowcoupling.lng.plan.plan.ActivityGroup;
import com.lowcoupling.lng.plan.plan.CheckPoint;
import com.lowcoupling.lng.plan.plan.Program;
import com.lowcoupling.lng.plan.plan.Project;
import com.lowcoupling.lng.plan.plan.ResourceInvolvement;
import com.lowcoupling.lng.plan.util.ActivityElementDecorator;
import com.lowcoupling.lng.plan.util.ActivityGroupDecorator;


public class PlanUtil {

	private static PlanUtil instance;
	private PlanUtil(){

	}
	public static PlanUtil getInstance () {
		if (instance==null){
			instance = new PlanUtil();
		}
		return instance;
	}


	/*
	 * it returns a Collection of plans on which the plan passed as parameter depends 
	 */
	public Collection<Project> getRelatedPlans(Project plan){

		Iterator<ActivityElement> activities = plan.getActivities().iterator();
		LinkedHashMap<String, Project> relatedPlans = new LinkedHashMap<String,Project>();
		//System.out.println("Retrieving plans for "+plan.getName());
		while(activities.hasNext()){
			ActivityElement element = activities.next();
			if(!element.getDependencies().isEmpty()){
				Iterator<ActivityElement> dependencies = element.getDependencies().iterator();
				while(dependencies.hasNext()){
					ActivityElement dependency = dependencies.next();
					EObject container = dependency.eContainer();
					while (!(container instanceof Project)){
						container = container.eContainer();
					}
					if (container instanceof Project){
						relatedPlans.put(((Project)container).getName(), ((Project)container));
					}
				}
			}
		}
		relatedPlans.put(plan.getName(),plan); 
		//System.out.println(" >returning plans");
		return relatedPlans.values();

	}

	/*
	 * It provides as output ALL the activities encompassing those belonging to 
	 * plans on which the current plan depends. These are retrieved 
	 * throuth the getRelatedPlans method
	 */
	public Map<String, ActivityElement> getAllActivities(Project plan, boolean dependencies){

		Collection<Project> plans = getRelatedPlans(plan);
		Iterator<Project> planIt = plans.iterator();
		Collection<ActivityElement> activities = new ArrayList<ActivityElement>();
		if (dependencies){
			while(planIt.hasNext()){
				Project cp = planIt.next();
				activities.addAll(cp.getActivities());
			}
		}else{
			activities = plan.getActivities();
		}
		Iterator<ActivityElement> actIt = activities.iterator();
		LinkedHashMap<String, ActivityElement> activityElements = new LinkedHashMap<String,ActivityElement>();
		while( actIt.hasNext()){
			ActivityElement element = (ActivityElement) actIt.next();
			if(element instanceof Activity || element instanceof CheckPoint){
				activityElements.put((new ActivityElementDecorator(element)).getFullQualifiedName(), element);
			}else if( element instanceof ActivityGroup){
				//activityElements.put(getFullQualifiedName(element), element);
				activityElements.putAll( (new ActivityGroupDecorator((ActivityGroup)element)).getAllActivities() );
			}

		}
		return activityElements;
	}








	/*
	 * it returns the Project containing the ActivityElement passed as parameter
	 */
	public Project getPlan(ActivityElement element){
		EObject container = element.eContainer();
		String qualifiedName=element.getName();;
		while ( !(container instanceof Project) && (container !=null)){
			if(container instanceof ActivityGroup){
				qualifiedName= ((ActivityGroup)container).getName()+"."+qualifiedName;
			}
			container = container.eContainer();
		}
		if (container instanceof Project){
			return (Project)container;
		}else{
			return null;
		}
	}



	public Activity getFirstActivity(Program plans, boolean dependencies){
		Iterator<Project> planIterator = plans.getProjects().iterator();
		Activity first = null;
		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			Activity current = PlanUtil.getInstance().getFirstActivity(plan, dependencies);
			if (current!=null){
				if (first !=null){
					ActivityElementDecorator firstActivity = new ActivityElementDecorator(first);
					ActivityElementDecorator currentActivity = new ActivityElementDecorator(current);
					if(currentActivity.getStartByCalendar().before(firstActivity.getStartByCalendar())){
						first=current;
					}
				}else{
					first = current;
				}
			}else{
				continue;
			}
		}
		return first;
	}

	public Activity getFirstActivity(Collection<Project> plans, boolean dependencies){
		Iterator<Project> planIterator = plans.iterator();
		Activity first = null;
		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			Activity current = PlanUtil.getInstance().getFirstActivity(plan, dependencies);
			if (first !=null){
				ActivityElementDecorator firstActivity = new ActivityElementDecorator(first);
				ActivityElementDecorator currentActivity = new ActivityElementDecorator(current);
				if(currentActivity.getStartByCalendar().before(firstActivity.getStartByCalendar())){
					first=current;
				}
			}else{
				first = current;
			}

		}
		return first;
	}

	public Activity getLastActivity(Program plans, boolean dependencies){
		Iterator<Project> planIterator = plans.getProjects().iterator();
		Activity last = null;

		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			Activity current = PlanUtil.getInstance().getLastActivity(plan, dependencies);
			if (last !=null){
				ActivityElementDecorator lastActivity = new ActivityElementDecorator(last);
				ActivityElementDecorator currentActivity = new ActivityElementDecorator(current);
				if(lastActivity.getEndByCalendar().before(currentActivity.getEndByCalendar())){
					last=current;
					//System.out.println("\t last activity updated with "+current);	
				}
			}else{
				//System.out.println("\t last Activity was null now initialized with "+current);
				last = current;
			}

		}
		return last;
	}

	public Activity getLastActivity(Collection<Project> plans, boolean dependencies){
		Iterator<Project> planIterator = plans.iterator();
		Activity last = null;

		while(planIterator.hasNext()){
			Project plan = planIterator.next();
			Activity current = PlanUtil.getInstance().getLastActivity(plan, dependencies);
			if (last !=null){
				ActivityElementDecorator lastActivity = new ActivityElementDecorator(last);
				ActivityElementDecorator currentActivity = new ActivityElementDecorator(current);
				if(lastActivity.getEndByCalendar().before(currentActivity.getEndByCalendar())){
					last=current;
					//System.out.println("\t last activity updated with "+current);	
				}
			}else{
				//System.out.println("\t last Activity was null now initialized with "+current);
				last = current;
			}

		}
		return last;
	}



	//returns the first activity (to begin) of the plan passed as parameter
	//Also dependencies shall be taken into account
	public Activity getFirstActivity(Project plan, boolean dependencies){
		//Calendar calendar = GregorianCalendar.getInstance();
		//DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Iterator<ActivityElement> activities = getAllActivities(plan, dependencies).values().iterator();
		ActivityElementDecorator first = null;
		while(activities.hasNext()){
			ActivityElement element = activities.next();
			if (element instanceof Activity){
				Activity act = (Activity)element;
				ActivityElementDecorator activity = new ActivityElementDecorator(act);
				if (first!=null){
					if( (activity.getStartByCalendar()!=null)){
						if(first.getStartByCalendar()!=null){
							if(activity.getStartByCalendar().before(first.getStart())){
								first = activity;
							}
						}else{
							first = activity;
						}
					}

				}else{
					first = activity;
				}
			}
		}
		if (first!=null ){
			return (Activity)first.getActivityElement();
		}else{
			System.out.println("First activity is null!");
			return null;
		}
	}



	//returns the last activity (to end) of the plan passed as parameter
	//Also dependencies shall be taken into account
	public Activity getLastActivity(Project plan, boolean dependencies){
		//Calendar calendar = GregorianCalendar.getInstance();
		//DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Iterator<ActivityElement> activities = getAllActivities(plan, dependencies).values().iterator();
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
