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
import org.palladiosimulator.edp2.models.ExperimentData.FixedIntervals;
import org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fixed Intervals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedIntervalsImpl#getLowerBound
 * <em>Lower Bound</em>}</li>
 * <li>{@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedIntervalsImpl#getWidth <em>
 * Width</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedIntervalsImpl#getNumberOfIntervals
 * <em>Number Of Intervals</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.FixedIntervalsImpl#getAggregatedMeasurements
 * <em>Aggregated Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedIntervalsImpl extends IdentifierImpl implements FixedIntervals {
    /**
     * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLowerBound()
     * @generated
     * @ordered
     */
    protected Measure lowerBound;

    /**
     * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected Measure width;

    /**
     * The default value of the '{@link #getNumberOfIntervals() <em>Number Of Intervals</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumberOfIntervals()
     * @generated
     * @ordered
     */
    protected static final long NUMBER_OF_INTERVALS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getNumberOfIntervals() <em>Number Of Intervals</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getNumberOfIntervals()
     * @generated
     * @ordered
     */
    protected long numberOfIntervals = NUMBER_OF_INTERVALS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FixedIntervalsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.FIXED_INTERVALS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getLowerBound() {
        return this.lowerBound;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLowerBound(final Measure newLowerBound) {
        final Measure oldLowerBound = this.lowerBound;
        this.lowerBound = newLowerBound;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.FIXED_INTERVALS__LOWER_BOUND, oldLowerBound, this.lowerBound));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure getWidth() {
        return this.width;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWidth(final Measure newWidth) {
        final Measure oldWidth = this.width;
        this.width = newWidth;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, ExperimentDataPackage.FIXED_INTERVALS__WIDTH,
                    oldWidth, this.width));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public long getNumberOfIntervals() {
        return this.numberOfIntervals;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setNumberOfIntervals(final long newNumberOfIntervals) {
        final long oldNumberOfIntervals = this.numberOfIntervals;
        this.numberOfIntervals = newNumberOfIntervals;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.FIXED_INTERVALS__NUMBER_OF_INTERVALS, oldNumberOfIntervals,
                    this.numberOfIntervals));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FixedWidthAggregatedMeasurements getAggregatedMeasurements() {
        if (this.eContainerFeatureID() != ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS) {
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
                ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS, msgs);
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
                || (this.eContainerFeatureID() != ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS && newAggregatedMeasurements != null)) {
            if (EcoreUtil.isAncestor(this, newAggregatedMeasurements)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newAggregatedMeasurements != null) {
                msgs = ((InternalEObject) newAggregatedMeasurements).eInverseAdd(this,
                        ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS,
                        FixedWidthAggregatedMeasurements.class, msgs);
            }
            msgs = this.basicSetAggregatedMeasurements(newAggregatedMeasurements, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS, newAggregatedMeasurements,
                    newAggregatedMeasurements));
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
        case ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetAggregatedMeasurements((FixedWidthAggregatedMeasurements) otherEnd, msgs);
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
        case ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS:
            return this.basicSetAggregatedMeasurements(null, msgs);
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
        case ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS:
            return this.eInternalContainer().eInverseRemove(this,
                    ExperimentDataPackage.FIXED_WIDTH_AGGREGATED_MEASUREMENTS__INTERVALS,
                    FixedWidthAggregatedMeasurements.class, msgs);
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
        case ExperimentDataPackage.FIXED_INTERVALS__LOWER_BOUND:
            return this.getLowerBound();
        case ExperimentDataPackage.FIXED_INTERVALS__WIDTH:
            return this.getWidth();
        case ExperimentDataPackage.FIXED_INTERVALS__NUMBER_OF_INTERVALS:
            return this.getNumberOfIntervals();
        case ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS:
            return this.getAggregatedMeasurements();
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
        case ExperimentDataPackage.FIXED_INTERVALS__LOWER_BOUND:
            this.setLowerBound((Measure) newValue);
            return;
        case ExperimentDataPackage.FIXED_INTERVALS__WIDTH:
            this.setWidth((Measure) newValue);
            return;
        case ExperimentDataPackage.FIXED_INTERVALS__NUMBER_OF_INTERVALS:
            this.setNumberOfIntervals((Long) newValue);
            return;
        case ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS:
            this.setAggregatedMeasurements((FixedWidthAggregatedMeasurements) newValue);
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
        case ExperimentDataPackage.FIXED_INTERVALS__LOWER_BOUND:
            this.setLowerBound((Measure) null);
            return;
        case ExperimentDataPackage.FIXED_INTERVALS__WIDTH:
            this.setWidth((Measure) null);
            return;
        case ExperimentDataPackage.FIXED_INTERVALS__NUMBER_OF_INTERVALS:
            this.setNumberOfIntervals(NUMBER_OF_INTERVALS_EDEFAULT);
            return;
        case ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS:
            this.setAggregatedMeasurements((FixedWidthAggregatedMeasurements) null);
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
        case ExperimentDataPackage.FIXED_INTERVALS__LOWER_BOUND:
            return this.lowerBound != null;
        case ExperimentDataPackage.FIXED_INTERVALS__WIDTH:
            return this.width != null;
        case ExperimentDataPackage.FIXED_INTERVALS__NUMBER_OF_INTERVALS:
            return this.numberOfIntervals != NUMBER_OF_INTERVALS_EDEFAULT;
        case ExperimentDataPackage.FIXED_INTERVALS__AGGREGATED_MEASUREMENTS:
            return this.getAggregatedMeasurements() != null;
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
        result.append(" (lowerBound: ");
        result.append(this.lowerBound);
        result.append(", width: ");
        result.append(this.width);
        result.append(", numberOfIntervals: ");
        result.append(this.numberOfIntervals);
        result.append(')');
        return result.toString();
    }

} // FixedIntervalsImpl
