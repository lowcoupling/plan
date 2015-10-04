/**
 */
package com.lowcoupling.lng.plan.plan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.lowcoupling.lng.plan.plan.PlanFactory
 * @model kind="package"
 * @generated
 */
public interface PlanPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "plan";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lowcoupling.com/lng/plan/Plan";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "plan";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlanPackage eINSTANCE = com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl.init();

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ProgramImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 1;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__LONG_NAME = 2;

  /**
   * The feature id for the '<em><b>Plans</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PLANS = 3;

  /**
   * The feature id for the '<em><b>Referenced Projects</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__REFERENCED_PROJECTS = 4;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PROJECTS = 5;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ProjectImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 1;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__LONG_NAME = 2;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__RESOURCES = 3;

  /**
   * The feature id for the '<em><b>Plans</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PLANS = 4;

  /**
   * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ASSUMPTIONS = 5;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__CONSTRAINTS = 6;

  /**
   * The feature id for the '<em><b>Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ACTIVITIES = 7;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.AssumptionImpl <em>Assumption</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.AssumptionImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getAssumption()
   * @generated
   */
  int ASSUMPTION = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Assumption</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSUMPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ConstraintImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ActivityElementImpl <em>Activity Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ActivityElementImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getActivityElement()
   * @generated
   */
  int ACTIVITY_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT__LONG_NAME = 2;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT__DEPENDENCIES = 3;

  /**
   * The number of structural features of the '<em>Activity Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ELEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ActivityGroupImpl <em>Activity Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ActivityGroupImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getActivityGroup()
   * @generated
   */
  int ACTIVITY_GROUP = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_GROUP__DESCRIPTION = ACTIVITY_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_GROUP__NAME = ACTIVITY_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_GROUP__LONG_NAME = ACTIVITY_ELEMENT__LONG_NAME;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_GROUP__DEPENDENCIES = ACTIVITY_ELEMENT__DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_GROUP__ACTIVITIES = ACTIVITY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_GROUP_FEATURE_COUNT = ACTIVITY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.WBSImportImpl <em>WBS Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.WBSImportImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getWBSImport()
   * @generated
   */
  int WBS_IMPORT = 5;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>WBS Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ResourcesImportImpl <em>Resources Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ResourcesImportImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResourcesImport()
   * @generated
   */
  int RESOURCES_IMPORT = 6;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Resources Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.PlanImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.PlanImportImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getPlanImport()
   * @generated
   */
  int PLAN_IMPORT = 7;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN_IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ResourcesImpl <em>Resources</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ResourcesImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResources()
   * @generated
   */
  int RESOURCES = 9;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES__RESOURCE = 0;

  /**
   * The number of structural features of the '<em>Resources</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ResourceImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.CheckPointImpl <em>Check Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.CheckPointImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getCheckPoint()
   * @generated
   */
  int CHECK_POINT = 11;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_POINT__DESCRIPTION = ACTIVITY_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_POINT__NAME = ACTIVITY_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_POINT__LONG_NAME = ACTIVITY_ELEMENT__LONG_NAME;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_POINT__DEPENDENCIES = ACTIVITY_ELEMENT__DEPENDENCIES;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_POINT__END = ACTIVITY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>After</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_POINT__AFTER = ACTIVITY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_POINT__OFFSET = ACTIVITY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Completeness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_POINT__COMPLETENESS = ACTIVITY_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Check Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_POINT_FEATURE_COUNT = ACTIVITY_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ResourceInvolvementImpl <em>Resource Involvement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ResourceInvolvementImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResourceInvolvement()
   * @generated
   */
  int RESOURCE_INVOLVEMENT = 12;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_INVOLVEMENT__RESOURCE = 0;

  /**
   * The feature id for the '<em><b>Occupation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_INVOLVEMENT__OCCUPATION = 1;

  /**
   * The feature id for the '<em><b>Responsibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_INVOLVEMENT__RESPONSIBILITY = 2;

  /**
   * The number of structural features of the '<em>Resource Involvement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_INVOLVEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.impl.ActivityImpl
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 13;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__DESCRIPTION = ACTIVITY_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = ACTIVITY_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__LONG_NAME = ACTIVITY_ELEMENT__LONG_NAME;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__DEPENDENCIES = ACTIVITY_ELEMENT__DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Involved Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__INVOLVED_RESOURCES = ACTIVITY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__START = ACTIVITY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>After</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__AFTER = ACTIVITY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__OFFSET = ACTIVITY_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__END = ACTIVITY_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__DURATION = ACTIVITY_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Completeness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__COMPLETENESS = ACTIVITY_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = ACTIVITY_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.lowcoupling.lng.plan.plan.Responsibility <em>Responsibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.lng.plan.plan.Responsibility
   * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResponsibility()
   * @generated
   */
  int RESPONSIBILITY = 14;


  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see com.lowcoupling.lng.plan.plan.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Program#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.lowcoupling.lng.plan.plan.Program#getDescription()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Description();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.lng.plan.plan.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Program#getLongName <em>Long Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Long Name</em>'.
   * @see com.lowcoupling.lng.plan.plan.Program#getLongName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_LongName();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.lng.plan.plan.Program#getPlans <em>Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Plans</em>'.
   * @see com.lowcoupling.lng.plan.plan.Program#getPlans()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Plans();

  /**
   * Returns the meta object for the reference list '{@link com.lowcoupling.lng.plan.plan.Program#getReferencedProjects <em>Referenced Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Referenced Projects</em>'.
   * @see com.lowcoupling.lng.plan.plan.Program#getReferencedProjects()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_ReferencedProjects();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.lng.plan.plan.Program#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see com.lowcoupling.lng.plan.plan.Program#getProjects()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Projects();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see com.lowcoupling.lng.plan.plan.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Project#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.lowcoupling.lng.plan.plan.Project#getDescription()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Description();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.lng.plan.plan.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Project#getLongName <em>Long Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Long Name</em>'.
   * @see com.lowcoupling.lng.plan.plan.Project#getLongName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_LongName();

  /**
   * Returns the meta object for the containment reference '{@link com.lowcoupling.lng.plan.plan.Project#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resources</em>'.
   * @see com.lowcoupling.lng.plan.plan.Project#getResources()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.lng.plan.plan.Project#getPlans <em>Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Plans</em>'.
   * @see com.lowcoupling.lng.plan.plan.Project#getPlans()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Plans();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.lng.plan.plan.Project#getAssumptions <em>Assumptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assumptions</em>'.
   * @see com.lowcoupling.lng.plan.plan.Project#getAssumptions()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Assumptions();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.lng.plan.plan.Project#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see com.lowcoupling.lng.plan.plan.Project#getConstraints()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Constraints();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.lng.plan.plan.Project#getActivities <em>Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activities</em>'.
   * @see com.lowcoupling.lng.plan.plan.Project#getActivities()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Activities();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.Assumption <em>Assumption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assumption</em>'.
   * @see com.lowcoupling.lng.plan.plan.Assumption
   * @generated
   */
  EClass getAssumption();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Assumption#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.lowcoupling.lng.plan.plan.Assumption#getValue()
   * @see #getAssumption()
   * @generated
   */
  EAttribute getAssumption_Value();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see com.lowcoupling.lng.plan.plan.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Constraint#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.lowcoupling.lng.plan.plan.Constraint#getValue()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Value();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.ActivityGroup <em>Activity Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Group</em>'.
   * @see com.lowcoupling.lng.plan.plan.ActivityGroup
   * @generated
   */
  EClass getActivityGroup();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.lng.plan.plan.ActivityGroup#getActivities <em>Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activities</em>'.
   * @see com.lowcoupling.lng.plan.plan.ActivityGroup#getActivities()
   * @see #getActivityGroup()
   * @generated
   */
  EReference getActivityGroup_Activities();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.WBSImport <em>WBS Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WBS Import</em>'.
   * @see com.lowcoupling.lng.plan.plan.WBSImport
   * @generated
   */
  EClass getWBSImport();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.WBSImport#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.lowcoupling.lng.plan.plan.WBSImport#getImportURI()
   * @see #getWBSImport()
   * @generated
   */
  EAttribute getWBSImport_ImportURI();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.ResourcesImport <em>Resources Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resources Import</em>'.
   * @see com.lowcoupling.lng.plan.plan.ResourcesImport
   * @generated
   */
  EClass getResourcesImport();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.ResourcesImport#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.lowcoupling.lng.plan.plan.ResourcesImport#getImportURI()
   * @see #getResourcesImport()
   * @generated
   */
  EAttribute getResourcesImport_ImportURI();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.PlanImport <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.lowcoupling.lng.plan.plan.PlanImport
   * @generated
   */
  EClass getPlanImport();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.PlanImport#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.lowcoupling.lng.plan.plan.PlanImport#getImportURI()
   * @see #getPlanImport()
   * @generated
   */
  EAttribute getPlanImport_ImportURI();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.ActivityElement <em>Activity Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Element</em>'.
   * @see com.lowcoupling.lng.plan.plan.ActivityElement
   * @generated
   */
  EClass getActivityElement();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.ActivityElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.lowcoupling.lng.plan.plan.ActivityElement#getDescription()
   * @see #getActivityElement()
   * @generated
   */
  EAttribute getActivityElement_Description();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.ActivityElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.lng.plan.plan.ActivityElement#getName()
   * @see #getActivityElement()
   * @generated
   */
  EAttribute getActivityElement_Name();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.ActivityElement#getLongName <em>Long Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Long Name</em>'.
   * @see com.lowcoupling.lng.plan.plan.ActivityElement#getLongName()
   * @see #getActivityElement()
   * @generated
   */
  EAttribute getActivityElement_LongName();

  /**
   * Returns the meta object for the reference list '{@link com.lowcoupling.lng.plan.plan.ActivityElement#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dependencies</em>'.
   * @see com.lowcoupling.lng.plan.plan.ActivityElement#getDependencies()
   * @see #getActivityElement()
   * @generated
   */
  EReference getActivityElement_Dependencies();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.Resources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resources</em>'.
   * @see com.lowcoupling.lng.plan.plan.Resources
   * @generated
   */
  EClass getResources();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.lng.plan.plan.Resources#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource</em>'.
   * @see com.lowcoupling.lng.plan.plan.Resources#getResource()
   * @see #getResources()
   * @generated
   */
  EReference getResources_Resource();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see com.lowcoupling.lng.plan.plan.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.lng.plan.plan.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.CheckPoint <em>Check Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Point</em>'.
   * @see com.lowcoupling.lng.plan.plan.CheckPoint
   * @generated
   */
  EClass getCheckPoint();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.CheckPoint#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see com.lowcoupling.lng.plan.plan.CheckPoint#getEnd()
   * @see #getCheckPoint()
   * @generated
   */
  EAttribute getCheckPoint_End();

  /**
   * Returns the meta object for the reference '{@link com.lowcoupling.lng.plan.plan.CheckPoint#getAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>After</em>'.
   * @see com.lowcoupling.lng.plan.plan.CheckPoint#getAfter()
   * @see #getCheckPoint()
   * @generated
   */
  EReference getCheckPoint_After();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.CheckPoint#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset</em>'.
   * @see com.lowcoupling.lng.plan.plan.CheckPoint#getOffset()
   * @see #getCheckPoint()
   * @generated
   */
  EAttribute getCheckPoint_Offset();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.CheckPoint#getCompleteness <em>Completeness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Completeness</em>'.
   * @see com.lowcoupling.lng.plan.plan.CheckPoint#getCompleteness()
   * @see #getCheckPoint()
   * @generated
   */
  EAttribute getCheckPoint_Completeness();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement <em>Resource Involvement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Involvement</em>'.
   * @see com.lowcoupling.lng.plan.plan.ResourceInvolvement
   * @generated
   */
  EClass getResourceInvolvement();

  /**
   * Returns the meta object for the reference '{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see com.lowcoupling.lng.plan.plan.ResourceInvolvement#getResource()
   * @see #getResourceInvolvement()
   * @generated
   */
  EReference getResourceInvolvement_Resource();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement#getOccupation <em>Occupation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Occupation</em>'.
   * @see com.lowcoupling.lng.plan.plan.ResourceInvolvement#getOccupation()
   * @see #getResourceInvolvement()
   * @generated
   */
  EAttribute getResourceInvolvement_Occupation();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.ResourceInvolvement#getResponsibility <em>Responsibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Responsibility</em>'.
   * @see com.lowcoupling.lng.plan.plan.ResourceInvolvement#getResponsibility()
   * @see #getResourceInvolvement()
   * @generated
   */
  EAttribute getResourceInvolvement_Responsibility();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.lng.plan.plan.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see com.lowcoupling.lng.plan.plan.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.lng.plan.plan.Activity#getInvolvedResources <em>Involved Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Involved Resources</em>'.
   * @see com.lowcoupling.lng.plan.plan.Activity#getInvolvedResources()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_InvolvedResources();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Activity#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see com.lowcoupling.lng.plan.plan.Activity#getStart()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Start();

  /**
   * Returns the meta object for the reference '{@link com.lowcoupling.lng.plan.plan.Activity#getAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>After</em>'.
   * @see com.lowcoupling.lng.plan.plan.Activity#getAfter()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_After();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Activity#getOffset <em>Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset</em>'.
   * @see com.lowcoupling.lng.plan.plan.Activity#getOffset()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Offset();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Activity#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see com.lowcoupling.lng.plan.plan.Activity#getEnd()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_End();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Activity#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see com.lowcoupling.lng.plan.plan.Activity#getDuration()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Duration();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.lng.plan.plan.Activity#getCompleteness <em>Completeness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Completeness</em>'.
   * @see com.lowcoupling.lng.plan.plan.Activity#getCompleteness()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Completeness();

  /**
   * Returns the meta object for enum '{@link com.lowcoupling.lng.plan.plan.Responsibility <em>Responsibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Responsibility</em>'.
   * @see com.lowcoupling.lng.plan.plan.Responsibility
   * @generated
   */
  EEnum getResponsibility();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlanFactory getPlanFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ProgramImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__DESCRIPTION = eINSTANCE.getProgram_Description();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__LONG_NAME = eINSTANCE.getProgram_LongName();

    /**
     * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PLANS = eINSTANCE.getProgram_Plans();

    /**
     * The meta object literal for the '<em><b>Referenced Projects</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__REFERENCED_PROJECTS = eINSTANCE.getProgram_ReferencedProjects();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PROJECTS = eINSTANCE.getProgram_Projects();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ProjectImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__LONG_NAME = eINSTANCE.getProject_LongName();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__RESOURCES = eINSTANCE.getProject_Resources();

    /**
     * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PLANS = eINSTANCE.getProject_Plans();

    /**
     * The meta object literal for the '<em><b>Assumptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__ASSUMPTIONS = eINSTANCE.getProject_Assumptions();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__CONSTRAINTS = eINSTANCE.getProject_Constraints();

    /**
     * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__ACTIVITIES = eINSTANCE.getProject_Activities();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.AssumptionImpl <em>Assumption</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.AssumptionImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getAssumption()
     * @generated
     */
    EClass ASSUMPTION = eINSTANCE.getAssumption();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSUMPTION__VALUE = eINSTANCE.getAssumption_Value();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ConstraintImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__VALUE = eINSTANCE.getConstraint_Value();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ActivityGroupImpl <em>Activity Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ActivityGroupImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getActivityGroup()
     * @generated
     */
    EClass ACTIVITY_GROUP = eINSTANCE.getActivityGroup();

    /**
     * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_GROUP__ACTIVITIES = eINSTANCE.getActivityGroup_Activities();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.WBSImportImpl <em>WBS Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.WBSImportImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getWBSImport()
     * @generated
     */
    EClass WBS_IMPORT = eINSTANCE.getWBSImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WBS_IMPORT__IMPORT_URI = eINSTANCE.getWBSImport_ImportURI();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ResourcesImportImpl <em>Resources Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ResourcesImportImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResourcesImport()
     * @generated
     */
    EClass RESOURCES_IMPORT = eINSTANCE.getResourcesImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCES_IMPORT__IMPORT_URI = eINSTANCE.getResourcesImport_ImportURI();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.PlanImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.PlanImportImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getPlanImport()
     * @generated
     */
    EClass PLAN_IMPORT = eINSTANCE.getPlanImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAN_IMPORT__IMPORT_URI = eINSTANCE.getPlanImport_ImportURI();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ActivityElementImpl <em>Activity Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ActivityElementImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getActivityElement()
     * @generated
     */
    EClass ACTIVITY_ELEMENT = eINSTANCE.getActivityElement();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY_ELEMENT__DESCRIPTION = eINSTANCE.getActivityElement_Description();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY_ELEMENT__NAME = eINSTANCE.getActivityElement_Name();

    /**
     * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY_ELEMENT__LONG_NAME = eINSTANCE.getActivityElement_LongName();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_ELEMENT__DEPENDENCIES = eINSTANCE.getActivityElement_Dependencies();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ResourcesImpl <em>Resources</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ResourcesImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResources()
     * @generated
     */
    EClass RESOURCES = eINSTANCE.getResources();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCES__RESOURCE = eINSTANCE.getResources_Resource();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ResourceImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.CheckPointImpl <em>Check Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.CheckPointImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getCheckPoint()
     * @generated
     */
    EClass CHECK_POINT = eINSTANCE.getCheckPoint();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_POINT__END = eINSTANCE.getCheckPoint_End();

    /**
     * The meta object literal for the '<em><b>After</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_POINT__AFTER = eINSTANCE.getCheckPoint_After();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_POINT__OFFSET = eINSTANCE.getCheckPoint_Offset();

    /**
     * The meta object literal for the '<em><b>Completeness</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_POINT__COMPLETENESS = eINSTANCE.getCheckPoint_Completeness();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ResourceInvolvementImpl <em>Resource Involvement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ResourceInvolvementImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResourceInvolvement()
     * @generated
     */
    EClass RESOURCE_INVOLVEMENT = eINSTANCE.getResourceInvolvement();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_INVOLVEMENT__RESOURCE = eINSTANCE.getResourceInvolvement_Resource();

    /**
     * The meta object literal for the '<em><b>Occupation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_INVOLVEMENT__OCCUPATION = eINSTANCE.getResourceInvolvement_Occupation();

    /**
     * The meta object literal for the '<em><b>Responsibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_INVOLVEMENT__RESPONSIBILITY = eINSTANCE.getResourceInvolvement_Responsibility();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.impl.ActivityImpl
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Involved Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__INVOLVED_RESOURCES = eINSTANCE.getActivity_InvolvedResources();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__START = eINSTANCE.getActivity_Start();

    /**
     * The meta object literal for the '<em><b>After</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__AFTER = eINSTANCE.getActivity_After();

    /**
     * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__OFFSET = eINSTANCE.getActivity_Offset();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__END = eINSTANCE.getActivity_End();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__DURATION = eINSTANCE.getActivity_Duration();

    /**
     * The meta object literal for the '<em><b>Completeness</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__COMPLETENESS = eINSTANCE.getActivity_Completeness();

    /**
     * The meta object literal for the '{@link com.lowcoupling.lng.plan.plan.Responsibility <em>Responsibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.lng.plan.plan.Responsibility
     * @see com.lowcoupling.lng.plan.plan.impl.PlanPackageImpl#getResponsibility()
     * @generated
     */
    EEnum RESPONSIBILITY = eINSTANCE.getResponsibility();

  }

} //PlanPackage
