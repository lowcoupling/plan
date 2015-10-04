/**
 */
package com.lowcoupling.lng.plan.plan.impl;

import com.lowcoupling.lng.plan.plan.ActivityElement;
import com.lowcoupling.lng.plan.plan.Assumption;
import com.lowcoupling.lng.plan.plan.Constraint;
import com.lowcoupling.lng.plan.plan.PlanImport;
import com.lowcoupling.lng.plan.plan.PlanPackage;
import com.lowcoupling.lng.plan.plan.Project;
import com.lowcoupling.lng.plan.plan.Resources;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project
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
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected Resources resources;

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
   * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssumptions()
   * @generated
   * @ordered
   */
  protected EList<Assumption> assumptions;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivities()
   * @generated
   * @ordered
   */
  protected EList<ActivityElement> activities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectImpl()
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
    return PlanPackage.Literals.PROJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PROJECT__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PROJECT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PROJECT__LONG_NAME, oldLongName, longName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resources getResources()
  {
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResources(Resources newResources, NotificationChain msgs)
  {
    Resources oldResources = resources;
    resources = newResources;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanPackage.PROJECT__RESOURCES, oldResources, newResources);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResources(Resources newResources)
  {
    if (newResources != resources)
    {
      NotificationChain msgs = null;
      if (resources != null)
        msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanPackage.PROJECT__RESOURCES, null, msgs);
      if (newResources != null)
        msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanPackage.PROJECT__RESOURCES, null, msgs);
      msgs = basicSetResources(newResources, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PROJECT__RESOURCES, newResources, newResources));
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
      plans = new EObjectContainmentEList<PlanImport>(PlanImport.class, this, PlanPackage.PROJECT__PLANS);
    }
    return plans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assumption> getAssumptions()
  {
    if (assumptions == null)
    {
      assumptions = new EObjectContainmentEList<Assumption>(Assumption.class, this, PlanPackage.PROJECT__ASSUMPTIONS);
    }
    return assumptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, PlanPackage.PROJECT__CONSTRAINTS);
    }
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActivityElement> getActivities()
  {
    if (activities == null)
    {
      activities = new EObjectContainmentEList<ActivityElement>(ActivityElement.class, this, PlanPackage.PROJECT__ACTIVITIES);
    }
    return activities;
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
      case PlanPackage.PROJECT__RESOURCES:
        return basicSetResources(null, msgs);
      case PlanPackage.PROJECT__PLANS:
        return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
      case PlanPackage.PROJECT__ASSUMPTIONS:
        return ((InternalEList<?>)getAssumptions()).basicRemove(otherEnd, msgs);
      case PlanPackage.PROJECT__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
      case PlanPackage.PROJECT__ACTIVITIES:
        return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
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
      case PlanPackage.PROJECT__DESCRIPTION:
        return getDescription();
      case PlanPackage.PROJECT__NAME:
        return getName();
      case PlanPackage.PROJECT__LONG_NAME:
        return getLongName();
      case PlanPackage.PROJECT__RESOURCES:
        return getResources();
      case PlanPackage.PROJECT__PLANS:
        return getPlans();
      case PlanPackage.PROJECT__ASSUMPTIONS:
        return getAssumptions();
      case PlanPackage.PROJECT__CONSTRAINTS:
        return getConstraints();
      case PlanPackage.PROJECT__ACTIVITIES:
        return getActivities();
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
      case PlanPackage.PROJECT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PlanPackage.PROJECT__NAME:
        setName((String)newValue);
        return;
      case PlanPackage.PROJECT__LONG_NAME:
        setLongName((String)newValue);
        return;
      case PlanPackage.PROJECT__RESOURCES:
        setResources((Resources)newValue);
        return;
      case PlanPackage.PROJECT__PLANS:
        getPlans().clear();
        getPlans().addAll((Collection<? extends PlanImport>)newValue);
        return;
      case PlanPackage.PROJECT__ASSUMPTIONS:
        getAssumptions().clear();
        getAssumptions().addAll((Collection<? extends Assumption>)newValue);
        return;
      case PlanPackage.PROJECT__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
        return;
      case PlanPackage.PROJECT__ACTIVITIES:
        getActivities().clear();
        getActivities().addAll((Collection<? extends ActivityElement>)newValue);
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
      case PlanPackage.PROJECT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PlanPackage.PROJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlanPackage.PROJECT__LONG_NAME:
        setLongName(LONG_NAME_EDEFAULT);
        return;
      case PlanPackage.PROJECT__RESOURCES:
        setResources((Resources)null);
        return;
      case PlanPackage.PROJECT__PLANS:
        getPlans().clear();
        return;
      case PlanPackage.PROJECT__ASSUMPTIONS:
        getAssumptions().clear();
        return;
      case PlanPackage.PROJECT__CONSTRAINTS:
        getConstraints().clear();
        return;
      case PlanPackage.PROJECT__ACTIVITIES:
        getActivities().clear();
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
      case PlanPackage.PROJECT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PlanPackage.PROJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlanPackage.PROJECT__LONG_NAME:
        return LONG_NAME_EDEFAULT == null ? longName != null : !LONG_NAME_EDEFAULT.equals(longName);
      case PlanPackage.PROJECT__RESOURCES:
        return resources != null;
      case PlanPackage.PROJECT__PLANS:
        return plans != null && !plans.isEmpty();
      case PlanPackage.PROJECT__ASSUMPTIONS:
        return assumptions != null && !assumptions.isEmpty();
      case PlanPackage.PROJECT__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
      case PlanPackage.PROJECT__ACTIVITIES:
        return activities != null && !activities.isEmpty();
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

} //ProjectImpl
