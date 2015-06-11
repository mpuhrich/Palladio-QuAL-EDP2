/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository;
import org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository;
import org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository;
import org.palladiosimulator.edp2.models.Repository.Repositories;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class RepositoryFactoryImpl extends EFactoryImpl implements RepositoryFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static RepositoryFactory init() {
        try {
            final RepositoryFactory theRepositoryFactory = (RepositoryFactory) EPackage.Registry.INSTANCE
                    .getEFactory(RepositoryPackage.eNS_URI);
            if (theRepositoryFactory != null) {
                return theRepositoryFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RepositoryFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public RepositoryFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case RepositoryPackage.LOCAL_DIRECTORY_REPOSITORY:
            return this.createLocalDirectoryRepository();
        case RepositoryPackage.LOCAL_MEMORY_REPOSITORY:
            return this.createLocalMemoryRepository();
        case RepositoryPackage.REMOTE_CDO_REPOSITORY:
            return this.createRemoteCdoRepository();
        case RepositoryPackage.REPOSITORIES:
            return this.createRepositories();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LocalDirectoryRepository createLocalDirectoryRepository() {
        final LocalDirectoryRepositoryImpl localDirectoryRepository = new LocalDirectoryRepositoryImpl();
        return localDirectoryRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LocalMemoryRepository createLocalMemoryRepository() {
        final LocalMemoryRepositoryImpl localMemoryRepository = new LocalMemoryRepositoryImpl();
        return localMemoryRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RemoteCdoRepository createRemoteCdoRepository() {
        final RemoteCdoRepositoryImpl remoteCdoRepository = new RemoteCdoRepositoryImpl();
        return remoteCdoRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Repositories createRepositories() {
        final RepositoriesImpl repositories = new RepositoriesImpl();
        return repositories;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RepositoryPackage getRepositoryPackage() {
        return (RepositoryPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RepositoryPackage getPackage() {
        return RepositoryPackage.eINSTANCE;
    }

} // RepositoryFactoryImpl
