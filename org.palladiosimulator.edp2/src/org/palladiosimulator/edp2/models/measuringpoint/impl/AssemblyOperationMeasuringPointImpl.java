/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.edp2.models.measuringpoint.AssemblyOperationMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.AssemblyReference;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Operation Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.palladiosimulator.edp2.models.measuringpoint.impl.AssemblyOperationMeasuringPointImpl#getAssembly <em>Assembly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyOperationMeasuringPointImpl extends OperationReferenceImpl implements AssemblyOperationMeasuringPoint {
    /**
     * The cached value of the '{@link #getAssembly() <em>Assembly</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssembly()
     * @generated
     * @ordered
     */
    protected AssemblyContext assembly;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AssemblyOperationMeasuringPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MeasuringpointPackage.Literals.ASSEMBLY_OPERATION_MEASURING_POINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssemblyContext getAssembly() {
        if (assembly != null && assembly.eIsProxy()) {
            InternalEObject oldAssembly = (InternalEObject)assembly;
            assembly = (AssemblyContext)eResolveProxy(oldAssembly);
            if (assembly != oldAssembly) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT__ASSEMBLY, oldAssembly, assembly));
            }
        }
        return assembly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssemblyContext basicGetAssembly() {
        return assembly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssembly(AssemblyContext newAssembly) {
        AssemblyContext oldAssembly = assembly;
        assembly = newAssembly;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT__ASSEMBLY, oldAssembly, assembly));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT__ASSEMBLY:
                if (resolve) return getAssembly();
                return basicGetAssembly();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT__ASSEMBLY:
                setAssembly((AssemblyContext)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT__ASSEMBLY:
                setAssembly((AssemblyContext)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT__ASSEMBLY:
                return assembly != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == AssemblyReference.class) {
            switch (derivedFeatureID) {
                case MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT__ASSEMBLY: return MeasuringpointPackage.ASSEMBLY_REFERENCE__ASSEMBLY;
                default: return -1;
            }
        }
        if (baseClass == MeasuringPoint.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == AssemblyReference.class) {
            switch (baseFeatureID) {
                case MeasuringpointPackage.ASSEMBLY_REFERENCE__ASSEMBLY: return MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT__ASSEMBLY;
                default: return -1;
            }
        }
        if (baseClass == MeasuringPoint.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //AssemblyOperationMeasuringPointImpl
