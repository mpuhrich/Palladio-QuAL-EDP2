/**
 */
package org.palladiosimulator.edp2.models.ExperimentData;

import java.util.Date;

import javax.measure.Measure;

import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Run</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.Run#getDuration <em>Duration</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.Run#getStartTime <em>Start Time</em>}
 * </li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.Run#getMeasurement <em>Measurement
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getRun()
 * @model abstract="true"
 * @generated
 */
public interface Run extends Identifier, Propertyable {

    /**
     * Returns the value of the '<em><b>Duration</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Length of the duration in milli-seconds. <!--
     * end-model-doc -->
     *
     * @return the value of the '<em>Duration</em>' attribute.
     * @see #setDuration(Measure)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getRun_Duration()
     * @model dataType="org.palladiosimulator.edp2.models.ExperimentData.EJSDurationMeasure"
     *        required="true" ordered="false"
     * @generated
     */
    Measure getDuration();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.Run#getDuration <em>Duration</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Duration</em>' attribute.
     * @see #getDuration()
     * @generated
     */
    void setDuration(Measure value);

    /**
     * Returns the value of the '<em><b>Start Time</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Instant at which the experiment run is started.
     * <!-- end-model-doc -->
     *
     * @return the value of the '<em>Start Time</em>' attribute.
     * @see #setStartTime(Date)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getRun_StartTime()
     * @model required="true" ordered="false"
     * @generated
     */
    Date getStartTime();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.Run#getStartTime <em>Start Time</em>}
     * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Start Time</em>' attribute.
     * @see #getStartTime()
     * @generated
     */
    void setStartTime(Date value);

    /**
     * Returns the value of the '<em><b>Measurement</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.edp2.models.ExperimentData.Measurement}. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.Measurement#getRun <em>Run</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Measurement</em>' containment reference list.
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getRun_Measurement()
     * @see org.palladiosimulator.edp2.models.ExperimentData.Measurement#getRun
     * @model opposite="run" containment="true" ordered="false"
     * @generated
     */
    EList<Measurement> getMeasurement();

} // Run
