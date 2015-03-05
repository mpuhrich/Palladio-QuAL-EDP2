/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasuringPointImpl extends EObjectImpl implements MeasuringPoint {
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
    public MeasuringPointRepository getMeasuringPointRepository() {
        if (this.eContainerFeatureID() != MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY) {
            return null;
        }
        return (MeasuringPointRepository) this.eInternalContainer();
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
        if (newMeasuringPointRepository != this.eInternalContainer()
                || (this.eContainerFeatureID() != MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY && newMeasuringPointRepository != null)) {
            if (EcoreUtil.isAncestor(this, newMeasuringPointRepository)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newMeasuringPointRepository != null) {
                msgs = ((InternalEObject) newMeasuringPointRepository).eInverseAdd(this,
                        MeasuringpointPackage.MEASURING_POINT_REPOSITORY__MEASURING_POINTS,
                        MeasuringPointRepository.class, msgs);
            }
            msgs = this.basicSetMeasuringPointRepository(newMeasuringPointRepository, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY, newMeasuringPointRepository,
                    newMeasuringPointRepository));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
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
        switch (featureID) {
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
        switch (this.eContainerFeatureID()) {
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
        switch (featureID) {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            return this.getMeasuringPointRepository();
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
        switch (featureID) {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            this.setMeasuringPointRepository((MeasuringPointRepository) newValue);
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
        switch (featureID) {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            this.setMeasuringPointRepository((MeasuringPointRepository) null);
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
        switch (featureID) {
        case MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY:
            return this.getMeasuringPointRepository() != null;
        }
        return super.eIsSet(featureID);
    }

} // MeasuringPointImpl
