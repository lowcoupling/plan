/*
 * generated by Xtext
 */
package com.lowcoupling.lng.plan.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPlanValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.lowcoupling.lng.plan.plan.PlanPackage.eINSTANCE);
		return result;
	}
}