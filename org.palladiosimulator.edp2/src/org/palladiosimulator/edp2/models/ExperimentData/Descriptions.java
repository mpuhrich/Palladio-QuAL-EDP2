/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.metricspec.Description;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.ExperimentData.Descriptions#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getDescriptions()
 * @model
 * @generated
 */
public interface Descriptions extends Identifier {
	/**
     * Returns the value of the '<em><b>Description</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.metricspec.Description}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' containment reference list.
     * @see org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage#getDescriptions_Description()
     * @model containment="true"
     * @generated
     */
	EList<Description> getDescription();

} // Descriptions
