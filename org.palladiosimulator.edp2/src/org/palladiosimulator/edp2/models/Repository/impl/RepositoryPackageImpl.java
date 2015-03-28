/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.impl;

import java.io.File;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.edp2.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.dao.MetaDao;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.impl.ExperimentDataPackageImpl;
import org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository;
import org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository;
import org.palladiosimulator.edp2.models.Repository.LocalSensorFrameworkRepository;
import org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository;
import org.palladiosimulator.edp2.models.Repository.Repositories;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointPackageImpl;
import org.palladiosimulator.metricspec.MetricSpecPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class RepositoryPackageImpl extends EPackageImpl implements RepositoryPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass localDirectoryRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass fileEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass localMemoryRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass remoteCdoRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass localSensorFrameworkRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass repositoriesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass iResourceSetEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass measurementsDaoFactoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass metaDaoEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass repositoryEClass = null;

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
     * @see org.palladiosimulator.edp2.models.Repository.RepositoryPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RepositoryPackageImpl() {
        super(eNS_URI, RepositoryFactory.eINSTANCE);
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
     * This method is used to initialize {@link RepositoryPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RepositoryPackage init() {
        if (isInited) {
            return (RepositoryPackage) EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
        }

        // Obtain or create and register package
        final RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof RepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                : new RepositoryPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        MetricSpecPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final ExperimentDataPackageImpl theExperimentDataPackage = (ExperimentDataPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ExperimentDataPackage.eNS_URI) instanceof ExperimentDataPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(ExperimentDataPackage.eNS_URI) : ExperimentDataPackage.eINSTANCE);
        final MeasuringpointPackageImpl theMeasuringpointPackage = (MeasuringpointPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(MeasuringpointPackage.eNS_URI) instanceof MeasuringpointPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(MeasuringpointPackage.eNS_URI) : MeasuringpointPackage.eINSTANCE);

        // Create package meta-data objects
        theRepositoryPackage.createPackageContents();
        theExperimentDataPackage.createPackageContents();
        theMeasuringpointPackage.createPackageContents();

        // Initialize created meta-data
        theRepositoryPackage.initializePackageContents();
        theExperimentDataPackage.initializePackageContents();
        theMeasuringpointPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRepositoryPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RepositoryPackage.eNS_URI, theRepositoryPackage);
        return theRepositoryPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLocalDirectoryRepository() {
        return this.localDirectoryRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLocalDirectoryRepository_Uri() {
        return (EAttribute) this.localDirectoryRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFile() {
        return this.fileEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLocalMemoryRepository() {
        return this.localMemoryRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLocalMemoryRepository_Domain() {
        return (EAttribute) this.localMemoryRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRemoteCdoRepository() {
        return this.remoteCdoRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRemoteCdoRepository_Url() {
        return (EAttribute) this.remoteCdoRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLocalSensorFrameworkRepository() {
        return this.localSensorFrameworkRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLocalSensorFrameworkRepository_Uri() {
        return (EAttribute) this.localSensorFrameworkRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLocalSensorFrameworkRepository_ImportSettings() {
        return (EAttribute) this.localSensorFrameworkRepositoryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRepositories() {
        return this.repositoriesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRepositories_AvailableRepositories() {
        return (EReference) this.repositoriesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRepositories_CommonResourceSet() {
        return (EReference) this.repositoriesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getIResourceSet() {
        return this.iResourceSetEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMeasurementsDaoFactory() {
        return this.measurementsDaoFactoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMetaDao() {
        return this.metaDaoEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRepository() {
        return this.repositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRepository_Repositories() {
        return (EReference) this.repositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRepository_ReadOnly() {
        return (EAttribute) this.repositoryEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRepository_Descriptions() {
        return (EReference) this.repositoryEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRepository_ExperimentGroups() {
        return (EReference) this.repositoryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RepositoryFactory getRepositoryFactory() {
        return (RepositoryFactory) this.getEFactoryInstance();
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
        this.localDirectoryRepositoryEClass = this.createEClass(LOCAL_DIRECTORY_REPOSITORY);
        this.createEAttribute(this.localDirectoryRepositoryEClass, LOCAL_DIRECTORY_REPOSITORY__URI);

        this.fileEClass = this.createEClass(FILE);

        this.localMemoryRepositoryEClass = this.createEClass(LOCAL_MEMORY_REPOSITORY);
        this.createEAttribute(this.localMemoryRepositoryEClass, LOCAL_MEMORY_REPOSITORY__DOMAIN);

        this.remoteCdoRepositoryEClass = this.createEClass(REMOTE_CDO_REPOSITORY);
        this.createEAttribute(this.remoteCdoRepositoryEClass, REMOTE_CDO_REPOSITORY__URL);

        this.localSensorFrameworkRepositoryEClass = this.createEClass(LOCAL_SENSOR_FRAMEWORK_REPOSITORY);
        this.createEAttribute(this.localSensorFrameworkRepositoryEClass, LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI);
        this.createEAttribute(this.localSensorFrameworkRepositoryEClass,
                LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS);

        this.repositoriesEClass = this.createEClass(REPOSITORIES);
        this.createEReference(this.repositoriesEClass, REPOSITORIES__AVAILABLE_REPOSITORIES);
        this.createEReference(this.repositoriesEClass, REPOSITORIES__COMMON_RESOURCE_SET);

        this.iResourceSetEClass = this.createEClass(IRESOURCE_SET);

        this.measurementsDaoFactoryEClass = this.createEClass(MEASUREMENTS_DAO_FACTORY);

        this.metaDaoEClass = this.createEClass(META_DAO);

        this.repositoryEClass = this.createEClass(REPOSITORY);
        this.createEReference(this.repositoryEClass, REPOSITORY__REPOSITORIES);
        this.createEReference(this.repositoryEClass, REPOSITORY__EXPERIMENT_GROUPS);
        this.createEAttribute(this.repositoryEClass, REPOSITORY__READ_ONLY);
        this.createEReference(this.repositoryEClass, REPOSITORY__DESCRIPTIONS);
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
        final ExperimentDataPackage theExperimentDataPackage = (ExperimentDataPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExperimentDataPackage.eNS_URI);
        final MetricSpecPackage theMetricSpecPackage = (MetricSpecPackage) EPackage.Registry.INSTANCE
                .getEPackage(MetricSpecPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.localDirectoryRepositoryEClass.getESuperTypes().add(this.getRepository());
        this.localMemoryRepositoryEClass.getESuperTypes().add(this.getRepository());
        this.remoteCdoRepositoryEClass.getESuperTypes().add(this.getRepository());
        this.localSensorFrameworkRepositoryEClass.getESuperTypes().add(this.getRepository());
        this.repositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.repositoryEClass.getESuperTypes().add(this.getMetaDao());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.localDirectoryRepositoryEClass, LocalDirectoryRepository.class,
                "LocalDirectoryRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getLocalDirectoryRepository_Uri(), this.ecorePackage.getEString(), "uri", null, 1, 1,
                LocalDirectoryRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        final EOperation op = this.addEOperation(this.localDirectoryRepositoryEClass, this.getFile(),
                "convertUriStringToFile", 1, 1, IS_UNIQUE, !IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEString(), "uriString", 1, 1, IS_UNIQUE, !IS_ORDERED);

        this.initEClass(this.fileEClass, File.class, "File", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.localMemoryRepositoryEClass, LocalMemoryRepository.class, "LocalMemoryRepository",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getLocalMemoryRepository_Domain(), this.ecorePackage.getEString(), "domain", null, 1,
                1, LocalMemoryRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.remoteCdoRepositoryEClass, RemoteCdoRepository.class, "RemoteCdoRepository", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getRemoteCdoRepository_Url(), this.ecorePackage.getEString(), "url", null, 1, 1,
                RemoteCdoRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.localSensorFrameworkRepositoryEClass, LocalSensorFrameworkRepository.class,
                "LocalSensorFrameworkRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getLocalSensorFrameworkRepository_Uri(), this.ecorePackage.getEString(), "uri", null,
                1, 1, LocalSensorFrameworkRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getLocalSensorFrameworkRepository_ImportSettings(), this.ecorePackage.getEString(),
                "importSettings", null, 1, 1, LocalSensorFrameworkRepository.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.repositoriesEClass, Repositories.class, "Repositories", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getRepositories_AvailableRepositories(), this.getRepository(),
                this.getRepository_Repositories(), "availableRepositories", null, 0, -1, Repositories.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getRepositories_CommonResourceSet(), this.getIResourceSet(), null,
                "commonResourceSet", null, 1, 1, Repositories.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.iResourceSetEClass, ResourceSet.class, "IResourceSet", IS_ABSTRACT, IS_INTERFACE,
                !IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.measurementsDaoFactoryEClass, MeasurementsDaoFactory.class, "MeasurementsDaoFactory",
                IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.metaDaoEClass, MetaDao.class, "MetaDao", IS_ABSTRACT, IS_INTERFACE,
                !IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.repositoryEClass, Repository.class, "Repository", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getRepository_Repositories(), this.getRepositories(),
                this.getRepositories_AvailableRepositories(), "repositories", null, 1, 1, Repository.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getRepository_ExperimentGroups(), theExperimentDataPackage.getExperimentGroup(),
                theExperimentDataPackage.getExperimentGroup_Repository(), "experimentGroups", null, 0, -1,
                Repository.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getRepository_ReadOnly(), this.ecorePackage.getEBoolean(), "readOnly", null, 1, 1,
                Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getRepository_Descriptions(), theMetricSpecPackage.getDescription(), null,
                "descriptions", null, 0, -1, Repository.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.addEOperation(this.repositoryEClass, null, "resetExperimentGroups", 1, 1, IS_UNIQUE, !IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // RepositoryPackageImpl
