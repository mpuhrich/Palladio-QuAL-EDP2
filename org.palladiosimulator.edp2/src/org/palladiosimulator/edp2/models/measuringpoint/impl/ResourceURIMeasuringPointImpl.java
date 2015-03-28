/**
 */
package org.palladiosimulator.edp2.models.measuringpoint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.edp2.models.measuringpoint.ResourceURIMeasuringPoint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource URI Measuring Point</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.measuringpoint.impl.ResourceURIMeasuringPointImpl#getResourceURI
 * <em>Resource URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceURIMeasuringPointImpl extends StringMeasuringPointImpl implements ResourceURIMeasuringPoint {
    /**
     * The default value of the '{@link #getResourceURI() <em>Resource URI</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResourceURI()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResourceURI() <em>Resource URI</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResourceURI()
     * @generated
     * @ordered
     */
    protected String resourceURI = RESOURCE_URI_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ResourceURIMeasuringPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MeasuringpointPackage.Literals.RESOURCE_URI_MEASURING_POINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getResourceURI() {
        return this.resourceURI;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResourceURI(final String newResourceURI) {
        final String oldResourceURI = this.resourceURI;
        this.resourceURI = newResourceURI;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    MeasuringpointPackage.RESOURCE_URI_MEASURING_POINT__RESOURCE_URI, oldResourceURI, this.resourceURI));
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
        case MeasuringpointPackage.RESOURCE_URI_MEASURING_POINT__RESOURCE_URI:
            return this.getResourceURI();
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
        case MeasuringpointPackage.RESOURCE_URI_MEASURING_POINT__RESOURCE_URI:
            this.setResourceURI((String) newValue);
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
        case MeasuringpointPackage.RESOURCE_URI_MEASURING_POINT__RESOURCE_URI:
            this.setResourceURI(RESOURCE_URI_EDEFAULT);
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
        case MeasuringpointPackage.RESOURCE_URI_MEASURING_POINT__RESOURCE_URI:
            return RESOURCE_URI_EDEFAULT == null ? this.resourceURI != null : !RESOURCE_URI_EDEFAULT
                    .equals(this.resourceURI);
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
        result.append(" (resourceURI: ");
        result.append(this.resourceURI);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getResourceURIRepresentation() {
        return this.resourceURI;
    }
} // ResourceURIMeasuringPointImpl
