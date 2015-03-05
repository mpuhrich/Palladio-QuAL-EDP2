/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Experiment Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> An experiment group contains all experiments which belong to a single
 * analysis. An example for an experiment group is a scalability analysis or architectural
 * alternative comparison including the corresponding set of experiments.
 *
 * Experiment groups can be either a manual or automatic analysis <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getExperimentSettings
 * <em>Experiment Settings</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getMeasuringTypes
 * <em>Measuring Types</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getPurpose <em>
 * Purpose</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getRepository <em>
 * Repository</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getReports <em>
 * Reports</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getMeasuringPointRepositories
 * <em>Measuring Point Repositories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentGroup()
 * @model
 * @generated
 */
public interface ExperimentGroup extends Identifier, Propertyable {
    /**
     * Returns the value of the '<em><b>Experiment Settings</b></em>' containment reference list.
     * The list contents are of type
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting}. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getExperimentGroup
     * <em>Experiment Group</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Experiment Settings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Experiment Settings</em>' containment reference list.
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentGroup_ExperimentSettings()
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting#getExperimentGroup
     * @model opposite="experimentGroup" containment="true" ordered="false"
     * @generated
     */
    EList<ExperimentSetting> getExperimentSettings();

    /**
     * Returns the value of the '<em><b>Measuring Types</b></em>' containment reference list. The
     * list contents are of type
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasuringType}. It is bidirectional
     * and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.MeasuringType#getExperimentGroup
     * <em>Experiment Group</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measuring Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Measuring Types</em>' containment reference list.
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentGroup_MeasuringTypes()
     * @see org.palladiosimulator.edp2.models.ExperimentData.MeasuringType#getExperimentGroup
     * @model opposite="experimentGroup" containment="true" ordered="false"
     * @generated
     */
    EList<MeasuringType> getMeasuringTypes();

    /**
     * Returns the value of the '<em><b>Repository</b></em>' reference. It is bidirectional and its
     * opposite is '
     * {@link org.palladiosimulator.edp2.models.Repository.Repository#getExperimentGroups
     * <em>Experiment Groups</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Repository</em>' reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc --> <!-- begin-model-doc --> Repository in which this experiment group is
     * stored. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Repository</em>' reference.
     * @see #setRepository(Repository)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentGroup_Repository()
     * @see org.palladiosimulator.edp2.models.Repository.Repository#getExperimentGroups
     * @model opposite="experimentGroups" transient="true" ordered="false"
     * @generated
     */
    Repository getRepository();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getRepository
     * <em>Repository</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Repository</em>' reference.
     * @see #getRepository()
     * @generated
     */
    void setRepository(Repository value);

    /**
     * Returns the value of the '<em><b>Reports</b></em>' containment reference list. The list
     * contents are of type
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun}. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun#getExperimentgroup
     * <em>Experimentgroup</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reports</em>' containment reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Reports</em>' containment reference list.
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentGroup_Reports()
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroupRun#getExperimentgroup
     * @model opposite="experimentgroup" containment="true" ordered="false"
     * @generated
     */
    EList<ExperimentGroupRun> getReports();

    /**
     * Returns the value of the '<em><b>Measuring Point Repositories</b></em>' reference list. The
     * list contents are of type
     * {@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measuring Point Repositories</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Measuring Point Repositories</em>' reference list.
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentGroup_MeasuringPointRepositories()
     * @model
     * @generated
     */
    EList<MeasuringPointRepository> getMeasuringPointRepositories();

    /**
     * Returns the value of the '<em><b>Purpose</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Purpose</em>' attribute isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Purpose</em>' attribute.
     * @see #setPurpose(String)
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getExperimentGroup_Purpose()
     * @model required="true" ordered="false"
     * @generated
     */
    String getPurpose();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup#getPurpose
     * <em>Purpose</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Purpose</em>' attribute.
     * @see #getPurpose()
     * @generated
     */
    void setPurpose(String value);

} // ExperimentGroup
