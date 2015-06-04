/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.ExperimentData.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>EStringto EObject Map Entry</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.EStringtoEObjectMapEntryImpl#getTypedKey
 * <em>Key</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.ExperimentData.impl.EStringtoEObjectMapEntryImpl#getTypedValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EStringtoEObjectMapEntryImpl extends EObjectImpl implements BasicEMap.Entry<String, Object> {

    /**
     * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getTypedKey()
     * @generated
     * @ordered
     */
    protected static final String KEY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getTypedKey()
     * @generated
     * @ordered
     */
    protected String key = KEY_EDEFAULT;

    /**
     * The default value of the '{@link #getTypedValue() <em>Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTypedValue()
     * @generated
     * @ordered
     */
    protected static final Object VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTypedValue() <em>Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTypedValue()
     * @generated
     * @ordered
     */
    protected Object value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EStringtoEObjectMapEntryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentDataPackage.Literals.ESTRINGTO_EOBJECT_MAP_ENTRY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getTypedKey() {
        return this.key;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTypedKey(final String newKey) {
        final String oldKey = this.key;
        this.key = newKey;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__KEY, oldKey, this.key));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Object getTypedValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTypedValue(final Object newValue) {
        final Object oldValue = this.value;
        this.value = newValue;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE, oldValue, this.value));
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
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__KEY:
            return this.getTypedKey();
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE:
            return this.getTypedValue();
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
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__KEY:
            this.setTypedKey((String) newValue);
            return;
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE:
            this.setTypedValue(newValue);
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
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__KEY:
            this.setTypedKey(KEY_EDEFAULT);
            return;
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE:
            this.setTypedValue(VALUE_EDEFAULT);
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
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__KEY:
            return KEY_EDEFAULT == null ? this.key != null : !KEY_EDEFAULT.equals(this.key);
        case ExperimentDataPackage.ESTRINGTO_EOBJECT_MAP_ENTRY__VALUE:
            return VALUE_EDEFAULT == null ? this.value != null : !VALUE_EDEFAULT.equals(this.value);
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
        result.append(" (key: ");
        result.append(this.key);
        result.append(", value: ");
        result.append(this.value);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected int hash = -1;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getHash() {
        if (this.hash == -1) {
            final Object theKey = this.getKey();
            this.hash = (theKey == null ? 0 : theKey.hashCode());
        }
        return this.hash;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setHash(final int hash) {
        this.hash = hash;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getKey() {
        return this.getTypedKey();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setKey(final String key) {
        this.setTypedKey(key);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getValue() {
        return this.getTypedValue();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object setValue(final Object value) {
        final Object oldValue = this.getValue();
        this.setTypedValue(value);
        return oldValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EMap<String, Object> getEMap() {
        final EObject container = this.eContainer();
        return container == null ? null : (EMap<String, Object>) container.eGet(this.eContainmentFeature());
    }

} // EStringtoEObjectMapEntryImpl
