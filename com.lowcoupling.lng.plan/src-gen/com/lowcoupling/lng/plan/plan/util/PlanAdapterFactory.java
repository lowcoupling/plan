/**
 */
package com.lowcoupling.lng.plan.plan.util;

import com.lowcoupling.lng.plan.plan.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.lowcoupling.lng.plan.plan.PlanPackage
 * @generated
 */
public class PlanAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PlanPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlanAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PlanPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlanSwitch<Adapter> modelSwitch =
    new PlanSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseAssumption(Assumption object)
      {
        return createAssumptionAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseActivityGroup(ActivityGroup object)
      {
        return createActivityGroupAdapter();
      }
      @Override
      public Adapter caseWBSImport(WBSImport object)
      {
        return createWBSImportAdapter();
      }
      @Override
      public Adapter caseResourcesImport(ResourcesImport object)
      {
        return createResourcesImportAdapter();
      }
      @Override
      public Adapter casePlanImport(PlanImport object)
      {
        return createPlanImportAdapter();
      }
      @Override
      public Adapter caseActivityElement(ActivityElement object)
      {
        return createActivityElementAdapter();
      }
      @Override
      public Adapter caseResources(Resources object)
      {
        return createResourcesAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseCheckPoint(CheckPoint object)
      {
        return createCheckPointAdapter();
      }
      @Override
      public Adapter caseResourceInvolvement(ResourceInvolvement object)
      {
        return createResourceInvolvementAdapter();
      }
      @Override
      public Adapter caseActivity(Activity object)
      {
        return createActivityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.Assumption <em>Assumption</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.Assumption
   * @generated
   */
  public Adapter createAssumptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.ActivityGroup <em>Activity Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.ActivityGroup
   * @generated
   */
  public Adapter createActivityGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.WBSImport <em>WBS Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.WBSImport
   * @generated
   */
  public Adapter createWBSImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.ResourcesImport <em>Resources Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.ResourcesImport
   * @generated
   */
  public Adapter createResourcesImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.PlanImport <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.PlanImport
   * @generated
   */
  public Adapter createPlanImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.ActivityElement <em>Activity Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.ActivityElement
   * @generated
   */
  public Adapter createActivityElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.Resources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.Resources
   * @generated
   */
  public Adapter createResourcesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.CheckPoint <em>Check Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.CheckPoint
   * @generated
   */
  public Adapter createCheckPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement <em>Resource Involvement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.ResourceInvolvement
   * @generated
   */
  public Adapter createResourceInvolvementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.lng.plan.plan.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.lng.plan.plan.Activity
   * @generated
   */
  public Adapter createActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PlanAdapterFactory
