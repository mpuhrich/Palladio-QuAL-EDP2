/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint#getMeasuringPoint <em>Measuring Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getStringMeasuringPoint()
 * @model
 * @generated
 */
public interface StringMeasuringPoint extends MeasuringPoint {
    /**
     * Returns the value of the '<em><b>Measuring Point</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measuring Point</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measuring Point</em>' attribute.
     * @see #setMeasuringPoint(String)
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getStringMeasuringPoint_MeasuringPoint()
     * @model required="true"
     * @generated
     */
    String getMeasuringPoint();

    /**
     * Sets the value of the '{@link org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint#getMeasuringPoint <em>Measuring Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measuring Point</em>' attribute.
     * @see #getMeasuringPoint()
     * @generated
     */
    void setMeasuringPoint(String value);

} // StringMeasuringPoint
