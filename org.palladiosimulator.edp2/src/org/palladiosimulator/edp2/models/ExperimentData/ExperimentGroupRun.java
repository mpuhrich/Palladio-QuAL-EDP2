/**
 */
package org.palladiosimulator.edp2.models.ExperimentData;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Experiment Group Run</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun#getExperimentgroup
 * <em>Experimentgroup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentGroupRun()
 * @model
 * @generated
 */
public interface ExperimentGroupRun extends Run {
    /**
     * Returns the value of the '<em><b>Experimentgroup</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getReports
     * <em>Reports</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Experimentgroup</em>' container reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Experimentgroup</em>' container reference.
     * @see #setExperimentgroup(ExperimentGroup)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentGroupRun_Experimentgroup()
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getReports
     * @model opposite="reports" required="true" transient="false"
     * @generated
     */
    ExperimentGroup getExperimentgroup();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun#getExperimentgroup
     * <em>Experimentgroup</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Experimentgroup</em>' container reference.
     * @see #getExperimentgroup()
     * @generated
     */
    void setExperimentgroup(ExperimentGroup value);

} // ExperimentGroupRun
