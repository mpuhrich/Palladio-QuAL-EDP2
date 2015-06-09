/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.util;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.edp2.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.dao.MetaDao;
import org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository;
import org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository;
import org.palladiosimulator.edp2.models.Repository.LocalSensorFrameworkRepository;
import org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository;
import org.palladiosimulator.edp2.models.Repository.Repositories;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.edp2.models.Repository.RepositoryPackage
 * @generated
 */
public class RepositorySwitch<T> extends Switch<T> {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static RepositoryPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public RepositorySwitch() {
        if (modelPackage == null) {
            modelPackage = RepositoryPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case RepositoryPackage.LOCAL_DIRECTORY_REPOSITORY: {
            final LocalDirectoryRepository localDirectoryRepository = (LocalDirectoryRepository) theEObject;
            T result = this.caseLocalDirectoryRepository(localDirectoryRepository);
            if (result == null) {
                result = this.caseRepository(localDirectoryRepository);
            }
            if (result == null) {
                result = this.caseIdentifier(localDirectoryRepository);
            }
            if (result == null) {
                result = this.caseMetaDao(localDirectoryRepository);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case RepositoryPackage.FILE: {
            final File file = (File) theEObject;
            T result = this.caseFile(file);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case RepositoryPackage.LOCAL_MEMORY_REPOSITORY: {
            final LocalMemoryRepository localMemoryRepository = (LocalMemoryRepository) theEObject;
            T result = this.caseLocalMemoryRepository(localMemoryRepository);
            if (result == null) {
                result = this.caseRepository(localMemoryRepository);
            }
            if (result == null) {
                result = this.caseIdentifier(localMemoryRepository);
            }
            if (result == null) {
                result = this.caseMetaDao(localMemoryRepository);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case RepositoryPackage.REMOTE_CDO_REPOSITORY: {
            final RemoteCdoRepository remoteCdoRepository = (RemoteCdoRepository) theEObject;
            T result = this.caseRemoteCdoRepository(remoteCdoRepository);
            if (result == null) {
                result = this.caseRepository(remoteCdoRepository);
            }
            if (result == null) {
                result = this.caseIdentifier(remoteCdoRepository);
            }
            if (result == null) {
                result = this.caseMetaDao(remoteCdoRepository);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case RepositoryPackage.LOCAL_SENSOR_FRAMEWORK_REPOSITORY: {
            final LocalSensorFrameworkRepository localSensorFrameworkRepository = (LocalSensorFrameworkRepository) theEObject;
            T result = this.caseLocalSensorFrameworkRepository(localSensorFrameworkRepository);
            if (result == null) {
                result = this.caseRepository(localSensorFrameworkRepository);
            }
            if (result == null) {
                result = this.caseIdentifier(localSensorFrameworkRepository);
            }
            if (result == null) {
                result = this.caseMetaDao(localSensorFrameworkRepository);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case RepositoryPackage.REPOSITORIES: {
            final Repositories repositories = (Repositories) theEObject;
            T result = this.caseRepositories(repositories);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case RepositoryPackage.IRESOURCE_SET: {
            final ResourceSet iResourceSet = (ResourceSet) theEObject;
            T result = this.caseIResourceSet(iResourceSet);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case RepositoryPackage.MEASUREMENTS_DAO_FACTORY: {
            final MeasurementsDaoFactory measurementsDaoFactory = (MeasurementsDaoFactory) theEObject;
            T result = this.caseMeasurementsDaoFactory(measurementsDaoFactory);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case RepositoryPackage.META_DAO: {
            final MetaDao metaDao = (MetaDao) theEObject;
            T result = this.caseMetaDao(metaDao);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case RepositoryPackage.REPOSITORY: {
            final Repository repository = (Repository) theEObject;
            T result = this.caseRepository(repository);
            if (result == null) {
                result = this.caseIdentifier(repository);
            }
            if (result == null) {
                result = this.caseMetaDao(repository);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Local Directory Repository</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Local Directory Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalDirectoryRepository(final LocalDirectoryRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFile(final File object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Local Memory Repository</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Local Memory Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalMemoryRepository(final LocalMemoryRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Remote Cdo Repository</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Remote Cdo Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemoteCdoRepository(final RemoteCdoRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Local Sensor Framework Repository</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Local Sensor Framework Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalSensorFrameworkRepository(final LocalSensorFrameworkRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repositories</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repositories</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepositories(final Repositories object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IResource Set</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IResource Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIResourceSet(final ResourceSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Measurements Dao Factory</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Measurements Dao Factory</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementsDaoFactory(final MeasurementsDaoFactory object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meta Dao</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meta Dao</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetaDao(final MetaDao object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Repository</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRepository(final Repository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // RepositorySwitch
