/**
 */
package com.lowcoupling.lng.plan.plan.impl;

import com.lowcoupling.lng.plan.plan.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanFactoryImpl extends EFactoryImpl implements PlanFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PlanFactory init()
  {
    try
    {
      PlanFactory thePlanFactory = (PlanFactory)EPackage.Registry.INSTANCE.getEFactory(PlanPackage.eNS_URI);
      if (thePlanFactory != null)
      {
        return thePlanFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PlanFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PlanPackage.PROGRAM: return createProgram();
      case PlanPackage.PROJECT: return createProject();
      case PlanPackage.ASSUMPTION: return createAssumption();
      case PlanPackage.CONSTRAINT: return createConstraint();
      case PlanPackage.ACTIVITY_GROUP: return createActivityGroup();
      case PlanPackage.WBS_IMPORT: return createWBSImport();
      case PlanPackage.RESOURCES_IMPORT: return createResourcesImport();
      case PlanPackage.PLAN_IMPORT: return createPlanImport();
      case PlanPackage.ACTIVITY_ELEMENT: return createActivityElement();
      case PlanPackage.RESOURCES: return createResources();
      case PlanPackage.RESOURCE: return createResource();
      case PlanPackage.CHECK_POINT: return createCheckPoint();
      case PlanPackage.RESOURCE_INVOLVEMENT: return createResourceInvolvement();
      case PlanPackage.ACTIVITY: return createActivity();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PlanPackage.RESPONSIBILITY:
        return createResponsibilityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PlanPackage.RESPONSIBILITY:
        return convertResponsibilityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assumption createAssumption()
  {
    AssumptionImpl assumption = new AssumptionImpl();
    return assumption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityGroup createActivityGroup()
  {
    ActivityGroupImpl activityGroup = new ActivityGroupImpl();
    return activityGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSImport createWBSImport()
  {
    WBSImportImpl wbsImport = new WBSImportImpl();
    return wbsImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourcesImport createResourcesImport()
  {
    ResourcesImportImpl resourcesImport = new ResourcesImportImpl();
    return resourcesImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanImport createPlanImport()
  {
    PlanImportImpl planImport = new PlanImportImpl();
    return planImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityElement createActivityElement()
  {
    ActivityElementImpl activityElement = new ActivityElementImpl();
    return activityElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resources createResources()
  {
    ResourcesImpl resources = new ResourcesImpl();
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckPoint createCheckPoint()
  {
    CheckPointImpl checkPoint = new CheckPointImpl();
    return checkPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceInvolvement createResourceInvolvement()
  {
    ResourceInvolvementImpl resourceInvolvement = new ResourceInvolvementImpl();
    return resourceInvolvement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity createActivity()
  {
    ActivityImpl activity = new ActivityImpl();
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Responsibility createResponsibilityFromString(EDataType eDataType, String initialValue)
  {
    Responsibility result = Responsibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertResponsibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanPackage getPlanPackage()
  {
    return (PlanPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PlanPackage getPackage()
  {
    return PlanPackage.eINSTANCE;
  }

} //PlanFactoryImpl
