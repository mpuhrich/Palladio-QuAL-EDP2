/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.edp2.models.measuringpoint.*;
import org.palladiosimulator.edp2.models.measuringpoint.ActiveResourceMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.AssemblyOperationMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.AssemblyPassiveResourceMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.LinkingResourceMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.SubSystemOperationMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.SystemOperationMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.UsageScenarioMeasuringPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasuringpointFactoryImpl extends EFactoryImpl implements MeasuringpointFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MeasuringpointFactory init() {
        try {
            MeasuringpointFactory theMeasuringpointFactory = (MeasuringpointFactory)EPackage.Registry.INSTANCE.getEFactory(MeasuringpointPackage.eNS_URI);
            if (theMeasuringpointFactory != null) {
                return theMeasuringpointFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MeasuringpointFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuringpointFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case MeasuringpointPackage.STRING_MEASURING_POINT: return createStringMeasuringPoint();
            case MeasuringpointPackage.ASSEMBLY_OPERATION_MEASURING_POINT: return createAssemblyOperationMeasuringPoint();
            case MeasuringpointPackage.ASSEMBLY_PASSIVE_RESOURCE_MEASURING_POINT: return createAssemblyPassiveResourceMeasuringPoint();
            case MeasuringpointPackage.ACTIVE_RESOURCE_MEASURING_POINT: return createActiveResourceMeasuringPoint();
            case MeasuringpointPackage.SYSTEM_OPERATION_MEASURING_POINT: return createSystemOperationMeasuringPoint();
            case MeasuringpointPackage.LINKING_RESOURCE_MEASURING_POINT: return createLinkingResourceMeasuringPoint();
            case MeasuringpointPackage.SUB_SYSTEM_OPERATION_MEASURING_POINT: return createSubSystemOperationMeasuringPoint();
            case MeasuringpointPackage.USAGE_SCENARIO_MEASURING_POINT: return createUsageScenarioMeasuringPoint();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringMeasuringPoint createStringMeasuringPoint() {
        StringMeasuringPointImpl stringMeasuringPoint = new StringMeasuringPointImpl();
        return stringMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssemblyOperationMeasuringPoint createAssemblyOperationMeasuringPoint() {
        AssemblyOperationMeasuringPointImpl assemblyOperationMeasuringPoint = new AssemblyOperationMeasuringPointImpl();
        return assemblyOperationMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssemblyPassiveResourceMeasuringPoint createAssemblyPassiveResourceMeasuringPoint() {
        AssemblyPassiveResourceMeasuringPointImpl assemblyPassiveResourceMeasuringPoint = new AssemblyPassiveResourceMeasuringPointImpl();
        return assemblyPassiveResourceMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActiveResourceMeasuringPoint createActiveResourceMeasuringPoint() {
        ActiveResourceMeasuringPointImpl activeResourceMeasuringPoint = new ActiveResourceMeasuringPointImpl();
        return activeResourceMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemOperationMeasuringPoint createSystemOperationMeasuringPoint() {
        SystemOperationMeasuringPointImpl systemOperationMeasuringPoint = new SystemOperationMeasuringPointImpl();
        return systemOperationMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkingResourceMeasuringPoint createLinkingResourceMeasuringPoint() {
        LinkingResourceMeasuringPointImpl linkingResourceMeasuringPoint = new LinkingResourceMeasuringPointImpl();
        return linkingResourceMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubSystemOperationMeasuringPoint createSubSystemOperationMeasuringPoint() {
        SubSystemOperationMeasuringPointImpl subSystemOperationMeasuringPoint = new SubSystemOperationMeasuringPointImpl();
        return subSystemOperationMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsageScenarioMeasuringPoint createUsageScenarioMeasuringPoint() {
        UsageScenarioMeasuringPointImpl usageScenarioMeasuringPoint = new UsageScenarioMeasuringPointImpl();
        return usageScenarioMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasuringpointPackage getMeasuringpointPackage() {
        return (MeasuringpointPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MeasuringpointPackage getPackage() {
        return MeasuringpointPackage.eINSTANCE;
    }

} //MeasuringpointFactoryImpl
