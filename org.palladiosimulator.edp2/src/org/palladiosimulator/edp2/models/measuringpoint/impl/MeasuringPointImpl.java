/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl#getMeasuringPointRepository
 * <em>Measuring Point Repository</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl#getStringRepresentation
 * <em>String Representation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl#getResourceURIRepresentation
 * <em>Resource URI Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasuringPointImpl extends CDOObjectImpl implements MeasuringPoint {

    /**
     * The default value of the '{@link #getStringRepresentation() <em>String Representation</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStringRepresentation()
     * @generated
     * @ordered
     */
    protected static final String STRING_REPRESENTATION_EDEFAULT = null;
    /**
     * The default value of the '{@link #getResourceURIRepresentation()
     * <em>Resource URI Representation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getResourceURIRepresentation()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_URI_REPRESENTATION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MeasuringPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MeasuringpointPackage.Literals.MEASURING_POINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MeasuringPointRepository getMeasuringPointRepository() {
        return (MeasuringPointRepository) this.eDynamicGet(
                MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY,
                MeasuringpointPackage.Literals.MEASURING_POINT__MEASURING_POINT_REPOSITORY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMeasuringPointRepository(
            final MeasuringPointRepository newMeasuringPointRepository, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newMeasuringPointRepository,
                MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMeasuringPointRepository(final MeasuringPointRepository newMeasuringPointRepository) {
        this.eDynamicSet(MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY,
                MeasuringpointPackage.Literals.MEASURING_POINT__MEASURING_POINT_REPOSITORY, newMeasuringPointRepository);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getStringRepresentation() {
        return (String) this.eDynamicGet(MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION,
                MeasuringpointPackage.Literals.MEASURING_POINT__STRING_REPRESENTATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setStringRepresentation(final String newStringRepresentation) {
        this.eDynamicSet(MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION,
                MeasuringpointPackage.Literals.MEASURING_POINT__STRING_REPRESENTATION, newStringRepresentation);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getResourceURIRepresentation() {
        return (String) this.eDynamicGet(MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION,
                MeasuringpointPackage.Literals.MEASURING_POINT__RESOURCE_URI_REPRESENTATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setResourceURIRepresentation(final String newResourceURIRepresentation) {
        this.eDynamicSet(MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION,
                MeasuringpointPackage.Literals.MEASURING_POINT__RESOURCE_URI_REPRESENTATION,
                newResourceURIRepresentation);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID)
        {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetMeasuringPointRepository((MeasuringPointRepository) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            return this.basicSetMeasuringPointRepository(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID())
        {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            return this.eInternalContainer().eInverseRemove(this,
                    MeasuringpointPackage.MEASURING_POINT_REPOSITORY__MEASURING_POINTS, MeasuringPointRepository.class,
                    msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            return this.getMeasuringPointRepository();
        case MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION:
            return this.getStringRepresentation();
        case MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION:
            return this.getResourceURIRepresentation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            this.setMeasuringPointRepository((MeasuringPointRepository) newValue);
            return;
        case MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION:
            this.setStringRepresentation((String) newValue);
            return;
        case MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION:
            this.setResourceURIRepresentation((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID)
        {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            this.setMeasuringPointRepository((MeasuringPointRepository) null);
            return;
        case MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION:
            this.setStringRepresentation(STRING_REPRESENTATION_EDEFAULT);
            return;
        case MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION:
            this.setResourceURIRepresentation(RESOURCE_URI_REPRESENTATION_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID)
        {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            return this.getMeasuringPointRepository() != null;
        case MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION:
            return STRING_REPRESENTATION_EDEFAULT == null ? this.getStringRepresentation() != null
            : !STRING_REPRESENTATION_EDEFAULT.equals(this.getStringRepresentation());
        case MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION:
            return RESOURCE_URI_REPRESENTATION_EDEFAULT == null ? this.getResourceURIRepresentation() != null
            : !RESOURCE_URI_REPRESENTATION_EDEFAULT.equals(this.getResourceURIRepresentation());
        }
        return super.eIsSet(featureID);
    }

} // MeasuringPointImpl
