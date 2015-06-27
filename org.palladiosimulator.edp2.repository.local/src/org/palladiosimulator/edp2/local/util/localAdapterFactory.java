/**
 */
package org.palladiosimulator.edp2.local.util;

import de.uka.ipd.sdq.identifier.Identifier;

import java.io.File;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.edp2.dao.MetaDao;

import org.palladiosimulator.edp2.local.*;

import org.palladiosimulator.edp2.models.Repository.Repository;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.edp2.local.localPackage
 * @generated
 */
public class localAdapterFactory extends AdapterFactoryImpl
{
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static localPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public localAdapterFactory()
    {
        if (modelPackage == null)
        {
            modelPackage = localPackage.eINSTANCE;
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
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected localSwitch<Adapter> modelSwitch =
            new localSwitch<Adapter>()
            {
                @Override
                public Adapter caseLocalDirectoryRepository(LocalDirectoryRepository object)
                {
                    return createLocalDirectoryRepositoryAdapter();
                }

                @Override
                public Adapter caseFile(File object)
                {
                    return createFileAdapter();
                }

                @Override
                public Adapter caseIdentifier(Identifier object)
                {
                    return createIdentifierAdapter();
                }

                @Override
                public Adapter caseMetaDao(MetaDao object)
                {
                    return createMetaDaoAdapter();
                }

                @Override
                public Adapter caseRepository(Repository object)
                {
                    return createRepositoryAdapter();
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
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.local.LocalDirectoryRepository <em>Local Directory Repository</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.local.LocalDirectoryRepository
     * @generated
     */
    public Adapter createLocalDirectoryRepositoryAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link java.io.File <em>File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see java.io.File
     * @generated
     */
    public Adapter createFileAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.dao.MetaDao <em>Meta Dao</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.dao.MetaDao
     * @generated
     */
    public Adapter createMetaDaoAdapter()
    {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.Repository.Repository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.Repository.Repository
     * @generated
     */
    public Adapter createRepositoryAdapter()
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

} //localAdapterFactory
