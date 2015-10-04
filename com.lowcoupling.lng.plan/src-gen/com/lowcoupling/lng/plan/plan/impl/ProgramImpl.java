/**
 */
package com.lowcoupling.lng.plan.plan.impl;

import com.lowcoupling.lng.plan.plan.PlanImport;
import com.lowcoupling.lng.plan.plan.PlanPackage;
import com.lowcoupling.lng.plan.plan.Program;
import com.lowcoupling.lng.plan.plan.Project;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProgramImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProgramImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProgramImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProgramImpl#getReferencedProjects <em>Referenced Projects</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProgramImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongName()
   * @generated
   * @ordered
   */
  protected static final String LONG_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongName()
   * @generated
   * @ordered
   */
  protected String longName = LONG_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlans()
   * @generated
   * @ordered
   */
  protected EList<PlanImport> plans;

  /**
   * The cached value of the '{@link #getReferencedProjects() <em>Referenced Projects</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedProjects()
   * @generated
   * @ordered
   */
  protected EList<Project> referencedProjects;

  /**
   * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjects()
   * @generated
   * @ordered
   */
  protected EList<Project> projects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PlanPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PROGRAM__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PROGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLongName()
  {
    return longName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongName(String newLongName)
  {
    String oldLongName = longName;
    longName = newLongName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PROGRAM__LONG_NAME, oldLongName, longName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PlanImport> getPlans()
  {
    if (plans == null)
    {
      plans = new EObjectContainmentEList<PlanImport>(PlanImport.class, this, PlanPackage.PROGRAM__PLANS);
    }
    return plans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Project> getReferencedProjects()
  {
    if (referencedProjects == null)
    {
      referencedProjects = new EObjectResolvingEList<Project>(Project.class, this, PlanPackage.PROGRAM__REFERENCED_PROJECTS);
    }
    return referencedProjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Project> getProjects()
  {
    if (projects == null)
    {
      projects = new EObjectContainmentEList<Project>(Project.class, this, PlanPackage.PROGRAM__PROJECTS);
    }
    return projects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PlanPackage.PROGRAM__PLANS:
        return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
      case PlanPackage.PROGRAM__PROJECTS:
        return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PlanPackage.PROGRAM__DESCRIPTION:
        return getDescription();
      case PlanPackage.PROGRAM__NAME:
        return getName();
      case PlanPackage.PROGRAM__LONG_NAME:
        return getLongName();
      case PlanPackage.PROGRAM__PLANS:
        return getPlans();
      case PlanPackage.PROGRAM__REFERENCED_PROJECTS:
        return getReferencedProjects();
      case PlanPackage.PROGRAM__PROJECTS:
        return getProjects();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlanPackage.PROGRAM__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PlanPackage.PROGRAM__NAME:
        setName((String)newValue);
        return;
      case PlanPackage.PROGRAM__LONG_NAME:
        setLongName((String)newValue);
        return;
      case PlanPackage.PROGRAM__PLANS:
        getPlans().clear();
        getPlans().addAll((Collection<? extends PlanImport>)newValue);
        return;
      case PlanPackage.PROGRAM__REFERENCED_PROJECTS:
        getReferencedProjects().clear();
        getReferencedProjects().addAll((Collection<? extends Project>)newValue);
        return;
      case PlanPackage.PROGRAM__PROJECTS:
        getProjects().clear();
        getProjects().addAll((Collection<? extends Project>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PlanPackage.PROGRAM__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PlanPackage.PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlanPackage.PROGRAM__LONG_NAME:
        setLongName(LONG_NAME_EDEFAULT);
        return;
      case PlanPackage.PROGRAM__PLANS:
        getPlans().clear();
        return;
      case PlanPackage.PROGRAM__REFERENCED_PROJECTS:
        getReferencedProjects().clear();
        return;
      case PlanPackage.PROGRAM__PROJECTS:
        getProjects().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PlanPackage.PROGRAM__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PlanPackage.PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlanPackage.PROGRAM__LONG_NAME:
        return LONG_NAME_EDEFAULT == null ? longName != null : !LONG_NAME_EDEFAULT.equals(longName);
      case PlanPackage.PROGRAM__PLANS:
        return plans != null && !plans.isEmpty();
      case PlanPackage.PROGRAM__REFERENCED_PROJECTS:
        return referencedProjects != null && !referencedProjects.isEmpty();
      case PlanPackage.PROGRAM__PROJECTS:
        return projects != null && !projects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(", name: ");
    result.append(name);
    result.append(", longName: ");
    result.append(longName);
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
