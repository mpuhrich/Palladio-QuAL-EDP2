/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals;
import org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Fixed Width Aggregated Measurements</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedWidthAggregatedMeasurementsImpl#getIntervals
 * <em>Intervals</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedWidthAggregatedMeasurementsImpl#getDataSeries
 * <em>Data Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedWidthAggregatedMeasurementsImpl extends AggregatedMeasurementsImpl implements
FixedWidthAggregatedMeasurements {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FixedWidthAggregatedMeasurementsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FixedIntervals getIntervals() {
        return (FixedIntervals) this.eDynamicGet(ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS,
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetIntervals(final FixedIntervals newIntervals, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newIntervals,
                ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIntervals(final FixedIntervals newIntervals) {
        this.eDynamicSet(ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS,
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS, newIntervals);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<DataSeries> getDataSeries() {
        return (EList<DataSeries>) this.eDynamicGet(
                ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES,
                ExperimentDataPackage.Literals.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS:
            final FixedIntervals intervals = this.getIntervals();
            if (intervals != null) {
                msgs = ((InternalEObject) intervals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS, null, msgs);
            }
            return this.basicSetIntervals((FixedIntervals) otherEnd, msgs);
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getDataSeries()).basicAdd(otherEnd, msgs);
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
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS:
            return this.basicSetIntervals(null, msgs);
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES:
            return ((InternalEList<?>) this.getDataSeries()).basicRemove(otherEnd, msgs);
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
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS:
            return this.getIntervals();
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES:
            return this.getDataSeries();
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
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS:
            this.setIntervals((FixedIntervals) newValue);
            return;
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES:
            this.getDataSeries().clear();
            this.getDataSeries().addAll((Collection<? extends DataSeries>) newValue);
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
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS:
            this.setIntervals((FixedIntervals) null);
            return;
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES:
            this.getDataSeries().clear();
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
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS:
            return this.getIntervals() != null;
        case ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES:
            return !this.getDataSeries().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // FixedWidthAggregatedMeasurementsImpl
