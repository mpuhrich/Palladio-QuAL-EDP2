/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getMeasuringPointRepository
 * <em>Measuring Point Repository</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getStringRepresentation
 * <em>String Representation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getResourceURIRepresentation
 * <em>Resource URI Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getMeasuringPoint()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface MeasuringPoint extends CDOObject {

    /**
     * Returns the value of the '<em><b>Measuring Point Repository</b></em>' container reference. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository#getMeasuringPoints
     * <em>Measuring Points</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measuring Point Repository</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Measuring Point Repository</em>' container reference.
     * @see #setMeasuringPointRepository(MeasuringPointRepository)
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getMeasuringPoint_MeasuringPointRepository()
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository#getMeasuringPoints
     * @model opposite="measuringPoints" required="true" transient="false"
     * @generated
     */
    MeasuringPointRepository getMeasuringPointRepository();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getMeasuringPointRepository
     * <em>Measuring Point Repository</em>}' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Measuring Point Repository</em>' container reference.
     * @see #getMeasuringPointRepository()
     * @generated
     */
    void setMeasuringPointRepository(MeasuringPointRepository value);

    /**
     * Returns the value of the '<em><b>String Representation</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>String Representation</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>String Representation</em>' attribute.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getMeasuringPoint_StringRepresentation()
     * @model required="true" transient="true" changeable="false" volatile="true"
     * @generated
     */
    String getStringRepresentation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getStringRepresentation
     * <em>String Representation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>String Representation</em>' attribute.
     * @see #getStringRepresentation()
     * @generated
     */
    void setStringRepresentation(String value);

    /**
     * Returns the value of the '<em><b>Resource URI Representation</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource URI Representation</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Resource URI Representation</em>' attribute.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getMeasuringPoint_ResourceURIRepresentation()
     * @model id="true" required="true" transient="true" changeable="false" volatile="true"
     * @generated
     */
    String getResourceURIRepresentation();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint#getResourceURIRepresentation
     * <em>Resource URI Representation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Resource URI Representation</em>' attribute.
     * @see #getResourceURIRepresentation()
     * @generated
     */
    void setResourceURIRepresentation(String value);
} // MeasuringPoint
