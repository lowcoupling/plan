/*
 * generated by Xtext
 */
package com.lowcoupling.lng.plan;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PlanUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return com.lowcoupling.lng.plan.ui.internal.PlanActivator.getInstance().getInjector("com.lowcoupling.lng.plan.Plan");
	}
	
}
