/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Measuring Point Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointRepositoryImpl#getMeasuringPoints
 * <em>Measuring Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasuringPointRepositoryImpl extends IdentifierImpl implements MeasuringPointRepository {

    /**
     * The cached value of the '{@link #getMeasuringPoints() <em>Measuring Points</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMeasuringPoints()
     * @generated
     * @ordered
     */
    protected EList<MeasuringPoint> measuringPoints;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MeasuringPointRepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MeasuringpointPackage.Literals.MEASURING_POINT_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<MeasuringPoint> getMeasuringPoints() {
        if (this.measuringPoints == null) {
            this.measuringPoints = new EObjectContainmentWithInverseEList<MeasuringPoint>(MeasuringPoint.class, this,
                    MeasuringpointPackage.MEASURING_POINT_REPOSITORY__MEASURING_POINTS,
                    MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY);
        }
        return this.measuringPoints;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MeasuringpointPackage.MEASURING_POINT_REPOSITORY__MEASURING_POINTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasuringPoints()).basicAdd(otherEnd,
                    msgs);
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
        case MeasuringpointPackage.MEASURING_POINT_REPOSITORY__MEASURING_POINTS:
            return ((InternalEList<?>) this.getMeasuringPoints()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MeasuringpointPackage.MEASURING_POINT_REPOSITORY__MEASURING_POINTS:
            return this.getMeasuringPoints();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MeasuringpointPackage.MEASURING_POINT_REPOSITORY__MEASURING_POINTS:
            this.getMeasuringPoints().clear();
            this.getMeasuringPoints().addAll((Collection<? extends MeasuringPoint>) newValue);
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
        case MeasuringpointPackage.MEASURING_POINT_REPOSITORY__MEASURING_POINTS:
            this.getMeasuringPoints().clear();
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
        case MeasuringpointPackage.MEASURING_POINT_REPOSITORY__MEASURING_POINTS:
            return this.measuringPoints != null && !this.measuringPoints.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // MeasuringPointRepositoryImpl
