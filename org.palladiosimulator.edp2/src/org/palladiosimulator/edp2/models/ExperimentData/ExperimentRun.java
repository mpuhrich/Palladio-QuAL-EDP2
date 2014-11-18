/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Experiment Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Experiment runs contain the collected data (results) for each replication of an experiment. The data is collected for each sensor declared in the experiment setting. There is one instance of collected data for each declared sensor.
 * 
 * The time when the experiment was started and how long it took are stored as attributes. The end of the experiment run can be calculated by: endTime = startTime + duration.
 * self.experimentSetting.measure->size()=measurements->size() and 
 * self.experimentSetting.measure->forAll(s|self.measurements->collect(measure)->select(s2|s=s2)->size()=1)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getExperimentSetting <em>Experiment Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentRun()
 * @model
 * @generated
 */
public interface ExperimentRun extends Run {
	/**
	 * Returns the value of the '<em><b>Experiment Setting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getExperimentRuns <em>Experiment Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment Setting</em>' container reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Setting</em>' container reference.
	 * @see #setExperimentSetting(ExperimentSetting)
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentRun_ExperimentSetting()
	 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getExperimentRuns
	 * @model opposite="experimentRuns" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ExperimentSetting getExperimentSetting();

	/**
	 * Sets the value of the '
	 * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun#getExperimentSetting
	 * <em>Experiment Setting</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Experiment Setting</em>' container reference.
	 * @see #getExperimentSetting()
	 * @generated
	 */
	void setExperimentSetting(ExperimentSetting value);

} // ExperimentRun
