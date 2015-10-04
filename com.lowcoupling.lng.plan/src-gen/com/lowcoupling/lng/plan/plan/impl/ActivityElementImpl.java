/**
 */
package com.lowcoupling.lng.plan.plan.impl;

import com.lowcoupling.lng.plan.plan.ActivityElement;
import com.lowcoupling.lng.plan.plan.PlanPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityElementImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityElementImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityElementImpl extends MinimalEObjectImpl.Container implements ActivityElement
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
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<ActivityElement> dependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityElementImpl()
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
    return PlanPackage.Literals.ACTIVITY_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY_ELEMENT__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY_ELEMENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY_ELEMENT__LONG_NAME, oldLongName, longName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActivityElement> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectResolvingEList<ActivityElement>(ActivityElement.class, this, PlanPackage.ACTIVITY_ELEMENT__DEPENDENCIES);
    }
    return dependencies;
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
      case PlanPackage.ACTIVITY_ELEMENT__DESCRIPTION:
        return getDescription();
      case PlanPackage.ACTIVITY_ELEMENT__NAME:
        return getName();
      case PlanPackage.ACTIVITY_ELEMENT__LONG_NAME:
        return getLongName();
      case PlanPackage.ACTIVITY_ELEMENT__DEPENDENCIES:
        return getDependencies();
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
      case PlanPackage.ACTIVITY_ELEMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PlanPackage.ACTIVITY_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case PlanPackage.ACTIVITY_ELEMENT__LONG_NAME:
        setLongName((String)newValue);
        return;
      case PlanPackage.ACTIVITY_ELEMENT__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends ActivityElement>)newValue);
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
      case PlanPackage.ACTIVITY_ELEMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PlanPackage.ACTIVITY_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PlanPackage.ACTIVITY_ELEMENT__LONG_NAME:
        setLongName(LONG_NAME_EDEFAULT);
        return;
      case PlanPackage.ACTIVITY_ELEMENT__DEPENDENCIES:
        getDependencies().clear();
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
      case PlanPackage.ACTIVITY_ELEMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PlanPackage.ACTIVITY_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PlanPackage.ACTIVITY_ELEMENT__LONG_NAME:
        return LONG_NAME_EDEFAULT == null ? longName != null : !LONG_NAME_EDEFAULT.equals(longName);
      case PlanPackage.ACTIVITY_ELEMENT__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
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

} //ActivityElementImpl
