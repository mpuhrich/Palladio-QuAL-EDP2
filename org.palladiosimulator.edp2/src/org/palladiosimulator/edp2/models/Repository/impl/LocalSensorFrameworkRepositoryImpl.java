/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.edp2.models.Repository.LocalSensorFrameworkRepository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Local Sensor Framework Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.edp2.models.Repository.impl.LocalSensorFrameworkRepositoryImpl#getUri
 * <em>Uri</em>}</li>
 * <li>
 * {@link org.palladiosimulator.edp2.models.Repository.impl.LocalSensorFrameworkRepositoryImpl#getImportSettings
 * <em>Import Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalSensorFrameworkRepositoryImpl extends RepositoryImpl implements LocalSensorFrameworkRepository {

    /**
     * The default value of the '{@link #getUri() <em>Uri</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getUri()
     * @generated
     * @ordered
     */
    protected static final String URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getUri()
     * @generated
     * @ordered
     */
    protected String uri = URI_EDEFAULT;

    /**
     * The default value of the '{@link #getImportSettings() <em>Import Settings</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getImportSettings()
     * @generated
     * @ordered
     */
    protected static final String IMPORT_SETTINGS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImportSettings() <em>Import Settings</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getImportSettings()
     * @generated
     * @ordered
     */
    protected String importSettings = IMPORT_SETTINGS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected LocalSensorFrameworkRepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RepositoryPackage.Literals.LOCAL_SENSOR_FRAMEWORK_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getUri() {
        return this.uri;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUri(final String newUri) {
        final String oldUri = this.uri;
        this.uri = newUri;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI, oldUri, this.uri));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getImportSettings() {
        return this.importSettings;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setImportSettings(final String newImportSettings) {
        final String oldImportSettings = this.importSettings;
        this.importSettings = newImportSettings;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS, oldImportSettings,
                    this.importSettings));
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
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI:
            return this.getUri();
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS:
            return this.getImportSettings();
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
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI:
            this.setUri((String) newValue);
            return;
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS:
            this.setImportSettings((String) newValue);
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
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI:
            this.setUri(URI_EDEFAULT);
            return;
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS:
            this.setImportSettings(IMPORT_SETTINGS_EDEFAULT);
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
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI:
            return URI_EDEFAULT == null ? this.uri != null : !URI_EDEFAULT.equals(this.uri);
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS:
            return IMPORT_SETTINGS_EDEFAULT == null ? this.importSettings != null : !IMPORT_SETTINGS_EDEFAULT
                    .equals(this.importSettings);
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
        result.append(" (uri: ");
        result.append(this.uri);
        result.append(", importSettings: ");
        result.append(this.importSettings);
        result.append(')');
        return result.toString();
    }

} // LocalSensorFrameworkRepositoryImpl
