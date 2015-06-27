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
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Raw Measurements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.RawMeasurementsImpl#getDataSeries
 * <em>Data Series</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.RawMeasurementsImpl#getMeasurementRange
 * <em>Measurement Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RawMeasurementsImpl extends IdentifierImpl implements RawMeasurements {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RawMeasurementsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.RAW_MEASUREMENTS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<DataSeries> getDataSeries() {
        return (EList<DataSeries>) this.eDynamicGet(ExperimentDataPackage.RAW_MEASUREMENTS__DATA_SERIES,
                ExperimentDataPackage.Literals.RAW_MEASUREMENTS__DATA_SERIES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MeasurementRange getMeasurementRange() {
        return (MeasurementRange) this.eDynamicGet(ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE,
                ExperimentDataPackage.Literals.RAW_MEASUREMENTS__MEASUREMENT_RANGE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetMeasurementRange(final MeasurementRange newMeasurementRange, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newMeasurementRange,
                ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMeasurementRange(final MeasurementRange newMeasurementRange) {
        this.eDynamicSet(ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE,
                ExperimentDataPackage.Literals.RAW_MEASUREMENTS__MEASUREMENT_RANGE, newMeasurementRange);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID)
        {
        case ExperimentDataPackage.RAW_MEASUREMENTS__DATA_SERIES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getDataSeries()).basicAdd(otherEnd, msgs);
        case ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetMeasurementRange((MeasurementRange) otherEnd, msgs);
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
        case ExperimentDataPackage.RAW_MEASUREMENTS__DATA_SERIES:
            return ((InternalEList<?>) this.getDataSeries()).basicRemove(otherEnd, msgs);
        case ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE:
            return this.basicSetMeasurementRange(null, msgs);
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
        case ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.MEASUREMENT_RANGE__RAW_MEASUREMENTS,
                    MeasurementRange.class, msgs);
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
        case ExperimentDataPackage.RAW_MEASUREMENTS__DATA_SERIES:
            return this.getDataSeries();
        case ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE:
            return this.getMeasurementRange();
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
        switch (featureID)
        {
        case ExperimentDataPackage.RAW_MEASUREMENTS__DATA_SERIES:
            this.getDataSeries().clear();
            this.getDataSeries().addAll((Collection<? extends DataSeries>) newValue);
            return;
        case ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE:
            this.setMeasurementRange((MeasurementRange) newValue);
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
        case ExperimentDataPackage.RAW_MEASUREMENTS__DATA_SERIES:
            this.getDataSeries().clear();
            return;
        case ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE:
            this.setMeasurementRange((MeasurementRange) null);
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
        case ExperimentDataPackage.RAW_MEASUREMENTS__DATA_SERIES:
            return !this.getDataSeries().isEmpty();
        case ExperimentDataPackage.RAW_MEASUREMENTS__MEASUREMENT_RANGE:
            return this.getMeasurementRange() != null;
        }
        return super.eIsSet(featureID);
    }

} // RawMeasurementsImpl
