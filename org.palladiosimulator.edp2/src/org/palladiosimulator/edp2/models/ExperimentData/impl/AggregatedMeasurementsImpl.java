/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.edp2.models.ExperimentData.AggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementRange;
import org.palladiosimulator.metricspec.AggregationFunctionDescription;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Aggregated Measurements</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl#getMeasurementRange
 * <em>Measurement Range</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl#isValid
 * <em>Valid</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl#getFunction
 * <em>Function</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl#getAggregationStatistics
 * <em>Aggregation Statistics</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl#getAggregationOn
 * <em>Aggregation On</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.AggregatedMeasurementsImpl#getMetric
 * <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AggregatedMeasurementsImpl extends IdentifierImpl implements AggregatedMeasurements {

    /**
     * The default value of the '{@link #isValid() <em>Valid</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #isValid()
     * @generated
     * @ordered
     */
    protected static final boolean VALID_EDEFAULT = false;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AggregatedMeasurementsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MeasurementRange getMeasurementRange() {
        return (MeasurementRange) this.eDynamicGet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetMeasurementRange(final MeasurementRange newMeasurementRange, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newMeasurementRange,
                ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMeasurementRange(final MeasurementRange newMeasurementRange) {
        this.eDynamicSet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE, newMeasurementRange);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isValid() {
        return (Boolean) this.eDynamicGet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__VALID,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__VALID, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValid(final boolean newValid) {
        this.eDynamicSet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__VALID,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__VALID, newValid);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AggregationFunctionDescription getFunction() {
        return (AggregationFunctionDescription) this.eDynamicGet(
                ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__FUNCTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AggregationFunctionDescription basicGetFunction() {
        return (AggregationFunctionDescription) this.eDynamicGet(
                ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__FUNCTION, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFunction(final AggregationFunctionDescription newFunction) {
        this.eDynamicSet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__FUNCTION, newFunction);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AggregationStatistics getAggregationStatistics() {
        return (AggregationStatistics) this.eDynamicGet(
                ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetAggregationStatistics(final AggregationStatistics newAggregationStatistics,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newAggregationStatistics,
                ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregationStatistics(final AggregationStatistics newAggregationStatistics) {
        this.eDynamicSet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS,
                newAggregationStatistics);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BaseMetricDescription getAggregationOn() {
        return (BaseMetricDescription) this.eDynamicGet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__AGGREGATION_ON, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public BaseMetricDescription basicGetAggregationOn() {
        return (BaseMetricDescription) this.eDynamicGet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__AGGREGATION_ON, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregationOn(final BaseMetricDescription newAggregationOn) {
        this.eDynamicSet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__AGGREGATION_ON, newAggregationOn);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricDescription getMetric() {
        return (MetricDescription) this.eDynamicGet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__METRIC, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MetricDescription basicGetMetric() {
        return (MetricDescription) this.eDynamicGet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__METRIC, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMetric(final MetricDescription newMetric) {
        this.eDynamicSet(ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC,
                ExperimentDataPackage.Literals.AGGREGATED_MEASUREMENTS__METRIC, newMetric);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetMeasurementRange((MeasurementRange) otherEnd, msgs);
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS:
            final AggregationStatistics aggregationStatistics = this.getAggregationStatistics();
            if (aggregationStatistics != null) {
                msgs = ((InternalEObject) aggregationStatistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS, null, msgs);
            }
            return this.basicSetAggregationStatistics((AggregationStatistics) otherEnd, msgs);
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
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE:
            return this.basicSetMeasurementRange(null, msgs);
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS:
            return this.basicSetAggregationStatistics(null, msgs);
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
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS, MeasurementRange.class, msgs);
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
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE:
            return this.getMeasurementRange();
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__VALID:
            return this.isValid();
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION:
            if (resolve) {
                return this.getFunction();
            }
            return this.basicGetFunction();
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS:
            return this.getAggregationStatistics();
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON:
            if (resolve) {
                return this.getAggregationOn();
            }
            return this.basicGetAggregationOn();
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC:
            if (resolve) {
                return this.getMetric();
            }
            return this.basicGetMetric();
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
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE:
            this.setMeasurementRange((MeasurementRange) newValue);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__VALID:
            this.setValid((Boolean) newValue);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION:
            this.setFunction((AggregationFunctionDescription) newValue);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS:
            this.setAggregationStatistics((AggregationStatistics) newValue);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON:
            this.setAggregationOn((BaseMetricDescription) newValue);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC:
            this.setMetric((MetricDescription) newValue);
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
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE:
            this.setMeasurementRange((MeasurementRange) null);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__VALID:
            this.setValid(VALID_EDEFAULT);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION:
            this.setFunction((AggregationFunctionDescription) null);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS:
            this.setAggregationStatistics((AggregationStatistics) null);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON:
            this.setAggregationOn((BaseMetricDescription) null);
            return;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC:
            this.setMetric((MetricDescription) null);
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
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE:
            return this.getMeasurementRange() != null;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__VALID:
            return this.isValid() != VALID_EDEFAULT;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION:
            return this.basicGetFunction() != null;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS:
            return this.getAggregationStatistics() != null;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON:
            return this.basicGetAggregationOn() != null;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC:
            return this.basicGetMetric() != null;
        }
        return super.eIsSet(featureID);
    }

} // AggregatedMeasurementsImpl
