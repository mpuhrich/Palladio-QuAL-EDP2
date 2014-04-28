/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData;

import org.eclipse.emf.common.util.EList;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raw Measurements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Raw measurements contains an orderered list of measurements for a sensor. For each measurement the time when the measurement as well as the measurement itself are stored. Hence, n measurements imply n event times. This means that  inheriting classes have to ensure the same number and ordering for additionally stored measurements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements#getDataSeries <em>Data Series</em>}</li>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements#getMeasurementsRange <em>Measurements Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getRawMeasurements()
 * @model
 * @generated
 */
public interface RawMeasurements extends Identifier {
	/**
	 * Returns the value of the '<em><b>Data Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries}.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getRawMeasurements <em>Raw Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Series</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Series</em>' containment reference list.
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getRawMeasurements_DataSeries()
	 * @see org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getRawMeasurements
	 * @model opposite="rawMeasurements" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DataSeries> getDataSeries();

	/**
	 * Returns the value of the '<em><b>Measurements Range</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getRawMeasurements <em>Raw Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements Range</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements Range</em>' container reference.
	 * @see #setMeasurementsRange(MeasurementsRange)
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getRawMeasurements_MeasurementsRange()
	 * @see org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange#getRawMeasurements
	 * @model opposite="rawMeasurements" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MeasurementsRange getMeasurementsRange();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements#getMeasurementsRange <em>Measurements Range</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurements Range</em>' container reference.
	 * @see #getMeasurementsRange()
	 * @generated
	 */
	void setMeasurementsRange(MeasurementsRange value);

} // RawMeasurements
