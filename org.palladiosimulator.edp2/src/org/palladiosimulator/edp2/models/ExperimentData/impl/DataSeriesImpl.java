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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.edp2.models.ExperimentData.DataSeries;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.TextualNominalStatistics;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Data Series</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.DataSeriesImpl#getNumericalStatistics
 * <em>Numerical Statistics</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.DataSeriesImpl#getAggregatedMeasurements
 * <em>Aggregated Measurements</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.DataSeriesImpl#getValuesUuid
 * <em>Values Uuid</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.DataSeriesImpl#getTextualStatistics
 * <em>Textual Statistics</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.DataSeriesImpl#getRawMeasurements
 * <em>Raw Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataSeriesImpl extends CDOObjectImpl implements DataSeries {

    /**
     * The default value of the '{@link #getValuesUuid() <em>Values Uuid</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getValuesUuid()
     * @generated
     * @ordered
     */
    protected static final String VALUES_UUID_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DataSeriesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.DATA_SERIES;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumericalNominalStatistics getNumericalStatistics() {
        return (NumericalNominalStatistics) this.eDynamicGet(ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS,
                ExperimentDataPackage.Literals.DATA_SERIES__NUMERICAL_STATISTICS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetNumericalStatistics(final NumericalNominalStatistics newNumericalStatistics,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newNumericalStatistics,
                ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setNumericalStatistics(final NumericalNominalStatistics newNumericalStatistics) {
        this.eDynamicSet(ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS,
                ExperimentDataPackage.Literals.DATA_SERIES__NUMERICAL_STATISTICS, newNumericalStatistics);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FixedWidthAggregatedMeasurements getAggregatedMeasurements() {
        return (FixedWidthAggregatedMeasurements) this.eDynamicGet(
                ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS,
                ExperimentDataPackage.Literals.DATA_SERIES__AGGREGATED_MEASUREMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetAggregatedMeasurements(
            final FixedWidthAggregatedMeasurements newAggregatedMeasurements, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newAggregatedMeasurements,
                ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregatedMeasurements(final FixedWidthAggregatedMeasurements newAggregatedMeasurements) {
        this.eDynamicSet(ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS,
                ExperimentDataPackage.Literals.DATA_SERIES__AGGREGATED_MEASUREMENTS, newAggregatedMeasurements);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getValuesUuid() {
        return (String) this.eDynamicGet(ExperimentDataPackage.DATA_SERIES__VALUES_UUID,
                ExperimentDataPackage.Literals.DATA_SERIES__VALUES_UUID, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValuesUuid(final String newValuesUuid) {
        this.eDynamicSet(ExperimentDataPackage.DATA_SERIES__VALUES_UUID,
                ExperimentDataPackage.Literals.DATA_SERIES__VALUES_UUID, newValuesUuid);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TextualNominalStatistics getTextualStatistics() {
        return (TextualNominalStatistics) this.eDynamicGet(ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS,
                ExperimentDataPackage.Literals.DATA_SERIES__TEXTUAL_STATISTICS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetTextualStatistics(final TextualNominalStatistics newTextualStatistics,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newTextualStatistics,
                ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTextualStatistics(final TextualNominalStatistics newTextualStatistics) {
        this.eDynamicSet(ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS,
                ExperimentDataPackage.Literals.DATA_SERIES__TEXTUAL_STATISTICS, newTextualStatistics);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RawMeasurements getRawMeasurements() {
        return (RawMeasurements) this.eDynamicGet(ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS,
                ExperimentDataPackage.Literals.DATA_SERIES__RAW_MEASUREMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRawMeasurements(final RawMeasurements newRawMeasurements, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newRawMeasurements,
                ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRawMeasurements(final RawMeasurements newRawMeasurements) {
        this.eDynamicSet(ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS,
                ExperimentDataPackage.Literals.DATA_SERIES__RAW_MEASUREMENTS, newRawMeasurements);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS:
            final NumericalNominalStatistics numericalStatistics = this.getNumericalStatistics();
            if (numericalStatistics != null) {
                msgs = ((InternalEObject) numericalStatistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS, null, msgs);
            }
            return this.basicSetNumericalStatistics((NumericalNominalStatistics) otherEnd, msgs);
        case ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetAggregatedMeasurements((FixedWidthAggregatedMeasurements) otherEnd, msgs);
        case ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS:
            final TextualNominalStatistics textualStatistics = this.getTextualStatistics();
            if (textualStatistics != null) {
                msgs = ((InternalEObject) textualStatistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS, null, msgs);
            }
            return this.basicSetTextualStatistics((TextualNominalStatistics) otherEnd, msgs);
        case ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetRawMeasurements((RawMeasurements) otherEnd, msgs);
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
        case ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS:
            return this.basicSetNumericalStatistics(null, msgs);
        case ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS:
            return this.basicSetAggregatedMeasurements(null, msgs);
        case ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS:
            return this.basicSetTextualStatistics(null, msgs);
        case ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS:
            return this.basicSetRawMeasurements(null, msgs);
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
        case ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES,
                    FixedWidthAggregatedMeasurements.class, msgs);
        case ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS:
            return this.eInternalContainer().eInverseRemove(this, ExperimentDataPackage.RAW_MEASUREMENTS__DATA_SERIES,
                    RawMeasurements.class, msgs);
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
        case ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS:
            return this.getNumericalStatistics();
        case ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS:
            return this.getAggregatedMeasurements();
        case ExperimentDataPackage.DATA_SERIES__VALUES_UUID:
            return this.getValuesUuid();
        case ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS:
            return this.getTextualStatistics();
        case ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS:
            return this.getRawMeasurements();
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
        case ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS:
            this.setNumericalStatistics((NumericalNominalStatistics) newValue);
            return;
        case ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS:
            this.setAggregatedMeasurements((FixedWidthAggregatedMeasurements) newValue);
            return;
        case ExperimentDataPackage.DATA_SERIES__VALUES_UUID:
            this.setValuesUuid((String) newValue);
            return;
        case ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS:
            this.setTextualStatistics((TextualNominalStatistics) newValue);
            return;
        case ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS:
            this.setRawMeasurements((RawMeasurements) newValue);
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
        case ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS:
            this.setNumericalStatistics((NumericalNominalStatistics) null);
            return;
        case ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS:
            this.setAggregatedMeasurements((FixedWidthAggregatedMeasurements) null);
            return;
        case ExperimentDataPackage.DATA_SERIES__VALUES_UUID:
            this.setValuesUuid(VALUES_UUID_EDEFAULT);
            return;
        case ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS:
            this.setTextualStatistics((TextualNominalStatistics) null);
            return;
        case ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS:
            this.setRawMeasurements((RawMeasurements) null);
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
        case ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS:
            return this.getNumericalStatistics() != null;
        case ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS:
            return this.getAggregatedMeasurements() != null;
        case ExperimentDataPackage.DATA_SERIES__VALUES_UUID:
            return VALUES_UUID_EDEFAULT == null ? this.getValuesUuid() != null : !VALUES_UUID_EDEFAULT.equals(this
                    .getValuesUuid());
        case ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS:
            return this.getTextualStatistics() != null;
        case ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS:
            return this.getRawMeasurements() != null;
        }
        return super.eIsSet(featureID);
    }

} // DataSeriesImpl
