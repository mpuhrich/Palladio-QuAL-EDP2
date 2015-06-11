/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import java.util.Collection;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MINIMUM,
                ExperimentDataPackage.Literals.NUMERICAL_ORDINAL_STATISTICS__MINIMUM, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMinimum(final Measure newMinimum) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MINIMUM,
                ExperimentDataPackage.Literals.NUMERICAL_ORDINAL_STATISTICS__MINIMUM, newMinimum);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getMaximum() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM,
                ExperimentDataPackage.Literals.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMaximum(final Measure newMaximum) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM,
                ExperimentDataPackage.Literals.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM, newMaximum);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getMedian() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MEDIAN,
                ExperimentDataPackage.Literals.NUMERICAL_ORDINAL_STATISTICS__MEDIAN, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMedian(final Measure newMedian) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MEDIAN,
                ExperimentDataPackage.Literals.NUMERICAL_ORDINAL_STATISTICS__MEDIAN, newMedian);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<NumericalPercentile> getPercentiles() {
        return (EList<NumericalPercentile>) this.eDynamicGet(
                ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES,
                ExperimentDataPackage.Literals.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES, true, true);
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
            return this.getMinimum() != null;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MAXIMUM:
            return this.getMaximum() != null;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__MEDIAN:
            return this.getMedian() != null;
        case ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES:
            return !this.getPercentiles().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // NumericalOrdinalStatisticsImpl
