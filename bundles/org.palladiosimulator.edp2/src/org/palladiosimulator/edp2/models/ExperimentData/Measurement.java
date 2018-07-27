/**
 */
package org.palladiosimulator.edp2.models.ExperimentData;

import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Measurement</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * There&nbsp;is&nbsp;exactly&nbsp;one&nbsp;instance&nbsp;of&nbsp;this&nbsp;
 * class&nbsp;for&nbsp;each&
 * nbsp;combination&nbsp;of&nbsp;experiment&nbsp;run&nbsp;and&nbsp;corresponding
 * &nbsp;measure&nbsp;declaration. It indicates that the experiment run contains measurements for
 * the linked Edp2Measure. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.Measurement#getMeasuringType <em>
 * Measuring Type</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.Measurement#getMeasurementRanges <em>
 * Measurement Ranges</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.Measurement#getRun <em>Run</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends Identifier, Propertyable {

    /**
     * Returns the value of the '<em><b>Measuring Type</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measuring Type</em>' reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Measuring Type</em>' reference.
     * @see #setMeasuringType(MeasuringType)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurement_MeasuringType()
     * @model required="true" ordered="false"
     * @generated
     */
    MeasuringType getMeasuringType();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.Measurement#getMeasuringType
     * <em>Measuring Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Measuring Type</em>' reference.
     * @see #getMeasuringType()
     * @generated
     */
    void setMeasuringType(MeasuringType value);

    /**
     * Returns the value of the '<em><b>Measurement Ranges</b></em>' containment reference list. The
     * list contents are of type
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange}. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getMeasurement
     * <em>Measurement</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Ranges</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Measurement Ranges</em>' containment reference list.
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurement_MeasurementRanges()
     * @see org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getMeasurement
     * @model opposite="measurement" containment="true" ordered="false"
     * @generated
     */
    EList<MeasurementRange> getMeasurementRanges();

    /**
     * Returns the value of the '<em><b>Run</b></em>' container reference. It is bidirectional and
     * its opposite is '{@link org.palladiosimulator.edp2.models.ExperimentData.Run#getMeasurement
     * <em>Measurement</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Run</em>' container reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Run</em>' container reference.
     * @see #setRun(Run)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurement_Run()
     * @see org.palladiosimulator.edp2.models.ExperimentData.Run#getMeasurement
     * @model opposite="measurement" required="true" transient="false"
     * @generated
     */
    Run getRun();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.Measurement#getRun <em>Run</em>}'
     * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Run</em>' container reference.
     * @see #getRun()
     * @generated
     */
    void setRun(Run value);

} // Measurement
