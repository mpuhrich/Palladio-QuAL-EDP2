/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage
 * @generated
 */
public interface MeasuringpointFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    MeasuringpointFactory eINSTANCE = org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringpointFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>String Measuring Point</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>String Measuring Point</em>'.
     * @generated
     */
    StringMeasuringPoint createStringMeasuringPoint();

    /**
     * Returns a new object of class '<em>Resource URI Measuring Point</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Resource URI Measuring Point</em>'.
     * @generated
     */
    ResourceURIMeasuringPoint createResourceURIMeasuringPoint();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    MeasuringpointPackage getMeasuringpointPackage();

} // MeasuringpointFactory
