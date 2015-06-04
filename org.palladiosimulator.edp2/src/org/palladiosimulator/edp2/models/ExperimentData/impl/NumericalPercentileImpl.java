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
     * The cached value of the '{@link #getPercentile() <em>Percentile</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPercentile()
     * @generated
     * @ordered
     */
    protected double percentile = PERCENTILE_EDEFAULT;

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
        return this.percentile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPercentile(final double newPercentile) {
        final double oldPercentile = this.percentile;
        this.percentile = newPercentile;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_PERCENTILE__PERCENTILE, oldPercentile, this.percentile));
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
                    ExperimentDataPackage.NUMERICAL_PERCENTILE__VALUE, oldValue, this.value));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NumericalOrdinalStatistics getOrdinalStatistics() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS) {
            return null;
        }
        return (NumericalOrdinalStatistics) this.eInternalContainer();
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
        if (newOrdinalStatistics != this.eInternalContainer()
                || (this.eContainerFeatureID() != ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS && newOrdinalStatistics != null)) {
            if (EcoreUtil.isAncestor(this, newOrdinalStatistics)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newOrdinalStatistics != null) {
                msgs = ((InternalEObject) newOrdinalStatistics).eInverseAdd(this,
                        ExperimentDataPackage.NUMERICAL_ORDINAL_STATISTICS__PERCENTILES,
                        NumericalOrdinalStatistics.class, msgs);
            }
            msgs = this.basicSetOrdinalStatistics(newOrdinalStatistics, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS, newOrdinalStatistics,
                    newOrdinalStatistics));
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
            return this.percentile != PERCENTILE_EDEFAULT;
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__VALUE:
            return this.value != null;
        case ExperimentDataPackage.NUMERICAL_PERCENTILE__ORDINAL_STATISTICS:
            return this.getOrdinalStatistics() != null;
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
        result.append(" (percentile: ");
        result.append(this.percentile);
        result.append(", value: ");
        result.append(this.value);
        result.append(')');
        return result.toString();
    }

} // NumericalPercentileImpl
