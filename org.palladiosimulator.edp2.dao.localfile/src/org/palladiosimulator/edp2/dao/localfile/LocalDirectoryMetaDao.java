/**
 *
 */
package org.palladiosimulator.edp2.dao.localfile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.edp2.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.dao.MetaDao;
import org.palladiosimulator.edp2.dao.MetaDaoDelegate;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.dao.impl.MetaDaoImpl;
import org.palladiosimulator.edp2.impl.resource.EmfModelXMIResourceFactoryImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;
import org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.metricspec.Description;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * DAO to access the meta data stored in a local directory.
 * Warning: It is not allowed to reassign a managed repository to another instance of Repositories.
 *
 * @author groenda, Sebastian Lehrig
 */
public class LocalDirectoryMetaDao extends MetaDaoImpl implements MetaDaoDelegate {

    /** Logger for this class. */
    private static final Logger LOGGER = Logger.getLogger(LocalDirectoryMetaDao.class.getCanonicalName());

    /** The measurement DAO factory connected to this meta data DAO.*/
    MeasurementsDaoFactory mmtDaoFactory = null;

    /** Repository in which the managed data is stored. */
    private LocalDirectoryRepository managedRepo;

    private final Adapter reposAdapter = new AdapterImpl() {
        @Override
        public void notifyChanged(final Notification msg) {
            if (msg.getFeature().equals(RepositoryPackage.Literals.REPOSITORY__REPOSITORIES)) {
                if (msg.getEventType() == Notification.SET) {
                    if (msg.getOldValue() != null) {
                        if (isOpen()) {
                            final String errMsg = "Repository was reassigned to another instance "
                                    + "of Repositories while it was still open. Data might be corrupted!";
                            LOGGER.log(Level.SEVERE, errMsg);
                            throw new IllegalStateException(errMsg);
                        }
                    }
                }
            }
        }
    };

    @Override
    public void setParent(final MetaDao repo) {
        this.managedRepo = (LocalDirectoryRepository) repo;
        // observe changes on the assignment of the repository
        managedRepo.eAdapters().add(reposAdapter);
        // observe changes on the ExperimentGroup list
        final Adapter descAdapter = new LocalDirectoryMetaResourceAdapter(managedRepo,
                RepositoryPackage.Literals.REPOSITORY__DESCRIPTIONS,
                EmfModelXMIResourceFactoryImpl.EDP2_DESCRIPTIONS_EXTENSION);
        managedRepo.eAdapters().add(descAdapter);
        // observe changes on the Descriptions list
        final Adapter expGroupAdapter = new LocalDirectoryMetaResourceAdapter(managedRepo,
                RepositoryPackage.Literals.REPOSITORY__EXPERIMENT_GROUPS,
                EmfModelXMIResourceFactoryImpl.EDP2_EXPERIMENT_GROUP_EXTENSION);
        managedRepo.eAdapters().add(expGroupAdapter);
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.IMetaDao#getMeasurementsDaoFactory()
     */
    @Override
    public MeasurementsDaoFactory getMeasurementsDaoFactory() {
        return mmtDaoFactory;
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.IEdp2Dao#canOpen()
     */
    @Override
    public boolean canOpen() {
        if (!super.canOpen()) {
            return false;
        }
        try {
            if (managedRepo.getRepositories() == null) {
                return false;
            }
            File directory = null;
            try {
                directory = managedRepo.convertUriStringToFile(managedRepo.getUri());
            } catch (final DataNotAccessibleException e) {
                return false;
            }
            if (!checkFilesContainEmfModel(directory, EmfModelXMIResourceFactoryImpl.EDP2_DESCRIPTIONS_EXTENSION, Description.class)) {
                // At least one of the description files is not valid
                return false;
            }
            if (!checkFilesContainEmfModel(directory, EmfModelXMIResourceFactoryImpl.EDP2_EXPERIMENT_GROUP_EXTENSION, ExperimentGroup.class)) {
                // At least one of the experiment group files is not valid
                return false;
            }
        } catch (final IllegalArgumentException e) {
            // URI is not valid
            return false;
        }
        return true;
    }

    /**Checks if all files with the given extension contain a EMF model with the given expected root.
     * @param directory Directory to check.
     * @param fileExtension Extension of files to check.
     * @param expectedRoot Expected EMF root element of each file.
     * @return <code>true</code> if the condition holds for all files, <code>false</code> otherwise.
     */
    private boolean checkFilesContainEmfModel(final File directory,
            final String fileExtension, final Class<?> expectedRoot) {
        assert (directory.isDirectory());

        ResourceSet resourceSet = EmfModelXMIResourceFactoryImpl.createResourceSet();
        Resource resource;
        final File[] files = directory.listFiles(new FilenameExtensionFiler(fileExtension));
        for (final File file : files) {
            if (!file.isFile()) {
                // File is not a simple file
                return false;
            }
            resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
            if (resource == null) {
                // Error accessing the resource
                return false;
            }
            try {
                resource.load(null);
                if (resource.getWarnings().size() != 0 || resource.getErrors().size() != 0) {
                    // There were warnings or errors while loading the file
                    return false;
                }
                if (resource.getContents().size() != 1 || !expectedRoot.isInstance(resource.getContents().get(0))) {
                    // There is more than one root or the root is not of the expected type
                    return false;
                }
            } catch (final IOException e) {
                LOGGER.log(Level.WARNING, "File " + directory.getAbsolutePath()
                        + "did not contain a valid EMF model. Reason: "
                        + e.getMessage());
                resourceSet = null;
                return false;
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.IEdp2Dao#close()
     */
    @Override
    public void close() throws DataNotAccessibleException {
        super.close();
        // close directory
        try {
            persistMetaData(false);
            closeRepository();
        } catch (final IllegalArgumentException e) {
            final String msg = "URI is not valid.";
            LOGGER.log(Level.WARNING, msg);
            throw new DataNotAccessibleException(msg, e);
        }
        assert !isOpen();
    }

    /**
     *
     */
    private void closeRepository() {
        if(mmtDaoFactory.isActive()) {
            mmtDaoFactory.setActive(false);
        }
        // Warning: Cannot clear lists as this would affect data on background storage
        // TODO: FIXME
        managedRepo.getDescriptions().clear();
        managedRepo.resetExperimentGroups();
        setClosed();
    }

    /**
     * @throws DataNotAccessibleException
     */
    private void persistMetaData(final boolean flushOnly) throws DataNotAccessibleException {
        final URI uri = URI.createURI(managedRepo.getUri());

        File directory = null;
        if(uri.isFile()) {
            directory = new File(uri.toFileString());

            if (!directory.isDirectory()) {
                final String msg = "URI does not point to a directory.";
                LOGGER.log(Level.WARNING, msg);
                throw new DataNotAccessibleException(msg, null);
            }

            // load descriptions
            saveDescriptions(directory, flushOnly);
            // load experiment groups
            saveExperimentGroups(directory, flushOnly);
        }
        else if(uri.isPlatformResource()) {
            LOGGER.log(Level.WARNING, "Platform resource deletion currently only partly supported!");
            //throw new UnsupportedOperationException("Platform resource deletion currently only partly supported!");
        }
        else {
            LOGGER.log(Level.WARNING, "Unsupported URI format.");
            //throw new UnsupportedOperationException("Unsupported URI format.");
        }
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.IEdp2Dao#delete()
     */
    @Override
    public void delete() throws DataNotAccessibleException {
        super.delete();
        if (true)
        {
            throw new UnsupportedOperationException("Not implemented yet");
            //		assert (isOpen());
            //		if (!isDeleted()) {
            //			// open directory
            //			URI uri;
            //			try {
            //				uri = URI.createURI(managedRepo.getUri());
            //				File directory = new File(uri.toFileString());
            //				if (!directory.isDirectory()) {
            //					String msg = "URI does not point to a directory.";
            //					LOGGER.log(Level.WARNING, msg);
            //					throw new DataNotAccessibleException(msg, null);
            //				}
            //				// load experiment groups
            //				loadExperimentGroups(directory);
            //				/* Find all cross references.
            //				 * Delete all cross references which are in the directory of the MetaDao.
            //				 */
            //				Map<EObject, Collection<Setting>> references = EcoreUtil.CrossReferencer.find(managedRepo.getExperimentGroups());
            //
            ////				DataSeries[] referencedDataSeries = null;
            ////				// TODO Auto-generated method stub
            ////				// Remove all DataSeries files
            ////				for (DataSeries dataSeries : referencedDataSeries) {
            ////					String dsFileLocation = directory.getAbsoluteFile()
            ////							+ File.separator
            ////							+ dataSeries.getValuesUuid()
            ////							+ EmfModelXMIResourceFactoryImpl.EDP2_DESCRIPTIONS_EXTENSION;
            ////					File dsFile = new File (dsFileLocation);
            ////					boolean success = dsFile.delete();
            ////					if (!success) {
            ////						LOGGER.log(Level.WARNING, "Failed to delete DataSeries file. Filename: " + dsFileLocation);
            ////					}
            ////				}
            //				// Remove all ExperimentGroup files
            //				deleteExperimentGroups(directory);
            //				if (!directory.delete()) {
            //					LOGGER.log(Level.WARNING, "Failed to delete EDP2 directory. Might be not empty. Directory: " + directory.getAbsolutePath());
            //				}
            //				mmtDaoFactory = null;
            //				setDeleted(true);
            //			} catch (IllegalArgumentException e) {
            //				String msg = "URI is not valid.";
            //				LOGGER.log(Level.WARNING, msg);
            //				throw new DataNotAccessibleException(msg, e);
            //			}
            //		}
            //		assert (isDeleted());
        }
    }

    //	/**Deletes all ExperimentGroup files in a directory.
    //	 * @param directory The EDP2 data directory.
    //	 */
    //	private void deleteExperimentGroups(File directory) {
    //		// ExperimentGroup files
    //		File[] expGroupFiles = directory
    //				.listFiles(new FilenameExtensionFiler(
    //						EmfModelXMIResourceFactoryImpl.EDP2_EXPERIMENT_GROUP_EXTENSION));
    //		for (File expGroupFile : expGroupFiles) {
    //			boolean success = expGroupFile.delete();
    //			if (!success) {
    //				LOGGER.log(Level.WARNING,
    //						"Failed to delete ExperimentGroup file. Filename: "
    //								+ expGroupFile.getAbsolutePath());
    //			}
    //		}
    //	}

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.IEdp2Dao#open()
     */
    @Override
    public void open() throws DataNotAccessibleException {
        super.open();
        // open directory
        try {
            final File directory = managedRepo.convertUriStringToFile(managedRepo.getUri());
            if (managedRepo.getRepositories() == null) {
                final String msg = "Every repository must be attached to an instance of Repositories in order to be opened.";
                LOGGER.log(Level.SEVERE, msg);
                throw new DataNotAccessibleException(msg, null);
            }
            // load descriptions
            loadDescriptions(directory);
            // load experiment groups
            loadExperimentGroups(directory);
            mmtDaoFactory = LocalDirectoryMeasurementsDaoFactory.getRegisteredFactory(directory);
            if (mmtDaoFactory == null) { // DaoFactory not previously initialized
                mmtDaoFactory = new LocalDirectoryMeasurementsDaoFactory(directory);
            } else {
                if (!mmtDaoFactory.isActive()) {
                    mmtDaoFactory.setActive(true);
                }
            }
            setOpen();
        } catch (final IllegalArgumentException e) {
            final String msg = "URI is not valid.";
            LOGGER.log(Level.WARNING, msg);
            throw new DataNotAccessibleException(msg, e);
        }
        assert (isOpen());
    }

    /**Loads all descriptions from the description files within the specified directory.
     * @param directory The EDP2 data directory
     */
    private void loadDescriptions(final File directory) {
        final File[] descriptionFiles = directory.listFiles(new FilenameExtensionFiler(EmfModelXMIResourceFactoryImpl.EDP2_DESCRIPTIONS_EXTENSION));
        for (final File descriptionFile : descriptionFiles) {
            if (!descriptionFile.isFile()) {
                final String msg = "Could not load the description file " + descriptionFile.getName();
                LOGGER.log(Level.WARNING, msg);
            }
            loadDescription(descriptionFile);
        }
    }

    /**Saves all descriptions to description files within the specified directory.
     * @param directory The EDP2 data directory.
     * @param flushOnly
     */
    private void saveDescriptions(final File directory, final boolean flushOnly) {
        for (final Description desc : managedRepo.getDescriptions()) {
            saveDescription(directory, desc, flushOnly);
        }
    }

    /**Saves a description in the provided directory.
     * @param directory The EDP2 data directory.
     * @param desc The description to save.
     * @param flushOnly
     */
    private void saveDescription(final File directory, final Description desc, final boolean flushOnly) {
        final String descFileLocation = directory.getAbsoluteFile() + File.separator
                + desc.getId() + "."
                + EmfModelXMIResourceFactoryImpl.EDP2_DESCRIPTIONS_EXTENSION;
        final Resource resource = getResourceForURI(URI.createFileURI(descFileLocation));
        if (resource == null) {
            final String msg = "Could not create resource to save the description file " + descFileLocation;
            LOGGER.log(Level.WARNING, msg);
        } else {
            if (desc.eResource() == null) {
                resource.getContents().add(desc);
            } else if (!desc.eResource().equals(resource)) {
                LOGGER.log(Level.SEVERE, "Description was assigned to resource " + desc.eResource() + "but should be assigned to " + resource);
            }
            try {
                resource.save(null);
                if (!flushOnly) {
                    resource.unload();
                }
                // TODO: Test
                //resource.getResourceSet().getResources().remove(resource);
            } catch (final IOException e) {
                final String msg = "Could not save the description file " + descFileLocation;
                LOGGER.log(Level.WARNING, msg, e);
            }
        }
    }

    /**Saves all experiment groups to files within the specified directory.
     * @param directory The EDP2 data directory.
     * @param flushOnly
     */
    private void saveExperimentGroups(final File directory, final boolean flushOnly) {
        for (final ExperimentGroup eg : managedRepo.getExperimentGroups()) {
            saveExperimentGroup(directory, eg, flushOnly);
        }
    }

    /**Returns a resource for the given URI.
     * @param uri Location for which a resource is requested.
     * @return created resource.
     */
    private Resource getResourceForURI(final URI uri) {
        return managedRepo.getRepositories().getCommonResourceSet().getResource(uri, true);
    }

    /**Saves an experiment group in the provided directory.
     * @param directory The EDP2 data directory.
     * @param expGroup The experiment group to save.
     * @param flushOnly
     */
    private void saveExperimentGroup(final File directory, final ExperimentGroup expGroup, final boolean flushOnly) {
        final String egFileLocation = directory.getAbsoluteFile() + File.separator
                + expGroup.getId() + "."
                + EmfModelXMIResourceFactoryImpl.EDP2_EXPERIMENT_GROUP_EXTENSION;
        final Resource resource = getResourceForURI(URI.createFileURI(egFileLocation));
        if (resource == null) {
            final String msg = "Could not create resource to save the experiment group file " + egFileLocation;
            LOGGER.log(Level.SEVERE, msg);
            throw new RuntimeException("Unable to persist experiment group: "+expGroup);
        } else {
            if (expGroup.eResource() == null) {
                if (resource.getContents().size() > 0) {
                    throw new IllegalStateException("Persisting experiment group which should have been persisted before: "+expGroup);
                }
                resource.getContents().add(expGroup);
            } else if (!expGroup.eResource().equals(resource)) {
                LOGGER.log(Level.SEVERE, "ExperimentGroup was assigned to resource " + expGroup.eResource() + "but should be assigned to " + resource);
                throw new IllegalStateException("Resource for experiment group is not the one it should be");
            }
            try {
                resource.save(null);
                if (!flushOnly) {
                    resource.unload();
                }
            } catch (final IOException e) {
                final String msg = "Could not save the experiment group file " + egFileLocation;
                LOGGER.log(Level.WARNING, msg, e);
            }
        }
    }

    /**Loads the description stored in a description file.
     * @param descriptionFile The description file containing the EMF model of the description.
     */
    private void loadDescription(final File descriptionFile) {
        assert (managedRepo.getRepositories() != null);
        final Resource resource = getResourceForURI(URI.createFileURI(descriptionFile.getAbsolutePath()));
        String errorMessage = null;
        try {
            resource.load(null);
            logDiagnostic(resource.getErrors(), Level.SEVERE);
            logDiagnostic(resource.getWarnings(), Level.WARNING);
            if (resource != null) {
                if (resource.getContents().size() == 1
                        && resource.getWarnings().size() == 0
                        && resource.getErrors().size() == 0
                        && resource.getContents().get(0) instanceof Description)
                {
                    managedRepo.getDescriptions().add((Description) resource.getContents().get(0));
                } else {
                    errorMessage = "There was more or less than one root element or there were errors parsing the file.";
                }
            }
        } catch (final IOException e) {
            errorMessage = "Could not load EMF model. Reason: " + e.getMessage();
        }
        if (errorMessage != null) {
            LOGGER.log(Level.WARNING, errorMessage + " Filename: " + descriptionFile.getAbsolutePath() + ".");
        }
    }

    /**Log diagnostic messages for EMF resources.
     * @param diagnostics Messages to log.
     * @param level Level with which the messages should be logged.
     */
    private void logDiagnostic(final EList<Diagnostic> diagnostics, final Level level) {
        if (diagnostics.size() != 0) {
            for (final Diagnostic diag : diagnostics) {
                LOGGER.log(level, "EMF Diagnostic message: " + diag.toString());
            }
        }
    }

    /**Loads all experiment groups from the description files within the specified directory.
     * @param directory The EDP2 data directory
     */
    private void loadExperimentGroups(final File directory) {
        final File[] expGroupFiles = directory.listFiles(new FilenameExtensionFiler(EmfModelXMIResourceFactoryImpl.EDP2_EXPERIMENT_GROUP_EXTENSION));
        for (final File expGroupFile : expGroupFiles) {
            if (!expGroupFile.isFile()) {
                final String msg = "Could not load the experiment group file " + expGroupFile.getName();
                LOGGER.log(Level.WARNING, msg);
            }
            loadExperimentGroup(expGroupFile);
        }
    }

    /**Loads the experiment group stored in a description file.
     * @param expGroupFile The experiment group file containing the EMF model of the description.
     */
    private void loadExperimentGroup(final File expGroupFile) {
        final Resource resource = getResourceForURI(
                URI.createFileURI(expGroupFile.getAbsolutePath()));
        String errorMessage = null;
        try {
            resource.load(null);
            logDiagnostic(resource.getErrors(), Level.SEVERE);
            logDiagnostic(resource.getWarnings(), Level.WARNING);
            if (resource != null) {
                if (resource.getContents().size() == 1
                        && resource.getWarnings().size() == 0
                        && resource.getErrors().size() == 0) {
                    if (new ExperimentDataSwitch<Boolean>() {
                        @Override
                        public Boolean caseExperimentGroup(final ExperimentGroup object) {
                            return true;
                        }
                        @Override
                        public Boolean defaultCase(final EObject object) {
                            return false;
                        }
                    }.doSwitch(resource.getContents().get(0)) == true) {
                        managedRepo.getExperimentGroups().add((ExperimentGroup) resource.getContents().get(0));
                    } else {
                        errorMessage = "Root model element was not of type ExperimentGroup.";
                    }
                } else {
                    errorMessage = "There was more or less than one root element or there were errors parsing the file.";
                }
            }
        } catch (final IOException e) {
            errorMessage = "Could not load EMF model.";
        }
        if (errorMessage != null) {
            LOGGER.log(Level.WARNING, errorMessage + " Filename: " + expGroupFile.getAbsolutePath() + ".");
        }
    }

    /**EMF Adapter class to generate file-based resources within a local directory for
     * a given structural feature containing a list of Identifiable elements.
     * @author groenda
     *
     */
    private final class LocalDirectoryMetaResourceAdapter extends AdapterImpl {
        /** Local directory repository which contains the feature. */
        private final LocalDirectoryRepository repo;
        /** Structural feature which is observed. */
        private final EStructuralFeature feature;
        /** File extension to use for generating the resources. */
        private final String fileExtension;

        private LocalDirectoryMetaResourceAdapter(
                final LocalDirectoryRepository repo, final EStructuralFeature feature,
                final String fileExtension) {
            this.repo = repo;
            this.feature = feature;
            this.fileExtension = fileExtension;
        }

        @SuppressWarnings("unchecked")
        @Override
        public void notifyChanged(final Notification msg) {
            if (msg.getFeature().equals(feature)) {
                if (msg.getEventType() == Notification.ADD) {
                    final Identifier id = (Identifier) msg.getNewValue();
                    assignResource(id);
                }
                if (msg.getEventType() == Notification.ADD_MANY) {
                    for (final Identifier id : (Collection<Identifier>) msg
                            .getNewValue()) {
                        assignResource(id);
                    }
                }
                if (msg.getEventType() == Notification.REMOVE) {
                    final Identifier id = (Identifier) msg.getOldValue();
                    removeResource(id);
                }
                if (msg.getEventType() == Notification.REMOVE_MANY) {
                    for (final Identifier id : (Collection<Identifier>) msg
                            .getOldValue()) {
                        removeResource(id);
                    }
                }
            }
        }

        /**Assigns a resource to the identifiable (if is does not have a resource yet).
         * @param id Identifiable.
         */
        private void assignResource(final Identifier id) {
            if (id.eResource() == null) {
                final URI uri = URI
                        .createURI(repo.getUri())
                        .appendSegment(id.getId())
                        .appendFileExtension(fileExtension);
                final Resource resource = repo.getRepositories()
                        .getCommonResourceSet().createResource(uri);
                resource.getContents().add(id);
                assert id.eResource() != null;
            }
        }

        /**Removes a resource from an identifiable (if it has a resource).
         * @param id Identifiable.
         */
        private void removeResource(final Identifier id) {
            if (id.eResource() != null) {
                try {
                    id.eResource().delete(null);
                } catch (final IOException e) {
                    LOGGER.log(Level.WARNING, "Could not delete file for a removed element. " + e.getMessage());
                }
            }
        }
    }

    /**Filename filter which accepts all files with a given extension.
     * @author groenda
     */
    class FilenameExtensionFiler implements FilenameFilter {
        /** Valid extension of the files. */
        private final String extension;

        /**Initializes the filter and sets the accepted extension.
         * @param extension Accepted extension.
         */
        public FilenameExtensionFiler(final String extension) {
            this.extension = extension;
        }

        @Override
        public boolean accept(final File arg0, final String arg1) {
            return arg1.endsWith(extension);
        }
    }

    @Override
    public void flush() {
        try {
            persistMetaData(true);
        } catch (final DataNotAccessibleException e) {
            LOGGER.log(Level.SEVERE, "Flush failed.", e);
            throw new RuntimeException(e);
        }
    }
}
