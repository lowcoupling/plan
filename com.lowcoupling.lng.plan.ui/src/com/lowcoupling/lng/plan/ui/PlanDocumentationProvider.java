package com.lowcoupling.lng.plan.ui;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import java.text.SimpleDateFormat;
import com.lowcoupling.lng.plan.plan.Activity;
import com.lowcoupling.lng.plan.plan.ActivityGroup;
import com.lowcoupling.lng.plan.plan.CheckPoint;
import com.lowcoupling.lng.plan.plan.Program;
import com.lowcoupling.lng.plan.plan.Project;
import com.lowcoupling.lng.plan.util.ActivityElementDecorator;

public class PlanDocumentationProvider implements IEObjectDocumentationProvider {


	@Override
	public String getDocumentation(EObject o) {
		if (o instanceof Activity) {
			String description = "";
			if( ((Activity)o).getDescription()!=null){
				description =  ((Activity)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
			}
			description = description +"</br><p>";
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			description = description +"<b>start date:</b> "+ sdf.format((new ActivityElementDecorator((Activity)o)).getStartByCalendar().getTime())+"<br>";
			description = description +"<b>end date:</b> "+ sdf.format((new ActivityElementDecorator((Activity)o)).getEndByCalendar().getTime())+"</br>";
			description = description +"</p>";
			return description;
		}
		if (o instanceof Project) {
			return ((Project)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
		}
		if (o instanceof Program) {
			return ((Program)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
		}
		if (o instanceof CheckPoint) {
			return ((CheckPoint)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
		}
		if (o instanceof ActivityGroup) {
			return ((ActivityGroup)o).getDescription().replaceAll(Pattern.quote("*"),"").replaceAll(Pattern.quote("/"),"");
		}
		return null;
	}

}