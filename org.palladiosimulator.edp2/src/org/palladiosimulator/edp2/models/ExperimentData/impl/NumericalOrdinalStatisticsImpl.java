/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numerical Ordinal Statistics</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalOrdinalStatisticsImpl#getMinimum
 * <em>Minimum</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalOrdinalStatisticsImpl#getMaximum
 * <em>Maximum</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalOrdinalStatisticsImpl#getMedian
 * <em>Median</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalOrdinalStatisticsImpl#getPercentiles
 * <em>Percentiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericalOrdinalStatisticsImpl extends NumericalNominalStatisticsImpl implements
        NumericalOrdinalStatistics {
    /**
     * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMinimum()
     * @generated
     * @ordered
     */
    protected Measure minimum;

    /**
     * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMaximum()
     * @generated
     * @ordered
     */
    protected Measure maximum;

    /**
     * The cached value of the '{@link #getMedian() <em>Median</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getMedian()
     * @generated
     * @ordered
     */
    protected Measure median;

    /**
     * The cached value of the '{@link #getPercentiles() <em>Percentiles</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPercentiles()
     * @generated
     * @ordered
     */
    protected EList<NumericalPercentile> percentiles;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NumericalOrdinalStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.NUMERICAL_ORDINAL_STATISTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getMinimum() {
        return this.minimum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMinimum(final Measure newMinimum) {
        final Measure oldMinimum = this.minimum;
        this.minimum = newMinimum;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MINIMUM, oldMinimum, this.minimum));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getMaximum() {
        return this.maximum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMaximum(final Measure newMaximum) {
        final Measure oldMaximum = this.maximum;
        this.maximum = newMaximum;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM, oldMaximum, this.maximum));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getMedian() {
        return this.median;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMedian(final Measure newMedian) {
        final Measure oldMedian = this.median;
        this.median = newMedian;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MEDIAN, oldMedian, this.median));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<NumericalPercentile> getPercentiles() {
        if (this.percentiles == null) {
            this.percentiles = new EObjectContainmentWithInverseEList<NumericalPercentile>(NumericalPercentile.class,
                    this, ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES,
                    ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS);
        }
        return this.percentiles;
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
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getPercentiles()).basicAdd(otherEnd, msgs);
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
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES:
            return ((InternalEList<?>) this.getPercentiles()).basicRemove(otherEnd, msgs);
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
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MINIMUM:
            return this.getMinimum();
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM:
            return this.getMaximum();
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MEDIAN:
            return this.getMedian();
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES:
            return this.getPercentiles();
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
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MINIMUM:
            this.setMinimum((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM:
            this.setMaximum((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MEDIAN:
            this.setMedian((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES:
            this.getPercentiles().clear();
            this.getPercentiles().addAll((Collection<? extends NumericalPercentile>) newValue);
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
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MINIMUM:
            this.setMinimum((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM:
            this.setMaximum((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MEDIAN:
            this.setMedian((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES:
            this.getPercentiles().clear();
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
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MINIMUM:
            return this.minimum != null;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM:
            return this.maximum != null;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MEDIAN:
            return this.median != null;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES:
            return this.percentiles != null && !this.percentiles.isEmpty();
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
        result.append(" (minimum: ");
        result.append(this.minimum);
        result.append(", maximum: ");
        result.append(this.maximum);
        result.append(", median: ");
        result.append(this.median);
        result.append(')');
        return result.toString();
    }

} // NumericalOrdinalStatisticsImpl
