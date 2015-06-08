/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import javax.measure.Measure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalMassDistribution;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numerical Mass Distribution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalMassDistributionImpl#getFrequency
 * <em>Frequency</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalMassDistributionImpl#getValue
 * <em>Value</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.NumericalMassDistributionImpl#getNumericalNominalStatistics
 * <em>Numerical Nominal Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericalMassDistributionImpl extends CDOObjectImpl implements NumericalMassDistribution {

    /**
     * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected static final long FREQUENCY_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected long frequency = FREQUENCY_EDEFAULT;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Measure value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NumericalMassDistributionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.NUMERICAL_MASS_DISTRIBUTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public long getFrequency() {
        return this.frequency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFrequency(final long newFrequency) {
        final long oldFrequency = this.frequency;
        this.frequency = newFrequency;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__FREQUENCY, oldFrequency, this.frequency));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValue(final Measure newValue) {
        final Measure oldValue = this.value;
        this.value = newValue;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__VALUE, oldValue, this.value));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumericalNominalStatistics getNumericalNominalStatistics() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS) {
            return null;
        }
        return (NumericalNominalStatistics) this.eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetNumericalNominalStatistics(
            final NumericalNominalStatistics newNumericalNominalStatistics, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newNumericalNominalStatistics,
                ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setNumericalNominalStatistics(final NumericalNominalStatistics newNumericalNominalStatistics) {
        if (newNumericalNominalStatistics != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS && newNumericalNominalStatistics != null)) {
            if (EcoreUtil.isAncestor(this, newNumericalNominalStatistics)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newNumericalNominalStatistics != null) {
                msgs = ((InternalEObject) newNumericalNominalStatistics).eInverseAdd(this,
                        ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION,
                        NumericalNominalStatistics.class, msgs);
            }
            msgs = this.basicSetNumericalNominalStatistics(newNumericalNominalStatistics, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS,
                    newNumericalNominalStatistics, newNumericalNominalStatistics));
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
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetNumericalNominalStatistics((NumericalNominalStatistics) otherEnd, msgs);
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
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS:
            return this.basicSetNumericalNominalStatistics(null, msgs);
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
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.NUMERICAL_NOMINAL_STATISTICS__NUMERICAL_MASS_DISTRIBUTION,
                    NumericalNominalStatistics.class, msgs);
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
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__FREQUENCY:
            return this.getFrequency();
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__VALUE:
            return this.getValue();
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS:
            return this.getNumericalNominalStatistics();
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
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__FREQUENCY:
            this.setFrequency((Long) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__VALUE:
            this.setValue((Measure) newValue);
            return;
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS:
            this.setNumericalNominalStatistics((NumericalNominalStatistics) newValue);
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
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__FREQUENCY:
            this.setFrequency(FREQUENCY_EDEFAULT);
            return;
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__VALUE:
            this.setValue((Measure) null);
            return;
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS:
            this.setNumericalNominalStatistics((NumericalNominalStatistics) null);
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
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__FREQUENCY:
            return this.frequency != FREQUENCY_EDEFAULT;
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__VALUE:
            return this.value != null;
        case ExperimentDataPackage.NUMERICAL_MASS_DISTRIBUTION__NUMERICAL_NOMINAL_STATISTICS:
            return this.getNumericalNominalStatistics() != null;
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
        result.append(" (frequency: ");
        result.append(this.frequency);
        result.append(", value: ");
        result.append(this.value);
        result.append(')');
        return result.toString();
    }

} // NumericalMassDistributionImpl
