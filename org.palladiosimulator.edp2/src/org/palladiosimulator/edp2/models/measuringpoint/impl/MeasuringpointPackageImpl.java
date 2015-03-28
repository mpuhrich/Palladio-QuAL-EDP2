/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.Repository.impl.RepositoryPackageImpl;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.metricspec.MetricSpecPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass measuringPointRepositoryEClass = null;

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
        if (isInited) {
            return (MeasuringpointPackage) EPackage.Registry.INSTANCE.getEPackage(MeasuringpointPackage.eNS_URI);
        }

        // Obtain or create and register package
        final MeasuringpointPackageImpl theMeasuringpointPackage = (MeasuringpointPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof MeasuringpointPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new MeasuringpointPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        MetricSpecPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final ExperimentDataPackageImpl theExperimentDataPackage = (ExperimentDataPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ExperimentDataPackage.eNS_URI) instanceof ExperimentDataPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(ExperimentDataPackage.eNS_URI) : ExperimentDataPackage.eINSTANCE);
        final RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl) (EPackage.Registry.INSTANCE
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
    @Override
    public EClass getMeasuringPoint() {
        return this.measuringPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMeasuringPoint_MeasuringPointRepository() {
        return (EReference) this.measuringPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMeasuringPoint_StringRepresentation() {
        return (EAttribute) this.measuringPointEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMeasuringPoint_ResourceURIRepresentation() {
        return (EAttribute) this.measuringPointEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStringMeasuringPoint() {
        return this.stringMeasuringPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getStringMeasuringPoint_MeasuringPoint() {
        return (EAttribute) this.stringMeasuringPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResourceURIMeasuringPoint() {
        return this.resourceURIMeasuringPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResourceURIMeasuringPoint_ResourceURI() {
        return (EAttribute) this.resourceURIMeasuringPointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMeasuringPointRepository() {
        return this.measuringPointRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMeasuringPointRepository_MeasuringPoints() {
        return (EReference) this.measuringPointRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MeasuringpointFactory getMeasuringpointFactory() {
        return (MeasuringpointFactory) this.getEFactoryInstance();
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
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.measuringPointEClass = this.createEClass(MEASURING_POINT);
        this.createEReference(this.measuringPointEClass, MEASURING_POINT__MEASURING_POINT_REPOSITORY);
        this.createEAttribute(this.measuringPointEClass, MEASURING_POINT__STRING_REPRESENTATION);
        this.createEAttribute(this.measuringPointEClass, MEASURING_POINT__RESOURCE_URI_REPRESENTATION);

        this.stringMeasuringPointEClass = this.createEClass(STRING_MEASURING_POINT);
        this.createEAttribute(this.stringMeasuringPointEClass, STRING_MEASURING_POINT__MEASURING_POINT);

        this.resourceURIMeasuringPointEClass = this.createEClass(RESOURCE_URI_MEASURING_POINT);
        this.createEAttribute(this.resourceURIMeasuringPointEClass, RESOURCE_URI_MEASURING_POINT__RESOURCE_URI);

        this.measuringPointRepositoryEClass = this.createEClass(MEASURING_POINT_REPOSITORY);
        this.createEReference(this.measuringPointRepositoryEClass, MEASURING_POINT_REPOSITORY__MEASURING_POINTS);
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
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
                .getEPackage(IdentifierPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.stringMeasuringPointEClass.getESuperTypes().add(this.getMeasuringPoint());
        this.resourceURIMeasuringPointEClass.getESuperTypes().add(this.getStringMeasuringPoint());
        this.measuringPointRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.measuringPointEClass, MeasuringPoint.class, "MeasuringPoint", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMeasuringPoint_MeasuringPointRepository(), this.getMeasuringPointRepository(),
                this.getMeasuringPointRepository_MeasuringPoints(), "measuringPointRepository", null, 1, 1,
                MeasuringPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getMeasuringPoint_StringRepresentation(), this.ecorePackage.getEString(),
                "stringRepresentation", null, 1, 1, MeasuringPoint.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getMeasuringPoint_ResourceURIRepresentation(), this.ecorePackage.getEString(),
                "resourceURIRepresentation", null, 1, 1, MeasuringPoint.class, IS_TRANSIENT, IS_VOLATILE,
                !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        this.initEClass(this.stringMeasuringPointEClass, StringMeasuringPoint.class, "StringMeasuringPoint",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getStringMeasuringPoint_MeasuringPoint(), this.ecorePackage.getEString(),
                "measuringPoint", null, 1, 1, StringMeasuringPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.resourceURIMeasuringPointEClass, ResourceURIMeasuringPoint.class,
                "ResourceURIMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getResourceURIMeasuringPoint_ResourceURI(), this.ecorePackage.getEString(),
                "resourceURI", null, 1, 1, ResourceURIMeasuringPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.measuringPointRepositoryEClass, MeasuringPointRepository.class,
                "MeasuringPointRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMeasuringPointRepository_MeasuringPoints(), this.getMeasuringPoint(),
                this.getMeasuringPoint_MeasuringPointRepository(), "measuringPoints", null, 0, -1,
                MeasuringPointRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // MeasuringpointPackageImpl
