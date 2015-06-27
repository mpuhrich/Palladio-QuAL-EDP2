/**
 */
package org.palladiosimulator.edp2.local;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.edp2.local.localPackage
 * @generated
 */
public interface localFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    localFactory eINSTANCE = org.palladiosimulator.edp2.local.impl.localFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Local Directory Repository</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Local Directory Repository</em>'.
     * @generated
     */
    LocalDirectoryRepository createLocalDirectoryRepository();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    localPackage getlocalPackage();

} //localFactory
