/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.repository.PassiveResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passive Resource Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.measuringpoint.PassiveResourceReference#getPassiveResource <em>Passive Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getPassiveResourceReference()
 * @model abstract="true"
 * @generated
 */
public interface PassiveResourceReference extends EObject {
    /**
     * Returns the value of the '<em><b>Passive Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Passive Resource</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Passive Resource</em>' reference.
     * @see #setPassiveResource(PassiveResource)
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getPassiveResourceReference_PassiveResource()
     * @model required="true"
     * @generated
     */
    PassiveResource getPassiveResource();

    /**
     * Sets the value of the '{@link org.palladiosimulator.edp2.models.measuringpoint.PassiveResourceReference#getPassiveResource <em>Passive Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Passive Resource</em>' reference.
     * @see #getPassiveResource()
     * @generated
     */
    void setPassiveResource(PassiveResource value);

} // PassiveResourceReference
