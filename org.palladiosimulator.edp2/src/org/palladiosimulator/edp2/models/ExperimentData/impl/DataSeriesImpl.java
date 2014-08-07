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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
public abstract class DataSeriesImpl extends EObjectImpl implements DataSeries {
    /**
     * The cached value of the '{@link #getNumericalStatistics() <em>Numerical Statistics</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumericalStatistics()
     * @generated
     * @ordered
     */
    protected NumericalNominalStatistics numericalStatistics;

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
     * The cached value of the '{@link #getValuesUuid() <em>Values Uuid</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getValuesUuid()
     * @generated
     * @ordered
     */
    protected String valuesUuid = VALUES_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getTextualStatistics() <em>Textual Statistics</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTextualStatistics()
     * @generated
     * @ordered
     */
    protected TextualNominalStatistics textualStatistics;

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
    public NumericalNominalStatistics getNumericalStatistics() {
        return this.numericalStatistics;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetNumericalStatistics(final NumericalNominalStatistics newNumericalStatistics,
            NotificationChain msgs) {
        final NumericalNominalStatistics oldNumericalStatistics = this.numericalStatistics;
        this.numericalStatistics = newNumericalStatistics;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS, oldNumericalStatistics,
                    newNumericalStatistics);
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
    public void setNumericalStatistics(final NumericalNominalStatistics newNumericalStatistics) {
        if (newNumericalStatistics != this.numericalStatistics) {
            NotificationChain msgs = null;
            if (this.numericalStatistics != null) {
                msgs = ((InternalEObject) this.numericalStatistics).eInverseRemove(this,
                        ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES,
                        NumericalNominalStatistics.class, msgs);
            }
            if (newNumericalStatistics != null) {
                msgs = ((InternalEObject) newNumericalStatistics).eInverseAdd(this,
                        ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__DATA_SERIES,
                        NumericalNominalStatistics.class, msgs);
            }
            msgs = this.basicSetNumericalStatistics(newNumericalStatistics, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS, newNumericalStatistics,
                    newNumericalStatistics));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FixedWidthAggregatedMeasurements getAggregatedMeasurements() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS) {
            return null;
        }
        return (FixedWidthAggregatedMeasurements) this.eInternalContainer();
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
        if (newAggregatedMeasurements != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS && newAggregatedMeasurements != null)) {
            if (EcoreUtil.isAncestor(this, newAggregatedMeasurements)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newAggregatedMeasurements != null) {
                msgs = ((InternalEObject) newAggregatedMeasurements).eInverseAdd(this,
                        ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__DATA_SERIES,
                        FixedWidthAggregatedMeasurements.class, msgs);
            }
            msgs = this.basicSetAggregatedMeasurements(newAggregatedMeasurements, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS, newAggregatedMeasurements,
                    newAggregatedMeasurements));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getValuesUuid() {
        return this.valuesUuid;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValuesUuid(final String newValuesUuid) {
        final String oldValuesUuid = this.valuesUuid;
        this.valuesUuid = newValuesUuid;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.DATA_SERIES__VALUES_UUID,
                    oldValuesUuid, this.valuesUuid));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TextualNominalStatistics getTextualStatistics() {
        return this.textualStatistics;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetTextualStatistics(final TextualNominalStatistics newTextualStatistics,
            NotificationChain msgs) {
        final TextualNominalStatistics oldTextualStatistics = this.textualStatistics;
        this.textualStatistics = newTextualStatistics;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS, oldTextualStatistics, newTextualStatistics);
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
    public void setTextualStatistics(final TextualNominalStatistics newTextualStatistics) {
        if (newTextualStatistics != this.textualStatistics) {
            NotificationChain msgs = null;
            if (this.textualStatistics != null) {
                msgs = ((InternalEObject) this.textualStatistics).eInverseRemove(this,
                        ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES, TextualNominalStatistics.class,
                        msgs);
            }
            if (newTextualStatistics != null) {
                msgs = ((InternalEObject) newTextualStatistics).eInverseAdd(this,
                        ExperimentDataPackage.TEXTUAL_NOMINAL_STATISTICS__DATA_SERIES, TextualNominalStatistics.class,
                        msgs);
            }
            msgs = this.basicSetTextualStatistics(newTextualStatistics, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS, newTextualStatistics, newTextualStatistics));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RawMeasurements getRawMeasurements() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS) {
            return null;
        }
        return (RawMeasurements) this.eInternalContainer();
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
        if (newRawMeasurements != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS && newRawMeasurements != null)) {
            if (EcoreUtil.isAncestor(this, newRawMeasurements)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newRawMeasurements != null) {
                msgs = ((InternalEObject) newRawMeasurements).eInverseAdd(this,
                        ExperimentDataPackage.RAW_MEASUREMENTS__DATA_SERIES, RawMeasurements.class, msgs);
            }
            msgs = this.basicSetRawMeasurements(newRawMeasurements, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS, newRawMeasurements, newRawMeasurements));
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
        case ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS:
            if (this.numericalStatistics != null) {
                msgs = ((InternalEObject) this.numericalStatistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ExperimentDataPackage.DATA_SERIES__NUMERICAL_STATISTICS, null, msgs);
            }
            return this.basicSetNumericalStatistics((NumericalNominalStatistics) otherEnd, msgs);
        case ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetAggregatedMeasurements((FixedWidthAggregatedMeasurements) otherEnd, msgs);
        case ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS:
            if (this.textualStatistics != null) {
                msgs = ((InternalEObject) this.textualStatistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
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
            return this.numericalStatistics != null;
        case ExperimentDataPackage.DATA_SERIES__AGGREGATED_MEASUREMENTS:
            return this.getAggregatedMeasurements() != null;
        case ExperimentDataPackage.DATA_SERIES__VALUES_UUID:
            return VALUES_UUID_EDEFAULT == null ? this.valuesUuid != null : !VALUES_UUID_EDEFAULT
                    .equals(this.valuesUuid);
        case ExperimentDataPackage.DATA_SERIES__TEXTUAL_STATISTICS:
            return this.textualStatistics != null;
        case ExperimentDataPackage.DATA_SERIES__RAW_MEASUREMENTS:
            return this.getRawMeasurements() != null;
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
        result.append(" (valuesUuid: ");
        result.append(this.valuesUuid);
        result.append(')');
        return result.toString();
    }

} // DataSeriesImpl
