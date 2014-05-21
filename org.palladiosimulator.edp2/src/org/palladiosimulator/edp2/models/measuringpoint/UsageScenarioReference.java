/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Scenario Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.measuringpoint.UsageScenarioReference#getUsageScenario <em>Usage Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getUsageScenarioReference()
 * @model abstract="true"
 * @generated
 */
public interface UsageScenarioReference extends EObject {
    /**
     * Returns the value of the '<em><b>Usage Scenario</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Scenario</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Scenario</em>' reference.
     * @see #setUsageScenario(UsageScenario)
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getUsageScenarioReference_UsageScenario()
     * @model required="true"
     * @generated
     */
    UsageScenario getUsageScenario();

    /**
     * Sets the value of the '{@link org.palladiosimulator.edp2.models.measuringpoint.UsageScenarioReference#getUsageScenario <em>Usage Scenario</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Scenario</em>' reference.
     * @see #getUsageScenario()
     * @generated
     */
    void setUsageScenario(UsageScenario value);

} // UsageScenarioReference
