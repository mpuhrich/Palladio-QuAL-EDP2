/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.edp2.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.dao.MetaDao;
import org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository;
import org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository;
import org.palladiosimulator.edp2.models.Repository.Repositories;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.edp2.models.Repository.RepositoryPackage
 * @generated
 */
public class RepositoryAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static RepositoryPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public RepositoryAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = RepositoryPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected RepositorySwitch<Adapter> modelSwitch = new RepositorySwitch<Adapter>()
            {
        @Override
        public Adapter caseLocalMemoryRepository(final LocalMemoryRepository object)
        {
            return RepositoryAdapterFactory.this.createLocalMemoryRepositoryAdapter();
        }

        @Override
        public Adapter caseRemoteCdoRepository(final RemoteCdoRepository object)
        {
            return RepositoryAdapterFactory.this.createRemoteCdoRepositoryAdapter();
        }

        @Override
        public Adapter caseRepositories(final Repositories object)
        {
            return RepositoryAdapterFactory.this.createRepositoriesAdapter();
        }

        @Override
        public Adapter caseIResourceSet(final ResourceSet object)
        {
            return RepositoryAdapterFactory.this.createIResourceSetAdapter();
        }

        @Override
        public Adapter caseMeasurementsDaoFactory(final MeasurementsDaoFactory object)
        {
            return RepositoryAdapterFactory.this.createMeasurementsDaoFactoryAdapter();
        }

        @Override
        public Adapter caseMetaDao(final MetaDao object)
        {
            return RepositoryAdapterFactory.this.createMetaDaoAdapter();
        }

        @Override
        public Adapter caseRepository(final Repository object)
        {
            return RepositoryAdapterFactory.this.createRepositoryAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object)
        {
            return RepositoryAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return RepositoryAdapterFactory.this.createEObjectAdapter();
        }
            };

            /**
             * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
             * @generated
             */
            @Override
            public Adapter createAdapter(final Notifier target) {
                return this.modelSwitch.doSwitch((EObject) target);
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository
     * <em>Local Memory Repository</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository
             * @generated
             */
            public Adapter createLocalMemoryRepositoryAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository
     * <em>Remote Cdo Repository</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository
             * @generated
             */
            public Adapter createRemoteCdoRepositoryAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.models.Repository.Repositories <em>Repositories</em>}'.
             * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             *
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.Repository.Repositories
             * @generated
             */
            public Adapter createRepositoriesAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
             * {@link org.eclipse.emf.ecore.resource.ResourceSet <em>IResource Set</em>}'. <!--
             * begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             *
             * @return the new adapter.
             * @see org.eclipse.emf.ecore.resource.ResourceSet
             * @generated
             */
            public Adapter createIResourceSetAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.edp2.dao.MeasurementsDaoFactory
     * <em>Measurements Dao Factory</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.dao.MeasurementsDaoFactory
             * @generated
             */
            public Adapter createMeasurementsDaoFactoryAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.dao.MetaDao
     * <em>Meta Dao</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see org.palladiosimulator.edp2.dao.MetaDao
             * @generated
             */
            public Adapter createMetaDaoAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.edp2.models.Repository.Repository <em>Repository</em>}'. <!--
             * begin-user-doc --> This default implementation returns null so that we can easily ignore
             * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
             * end-user-doc -->
             *
             * @return the new adapter.
             * @see org.palladiosimulator.edp2.models.Repository.Repository
             * @generated
             */
            public Adapter createRepositoryAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see de.uka.ipd.sdq.identifier.Identifier
             * @generated
             */
            public Adapter createIdentifierAdapter() {
                return null;
            }

            /**
             * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @generated
             */
            public Adapter createEObjectAdapter() {
                return null;
            }

} // RepositoryAdapterFactory
