/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Fixed Width Aggregated Measurements</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements#getIntervals
 * <em>Intervals</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements#getDataSeries
 * <em>Data Series</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getFixedWidthAggregatedMeasurements()
 * @model
 * @generated
 */
public interface FixedWidthAggregatedMeasurements extends AggregatedMeasurements {
    /**
     * Returns the value of the '<em><b>Intervals</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getAggregatedMeasurements
     * <em>Aggregated Measurements</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Intervals</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Intervals</em>' containment reference.
     * @see #setIntervals(FixedIntervals)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getFixedWidthAggregatedMeasurements_Intervals()
     * @see org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals#getAggregatedMeasurements
     * @model opposite="aggregatedMeasurements" containment="true" required="true" ordered="false"
     * @generated
     */
    FixedIntervals getIntervals();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements#getIntervals
     * <em>Intervals</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Intervals</em>' containment reference.
     * @see #getIntervals()
     * @generated
     */
    void setIntervals(FixedIntervals value);

    /**
     * Returns the value of the '<em><b>Data Series</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries}. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getAggregatedMeasurements
     * <em>Aggregated Measurements</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Series</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Data Series</em>' containment reference list.
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getFixedWidthAggregatedMeasurements_DataSeries()
     * @see org.palladiosimulator.edp2.models.ExperimentData.DataSeries#getAggregatedMeasurements
     * @model opposite="aggregatedMeasurements" containment="true" required="true" ordered="false"
     * @generated
     */
    EList<DataSeries> getDataSeries();

} // FixedWidthAggregatedMeasurements
