/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numerical Interval Statistics</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl#getArithmethicMean
 * <em>Arithmethic Mean</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl#getVariance
 * <em>Variance</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl#getStandardDeviation
 * <em>Standard Deviation</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalIntervalStatisticsImpl#getSum
 * <em>Sum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericalIntervalStatisticsImpl extends NumericalOrdinalStatisticsImpl implements
NumericalIntervalStatistics {
    /**
     * The cached value of the '{@link #getArithmethicMean() <em>Arithmethic Mean</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getArithmethicMean()
     * @generated
     * @ordered
     */
    protected Measure arithmethicMean;

    /**
     * The cached value of the '{@link #getVariance() <em>Variance</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getVariance()
     * @generated
     * @ordered
     */
    protected Measure variance;

    /**
     * The cached value of the '{@link #getStandardDeviation() <em>Standard Deviation</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getStandardDeviation()
     * @generated
     * @ordered
     */
    protected Measure standardDeviation;

    /**
     * The cached value of the '{@link #getSum() <em>Sum</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSum()
     * @generated
     * @ordered
     */
    protected Measure sum;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NumericalIntervalStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.NUMERICAL_INTERVAL_STATISTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getArithmethicMean() {
        return this.arithmethicMean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setArithmethicMean(final Measure newArithmethicMean) {
        final Measure oldArithmethicMean = this.arithmethicMean;
        this.arithmethicMean = newArithmethicMean;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN, oldArithmethicMean,
                    this.arithmethicMean));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getVariance() {
        return this.variance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setVariance(final Measure newVariance) {
        final Measure oldVariance = this.variance;
        this.variance = newVariance;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE, oldVariance, this.variance));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getStandardDeviation() {
        return this.standardDeviation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStandardDeviation(final Measure newStandardDeviation) {
        final Measure oldStandardDeviation = this.standardDeviation;
        this.standardDeviation = newStandardDeviation;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION, oldStandardDeviation,
                    this.standardDeviation));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getSum() {
        return this.sum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSum(final Measure newSum) {
        final Measure oldSum = this.sum;
        this.sum = newSum;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM, oldSum, this.sum));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN:
            return this.getArithmethicMean();
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE:
            return this.getVariance();
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION:
            return this.getStandardDeviation();
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM:
            return this.getSum();
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
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN:
            this.setArithmethicMean((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE:
            this.setVariance((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION:
            this.setStandardDeviation((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM:
            this.setSum((Measure) newValue);
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
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN:
            this.setArithmethicMean((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE:
            this.setVariance((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION:
            this.setStandardDeviation((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM:
            this.setSum((Measure) null);
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
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__ARITHMETHIC_MEAN:
            return this.arithmethicMean != null;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__VARIANCE:
            return this.variance != null;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__STANDARD_DEVIATION:
            return this.standardDeviation != null;
        case ExperimentDataPackage.NUMERICAL_INTERVAL_STATISTICS__SUM:
            return this.sum != null;
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
        result.append(" (arithmethicMean: ");
        result.append(this.arithmethicMean);
        result.append(", variance: ");
        result.append(this.variance);
        result.append(", standardDeviation: ");
        result.append(this.standardDeviation);
        result.append(", sum: ");
        result.append(this.sum);
        result.append(')');
        return result.toString();
    }

} // NumericalIntervalStatisticsImpl
