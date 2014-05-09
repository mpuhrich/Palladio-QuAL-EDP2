/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceReference;
import org.palladiosimulator.edp2.models.measuringpoint.AssemblyOperationMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.AssemblyPassiveResourceMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.AssemblyReference;
import org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceReference;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.OperationReference;
import org.palladiosimulator.edp2.models.measuringpoint.PassiveResourceReference;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.SubSystemOperationMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.SubSystemReference;
import org.palladiosimulator.edp2.models.measuringpoint.SystemOperationMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.SystemReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage
 * @generated
 */
public class MeasuringpointSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MeasuringpointPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuringpointSwitch() {
        if (modelPackage == null) {
            modelPackage = MeasuringpointPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case MeasuringpointPackage.MEASURING_POINT: {
                MeasuringPoint measuringPoint = (MeasuringPoint)theEObject;
                T result = caseMeasuringPoint(measuringPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.STRING_MEASURING_POINT: {
                StringMeasuringPoint stringMeasuringPoint = (StringMeasuringPoint)theEObject;
                T result = caseStringMeasuringPoint(stringMeasuringPoint);
                if (result == null) result = caseMeasuringPoint(stringMeasuringPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT: {
                AssemblyOperationMeasuringPoint assemblyOperationMeasuringPoint = (AssemblyOperationMeasuringPoint)theEObject;
                T result = caseAssemblyOperationMeasuringPoint(assemblyOperationMeasuringPoint);
                if (result == null) result = caseOperationReference(assemblyOperationMeasuringPoint);
                if (result == null) result = caseAssemblyReference(assemblyOperationMeasuringPoint);
                if (result == null) result = caseMeasuringPoint(assemblyOperationMeasuringPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.ASSEMBLY_PASSIVE_RESOURCE_MEASURING_POINT: {
                AssemblyPassiveResourceMeasuringPoint assemblyPassiveResourceMeasuringPoint = (AssemblyPassiveResourceMeasuringPoint)theEObject;
                T result = caseAssemblyPassiveResourceMeasuringPoint(assemblyPassiveResourceMeasuringPoint);
                if (result == null) result = caseAssemblyReference(assemblyPassiveResourceMeasuringPoint);
                if (result == null) result = casePassiveResourceReference(assemblyPassiveResourceMeasuringPoint);
                if (result == null) result = caseMeasuringPoint(assemblyPassiveResourceMeasuringPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.ACTIVE_RESOURCE_MEASURING_POINT: {
                ActiveResourceMeasuringPoint activeResourceMeasuringPoint = (ActiveResourceMeasuringPoint)theEObject;
                T result = caseActiveResourceMeasuringPoint(activeResourceMeasuringPoint);
                if (result == null) result = caseMeasuringPoint(activeResourceMeasuringPoint);
                if (result == null) result = caseActiveResourceReference(activeResourceMeasuringPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.SYSTEM_OPERATION_MEASURING_POINT: {
                SystemOperationMeasuringPoint systemOperationMeasuringPoint = (SystemOperationMeasuringPoint)theEObject;
                T result = caseSystemOperationMeasuringPoint(systemOperationMeasuringPoint);
                if (result == null) result = caseOperationReference(systemOperationMeasuringPoint);
                if (result == null) result = caseMeasuringPoint(systemOperationMeasuringPoint);
                if (result == null) result = caseSystemReference(systemOperationMeasuringPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.OPERATION_REFERENCE: {
                OperationReference operationReference = (OperationReference)theEObject;
                T result = caseOperationReference(operationReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.ASSEMBLY_REFERENCE: {
                AssemblyReference assemblyReference = (AssemblyReference)theEObject;
                T result = caseAssemblyReference(assemblyReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.SYSTEM_REFERENCE: {
                SystemReference systemReference = (SystemReference)theEObject;
                T result = caseSystemReference(systemReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.PASSIVE_RESOURCE_REFERENCE: {
                PassiveResourceReference passiveResourceReference = (PassiveResourceReference)theEObject;
                T result = casePassiveResourceReference(passiveResourceReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.ACTIVE_RESOURCE_REFERENCE: {
                ActiveResourceReference activeResourceReference = (ActiveResourceReference)theEObject;
                T result = caseActiveResourceReference(activeResourceReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.LINKING_RESOURCE_MEASURING_POINT: {
                LinkingResourceMeasuringPoint linkingResourceMeasuringPoint = (LinkingResourceMeasuringPoint)theEObject;
                T result = caseLinkingResourceMeasuringPoint(linkingResourceMeasuringPoint);
                if (result == null) result = caseMeasuringPoint(linkingResourceMeasuringPoint);
                if (result == null) result = caseLinkingResourceReference(linkingResourceMeasuringPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.LINKING_RESOURCE_REFERENCE: {
                LinkingResourceReference linkingResourceReference = (LinkingResourceReference)theEObject;
                T result = caseLinkingResourceReference(linkingResourceReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.SUB_SYSTEM_OPERATION_MEASURING_POINT: {
                SubSystemOperationMeasuringPoint subSystemOperationMeasuringPoint = (SubSystemOperationMeasuringPoint)theEObject;
                T result = caseSubSystemOperationMeasuringPoint(subSystemOperationMeasuringPoint);
                if (result == null) result = caseMeasuringPoint(subSystemOperationMeasuringPoint);
                if (result == null) result = caseSubSystemReference(subSystemOperationMeasuringPoint);
                if (result == null) result = caseOperationReference(subSystemOperationMeasuringPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MeasuringpointPackage.SUB_SYSTEM_REFERENCE: {
                SubSystemReference subSystemReference = (SubSystemReference)theEObject;
                T result = caseSubSystemReference(subSystemReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasuringPoint(MeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringMeasuringPoint(StringMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assembly Operation Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assembly Operation Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssemblyOperationMeasuringPoint(AssemblyOperationMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assembly Passive Resource Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assembly Passive Resource Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssemblyPassiveResourceMeasuringPoint(AssemblyPassiveResourceMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Active Resource Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Active Resource Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActiveResourceMeasuringPoint(ActiveResourceMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System Operation Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Operation Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystemOperationMeasuringPoint(SystemOperationMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationReference(OperationReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assembly Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assembly Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssemblyReference(AssemblyReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystemReference(SystemReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Passive Resource Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Passive Resource Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePassiveResourceReference(PassiveResourceReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Active Resource Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Active Resource Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseActiveResourceReference(ActiveResourceReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linking Resource Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linking Resource Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkingResourceMeasuringPoint(LinkingResourceMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linking Resource Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linking Resource Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkingResourceReference(LinkingResourceReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub System Operation Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub System Operation Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubSystemOperationMeasuringPoint(SubSystemOperationMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub System Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub System Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubSystemReference(SubSystemReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //MeasuringpointSwitch
