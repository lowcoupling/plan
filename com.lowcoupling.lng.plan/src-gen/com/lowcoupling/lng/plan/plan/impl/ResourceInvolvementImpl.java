/**
 */
package com.lowcoupling.lng.plan.plan.impl;

import com.lowcoupling.lng.plan.plan.PlanPackage;
import com.lowcoupling.lng.plan.plan.Resource;
import com.lowcoupling.lng.plan.plan.ResourceInvolvement;
import com.lowcoupling.lng.plan.plan.Responsibility;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ResourceInvolvementImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ResourceInvolvementImpl#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ResourceInvolvementImpl#getResponsibility <em>Responsibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceInvolvementImpl extends MinimalEObjectImpl.Container implements ResourceInvolvement
{
  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected Resource resource;

  /**
   * The default value of the '{@link #getOccupation() <em>Occupation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccupation()
   * @generated
   * @ordered
   */
  protected static final int OCCUPATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOccupation() <em>Occupation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccupation()
   * @generated
   * @ordered
   */
  protected int occupation = OCCUPATION_EDEFAULT;

  /**
   * The default value of the '{@link #getResponsibility() <em>Responsibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsibility()
   * @generated
   * @ordered
   */
  protected static final Responsibility RESPONSIBILITY_EDEFAULT = Responsibility.RESPONSIBLE;

  /**
   * The cached value of the '{@link #getResponsibility() <em>Responsibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsibility()
   * @generated
   * @ordered
   */
  protected Responsibility responsibility = RESPONSIBILITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceInvolvementImpl()
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
    return PlanPackage.Literals.RESOURCE_INVOLVEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource getResource()
  {
    if (resource != null && resource.eIsProxy())
    {
      InternalEObject oldResource = (InternalEObject)resource;
      resource = (Resource)eResolveProxy(oldResource);
      if (resource != oldResource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanPackage.RESOURCE_INVOLVEMENT__RESOURCE, oldResource, resource));
      }
    }
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource basicGetResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(Resource newResource)
  {
    Resource oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.RESOURCE_INVOLVEMENT__RESOURCE, oldResource, resource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOccupation()
  {
    return occupation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOccupation(int newOccupation)
  {
    int oldOccupation = occupation;
    occupation = newOccupation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.RESOURCE_INVOLVEMENT__OCCUPATION, oldOccupation, occupation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Responsibility getResponsibility()
  {
    return responsibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponsibility(Responsibility newResponsibility)
  {
    Responsibility oldResponsibility = responsibility;
    responsibility = newResponsibility == null ? RESPONSIBILITY_EDEFAULT : newResponsibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.RESOURCE_INVOLVEMENT__RESPONSIBILITY, oldResponsibility, responsibility));
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
      case PlanPackage.RESOURCE_INVOLVEMENT__RESOURCE:
        if (resolve) return getResource();
        return basicGetResource();
      case PlanPackage.RESOURCE_INVOLVEMENT__OCCUPATION:
        return getOccupation();
      case PlanPackage.RESOURCE_INVOLVEMENT__RESPONSIBILITY:
        return getResponsibility();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlanPackage.RESOURCE_INVOLVEMENT__RESOURCE:
        setResource((Resource)newValue);
        return;
      case PlanPackage.RESOURCE_INVOLVEMENT__OCCUPATION:
        setOccupation((Integer)newValue);
        return;
      case PlanPackage.RESOURCE_INVOLVEMENT__RESPONSIBILITY:
        setResponsibility((Responsibility)newValue);
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
      case PlanPackage.RESOURCE_INVOLVEMENT__RESOURCE:
        setResource((Resource)null);
        return;
      case PlanPackage.RESOURCE_INVOLVEMENT__OCCUPATION:
        setOccupation(OCCUPATION_EDEFAULT);
        return;
      case PlanPackage.RESOURCE_INVOLVEMENT__RESPONSIBILITY:
        setResponsibility(RESPONSIBILITY_EDEFAULT);
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
      case PlanPackage.RESOURCE_INVOLVEMENT__RESOURCE:
        return resource != null;
      case PlanPackage.RESOURCE_INVOLVEMENT__OCCUPATION:
        return occupation != OCCUPATION_EDEFAULT;
      case PlanPackage.RESOURCE_INVOLVEMENT__RESPONSIBILITY:
        return responsibility != RESPONSIBILITY_EDEFAULT;
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
    result.append(" (occupation: ");
    result.append(occupation);
    result.append(", responsibility: ");
    result.append(responsibility);
    result.append(')');
    return result.toString();
  }

} //ResourceInvolvementImpl
