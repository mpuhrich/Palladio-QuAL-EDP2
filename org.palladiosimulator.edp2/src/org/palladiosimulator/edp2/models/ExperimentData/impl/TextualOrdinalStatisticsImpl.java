/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;
import org.palladiosimulator.metricspec.Identifier;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Textual Ordinal Statistics</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl#getMinimum
 * <em>Minimum</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl#getMaximum
 * <em>Maximum</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.TextualOrdinalStatisticsImpl#getMedian
 * <em>Median</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualOrdinalStatisticsImpl extends TextualNominalStatisticsImpl implements TextualOrdinalStatistics {

    /**
     * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMinimum()
     * @generated
     * @ordered
     */
    protected Identifier minimum;

    /**
     * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMaximum()
     * @generated
     * @ordered
     */
    protected Identifier maximum;

    /**
     * The cached value of the '{@link #getMedian() <em>Median</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getMedian()
     * @generated
     * @ordered
     */
    protected Identifier median;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TextualOrdinalStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.TEXTUAL_ORDINAL_STATISTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Identifier getMinimum() {
        if (this.minimum != null && ((EObject) this.minimum).eIsProxy()) {
            final InternalEObject oldMinimum = (InternalEObject) this.minimum;
            this.minimum = (Identifier) this.eResolveProxy(oldMinimum);
            if (this.minimum != oldMinimum) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM, oldMinimum, this.minimum));
                }
            }
        }
        return this.minimum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Identifier basicGetMinimum() {
        return this.minimum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMinimum(final Identifier newMinimum) {
        final Identifier oldMinimum = this.minimum;
        this.minimum = newMinimum;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM, oldMinimum, this.minimum));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Identifier getMaximum() {
        if (this.maximum != null && ((EObject) this.maximum).eIsProxy()) {
            final InternalEObject oldMaximum = (InternalEObject) this.maximum;
            this.maximum = (Identifier) this.eResolveProxy(oldMaximum);
            if (this.maximum != oldMaximum) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM, oldMaximum, this.maximum));
                }
            }
        }
        return this.maximum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Identifier basicGetMaximum() {
        return this.maximum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMaximum(final Identifier newMaximum) {
        final Identifier oldMaximum = this.maximum;
        this.maximum = newMaximum;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM, oldMaximum, this.maximum));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Identifier getMedian() {
        if (this.median != null && ((EObject) this.median).eIsProxy()) {
            final InternalEObject oldMedian = (InternalEObject) this.median;
            this.median = (Identifier) this.eResolveProxy(oldMedian);
            if (this.median != oldMedian) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN, oldMedian, this.median));
                }
            }
        }
        return this.median;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Identifier basicGetMedian() {
        return this.median;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMedian(final Identifier newMedian) {
        final Identifier oldMedian = this.median;
        this.median = newMedian;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN, oldMedian, this.median));
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
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM:
            if (resolve) {
                return this.getMinimum();
            }
            return this.basicGetMinimum();
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM:
            if (resolve) {
                return this.getMaximum();
            }
            return this.basicGetMaximum();
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN:
            if (resolve) {
                return this.getMedian();
            }
            return this.basicGetMedian();
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
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM:
            this.setMinimum((Identifier) newValue);
            return;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM:
            this.setMaximum((Identifier) newValue);
            return;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN:
            this.setMedian((Identifier) newValue);
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
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM:
            this.setMinimum((Identifier) null);
            return;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM:
            this.setMaximum((Identifier) null);
            return;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN:
            this.setMedian((Identifier) null);
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
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MINIMUM:
            return this.minimum != null;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MAXIMUM:
            return this.maximum != null;
        case ExperimentDataPackage.TEXTUAL_ORDINAL_STATISTICS__MEDIAN:
            return this.median != null;
        }
        return super.eIsSet(featureID);
    }

} // TextualOrdinalStatisticsImpl
