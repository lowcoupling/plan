/**
 */
package com.lowcoupling.lng.plan.plan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.ActivityGroup#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivityGroup()
 * @model
 * @generated
 */
public interface ActivityGroup extends ActivityElement
{
  /**
   * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.lng.plan.plan.ActivityElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activities</em>' containment reference list.
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivityGroup_Activities()
   * @model containment="true"
   * @generated
   */
  EList<ActivityElement> getActivities();

} // ActivityGroup
