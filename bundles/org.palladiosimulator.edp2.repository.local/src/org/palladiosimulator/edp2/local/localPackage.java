/**
 */
package org.palladiosimulator.edp2.local;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.edp2.local.localFactory
 * @model kind="package"
 * @generated
 */
public interface localPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "local";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://org.palladiosimulator.edp2/LocalRepository/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "local";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    localPackage eINSTANCE = org.palladiosimulator.edp2.local.impl.localPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.edp2.local.impl.LocalDirectoryRepositoryImpl <em>Local Directory Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.edp2.local.impl.LocalDirectoryRepositoryImpl
     * @see org.palladiosimulator.edp2.local.impl.localPackageImpl#getLocalDirectoryRepository()
     * @generated
     */
    int LOCAL_DIRECTORY_REPOSITORY = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_DIRECTORY_REPOSITORY__ID = RepositoryPackage.REPOSITORY__ID;

    /**
     * The feature id for the '<em><b>Repositories</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_DIRECTORY_REPOSITORY__REPOSITORIES = RepositoryPackage.REPOSITORY__REPOSITORIES;

    /**
     * The feature id for the '<em><b>Experiment Groups</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_DIRECTORY_REPOSITORY__EXPERIMENT_GROUPS = RepositoryPackage.REPOSITORY__EXPERIMENT_GROUPS;

    /**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_DIRECTORY_REPOSITORY__READ_ONLY = RepositoryPackage.REPOSITORY__READ_ONLY;

    /**
     * The feature id for the '<em><b>Descriptions</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_DIRECTORY_REPOSITORY__DESCRIPTIONS = RepositoryPackage.REPOSITORY__DESCRIPTIONS;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_DIRECTORY_REPOSITORY__URI = RepositoryPackage.REPOSITORY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Local Directory Repository</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_DIRECTORY_REPOSITORY_FEATURE_COUNT = RepositoryPackage.REPOSITORY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link java.io.File <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.io.File
     * @see org.palladiosimulator.edp2.local.impl.localPackageImpl#getFile()
     * @generated
     */
    int FILE = 1;

    /**
     * The number of structural features of the '<em>File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_FEATURE_COUNT = 0;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.edp2.local.LocalDirectoryRepository <em>Local Directory Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Directory Repository</em>'.
     * @see org.palladiosimulator.edp2.local.LocalDirectoryRepository
     * @generated
     */
    EClass getLocalDirectoryRepository();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.edp2.local.LocalDirectoryRepository#getUri <em>Uri</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uri</em>'.
     * @see org.palladiosimulator.edp2.local.LocalDirectoryRepository#getUri()
     * @see #getLocalDirectoryRepository()
     * @generated
     */
    EAttribute getLocalDirectoryRepository_Uri();

    /**
     * Returns the meta object for class '{@link java.io.File <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File</em>'.
     * @see java.io.File
     * @model instanceClass="java.io.File"
     * @generated
     */
    EClass getFile();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    localFactory getlocalFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link org.palladiosimulator.edp2.local.impl.LocalDirectoryRepositoryImpl <em>Local Directory Repository</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.edp2.local.impl.LocalDirectoryRepositoryImpl
         * @see org.palladiosimulator.edp2.local.impl.localPackageImpl#getLocalDirectoryRepository()
         * @generated
         */
        EClass LOCAL_DIRECTORY_REPOSITORY = eINSTANCE.getLocalDirectoryRepository();

        /**
         * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCAL_DIRECTORY_REPOSITORY__URI = eINSTANCE.getLocalDirectoryRepository_Uri();

        /**
         * The meta object literal for the '{@link java.io.File <em>File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.io.File
         * @see org.palladiosimulator.edp2.local.impl.localPackageImpl#getFile()
         * @generated
         */
        EClass FILE = eINSTANCE.getFile();

    }

} //localPackage
