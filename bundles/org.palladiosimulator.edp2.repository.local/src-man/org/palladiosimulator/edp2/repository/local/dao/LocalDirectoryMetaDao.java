/**
 *
 */
package org.palladiosimulator.edp2.repository.local.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.palladiosimulator.edp2.EDP2Constants;
import org.palladiosimulator.edp2.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.dao.MetaDao;
import org.palladiosimulator.edp2.dao.MetaDaoDelegate;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.dao.impl.MetaDaoImpl;
import org.palladiosimulator.edp2.local.LocalDirectoryRepository;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.repository.local.LocalDirectoryRepositoryHelper;
import org.palladiosimulator.metricspec.Description;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.util.MetricSpecSwitch;

/**
 * DAO to access the meta data stored in a local directory. Warning: It is not allowed to reassign a
 * managed repository to another instance of Repositories.
 *
 * @author groenda, Sebastian Lehrig
 */
public class LocalDirectoryMetaDao extends MetaDaoImpl implements MetaDaoDelegate {

    /** Logger for this class. */
    private static final Logger LOGGER = Logger.getLogger(LocalDirectoryMetaDao.class.getName());

    /** The measurement DAO factory connected to this meta data DAO. */
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
        this.managedRepo.eAdapters().add(this.reposAdapter);
        // observe changes on the ExperimentGroup list
        final Adapter descAdapter = new LocalDirectoryMetaResourceAdapter(this.managedRepo,
                RepositoryPackage.Literals.REPOSITORY__DESCRIPTIONS,
                EDP2Constants.EDP2_DESCRIPTIONS_EXTENSION);
        this.managedRepo.eAdapters().add(descAdapter);
        // observe changes on the Descriptions list
        final Adapter expGroupAdapter = new LocalDirectoryMetaResourceAdapter(this.managedRepo,
                RepositoryPackage.Literals.REPOSITORY__EXPERIMENT_GROUPS,
                EDP2Constants.EDP2_EXPERIMENT_GROUP_EXTENSION);
        this.managedRepo.eAdapters().add(expGroupAdapter);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.palladiosimulator.edp2.IMetaDao#getMeasurementsDaoFactory()
     */
    @Override
    public MeasurementsDaoFactory getMeasurementsDaoFactory() {
        return this.mmtDaoFactory;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.palladiosimulator.edp2.IEdp2Dao#canOpen()
     */
    @Override
    public boolean canOpen(DiagnosticChain diagnosticChain) {
        boolean result = super.canOpen(diagnosticChain);
        
        result = result && this.managedRepo.getRepositories() != null;
        
        var diag = Diagnostician.INSTANCE.validate(this.managedRepo);
        diagnosticChain.add(diag);
        result = result && diag.getSeverity() == org.eclipse.emf.common.util.Diagnostic.OK;
    
        Path directory;
        try {
            directory = LocalDirectoryRepositoryHelper.convertToDirectory(this.managedRepo.getUri()).toPath();
        } catch ( DataNotAccessibleException e) {
            diagnosticChain.add(BasicDiagnostic.toDiagnostic(e));
            return false;
        }
        result = result && checkFilesContainEmfModel(directory, EDP2Constants.EDP2_DESCRIPTIONS_EXTENSION,
                Description.class, diagnosticChain);
        result = result && checkFilesContainEmfModel(directory, EDP2Constants.EDP2_EXPERIMENT_GROUP_EXTENSION,
                ExperimentGroup.class, diagnosticChain);

        return result;
    }

    /**
     * Checks if all files with the given extension contain a EMF model with the given expected
     * root.
     *
     * @param directory
     *            Directory to check.
     * @param fileExtension
     *            Extension of files to check.
     * @param expectedRoot
     *            Expected EMF root element of each file.
     * @return <code>true</code> if the condition holds for all files, <code>false</code> otherwise.
     */
    private boolean checkFilesContainEmfModel(final Path directory, final String fileExtension,
            final Class<?> expectedRoot, DiagnosticChain diagnostics) {
        assert (Files.isDirectory(directory));

        ResourceSet resourceSet = new ResourceSetImpl();
        var result = true;
        try {
            for (var path : Files.newDirectoryStream(directory, "*." + fileExtension)) {
                var singleResult = Files.isRegularFile(path);
                
                if (singleResult) {
                    var resource = resourceSet.createResource(URI.createURI(path.toUri().toString()));
                    if (resource == null) {
                        diagnostics.add(new BasicDiagnostic(path.toString(), Diagnostic.WARNING, "Could not open resource", null));
                        singleResult = false;
                    }
                    try {
                        resource.load(null);
                        if (resource.getErrors().size() != 0) {
                            // There were errors while loading the file
                            singleResult = false;
                        }
                        if (resource.getContents().size() != 1 || !expectedRoot.isInstance(resource.getContents().get(0))) {
                            diagnostics.add(new BasicDiagnostic(path.toString(), Diagnostic.WARNING, "The resource did not contain the expected element of type " + expectedRoot.getName(), null));
                            // There is more than one root or the root is not of the expected type
                            singleResult = false;
                        }
                    } catch (final IOException e) {
                        var diag = new BasicDiagnostic(path.toString(), Diagnostic.WARNING, "Exception during loading of resource.", null);
                        diag.add(BasicDiagnostic.toDiagnostic(e));
                        diagnostics.add(diag);
                        singleResult = false;
                    } finally {
                        if (resource != null) {
                            logDiagnostic(resource.getErrors(), diagnostics, org.eclipse.emf.common.util.Diagnostic.ERROR);
                            logDiagnostic(resource.getWarnings(), diagnostics, org.eclipse.emf.common.util.Diagnostic.WARNING);
                        }
                    }
                }
                result &= singleResult;
            }
        } catch (final IOException e) {
            var diag = new BasicDiagnostic(directory.toString(), Diagnostic.ERROR, "Problem parsing directory.", null);
            diag.add(BasicDiagnostic.toDiagnostic(e));
            diagnostics.add(diag);
            return false;
        }
        return result;
    }

    /*
     * (non-Javadoc)
     *
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
        if (this.mmtDaoFactory.isActive()) {
            this.mmtDaoFactory.setActive(false);
        }
        // Warning: Cannot clear lists as this would affect data on background storage
        // TODO: FIXME
        this.managedRepo.getDescriptions().clear();
        this.managedRepo.resetExperimentGroups();
        setClosed();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.palladiosimulator.edp2.IEdp2Dao#open()
     */
    @Override
    public void open(DiagnosticChain diagnosticChain) {
        super.open(diagnosticChain);
        // open directory

        if (this.managedRepo.getRepositories() == null) {
            final String msg = "Every repository must be attached to an instance of Repositories in order to be opened.";
            LOGGER.log(Level.SEVERE, msg);
            diagnosticChain.add(new BasicDiagnostic(this.managedRepo.toString(), org.eclipse.emf.common.util.Diagnostic.ERROR, msg, null));
            return;
        }

        // load descriptions
        loadDataModels(MetricSpecPackage.Literals.DESCRIPTION, RepositoryPackage.Literals.REPOSITORY__DESCRIPTIONS, EDP2Constants.EDP2_DESCRIPTIONS_EXTENSION,
                diagnosticChain);
        // load experiment groups
        loadDataModels(ExperimentDataPackage.Literals.EXPERIMENT_GROUP, RepositoryPackage.Literals.REPOSITORY__EXPERIMENT_GROUPS, EDP2Constants.EDP2_EXPERIMENT_GROUP_EXTENSION,
                diagnosticChain);

        final URI repositoryURI = this.managedRepo.getUri();
        this.mmtDaoFactory = LocalDirectoryMeasurementsDaoFactory.getRegisteredFactory(repositoryURI);
        if (this.mmtDaoFactory == null) { // DaoFactory not previously initialized
            this.mmtDaoFactory = new LocalDirectoryMeasurementsDaoFactory(repositoryURI);
        } else {
            if (!this.mmtDaoFactory.isActive()) {
                this.mmtDaoFactory.setActive(true);
            }
        }
        setOpen();
    }

    /**
     * Loads all descriptions from the description files within the specified directory.
     *
     * @param directory
     *            The EDP2 data directory
     * @throws DataNotAccessibleException
     * @throws IOException 
     */
    private void loadDataModels(EClass entityBaseType, EReference reference, String fileExtension, DiagnosticChain diagnosticChain) {
        try {
            Path dirPath = LocalDirectoryRepositoryHelper.convertToDirectory(this.managedRepo.getUri()).toPath();
            for (var filePath : Files.newDirectoryStream(dirPath, "*." + fileExtension)) {
                var relativePath = dirPath.relativize(filePath);
                var repoUri = this.managedRepo.getUri();
                if (!repoUri.hasTrailingPathSeparator()) {
                    repoUri = repoUri.appendSegment("");
                }
                var modelUri = URI.createURI(relativePath.toString()).resolve(repoUri);
                loadDataModel(entityBaseType, reference, modelUri, diagnosticChain);
            }
        } catch (DataNotAccessibleException | IOException e) {
            diagnosticChain.add(BasicDiagnostic.toDiagnostic(e));
        }
    }
    
    /**
     * Loads the description stored in a description file.
     *
     * @param descriptionFile
     *            The description file containing the EMF model of the description.
     */
    private void loadDataModel(EClass entityBaseType, EReference reference, final URI uri, DiagnosticChain diagnosticChain) {
        final Resource resource = getResourceForURI(uri);
        if (resource != null) {
            try {
                resource.load(null);
                logDiagnostic(resource.getErrors(), diagnosticChain, org.eclipse.emf.common.util.Diagnostic.ERROR);
                logDiagnostic(resource.getWarnings(), diagnosticChain, org.eclipse.emf.common.util.Diagnostic.WARNING);
                
                if (resource.getErrors().isEmpty()) {
                    var elements = resource.getContents().stream().filter(entityBaseType::isInstance).collect(Collectors.toList());
                    if (elements.isEmpty()) {
                        diagnosticChain
                            .add(new BasicDiagnostic(uri.toString(), org.eclipse.emf.common.util.Diagnostic.WARNING,
                                    "The file was skipped, as it did not contain the expected element of type "
                                            + entityBaseType.getName(),
                                    new Object[] {}));                            
                    } else {
                        if (reference.isMany()) {
                            @SuppressWarnings("unchecked")
                            var list = (EList<EObject>) this.managedRepo.eGet(reference);
                            elements.forEach(elem -> list.add(elem));
                        } else {
                            elements.forEach(elem -> this.managedRepo.eSet(reference, elem));
                        }                        
                    }
                }
            } catch (final IOException e) {
                diagnosticChain.add(BasicDiagnostic.toDiagnostic(e));                
            }
        }
    }


    /**
     * @throws DataNotAccessibleException
     */
    private void persistMetaData(final boolean flushOnly) throws DataNotAccessibleException {
        saveDataModels(RepositoryPackage.Literals.REPOSITORY__DESCRIPTIONS, !flushOnly);
        saveDataModels(RepositoryPackage.Literals.REPOSITORY__EXPERIMENT_GROUPS, !flushOnly);
    }
    
    /**
     * Saves all descriptions to description files within the specified directory.
     *
     * @param uri
     *            The EDP2 data directory.
     * @param flushOnly
     */
    
    @SuppressWarnings("rawtypes")
    private void saveDataModels(EReference reference, boolean unload) {
        if (!reference.getEContainingClass().isSuperTypeOf(this.managedRepo.eClass())) {
            throw new IllegalArgumentException(String.format("An illegal reference %swas presented for repository of type %s",
                    reference, this.managedRepo.eClass()));
        }
        Object gets = this.managedRepo.eGet(reference, true);
        if (reference.isMany()) {
            for (var element : ((EList)gets)) {
                saveDataModel((EObject) element, unload);
            }
        } else {
            saveDataModel((EObject) gets, unload);
        }
    }
    
    private void saveDataModel(EObject object, boolean unload) {
        final var modelUri = getArtifactURI(object);
        final Resource resource = getResourceForURI(modelUri);
        
        if (resource == null) {
            final String msg = "Could not create resource to persist meta data: " + modelUri;
            LOGGER.log(Level.SEVERE, msg);
            throw new RuntimeException("Unable to persist: " + object);
        } else {
            // If the resource is not set, initialize it.
            if (object.eResource() == null) {
                if (resource.getContents().size() > 0) {
                    throw new IllegalStateException(
                            "Persisting object which should have been persisted before: " + object);
                }
                resource.getContents().add(object);
            } else if (!object.eResource().equals(resource)) {
                LOGGER.log(Level.SEVERE, "Object was assigned to resource " + object.eResource()
                        + "but should be assigned to " + resource);
                throw new IllegalStateException("Resource for object is not the one it should be");
            }
            try {
                resource.save(null);
                if (unload) {
                    resource.unload();
                }
            } catch (final IOException e) {
                final String msg = "Could not save " + object;
                LOGGER.log(Level.WARNING, msg, e);
            }
        }
        
    }
    

    private URI getArtifactURI(final EObject identifier) {
        return (new ComposedSwitch<URI>(Arrays.asList(new MetricSpecSwitch<URI>() {
            public URI caseDescription(Description object) {
                return managedRepo.getUri()
                    .appendSegment(object.getId())
                    .appendFileExtension(EDP2Constants.EDP2_DESCRIPTIONS_EXTENSION);
            };
        }, new ExperimentDataSwitch<URI>() {
            @Override
            public URI caseExperimentGroup(ExperimentGroup object) {
                return managedRepo.getUri()
                    .appendSegment(object.getId())
                    .appendFileExtension(EDP2Constants.EDP2_EXPERIMENT_GROUP_EXTENSION);
            }
        }))).doSwitch(identifier);
    }
    /**
     * Returns a resource for the given URI.
     *
     * @param uri
     *            Location for which a resource is requested.
     * @return created resource.
     */
    private Resource getResourceForURI(final URI uri) {
        return this.managedRepo.getRepositories().getCommonResourceSet().getResource(uri, true);
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
    
   /**
    * Log diagnostic messages for EMF resources.
    *
    * @param diagnostics
    *            Messages to log.
    * @param level
    *            Level with which the messages should be logged.
    */
   private void logDiagnostic(EList<Resource.Diagnostic> diagnostics, DiagnosticChain diagnosticChain, int errorLevel) {
       if (diagnostics.size() != 0) {
           for (final var diag : diagnostics) {
               var basicDiag = new BasicDiagnostic(diag.getLocation(), errorLevel, diag.getMessage(), new Object[] {diag});
               diagnosticChain.add(basicDiag);
               Level logLevel = Level.INFO;
               switch(errorLevel) {
               case Diagnostic.WARNING:
                   logLevel = Level.WARNING;
                   break;
               case Diagnostic.ERROR:
                   logLevel = Level.SEVERE;
               }
               LOGGER.log(logLevel, "EMF Diagnostic message: " + diag.toString());
           }
       }
   }
}
