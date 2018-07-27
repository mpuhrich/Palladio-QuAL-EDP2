/**
 */
package org.palladiosimulator.edp2.local.impl;

import java.io.File;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.edp2.local.LocalDirectoryRepository;
import org.palladiosimulator.edp2.local.localFactory;
import org.palladiosimulator.edp2.local.localPackage;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;

import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class localPackageImpl extends EPackageImpl implements localPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localDirectoryRepositoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.edp2.local.localPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private localPackageImpl()
    {
        super(eNS_URI, localFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link localPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static localPackage init()
    {
        if (isInited)
            return (localPackage) EPackage.Registry.INSTANCE.getEPackage(localPackage.eNS_URI);

        // Obtain or create and register package
        localPackageImpl thelocalPackage = (localPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof localPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new localPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        ExperimentDataPackage.eINSTANCE.eClass();
        RepositoryPackage.eINSTANCE.eClass();
        MeasuringpointPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        thelocalPackage.createPackageContents();

        // Initialize created meta-data
        thelocalPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thelocalPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(localPackage.eNS_URI, thelocalPackage);
        return thelocalPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalDirectoryRepository()
    {
        return localDirectoryRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLocalDirectoryRepository_Uri()
    {
        return (EAttribute) localDirectoryRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFile()
    {
        return fileEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public localFactory getlocalFactory()
    {
        return (localFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents()
    {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        localDirectoryRepositoryEClass = createEClass(LOCAL_DIRECTORY_REPOSITORY);
        createEAttribute(localDirectoryRepositoryEClass, LOCAL_DIRECTORY_REPOSITORY__URI);

        fileEClass = createEClass(FILE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents()
    {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
                .getEPackage(RepositoryPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        localDirectoryRepositoryEClass.getESuperTypes().add(theRepositoryPackage.getRepository());

        // Initialize classes and features; add operations and parameters
        initEClass(localDirectoryRepositoryEClass, LocalDirectoryRepository.class, "LocalDirectoryRepository",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLocalDirectoryRepository_Uri(), ecorePackage.getEString(), "uri", null, 1, 1,
                LocalDirectoryRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        EOperation op = addEOperation(localDirectoryRepositoryEClass, this.getFile(), "convertUriStringToFile", 1, 1,
                IS_UNIQUE, !IS_ORDERED);
        addEParameter(op, ecorePackage.getEString(), "uriString", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(fileEClass, File.class, "File", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //localPackageImpl
