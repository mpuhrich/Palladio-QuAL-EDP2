/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory
 * @model kind="package"
 * @generated
 */
public interface MeasuringpointPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "measuringpoint";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/EDP2/MeasuringPoint/0.9.1";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.palladiosimulator.edp2.models";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MeasuringpointPackage eINSTANCE = org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl <em>Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getMeasuringPoint()
     * @generated
     */
    int MEASURING_POINT = 0;

    /**
     * The number of structural features of the '<em>Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEASURING_POINT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl <em>String Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getStringMeasuringPoint()
     * @generated
     */
    int STRING_MEASURING_POINT = 1;

    /**
     * The feature id for the '<em><b>Measuring Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_MEASURING_POINT__MEASURING_POINT = MEASURING_POINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_MEASURING_POINT_FEATURE_COUNT = MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.OperationReferenceImpl <em>Operation Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.OperationReferenceImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getOperationReference()
     * @generated
     */
    int OPERATION_REFERENCE = 6;

    /**
     * The feature id for the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_REFERENCE__ROLE = 0;

    /**
     * The feature id for the '<em><b>Operation Signature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_REFERENCE__OPERATION_SIGNATURE = 1;

    /**
     * The number of structural features of the '<em>Operation Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_REFERENCE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyOperationMeasuringPointImpl <em>Assembly Operation Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyOperationMeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getAssemblyOperationMeasuringPoint()
     * @generated
     */
    int ASSEMBLY_OPERATION_MEASURING_POINT = 2;

    /**
     * The feature id for the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSEMBLY_OPERATION_MEASURING_POINT__ROLE = OPERATION_REFERENCE__ROLE;

    /**
     * The feature id for the '<em><b>Operation Signature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSEMBLY_OPERATION_MEASURING_POINT__OPERATION_SIGNATURE = OPERATION_REFERENCE__OPERATION_SIGNATURE;

    /**
     * The feature id for the '<em><b>Assembly</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSEMBLY_OPERATION_MEASURING_POINT__ASSEMBLY = OPERATION_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Assembly Operation Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSEMBLY_OPERATION_MEASURING_POINT_FEATURE_COUNT = OPERATION_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyReferenceImpl <em>Assembly Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyReferenceImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getAssemblyReference()
     * @generated
     */
    int ASSEMBLY_REFERENCE = 7;

    /**
     * The feature id for the '<em><b>Assembly</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSEMBLY_REFERENCE__ASSEMBLY = 0;

    /**
     * The number of structural features of the '<em>Assembly Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSEMBLY_REFERENCE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyPassiveResourceMeasuringPointImpl <em>Assembly Passive Resource Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyPassiveResourceMeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getAssemblyPassiveResourceMeasuringPoint()
     * @generated
     */
    int ASSEMBLY_PASSIVE_RESOURCE_MEASURING_POINT = 3;

    /**
     * The feature id for the '<em><b>Assembly</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSEMBLY_PASSIVE_RESOURCE_MEASURING_POINT__ASSEMBLY = ASSEMBLY_REFERENCE__ASSEMBLY;

    /**
     * The feature id for the '<em><b>Passive Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSEMBLY_PASSIVE_RESOURCE_MEASURING_POINT__PASSIVE_RESOURCE = ASSEMBLY_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Assembly Passive Resource Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSEMBLY_PASSIVE_RESOURCE_MEASURING_POINT_FEATURE_COUNT = ASSEMBLY_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.ActiveResourceMeasuringPointImpl <em>Active Resource Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.ActiveResourceMeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getActiveResourceMeasuringPoint()
     * @generated
     */
    int ACTIVE_RESOURCE_MEASURING_POINT = 4;

    /**
     * The feature id for the '<em><b>Active Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_RESOURCE_MEASURING_POINT__ACTIVE_RESOURCE = MEASURING_POINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Replica ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_RESOURCE_MEASURING_POINT__REPLICA_ID = MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Active Resource Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_RESOURCE_MEASURING_POINT_FEATURE_COUNT = MEASURING_POINT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.SystemOperationMeasuringPointImpl <em>System Operation Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.SystemOperationMeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getSystemOperationMeasuringPoint()
     * @generated
     */
    int SYSTEM_OPERATION_MEASURING_POINT = 5;

    /**
     * The feature id for the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_OPERATION_MEASURING_POINT__ROLE = OPERATION_REFERENCE__ROLE;

    /**
     * The feature id for the '<em><b>Operation Signature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_OPERATION_MEASURING_POINT__OPERATION_SIGNATURE = OPERATION_REFERENCE__OPERATION_SIGNATURE;

    /**
     * The feature id for the '<em><b>System</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_OPERATION_MEASURING_POINT__SYSTEM = OPERATION_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>System Operation Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_OPERATION_MEASURING_POINT_FEATURE_COUNT = OPERATION_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.SystemReferenceImpl <em>System Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.SystemReferenceImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getSystemReference()
     * @generated
     */
    int SYSTEM_REFERENCE = 8;

    /**
     * The feature id for the '<em><b>System</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_REFERENCE__SYSTEM = 0;

    /**
     * The number of structural features of the '<em>System Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_REFERENCE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.PassiveResourceReferenceImpl <em>Passive Resource Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.PassiveResourceReferenceImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getPassiveResourceReference()
     * @generated
     */
    int PASSIVE_RESOURCE_REFERENCE = 9;

    /**
     * The feature id for the '<em><b>Passive Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSIVE_RESOURCE_REFERENCE__PASSIVE_RESOURCE = 0;

    /**
     * The number of structural features of the '<em>Passive Resource Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSIVE_RESOURCE_REFERENCE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.ActiveResourceReferenceImpl <em>Active Resource Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.ActiveResourceReferenceImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getActiveResourceReference()
     * @generated
     */
    int ACTIVE_RESOURCE_REFERENCE = 10;

    /**
     * The feature id for the '<em><b>Active Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_RESOURCE_REFERENCE__ACTIVE_RESOURCE = 0;

    /**
     * The feature id for the '<em><b>Replica ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_RESOURCE_REFERENCE__REPLICA_ID = 1;

    /**
     * The number of structural features of the '<em>Active Resource Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTIVE_RESOURCE_REFERENCE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.LinkingResourceMeasuringPointImpl <em>Linking Resource Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.LinkingResourceMeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getLinkingResourceMeasuringPoint()
     * @generated
     */
    int LINKING_RESOURCE_MEASURING_POINT = 11;

    /**
     * The feature id for the '<em><b>Linking Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKING_RESOURCE_MEASURING_POINT__LINKING_RESOURCE = MEASURING_POINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Linking Resource Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKING_RESOURCE_MEASURING_POINT_FEATURE_COUNT = MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.LinkingResourceReferenceImpl <em>Linking Resource Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.LinkingResourceReferenceImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getLinkingResourceReference()
     * @generated
     */
    int LINKING_RESOURCE_REFERENCE = 12;

    /**
     * The feature id for the '<em><b>Linking Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKING_RESOURCE_REFERENCE__LINKING_RESOURCE = 0;

    /**
     * The number of structural features of the '<em>Linking Resource Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKING_RESOURCE_REFERENCE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.SubSystemOperationMeasuringPointImpl <em>Sub System Operation Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.SubSystemOperationMeasuringPointImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getSubSystemOperationMeasuringPoint()
     * @generated
     */
    int SUB_SYSTEM_OPERATION_MEASURING_POINT = 13;

    /**
     * The feature id for the '<em><b>Subsystem</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_SYSTEM_OPERATION_MEASURING_POINT__SUBSYSTEM = MEASURING_POINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_SYSTEM_OPERATION_MEASURING_POINT__ROLE = MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Operation Signature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_SYSTEM_OPERATION_MEASURING_POINT__OPERATION_SIGNATURE = MEASURING_POINT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sub System Operation Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_SYSTEM_OPERATION_MEASURING_POINT_FEATURE_COUNT = MEASURING_POINT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.SubSystemReferenceImpl <em>Sub System Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.SubSystemReferenceImpl
     * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getSubSystemReference()
     * @generated
     */
    int SUB_SYSTEM_REFERENCE = 14;

    /**
     * The feature id for the '<em><b>Subsystem</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_SYSTEM_REFERENCE__SUBSYSTEM = 0;

    /**
     * The number of structural features of the '<em>Sub System Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_SYSTEM_REFERENCE_FEATURE_COUNT = 1;


    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint <em>Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint
     * @generated
     */
    EClass getMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint <em>String Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint
     * @generated
     */
    EClass getStringMeasuringPoint();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint#getMeasuringPoint <em>Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint#getMeasuringPoint()
     * @see #getStringMeasuringPoint()
     * @generated
     */
    EAttribute getStringMeasuringPoint_MeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.AssemblyOperationMeasuringPoint <em>Assembly Operation Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assembly Operation Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.AssemblyOperationMeasuringPoint
     * @generated
     */
    EClass getAssemblyOperationMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.AssemblyPassiveResourceMeasuringPoint <em>Assembly Passive Resource Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assembly Passive Resource Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.AssemblyPassiveResourceMeasuringPoint
     * @generated
     */
    EClass getAssemblyPassiveResourceMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceMeasuringPoint <em>Active Resource Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Active Resource Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceMeasuringPoint
     * @generated
     */
    EClass getActiveResourceMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.SystemOperationMeasuringPoint <em>System Operation Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Operation Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SystemOperationMeasuringPoint
     * @generated
     */
    EClass getSystemOperationMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.OperationReference <em>Operation Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Reference</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.OperationReference
     * @generated
     */
    EClass getOperationReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.measuringpoint.OperationReference#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Role</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.OperationReference#getRole()
     * @see #getOperationReference()
     * @generated
     */
    EReference getOperationReference_Role();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.measuringpoint.OperationReference#getOperationSignature <em>Operation Signature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Operation Signature</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.OperationReference#getOperationSignature()
     * @see #getOperationReference()
     * @generated
     */
    EReference getOperationReference_OperationSignature();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.AssemblyReference <em>Assembly Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assembly Reference</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.AssemblyReference
     * @generated
     */
    EClass getAssemblyReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.measuringpoint.AssemblyReference#getAssembly <em>Assembly</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Assembly</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.AssemblyReference#getAssembly()
     * @see #getAssemblyReference()
     * @generated
     */
    EReference getAssemblyReference_Assembly();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.SystemReference <em>System Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Reference</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SystemReference
     * @generated
     */
    EClass getSystemReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.measuringpoint.SystemReference#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>System</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SystemReference#getSystem()
     * @see #getSystemReference()
     * @generated
     */
    EReference getSystemReference_System();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.PassiveResourceReference <em>Passive Resource Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Passive Resource Reference</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.PassiveResourceReference
     * @generated
     */
    EClass getPassiveResourceReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.measuringpoint.PassiveResourceReference#getPassiveResource <em>Passive Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Passive Resource</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.PassiveResourceReference#getPassiveResource()
     * @see #getPassiveResourceReference()
     * @generated
     */
    EReference getPassiveResourceReference_PassiveResource();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceReference <em>Active Resource Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Active Resource Reference</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceReference
     * @generated
     */
    EClass getActiveResourceReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceReference#getActiveResource <em>Active Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Active Resource</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceReference#getActiveResource()
     * @see #getActiveResourceReference()
     * @generated
     */
    EReference getActiveResourceReference_ActiveResource();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceReference#getReplicaID <em>Replica ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Replica ID</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceReference#getReplicaID()
     * @see #getActiveResourceReference()
     * @generated
     */
    EAttribute getActiveResourceReference_ReplicaID();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceMeasuringPoint <em>Linking Resource Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linking Resource Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceMeasuringPoint
     * @generated
     */
    EClass getLinkingResourceMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceReference <em>Linking Resource Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linking Resource Reference</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceReference
     * @generated
     */
    EClass getLinkingResourceReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceReference#getLinkingResource <em>Linking Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Linking Resource</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceReference#getLinkingResource()
     * @see #getLinkingResourceReference()
     * @generated
     */
    EReference getLinkingResourceReference_LinkingResource();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.SubSystemOperationMeasuringPoint <em>Sub System Operation Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub System Operation Measuring Point</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SubSystemOperationMeasuringPoint
     * @generated
     */
    EClass getSubSystemOperationMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.models.measuringpoint.SubSystemReference <em>Sub System Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub System Reference</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SubSystemReference
     * @generated
     */
    EClass getSubSystemReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.edp2.models.measuringpoint.SubSystemReference#getSubsystem <em>Subsystem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Subsystem</em>'.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SubSystemReference#getSubsystem()
     * @see #getSubSystemReference()
     * @generated
     */
    EReference getSubSystemReference_Subsystem();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MeasuringpointFactory getMeasuringpointFactory();

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
    interface Literals {
        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl <em>Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getMeasuringPoint()
         * @generated
         */
        EClass MEASURING_POINT = eINSTANCE.getMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl <em>String Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getStringMeasuringPoint()
         * @generated
         */
        EClass STRING_MEASURING_POINT = eINSTANCE.getStringMeasuringPoint();

        /**
         * The meta object literal for the '<em><b>Measuring Point</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_MEASURING_POINT__MEASURING_POINT = eINSTANCE.getStringMeasuringPoint_MeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyOperationMeasuringPointImpl <em>Assembly Operation Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyOperationMeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getAssemblyOperationMeasuringPoint()
         * @generated
         */
        EClass ASSEMBLY_OPERATION_MEASURING_POINT = eINSTANCE.getAssemblyOperationMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyPassiveResourceMeasuringPointImpl <em>Assembly Passive Resource Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyPassiveResourceMeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getAssemblyPassiveResourceMeasuringPoint()
         * @generated
         */
        EClass ASSEMBLY_PASSIVE_RESOURCE_MEASURING_POINT = eINSTANCE.getAssemblyPassiveResourceMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.ActiveResourceMeasuringPointImpl <em>Active Resource Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.ActiveResourceMeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getActiveResourceMeasuringPoint()
         * @generated
         */
        EClass ACTIVE_RESOURCE_MEASURING_POINT = eINSTANCE.getActiveResourceMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.SystemOperationMeasuringPointImpl <em>System Operation Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.SystemOperationMeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getSystemOperationMeasuringPoint()
         * @generated
         */
        EClass SYSTEM_OPERATION_MEASURING_POINT = eINSTANCE.getSystemOperationMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.OperationReferenceImpl <em>Operation Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.OperationReferenceImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getOperationReference()
         * @generated
         */
        EClass OPERATION_REFERENCE = eINSTANCE.getOperationReference();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_REFERENCE__ROLE = eINSTANCE.getOperationReference_Role();

        /**
         * The meta object literal for the '<em><b>Operation Signature</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_REFERENCE__OPERATION_SIGNATURE = eINSTANCE.getOperationReference_OperationSignature();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyReferenceImpl <em>Assembly Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyReferenceImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getAssemblyReference()
         * @generated
         */
        EClass ASSEMBLY_REFERENCE = eINSTANCE.getAssemblyReference();

        /**
         * The meta object literal for the '<em><b>Assembly</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSEMBLY_REFERENCE__ASSEMBLY = eINSTANCE.getAssemblyReference_Assembly();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.SystemReferenceImpl <em>System Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.SystemReferenceImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getSystemReference()
         * @generated
         */
        EClass SYSTEM_REFERENCE = eINSTANCE.getSystemReference();

        /**
         * The meta object literal for the '<em><b>System</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM_REFERENCE__SYSTEM = eINSTANCE.getSystemReference_System();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.PassiveResourceReferenceImpl <em>Passive Resource Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.PassiveResourceReferenceImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getPassiveResourceReference()
         * @generated
         */
        EClass PASSIVE_RESOURCE_REFERENCE = eINSTANCE.getPassiveResourceReference();

        /**
         * The meta object literal for the '<em><b>Passive Resource</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PASSIVE_RESOURCE_REFERENCE__PASSIVE_RESOURCE = eINSTANCE.getPassiveResourceReference_PassiveResource();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.ActiveResourceReferenceImpl <em>Active Resource Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.ActiveResourceReferenceImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getActiveResourceReference()
         * @generated
         */
        EClass ACTIVE_RESOURCE_REFERENCE = eINSTANCE.getActiveResourceReference();

        /**
         * The meta object literal for the '<em><b>Active Resource</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTIVE_RESOURCE_REFERENCE__ACTIVE_RESOURCE = eINSTANCE.getActiveResourceReference_ActiveResource();

        /**
         * The meta object literal for the '<em><b>Replica ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTIVE_RESOURCE_REFERENCE__REPLICA_ID = eINSTANCE.getActiveResourceReference_ReplicaID();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.LinkingResourceMeasuringPointImpl <em>Linking Resource Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.LinkingResourceMeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getLinkingResourceMeasuringPoint()
         * @generated
         */
        EClass LINKING_RESOURCE_MEASURING_POINT = eINSTANCE.getLinkingResourceMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.LinkingResourceReferenceImpl <em>Linking Resource Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.LinkingResourceReferenceImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getLinkingResourceReference()
         * @generated
         */
        EClass LINKING_RESOURCE_REFERENCE = eINSTANCE.getLinkingResourceReference();

        /**
         * The meta object literal for the '<em><b>Linking Resource</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKING_RESOURCE_REFERENCE__LINKING_RESOURCE = eINSTANCE.getLinkingResourceReference_LinkingResource();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.SubSystemOperationMeasuringPointImpl <em>Sub System Operation Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.SubSystemOperationMeasuringPointImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getSubSystemOperationMeasuringPoint()
         * @generated
         */
        EClass SUB_SYSTEM_OPERATION_MEASURING_POINT = eINSTANCE.getSubSystemOperationMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.models.measuringpoint.impl.SubSystemReferenceImpl <em>Sub System Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.SubSystemReferenceImpl
         * @see org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl#getSubSystemReference()
         * @generated
         */
        EClass SUB_SYSTEM_REFERENCE = eINSTANCE.getSubSystemReference();

        /**
         * The meta object literal for the '<em><b>Subsystem</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUB_SYSTEM_REFERENCE__SUBSYSTEM = eINSTANCE.getSubSystemReference_Subsystem();

    }

} //MeasuringpointPackage
