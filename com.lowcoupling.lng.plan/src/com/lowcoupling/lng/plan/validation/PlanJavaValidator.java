package com.lowcoupling.lng.plan.validation;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import com.lowcoupling.lng.plan.plan.Activity;
import com.lowcoupling.lng.plan.plan.ActivityElement;
import com.lowcoupling.lng.plan.plan.ActivityGroup;
import com.lowcoupling.lng.plan.plan.CheckPoint;
import com.lowcoupling.lng.plan.plan.PlanPackage;
import com.lowcoupling.lng.plan.plan.Project;
import com.lowcoupling.lng.plan.plan.impl.ActivityGroupImpl;
import com.lowcoupling.lng.plan.plan.impl.ActivityImpl;
import com.lowcoupling.lng.plan.plan.impl.CheckPointImpl;
import com.lowcoupling.lng.plan.util.ActivityElementDecorator;
import com.lowcoupling.lng.plan.util.ActivityGroupDecorator;



public class PlanJavaValidator extends AbstractPlanValidator {

	@Check
	public boolean checkNestedGroups(ActivityGroup group){

		if(group!=null){
			if (group.eContainer() instanceof ActivityGroup){
				try{
				error("There can't be nested group of activities", PlanPackage.Literals.ACTIVITY_ELEMENT__NAME);
				} catch(Exception e){}
				return true;
			}
		}
		return false;
	}

	@Check
	public boolean checkForLoops(ActivityElement element){
		if (false) return false;
		if (element instanceof ActivityGroup) return false;
		EObject dependency = null;
		if (element instanceof Activity){
			dependency = ((Activity)element).getAfter();
		}else{
			dependency = ((CheckPoint)element).getAfter();
		}
		HashMap<String, EObject> ancestors = new HashMap<String,EObject>();
		ActivityElementDecorator dec = new ActivityElementDecorator(element);
		ancestors.put(dec.getFullQualifiedName(),element);
		while (dependency!=null){
			if (dependency instanceof ActivityImpl){
				ActivityElementDecorator dependencyDecorator = new ActivityElementDecorator((Activity)dependency);
				if(ancestors.get(dependencyDecorator.getFullQualifiedName())!=null){
					try{
						error("There is a loop in the after relationship", PlanPackage.Literals.ACTIVITY_ELEMENT__NAME);
						} catch(Exception e){}
					return true;
				}
				ancestors.put(dependencyDecorator.getFullQualifiedName(), dependency);
				dependency = ((Activity)dependency).getAfter();
			}else if (dependency instanceof CheckPointImpl){
				ActivityElementDecorator dependencyDecorator = new ActivityElementDecorator((CheckPoint)dependency);
				if(ancestors.get(dependencyDecorator.getFullQualifiedName())!=null){
					try{
						error("There is a loop in the after relationship", PlanPackage.Literals.ACTIVITY_ELEMENT__NAME);
						} catch(Exception e){}
					return true;
				}
				ancestors.put(dependencyDecorator.getFullQualifiedName(), dependency);
				dependency = ((CheckPoint)dependency).getAfter();
			}else {
				//System.out.println("Group dependency ");
				ActivityGroup group = (ActivityGroup)dependency;
				ActivityGroupDecorator groupDecorator = new ActivityGroupDecorator(group);
				ActivityElementDecorator dependencyDecorator = new ActivityElementDecorator((ActivityElement)groupDecorator.getLastActivity());
				if(ancestors.get(dependencyDecorator.getFullQualifiedName())!=null){
					try{
						error("There is a loop in the after relationship", PlanPackage.Literals.ACTIVITY_ELEMENT__NAME);
						} catch(Exception e){}
					return true;
				}
				ancestors.put(dependencyDecorator.getFullQualifiedName(), groupDecorator.getLastActivity());
				dependency = groupDecorator.getLastActivity().getAfter();
			}
		}
		return false;
	}


	//	@Check
	//	public void checkGreetingStartsWithCapital(Greeting greeting) {
	//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
	//		}
	//	}

}
