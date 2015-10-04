/**
 */
package com.lowcoupling.lng.plan.plan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Resources#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.lowcoupling.lng.plan.plan.PlanPackage#getResources()
 * @model
 * @generated
 */
public interface Resources extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.lng.plan.plan.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' containment reference list.
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getResources_Resource()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResource();

} // Resources
