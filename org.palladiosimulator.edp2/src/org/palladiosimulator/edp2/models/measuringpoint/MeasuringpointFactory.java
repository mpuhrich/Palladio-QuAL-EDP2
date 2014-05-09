/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage
 * @generated
 */
public interface MeasuringpointFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MeasuringpointFactory eINSTANCE = org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointFactoryImpl.init();

    /**
     * Returns a new object of class '<em>String Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Measuring Point</em>'.
     * @generated
     */
    StringMeasuringPoint createStringMeasuringPoint();

    /**
     * Returns a new object of class '<em>Assembly Operation Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assembly Operation Measuring Point</em>'.
     * @generated
     */
    AssemblyOperationMeasuringPoint createAssemblyOperationMeasuringPoint();

    /**
     * Returns a new object of class '<em>Assembly Passive Resource Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assembly Passive Resource Measuring Point</em>'.
     * @generated
     */
    AssemblyPassiveResourceMeasuringPoint createAssemblyPassiveResourceMeasuringPoint();

    /**
     * Returns a new object of class '<em>Active Resource Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Active Resource Measuring Point</em>'.
     * @generated
     */
    ActiveResourceMeasuringPoint createActiveResourceMeasuringPoint();

    /**
     * Returns a new object of class '<em>System Operation Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System Operation Measuring Point</em>'.
     * @generated
     */
    SystemOperationMeasuringPoint createSystemOperationMeasuringPoint();

    /**
     * Returns a new object of class '<em>Linking Resource Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Linking Resource Measuring Point</em>'.
     * @generated
     */
    LinkingResourceMeasuringPoint createLinkingResourceMeasuringPoint();

    /**
     * Returns a new object of class '<em>Sub System Operation Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub System Operation Measuring Point</em>'.
     * @generated
     */
    SubSystemOperationMeasuringPoint createSubSystemOperationMeasuringPoint();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MeasuringpointPackage getMeasuringpointPackage();

} //MeasuringpointFactory
