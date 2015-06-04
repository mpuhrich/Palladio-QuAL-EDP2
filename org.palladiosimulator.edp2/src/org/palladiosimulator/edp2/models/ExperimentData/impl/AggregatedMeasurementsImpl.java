/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
     * The cached value of the '{@link #isValid() <em>Valid</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #isValid()
     * @generated
     * @ordered
     */
    protected boolean valid = VALID_EDEFAULT;

    /**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected AggregationFunctionDescription function;

    /**
     * The cached value of the '{@link #getAggregationStatistics() <em>Aggregation Statistics</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAggregationStatistics()
     * @generated
     * @ordered
     */
    protected AggregationStatistics aggregationStatistics;

    /**
     * The cached value of the '{@link #getAggregationOn() <em>Aggregation On</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAggregationOn()
     * @generated
     * @ordered
     */
    protected BaseMetricDescription aggregationOn;

    /**
     * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getMetric()
     * @generated
     * @ordered
     */
    protected MetricDescription metric;

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
        if (this.eContainerFeatureID() != ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE) {
            return null;
        }
        return (MeasurementRange) this.eInternalContainer();
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
        if (newMeasurementRange != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE && newMeasurementRange != null)) {
            if (EcoreUtil.isAncestor(this, newMeasurementRange)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newMeasurementRange != null) {
                msgs = ((InternalEObject) newMeasurementRange).eInverseAdd(this,
                        ExperimentDataPackage.MEASUREMENT_RANGE__AGGREGATED_MEASUREMENTS, MeasurementRange.class, msgs);
            }
            msgs = this.basicSetMeasurementRange(newMeasurementRange, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE, newMeasurementRange,
                    newMeasurementRange));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isValid() {
        return this.valid;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValid(final boolean newValid) {
        final boolean oldValid = this.valid;
        this.valid = newValid;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.AGGREGATED_MEASUREMENTS__VALID, oldValid, this.valid));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AggregationFunctionDescription getFunction() {
        if (this.function != null && this.function.eIsProxy()) {
            final InternalEObject oldFunction = (InternalEObject) this.function;
            this.function = (AggregationFunctionDescription) this.eResolveProxy(oldFunction);
            if (this.function != oldFunction) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION, oldFunction, this.function));
                }
            }
        }
        return this.function;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AggregationFunctionDescription basicGetFunction() {
        return this.function;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFunction(final AggregationFunctionDescription newFunction) {
        final AggregationFunctionDescription oldFunction = this.function;
        this.function = newFunction;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION, oldFunction, this.function));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AggregationStatistics getAggregationStatistics() {
        return this.aggregationStatistics;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetAggregationStatistics(final AggregationStatistics newAggregationStatistics,
            NotificationChain msgs) {
        final AggregationStatistics oldAggregationStatistics = this.aggregationStatistics;
        this.aggregationStatistics = newAggregationStatistics;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS, oldAggregationStatistics,
                    newAggregationStatistics);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregationStatistics(final AggregationStatistics newAggregationStatistics) {
        if (newAggregationStatistics != this.aggregationStatistics) {
            NotificationChain msgs = null;
            if (this.aggregationStatistics != null) {
                msgs = ((InternalEObject) this.aggregationStatistics).eInverseRemove(this,
                        ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS,
                        AggregationStatistics.class, msgs);
            }
            if (newAggregationStatistics != null) {
                msgs = ((InternalEObject) newAggregationStatistics).eInverseAdd(this,
                        ExperimentDataPackage.AGGREGATION_STATISTICS__AGGREGATED_MEASUREMENTS,
                        AggregationStatistics.class, msgs);
            }
            msgs = this.basicSetAggregationStatistics(newAggregationStatistics, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS, newAggregationStatistics,
                    newAggregationStatistics));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public BaseMetricDescription getAggregationOn() {
        if (this.aggregationOn != null && this.aggregationOn.eIsProxy()) {
            final InternalEObject oldAggregationOn = (InternalEObject) this.aggregationOn;
            this.aggregationOn = (BaseMetricDescription) this.eResolveProxy(oldAggregationOn);
            if (this.aggregationOn != oldAggregationOn) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON, oldAggregationOn,
                            this.aggregationOn));
                }
            }
        }
        return this.aggregationOn;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public BaseMetricDescription basicGetAggregationOn() {
        return this.aggregationOn;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregationOn(final BaseMetricDescription newAggregationOn) {
        final BaseMetricDescription oldAggregationOn = this.aggregationOn;
        this.aggregationOn = newAggregationOn;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON, oldAggregationOn, this.aggregationOn));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricDescription getMetric() {
        if (this.metric != null && this.metric.eIsProxy()) {
            final InternalEObject oldMetric = (InternalEObject) this.metric;
            this.metric = (MetricDescription) this.eResolveProxy(oldMetric);
            if (this.metric != oldMetric) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC, oldMetric, this.metric));
                }
            }
        }
        return this.metric;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MetricDescription basicGetMetric() {
        return this.metric;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMetric(final MetricDescription newMetric) {
        final MetricDescription oldMetric = this.metric;
        this.metric = newMetric;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC, oldMetric, this.metric));
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
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__MEASUREMENT_RANGE:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetMeasurementRange((MeasurementRange) otherEnd, msgs);
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS:
            if (this.aggregationStatistics != null) {
                msgs = ((InternalEObject) this.aggregationStatistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
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
            return this.valid != VALID_EDEFAULT;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__FUNCTION:
            return this.function != null;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_STATISTICS:
            return this.aggregationStatistics != null;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__AGGREGATION_ON:
            return this.aggregationOn != null;
        case ExperimentDataPackage.AGGREGATED_MEASUREMENTS__METRIC:
            return this.metric != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (valid: ");
        result.append(this.valid);
        result.append(')');
        return result.toString();
    }

} // AggregatedMeasurementsImpl
