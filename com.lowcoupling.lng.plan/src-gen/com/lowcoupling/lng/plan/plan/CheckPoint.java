/**
 */
package com.lowcoupling.lng.plan.plan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.CheckPoint#getEnd <em>End</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.CheckPoint#getAfter <em>After</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.CheckPoint#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.CheckPoint#getCompleteness <em>Completeness</em>}</li>
 * </ul>
 *
 * @see com.lowcoupling.lng.plan.plan.PlanPackage#getCheckPoint()
 * @model
 * @generated
 */
public interface CheckPoint extends ActivityElement
{
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
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getCheckPoint_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.CheckPoint#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

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
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getCheckPoint_After()
   * @model
   * @generated
   */
  ActivityElement getAfter();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.CheckPoint#getAfter <em>After</em>}' reference.
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
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getCheckPoint_Offset()
   * @model
   * @generated
   */
  int getOffset();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.CheckPoint#getOffset <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset</em>' attribute.
   * @see #getOffset()
   * @generated
   */
  void setOffset(int value);

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
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getCheckPoint_Completeness()
   * @model
   * @generated
   */
  int getCompleteness();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.CheckPoint#getCompleteness <em>Completeness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Completeness</em>' attribute.
   * @see #getCompleteness()
   * @generated
   */
  void setCompleteness(int value);

} // CheckPoint
