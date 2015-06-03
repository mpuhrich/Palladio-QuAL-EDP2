/**
 */
package org.palladiosimulator.edp2.models.ExperimentData;

import javax.measure.Measure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Measurement Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The&nbsp;collected&nbsp;data&nbsp;can&nbsp;be&nbsp;split&nbsp;into&nbsp;several
 * &nbsp;measurement&nbsp
 * ;ranges.&nbsp;A&nbsp;range&nbsp;is&nbsp;specified&nbsp;as&nbsp;time&nbsp;interval
 * &nbsp;and&nbsp;all&nbsp;measurements&nbsp;falling&nbsp;into&nbsp;a&nbsp;range
 * 's&nbsp;interval&nbsp;belong&nbsp;to&nbsp;that&nbsp;range.&nbsp;And&nbsp;only&nbsp;these&nbsp;measurements.&nbsp;The&nbsp;intervals&nbsp;of&nbsp;different&nbsp;ranges&nbsp;are&nbsp;not&nbsp;allowed&nbsp;to&nbsp;overlap.&nbsp;They&nbsp;have&nbsp;to&nbsp;be&nbsp;disjunct.&nbsp;There&nbsp;might&nbsp;be&nbsp;time&nbsp;betw
 * e e n
 * the&nbsp;end&nbsp;of&nbsp;one&nbsp;interval&nbsp;and&nbsp;the&nbsp;beginning&nbsp;of&nbsp;the&
 * nbsp;next. It is not allowed to change ranges or shift measurements between subsequent ranges to
 * readjust the range after measurements have been taken. Ranges can be used to differentiate the
 * warm-up-phase from the measurement phase as well as to&nbsp;implement sliding means. <!--
 * end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getRawMeasurements
 * <em>Raw Measurements</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getMeasurement <em>
 * Measurement</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getEndTime <em>End
 * Time</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getStartTime <em>
 * Start Time</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getAggregatedMeasurements
 * <em>Aggregated Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurementRange()
 * @model
 * @generated
 */
public interface MeasurementRange extends Propertyable {

    /**
     * Returns the value of the '<em><b>Raw Measurements</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements#getMeasurementRange
     * <em>Measurement Range</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Raw Measurements</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Raw Measurements</em>' containment reference.
     * @see #setRawMeasurements(RawMeasurements)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurementRange_RawMeasurements()
     * @see org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements#getMeasurementRange
     * @model opposite="measurementRange" containment="true" ordered="false"
     * @generated
     */
    RawMeasurements getRawMeasurements();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getRawMeasurements
     * <em>Raw Measurements</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Raw Measurements</em>' containment reference.
     * @see #getRawMeasurements()
     * @generated
     */
    void setRawMeasurements(RawMeasurements value);

    /**
     * Returns the value of the '<em><b>Measurement</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.Measurement#getMeasurementRanges
     * <em>Measurement Ranges</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement</em>' container reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Measurement</em>' container reference.
     * @see #setMeasurement(Measurement)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurementRange_Measurement()
     * @see org.palladiosimulator.edp2.models.ExperimentData.Measurement#getMeasurementRanges
     * @model opposite="measurementRanges" required="true" transient="false" ordered="false"
     * @generated
     */
    Measurement getMeasurement();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getMeasurement
     * <em>Measurement</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Measurement</em>' container reference.
     * @see #getMeasurement()
     * @generated
     */
    void setMeasurement(Measurement value);

    /**
     * Returns the value of the '<em><b>End Time</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Time passed since the start of the measuring. It
     * refers to the right end of the time interval for which the measurements are captured in this
     * range.
     *
     * For example, in a simulation environment this would mean simulation time passed since the
     * start of the simulation. In a real world environment this would be the real time passed after
     * the measurement has been started. <!-- end-model-doc -->
     *
     * @return the value of the '<em>End Time</em>' attribute.
     * @see #setEndTime(Measure)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurementRange_EndTime()
     * @model dataType="org.palladiosimulator.edp2.models.ExperimentData.EJSDurationMeasure"
     *        required="true" ordered="false"
     * @generated
     */
    Measure getEndTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getEndTime
     * <em>End Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>End Time</em>' attribute.
     * @see #getEndTime()
     * @generated
     */
    void setEndTime(Measure value);

    /**
     * Returns the value of the '<em><b>Start Time</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Time passed since the start of the measuring. It
     * refers to the left end of the time interval for which the measurements are captured in this
     * range.
     *
     * For example, in a simulation environment this would mean simulation time passed since the
     * start of the simulation. In a real world environment this would be the real time passed after
     * the measurement has been started. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Start Time</em>' attribute.
     * @see #setStartTime(Measure)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurementRange_StartTime()
     * @model dataType="org.palladiosimulator.edp2.models.ExperimentData.EJSDurationMeasure"
     *        required="true" ordered="false"
     * @generated
     */
    Measure getStartTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange#getStartTime
     * <em>Start Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Start Time</em>' attribute.
     * @see #getStartTime()
     * @generated
     */
    void setStartTime(Measure value);

    /**
     * Returns the value of the '<em><b>Aggregated Measurements</b></em>' containment reference
     * list. The list contents are of type
     * {@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements}. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getMeasurementRange
     * <em>Measurement Range</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregated Measurements</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Aggregated Measurements</em>' containment reference list.
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getMeasurementRange_AggregatedMeasurements()
     * @see org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements#getMeasurementRange
     * @model opposite="measurementRange" containment="true" ordered="false"
     * @generated
     */
    EList<AggregatedMeasurements> getAggregatedMeasurements();

} // MeasurementRange
