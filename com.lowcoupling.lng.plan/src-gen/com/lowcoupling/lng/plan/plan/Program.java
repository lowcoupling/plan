/**
 */
package com.lowcoupling.lng.plan.plan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Program#getDescription <em>Description</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Program#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Program#getLongName <em>Long Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Program#getPlans <em>Plans</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Program#getReferencedProjects <em>Referenced Projects</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.Program#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see com.lowcoupling.lng.plan.plan.PlanPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
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
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getProgram_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.Program#getDescription <em>Description</em>}' attribute.
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
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.Program#getName <em>Name</em>}' attribute.
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
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getProgram_LongName()
   * @model
   * @generated
   */
  String getLongName();

  /**
   * Sets the value of the '{@link com.lowcoupling.lng.plan.plan.Program#getLongName <em>Long Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' attribute.
   * @see #getLongName()
   * @generated
   */
  void setLongName(String value);

  /**
   * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.lng.plan.plan.PlanImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plans</em>' containment reference list.
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getProgram_Plans()
   * @model containment="true"
   * @generated
   */
  EList<PlanImport> getPlans();

  /**
   * Returns the value of the '<em><b>Referenced Projects</b></em>' reference list.
   * The list contents are of type {@link com.lowcoupling.lng.plan.plan.Project}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Projects</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Projects</em>' reference list.
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getProgram_ReferencedProjects()
   * @model
   * @generated
   */
  EList<Project> getReferencedProjects();

  /**
   * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.lng.plan.plan.Project}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projects</em>' containment reference list.
   * @see com.lowcoupling.lng.plan.plan.PlanPackage#getProgram_Projects()
   * @model containment="true"
   * @generated
   */
  EList<Project> getProjects();

} // Program
