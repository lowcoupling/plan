/**
 */
package com.lowcoupling.lng.plan.plan.impl;

import com.lowcoupling.lng.plan.plan.ActivityElement;
import com.lowcoupling.lng.plan.plan.CheckPoint;
import com.lowcoupling.lng.plan.plan.PlanPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.CheckPointImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.CheckPointImpl#getAfter <em>After</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.CheckPointImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.CheckPointImpl#getCompleteness <em>Completeness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckPointImpl extends ActivityElementImpl implements CheckPoint
{
  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final String END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected String end = END_EDEFAULT;

  /**
   * The cached value of the '{@link #getAfter() <em>After</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfter()
   * @generated
   * @ordered
   */
  protected ActivityElement after;

  /**
   * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected static final int OFFSET_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected int offset = OFFSET_EDEFAULT;

  /**
   * The default value of the '{@link #getCompleteness() <em>Completeness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompleteness()
   * @generated
   * @ordered
   */
  protected static final int COMPLETENESS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCompleteness() <em>Completeness</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompleteness()
   * @generated
   * @ordered
   */
  protected int completeness = COMPLETENESS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckPointImpl()
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
    return PlanPackage.Literals.CHECK_POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(String newEnd)
  {
    String oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.CHECK_POINT__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityElement getAfter()
  {
    if (after != null && after.eIsProxy())
    {
      InternalEObject oldAfter = (InternalEObject)after;
      after = (ActivityElement)eResolveProxy(oldAfter);
      if (after != oldAfter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanPackage.CHECK_POINT__AFTER, oldAfter, after));
      }
    }
    return after;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityElement basicGetAfter()
  {
    return after;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfter(ActivityElement newAfter)
  {
    ActivityElement oldAfter = after;
    after = newAfter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.CHECK_POINT__AFTER, oldAfter, after));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOffset()
  {
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffset(int newOffset)
  {
    int oldOffset = offset;
    offset = newOffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.CHECK_POINT__OFFSET, oldOffset, offset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCompleteness()
  {
    return completeness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompleteness(int newCompleteness)
  {
    int oldCompleteness = completeness;
    completeness = newCompleteness;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.CHECK_POINT__COMPLETENESS, oldCompleteness, completeness));
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
      case PlanPackage.CHECK_POINT__END:
        return getEnd();
      case PlanPackage.CHECK_POINT__AFTER:
        if (resolve) return getAfter();
        return basicGetAfter();
      case PlanPackage.CHECK_POINT__OFFSET:
        return getOffset();
      case PlanPackage.CHECK_POINT__COMPLETENESS:
        return getCompleteness();
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
      case PlanPackage.CHECK_POINT__END:
        setEnd((String)newValue);
        return;
      case PlanPackage.CHECK_POINT__AFTER:
        setAfter((ActivityElement)newValue);
        return;
      case PlanPackage.CHECK_POINT__OFFSET:
        setOffset((Integer)newValue);
        return;
      case PlanPackage.CHECK_POINT__COMPLETENESS:
        setCompleteness((Integer)newValue);
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
      case PlanPackage.CHECK_POINT__END:
        setEnd(END_EDEFAULT);
        return;
      case PlanPackage.CHECK_POINT__AFTER:
        setAfter((ActivityElement)null);
        return;
      case PlanPackage.CHECK_POINT__OFFSET:
        setOffset(OFFSET_EDEFAULT);
        return;
      case PlanPackage.CHECK_POINT__COMPLETENESS:
        setCompleteness(COMPLETENESS_EDEFAULT);
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
      case PlanPackage.CHECK_POINT__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
      case PlanPackage.CHECK_POINT__AFTER:
        return after != null;
      case PlanPackage.CHECK_POINT__OFFSET:
        return offset != OFFSET_EDEFAULT;
      case PlanPackage.CHECK_POINT__COMPLETENESS:
        return completeness != COMPLETENESS_EDEFAULT;
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
    result.append(" (end: ");
    result.append(end);
    result.append(", offset: ");
    result.append(offset);
    result.append(", completeness: ");
    result.append(completeness);
    result.append(')');
    return result.toString();
  }

} //CheckPointImpl
