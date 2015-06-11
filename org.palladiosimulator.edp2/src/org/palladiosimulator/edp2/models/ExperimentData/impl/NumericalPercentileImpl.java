/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalPercentile;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numerical Percentile</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalPercentileImpl#getPercentile
 * <em>Percentile</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalPercentileImpl#getValue
 * <em>Value</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalPercentileImpl#getOrdinalStatistics
 * <em>Ordinal Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericalPercentileImpl extends IdentifierImpl implements NumericalPercentile {

    /**
     * The default value of the '{@link #getPercentile() <em>Percentile</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPercentile()
     * @generated
     * @ordered
     */
    protected static final double PERCENTILE_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NumericalPercentileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.NUMERICAL_PERCENTILE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getPercentile() {
        return (Double) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_PERCENTILE__PERCENTILE,
                ExperimentDataPackage.Literals.NUMERICAL_PERCENTILE__PERCENTILE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPercentile(final double newPercentile) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_PERCENTILE__PERCENTILE,
                ExperimentDataPackage.Literals.NUMERICAL_PERCENTILE__PERCENTILE, newPercentile);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getValue() {
        return (Measure) this.eDynamicGet(ExperimentDataPackage.NUMERICAL_PERCENTILE__VALUE,
                ExperimentDataPackage.Literals.NUMERICAL_PERCENTILE__VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValue(final Measure newValue) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_PERCENTILE__VALUE,
                ExperimentDataPackage.Literals.NUMERICAL_PERCENTILE__VALUE, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumericalOrdinalStatistics getOrdinalStatistics() {
        return (NumericalOrdinalStatistics) this.eDynamicGet(
                ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS,
                ExperimentDataPackage.Literals.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetOrdinalStatistics(final NumericalOrdinalStatistics newOrdinalStatistics,
            NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newOrdinalStatistics,
                ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOrdinalStatistics(final NumericalOrdinalStatistics newOrdinalStatistics) {
        this.eDynamicSet(ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS,
                ExperimentDataPackage.Literals.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS, newOrdinalStatistics);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetOrdinalStatistics((NumericalOrdinalStatistics) otherEnd, msgs);
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
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS:
            return this.basicSetOrdinalStatistics(null, msgs);
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
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES, NumericalOrdinalStatistics.class,
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
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__PERCENTILE:
            return this.getPercentile();
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__VALUE:
            return this.getValue();
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS:
            return this.getOrdinalStatistics();
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
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__PERCENTILE:
            this.setPercentile((Double) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__VALUE:
            this.setValue((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS:
            this.setOrdinalStatistics((NumericalOrdinalStatistics) newValue);
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
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__PERCENTILE:
            this.setPercentile(PERCENTILE_EDEFAULT);
            return;
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__VALUE:
            this.setValue((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS:
            this.setOrdinalStatistics((NumericalOrdinalStatistics) null);
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
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__PERCENTILE:
            return this.getPercentile() != PERCENTILE_EDEFAULT;
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__VALUE:
            return this.getValue() != null;
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS:
            return this.getOrdinalStatistics() != null;
        }
        return super.eIsSet(featureID);
    }

} // NumericalPercentileImpl
