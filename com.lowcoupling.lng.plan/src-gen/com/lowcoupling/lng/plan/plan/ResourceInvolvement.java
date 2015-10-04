/**
 */
package com.lowcoupling.lng.plan.plan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement#getResource <em>Resource</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement#getResponsibility <em>Responsibility</em>}</li>
 * </ul>
 *
 * @see com.lowcoupling.lng.plan.plan.PlanPackage#getResourceInvolvement()
 * @model
 * @generated
 */
public interface ResourceInvolvement extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(Resource)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getResourceInvolvement_Resource()
   * @model
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement#getResource <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

  /**
   * Returns the value of the '<em><b>Occupation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occupation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occupation</em>' attribute.
   * @see #setOccupation(int)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getResourceInvolvement_Occupation()
   * @model
   * @generated
   */
  int getOccupation();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement#getOccupation <em>Occupation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Occupation</em>' attribute.
   * @see #getOccupation()
   * @generated
   */
  void setOccupation(int value);

  /**
   * Returns the value of the '<em><b>Responsibility</b></em>' attribute.
   * The literals are from the enumeration {@link com.lowcoupling.lng.plan.plan.Responsibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responsibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsibility</em>' attribute.
   * @see com.lowcoupling.lng.plan.plan.Responsibility
   * @see #setResponsibility(Responsibility)
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getResourceInvolvement_Responsibility()
   * @model
   * @generated
   */
  Responsibility getResponsibility();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement#getResponsibility <em>Responsibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Responsibility</em>' attribute.
   * @see com.lowcoupling.lng.plan.plan.Responsibility
   * @see #getResponsibility()
   * @generated
   */
  void setResponsibility(Responsibility value);

} // ResourceInvolvement
