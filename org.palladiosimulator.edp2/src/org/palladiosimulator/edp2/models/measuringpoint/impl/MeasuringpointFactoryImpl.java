/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class MeasuringpointFactoryImpl extends EFactoryImpl implements MeasuringpointFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static MeasuringpointFactory init() {
        try {
            final MeasuringpointFactory theMeasuringpointFactory = (MeasuringpointFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MeasuringpointPackage.eNS_URI);
            if (theMeasuringpointFactory != null) {
                return theMeasuringpointFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MeasuringpointFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MeasuringpointFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case MeasuringpointPackage.STRING_MEASURING_POINT:
            return this.createStringMeasuringPoint();
        case MeasuringpointPackage.RESOURCE_URI_MEASURING_POINT:
            return this.createResourceURIMeasuringPoint();
        case MeasuringpointPackage.MEASURING_POINT_REPOSITORY:
            return this.createMeasuringPointRepository();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StringMeasuringPoint createStringMeasuringPoint() {
        final StringMeasuringPointImpl stringMeasuringPoint = new StringMeasuringPointImpl();
        return stringMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceURIMeasuringPoint createResourceURIMeasuringPoint() {
        final ResourceURIMeasuringPointImpl resourceURIMeasuringPoint = new ResourceURIMeasuringPointImpl();
        return resourceURIMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MeasuringPointRepository createMeasuringPointRepository() {
        final MeasuringPointRepositoryImpl measuringPointRepository = new MeasuringPointRepositoryImpl();
        return measuringPointRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MeasuringpointPackage getMeasuringpointPackage() {
        return (MeasuringpointPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MeasuringpointPackage getPackage() {
        return MeasuringpointPackage.eINSTANCE;
    }

} // MeasuringpointFactoryImpl
