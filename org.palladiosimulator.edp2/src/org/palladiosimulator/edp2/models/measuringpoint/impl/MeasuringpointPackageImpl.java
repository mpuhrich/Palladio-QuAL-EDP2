/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.metricspec.MetricSpecPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MeasuringpointPackageImpl extends EPackageImpl implements MeasuringpointPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass measuringPointEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass stringMeasuringPointEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass resourceURIMeasuringPointEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MeasuringpointPackageImpl() {
        super(eNS_URI, MeasuringpointFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     * 
     * <p>
     * This method is used to initialize {@link MeasuringpointPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MeasuringpointPackage init() {
        if (isInited)
            return (MeasuringpointPackage) EPackage.Registry.INSTANCE.getEPackage(MeasuringpointPackage.eNS_URI);

        // Obtain or create and register package
        MeasuringpointPackageImpl theMeasuringpointPackage = (MeasuringpointPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof MeasuringpointPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                : new MeasuringpointPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        MetricSpecPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        ExperimentDataPackageImpl theExperimentDataPackage = (ExperimentDataPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ExperimentDataPackage.eNS_URI) instanceof ExperimentDataPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ExperimentDataPackage.eNS_URI) : ExperimentDataPackage.eINSTANCE);
        RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(RepositoryPackage.eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(RepositoryPackage.eNS_URI) : RepositoryPackage.eINSTANCE);

        // Create package meta-data objects
        theMeasuringpointPackage.createPackageContents();
        theExperimentDataPackage.createPackageContents();
        theRepositoryPackage.createPackageContents();

        // Initialize created meta-data
        theMeasuringpointPackage.initializePackageContents();
        theExperimentDataPackage.initializePackageContents();
        theRepositoryPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMeasuringpointPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MeasuringpointPackage.eNS_URI, theMeasuringpointPackage);
        return theMeasuringpointPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getMeasuringPoint() {
        return measuringPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getStringMeasuringPoint() {
        return stringMeasuringPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getStringMeasuringPoint_MeasuringPoint() {
        return (EAttribute) stringMeasuringPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getResourceURIMeasuringPoint() {
        return resourceURIMeasuringPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getResourceURIMeasuringPoint_ResourceURI() {
        return (EAttribute) resourceURIMeasuringPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MeasuringpointFactory getMeasuringpointFactory() {
        return (MeasuringpointFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        measuringPointEClass = createEClass(MEASURING_POINT);

        stringMeasuringPointEClass = createEClass(STRING_MEASURING_POINT);
        createEAttribute(stringMeasuringPointEClass, STRING_MEASURING_POINT__MEASURING_POINT);

        resourceURIMeasuringPointEClass = createEClass(RESOURCE_URI_MEASURING_POINT);
        createEAttribute(resourceURIMeasuringPointEClass, RESOURCE_URI_MEASURING_POINT__RESOURCE_URI);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        stringMeasuringPointEClass.getESuperTypes().add(this.getMeasuringPoint());
        resourceURIMeasuringPointEClass.getESuperTypes().add(this.getStringMeasuringPoint());

        // Initialize classes and features; add operations and parameters
        initEClass(measuringPointEClass, MeasuringPoint.class, "MeasuringPoint", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(stringMeasuringPointEClass, StringMeasuringPoint.class, "StringMeasuringPoint", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringMeasuringPoint_MeasuringPoint(), ecorePackage.getEString(), "measuringPoint", null, 1,
                1, StringMeasuringPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceURIMeasuringPointEClass, ResourceURIMeasuringPoint.class, "ResourceURIMeasuringPoint",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResourceURIMeasuringPoint_ResourceURI(), ecorePackage.getEString(), "resourceURI", null, 1,
                1, ResourceURIMeasuringPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} // MeasuringpointPackageImpl
