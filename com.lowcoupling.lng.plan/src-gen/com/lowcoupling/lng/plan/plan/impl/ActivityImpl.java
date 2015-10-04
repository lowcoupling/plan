/**
 */
package com.lowcoupling.lng.plan.plan.impl;

import com.lowcoupling.lng.plan.plan.Activity;
import com.lowcoupling.lng.plan.plan.ActivityElement;
import com.lowcoupling.lng.plan.plan.PlanPackage;
import com.lowcoupling.lng.plan.plan.ResourceInvolvement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityImpl#getInvolvedResources <em>Involved Resources</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityImpl#getAfter <em>After</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.lowcoupling.lng.plan.plan.impl.ActivityImpl#getCompleteness <em>Completeness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends ActivityElementImpl implements Activity
{
  /**
   * The cached value of the '{@link #getInvolvedResources() <em>Involved Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvolvedResources()
   * @generated
   * @ordered
   */
  protected EList<ResourceInvolvement> involvedResources;

  /**
   * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected static final String START_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected String start = START_EDEFAULT;

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
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final int DURATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected int duration = DURATION_EDEFAULT;

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
  protected ActivityImpl()
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
    return PlanPackage.Literals.ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceInvolvement> getInvolvedResources()
  {
    if (involvedResources == null)
    {
      involvedResources = new EObjectContainmentEList<ResourceInvolvement>(ResourceInvolvement.class, this, PlanPackage.ACTIVITY__INVOLVED_RESOURCES);
    }
    return involvedResources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(String newStart)
  {
    String oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY__START, oldStart, start));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanPackage.ACTIVITY__AFTER, oldAfter, after));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY__AFTER, oldAfter, after));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY__OFFSET, oldOffset, offset));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(int newDuration)
  {
    int oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY__DURATION, oldDuration, duration));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.ACTIVITY__COMPLETENESS, oldCompleteness, completeness));
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
      case PlanPackage.ACTIVITY__INVOLVED_RESOURCES:
        return ((InternalEList<?>)getInvolvedResources()).basicRemove(otherEnd, msgs);
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
      case PlanPackage.ACTIVITY__INVOLVED_RESOURCES:
        return getInvolvedResources();
      case PlanPackage.ACTIVITY__START:
        return getStart();
      case PlanPackage.ACTIVITY__AFTER:
        if (resolve) return getAfter();
        return basicGetAfter();
      case PlanPackage.ACTIVITY__OFFSET:
        return getOffset();
      case PlanPackage.ACTIVITY__END:
        return getEnd();
      case PlanPackage.ACTIVITY__DURATION:
        return getDuration();
      case PlanPackage.ACTIVITY__COMPLETENESS:
        return getCompleteness();
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
      case PlanPackage.ACTIVITY__INVOLVED_RESOURCES:
        getInvolvedResources().clear();
        getInvolvedResources().addAll((Collection<? extends ResourceInvolvement>)newValue);
        return;
      case PlanPackage.ACTIVITY__START:
        setStart((String)newValue);
        return;
      case PlanPackage.ACTIVITY__AFTER:
        setAfter((ActivityElement)newValue);
        return;
      case PlanPackage.ACTIVITY__OFFSET:
        setOffset((Integer)newValue);
        return;
      case PlanPackage.ACTIVITY__END:
        setEnd((String)newValue);
        return;
      case PlanPackage.ACTIVITY__DURATION:
        setDuration((Integer)newValue);
        return;
      case PlanPackage.ACTIVITY__COMPLETENESS:
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
      case PlanPackage.ACTIVITY__INVOLVED_RESOURCES:
        getInvolvedResources().clear();
        return;
      case PlanPackage.ACTIVITY__START:
        setStart(START_EDEFAULT);
        return;
      case PlanPackage.ACTIVITY__AFTER:
        setAfter((ActivityElement)null);
        return;
      case PlanPackage.ACTIVITY__OFFSET:
        setOffset(OFFSET_EDEFAULT);
        return;
      case PlanPackage.ACTIVITY__END:
        setEnd(END_EDEFAULT);
        return;
      case PlanPackage.ACTIVITY__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case PlanPackage.ACTIVITY__COMPLETENESS:
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
      case PlanPackage.ACTIVITY__INVOLVED_RESOURCES:
        return involvedResources != null && !involvedResources.isEmpty();
      case PlanPackage.ACTIVITY__START:
        return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
      case PlanPackage.ACTIVITY__AFTER:
        return after != null;
      case PlanPackage.ACTIVITY__OFFSET:
        return offset != OFFSET_EDEFAULT;
      case PlanPackage.ACTIVITY__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
      case PlanPackage.ACTIVITY__DURATION:
        return duration != DURATION_EDEFAULT;
      case PlanPackage.ACTIVITY__COMPLETENESS:
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
    result.append(" (start: ");
    result.append(start);
    result.append(", offset: ");
    result.append(offset);
    result.append(", end: ");
    result.append(end);
    result.append(", duration: ");
    result.append(duration);
    result.append(", completeness: ");
    result.append(completeness);
    result.append(')');
    return result.toString();
  }

} //ActivityImpl
