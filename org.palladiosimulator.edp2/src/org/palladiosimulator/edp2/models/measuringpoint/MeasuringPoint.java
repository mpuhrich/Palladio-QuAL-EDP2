/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.ecore.EObject;

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
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getMeasuringPoint()
 * @model abstract="true"
 * @generated
 */
public interface MeasuringPoint extends EObject {

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
} // MeasuringPoint
