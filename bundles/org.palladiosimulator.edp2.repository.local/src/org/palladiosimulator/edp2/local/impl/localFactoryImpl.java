/**
 */
package org.palladiosimulator.edp2.local.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.edp2.local.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class localFactoryImpl extends EFactoryImpl implements localFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static localFactory init()
    {
        try
        {
            localFactory thelocalFactory = (localFactory) EPackage.Registry.INSTANCE.getEFactory(localPackage.eNS_URI);
            if (thelocalFactory != null)
            {
                return thelocalFactory;
            }
        } catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new localFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public localFactoryImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass)
    {
        switch (eClass.getClassifierID())
        {
        case localPackage.LOCAL_DIRECTORY_REPOSITORY:
            return createLocalDirectoryRepository();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalDirectoryRepository createLocalDirectoryRepository()
    {
        LocalDirectoryRepositoryImpl localDirectoryRepository = new LocalDirectoryRepositoryImpl();
        return localDirectoryRepository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public localPackage getlocalPackage()
    {
        return (localPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static localPackage getPackage()
    {
        return localPackage.eINSTANCE;
    }

} //localFactoryImpl
