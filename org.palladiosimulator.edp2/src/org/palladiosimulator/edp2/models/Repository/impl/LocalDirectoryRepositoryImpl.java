/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.impl;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;
import org.palladiosimulator.edp2.dao.MetaDaoDelegate;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Local Directory Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.edp2.models.Repository.impl.LocalDirectoryRepositoryImpl#getUri
 * <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalDirectoryRepositoryImpl extends RepositoryImpl implements LocalDirectoryRepository {

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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    protected LocalDirectoryRepositoryImpl() {
        super();
        final MetaDaoDelegate delegate = this.getMetaDaoDelegate("org.palladiosimulator.edp2.dao.localfile.dao");
        delegate.setParent(this);

        this.metaDao = delegate;
    }

    private MetaDaoDelegate getMetaDaoDelegate(final String wantedId) {
        try {
            return ExtensionHelper.getExecutableExtension("org.palladiosimulator.edp2.dao", "class", "id", wantedId);
        } catch (final RuntimeException e) {
        }

        try {
            return (MetaDaoDelegate) Class.forName("org.palladiosimulator.edp2.dao.localfile.LocalDirectoryMetaDao")
                    .newInstance();
        } catch (final InstantiationException e) {
            throw new RuntimeException(e);
        } catch (final IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (final ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RepositoryPackage.Literals.LOCAL_DIRECTORY_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getUri() {
        return (String) this.eDynamicGet(RepositoryPackage.LOCAL_DIRECTORY_REPOSITORY__URI,
                RepositoryPackage.Literals.LOCAL_DIRECTORY_REPOSITORY__URI, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public void setUri(final String newUri) {
        final String oldUri = this.getUri();
        this.eDynamicSet(RepositoryPackage.LOCAL_DIRECTORY_REPOSITORY__URI,
                RepositoryPackage.Literals.LOCAL_DIRECTORY_REPOSITORY__URI, newUri);
        this.setId(newUri);
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    RepositoryPackage.LOCAL_DIRECTORY_REPOSITORY__URI, oldUri, this.getUri()));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @throws DataNotAccessibleException
     * @generated NOT
     */
    @Override
    public File convertUriStringToFile(final String uriString) throws DataNotAccessibleException {
        return this.convertUriStringToFileInternal(uriString);
    }

    /**
     * Converts a supplied URI to a file on the local file system, if possible.
     *
     * @param uri
     *            The URI to convert.
     * @return Local file.
     * @throws DataNotAccessibleException
     *             For conversion errors. Details are provided in the message.
     */
    private File convertUriStringToFileInternal(final String uriString) throws DataNotAccessibleException {
        final URI uri = URI.createURI(uriString);
        File directory;
        String fileLocation;
        if (uri.isPlatform()) {
            URL urlToFoo = null;
            try {
                urlToFoo = FileLocator.toFileURL(new URL(uri.toString()));
                fileLocation = urlToFoo.getFile();
            } catch (final MalformedURLException e) {
                throw new DataNotAccessibleException("The URI is not well-formed.", e);
            } catch (final IOException e) {
                throw new DataNotAccessibleException("The URI could not be converted.", e);
            }
        } else {
            fileLocation = uri.toFileString();
        }
        if (fileLocation == null) {
            // URI is valid but does not point to a file
            throw new DataNotAccessibleException("The URI could not be converted to a local file.", null);
        } else {
            directory = new File(fileLocation);
            if (!directory.isDirectory()) {
                // URI does not point to a directory.
                throw new DataNotAccessibleException("The URI does not point to a directory.", null);
            }
        }
        return directory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case RepositoryPackage.LOCAL_DIRECTORY_REPOSITORY__URI:
            return this.getUri();
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
        switch (featureID)
        {
        case RepositoryPackage.LOCAL_DIRECTORY_REPOSITORY__URI:
            this.setUri((String) newValue);
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
        switch (featureID)
        {
        case RepositoryPackage.LOCAL_DIRECTORY_REPOSITORY__URI:
            this.setUri(URI_EDEFAULT);
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
        switch (featureID)
        {
        case RepositoryPackage.LOCAL_DIRECTORY_REPOSITORY__URI:
            return URI_EDEFAULT == null ? this.getUri() != null : !URI_EDEFAULT.equals(this.getUri());
        }
        return super.eIsSet(featureID);
    }

} // LocalDirectoryRepositoryImpl
