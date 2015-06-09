/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.impl;

import org.eclipse.emf.ecore.EClass;
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
     * The default value of the '{@link #getImportSettings() <em>Import Settings</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getImportSettings()
     * @generated
     * @ordered
     */
    protected static final String IMPORT_SETTINGS_EDEFAULT = null;

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
        return (String) this.eDynamicGet(RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI,
                RepositoryPackage.Literals.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setUri(final String newUri) {
        this.eDynamicSet(RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI,
                RepositoryPackage.Literals.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__URI, newUri);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getImportSettings() {
        return (String) this.eDynamicGet(RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS,
                RepositoryPackage.Literals.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setImportSettings(final String newImportSettings) {
        this.eDynamicSet(RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS,
                RepositoryPackage.Literals.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS, newImportSettings);
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
            return URI_EDEFAULT == null ? this.getUri() != null : !URI_EDEFAULT.equals(this.getUri());
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY__IMPORT_SETTINGS:
            return IMPORT_SETTINGS_EDEFAULT == null ? this.getImportSettings() != null : !IMPORT_SETTINGS_EDEFAULT
            .equals(this.getImportSettings());
        }
        return super.eIsSet(featureID);
    }

} // LocalSensorFrameworkRepositoryImpl
