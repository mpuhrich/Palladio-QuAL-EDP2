/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource URI Measuring Point</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint#getResourceURI
 * <em>Resource URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getResourceURIMeasuringPoint()
 * @model
 * @generated
 */
public interface ResourceURIMeasuringPoint extends StringMeasuringPoint {

    /**
     * Returns the value of the '<em><b>Resource URI</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource URI</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Resource URI</em>' attribute.
     * @see #setResourceURI(String)
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getResourceURIMeasuringPoint_ResourceURI()
     * @model required="true"
     * @generated
     */
    String getResourceURI();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint#getResourceURI
     * <em>Resource URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Resource URI</em>' attribute.
     * @see #getResourceURI()
     * @generated
     */
    void setResourceURI(String value);

} // ResourceURIMeasuringPoint
