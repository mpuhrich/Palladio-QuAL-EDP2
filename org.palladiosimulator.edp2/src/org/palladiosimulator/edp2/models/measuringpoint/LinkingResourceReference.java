/**
 */
package org.palladiosimulator.edp2.models.measuringpoint;

import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.resourceenvironment.LinkingResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linking Resource Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceReference#getLinkingResource <em>Linking Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getLinkingResourceReference()
 * @model abstract="true"
 * @generated
 */
public interface LinkingResourceReference extends EObject {
    /**
     * Returns the value of the '<em><b>Linking Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Linking Resource</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Linking Resource</em>' reference.
     * @see #setLinkingResource(LinkingResource)
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage#getLinkingResourceReference_LinkingResource()
     * @model required="true"
     * @generated
     */
    LinkingResource getLinkingResource();

    /**
     * Sets the value of the '{@link org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceReference#getLinkingResource <em>Linking Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Linking Resource</em>' reference.
     * @see #getLinkingResource()
     * @generated
     */
    void setLinkingResource(LinkingResource value);

} // LinkingResourceReference
