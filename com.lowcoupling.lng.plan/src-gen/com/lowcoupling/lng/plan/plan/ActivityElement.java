/**
 */
package com.lowcoupling.lng.plan.plan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.ActivityElement#getDescription <em>Description</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.ActivityElement#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.ActivityElement#getLongName <em>Long Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.ActivityElement#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivityElement()
 * @model
 * @generated
 */
public interface ActivityElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivityElement_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.ActivityElement#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivityElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.ActivityElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Name</em>' attribute.
   * @see #setLongName(String)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivityElement_LongName()
   * @model
   * @generated
   */
  String getLongName();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.ActivityElement#getLongName <em>Long Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' attribute.
   * @see #getLongName()
   * @generated
   */
  void setLongName(String value);

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
   * The list contents are of type {@link com.lowcoupling.lng.plan.plan.ActivityElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' reference list.
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivityElement_Dependencies()
   * @model
   * @generated
   */
  EList<ActivityElement> getDependencies();

} // ActivityElement
