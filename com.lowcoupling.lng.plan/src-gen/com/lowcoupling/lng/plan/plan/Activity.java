/**
 */
package com.lowcoupling.lng.plan.plan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Activity#getInvolvedResources <em>Involved Resources</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Activity#getStart <em>Start</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Activity#getAfter <em>After</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Activity#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Activity#getEnd <em>End</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Activity#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Activity#getCompleteness <em>Completeness</em>}</li>
 * </ul>
 *
 * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends ActivityElement
{
  /**
   * Returns the value of the '<em><b>Involved Resources</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.lng.plan.plan.ResourceInvolvement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Involved Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Involved Resources</em>' containment reference list.
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivity_InvolvedResources()
   * @model containment="true"
   * @generated
   */
  EList<ResourceInvolvement> getInvolvedResources();

  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(String)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivity_Start()
   * @model
   * @generated
   */
  String getStart();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.Activity#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(String value);

  /**
   * Returns the value of the '<em><b>After</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After</em>' reference.
   * @see #setAfter(ActivityElement)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivity_After()
   * @model
   * @generated
   */
  ActivityElement getAfter();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.Activity#getAfter <em>After</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After</em>' reference.
   * @see #getAfter()
   * @generated
   */
  void setAfter(ActivityElement value);

  /**
   * Returns the value of the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Offset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset</em>' attribute.
   * @see #setOffset(int)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivity_Offset()
   * @model
   * @generated
   */
  int getOffset();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.Activity#getOffset <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset</em>' attribute.
   * @see #getOffset()
   * @generated
   */
  void setOffset(int value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivity_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.Activity#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(int)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivity_Duration()
   * @model
   * @generated
   */
  int getDuration();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.Activity#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(int value);

  /**
   * Returns the value of the '<em><b>Completeness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Completeness</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Completeness</em>' attribute.
   * @see #setCompleteness(int)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getActivity_Completeness()
   * @model
   * @generated
   */
  int getCompleteness();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.Activity#getCompleteness <em>Completeness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Completeness</em>' attribute.
   * @see #getCompleteness()
   * @generated
   */
  void setCompleteness(int value);

} // Activity
