/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage
 * @generated
 */
public class MeasuringpointAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MeasuringpointPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuringpointAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MeasuringpointPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasuringpointSwitch<Adapter> modelSwitch =
        new MeasuringpointSwitch<Adapter>() {
            @Override
            public Adapter caseMeasuringPoint(MeasuringPoint object) {
                return createMeasuringPointAdapter();
            }
            @Override
            public Adapter caseStringMeasuringPoint(StringMeasuringPoint object) {
                return createStringMeasuringPointAdapter();
            }
            @Override
            public Adapter caseAssemblyOperationMeasuringPoint(AssemblyOperationMeasuringPoint object) {
                return createAssemblyOperationMeasuringPointAdapter();
            }
            @Override
            public Adapter caseAssemblyPassiveResourceMeasuringPoint(AssemblyPassiveResourceMeasuringPoint object) {
                return createAssemblyPassiveResourceMeasuringPointAdapter();
            }
            @Override
            public Adapter caseActiveResourceMeasuringPoint(ActiveResourceMeasuringPoint object) {
                return createActiveResourceMeasuringPointAdapter();
            }
            @Override
            public Adapter caseSystemOperationMeasuringPoint(SystemOperationMeasuringPoint object) {
                return createSystemOperationMeasuringPointAdapter();
            }
            @Override
            public Adapter caseOperationReference(OperationReference object) {
                return createOperationReferenceAdapter();
            }
            @Override
            public Adapter caseAssemblyReference(AssemblyReference object) {
                return createAssemblyReferenceAdapter();
            }
            @Override
            public Adapter caseSystemReference(SystemReference object) {
                return createSystemReferenceAdapter();
            }
            @Override
            public Adapter casePassiveResourceReference(PassiveResourceReference object) {
                return createPassiveResourceReferenceAdapter();
            }
            @Override
            public Adapter caseActiveResourceReference(ActiveResourceReference object) {
                return createActiveResourceReferenceAdapter();
            }
            @Override
            public Adapter caseLinkingResourceMeasuringPoint(LinkingResourceMeasuringPoint object) {
                return createLinkingResourceMeasuringPointAdapter();
            }
            @Override
            public Adapter caseLinkingResourceReference(LinkingResourceReference object) {
                return createLinkingResourceReferenceAdapter();
            }
            @Override
            public Adapter caseSubSystemOperationMeasuringPoint(SubSystemOperationMeasuringPoint object) {
                return createSubSystemOperationMeasuringPointAdapter();
            }
            @Override
            public Adapter caseSubSystemReference(SubSystemReference object) {
                return createSubSystemReferenceAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint <em>Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint
     * @generated
     */
    public Adapter createMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint <em>String Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint
     * @generated
     */
    public Adapter createStringMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.AssemblyOperationMeasuringPoint <em>Assembly Operation Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.AssemblyOperationMeasuringPoint
     * @generated
     */
    public Adapter createAssemblyOperationMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.AssemblyPassiveResourceMeasuringPoint <em>Assembly Passive Resource Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.AssemblyPassiveResourceMeasuringPoint
     * @generated
     */
    public Adapter createAssemblyPassiveResourceMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceMeasuringPoint <em>Active Resource Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceMeasuringPoint
     * @generated
     */
    public Adapter createActiveResourceMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.SystemOperationMeasuringPoint <em>System Operation Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SystemOperationMeasuringPoint
     * @generated
     */
    public Adapter createSystemOperationMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.OperationReference <em>Operation Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.OperationReference
     * @generated
     */
    public Adapter createOperationReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.AssemblyReference <em>Assembly Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.AssemblyReference
     * @generated
     */
    public Adapter createAssemblyReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.SystemReference <em>System Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SystemReference
     * @generated
     */
    public Adapter createSystemReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.PassiveResourceReference <em>Passive Resource Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.PassiveResourceReference
     * @generated
     */
    public Adapter createPassiveResourceReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceReference <em>Active Resource Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceReference
     * @generated
     */
    public Adapter createActiveResourceReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceMeasuringPoint <em>Linking Resource Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceMeasuringPoint
     * @generated
     */
    public Adapter createLinkingResourceMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceReference <em>Linking Resource Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceReference
     * @generated
     */
    public Adapter createLinkingResourceReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.SubSystemOperationMeasuringPoint <em>Sub System Operation Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SubSystemOperationMeasuringPoint
     * @generated
     */
    public Adapter createSubSystemOperationMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.SubSystemReference <em>Sub System Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.SubSystemReference
     * @generated
     */
    public Adapter createSubSystemReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //MeasuringpointAdapterFactory
