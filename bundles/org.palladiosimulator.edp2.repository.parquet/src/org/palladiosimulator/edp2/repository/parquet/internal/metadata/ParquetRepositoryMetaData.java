package org.palladiosimulator.edp2.repository.parquet.internal.metadata;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.palladiosimulator.edp2.EDP2Constants;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.util.ExperimentDataSwitch;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.repository.parquet.ParquetRepository;
import org.palladiosimulator.edp2.repository.parquet.internal.context.ExperimentContextFactory;
import org.palladiosimulator.metricspec.Description;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.util.MetricSpecSwitch;

public class ParquetRepositoryMetaData {

    private static final Logger LOGGER = Logger.getLogger(ParquetRepositoryMetaData.class.getName());

    private ParquetRepository repository;
    private ExperimentContextFactory contextFactory;

    public ParquetRepositoryMetaData(ParquetRepository repository, ExperimentContextFactory contextFactory) {
        this.repository = repository;
        this.contextFactory = contextFactory;

        // observe changes on the ExperimentGroup list
        final Adapter descAdapter = new ParquetRepositoryMetaDataResourceAdapter(repository,
                RepositoryPackage.Literals.REPOSITORY__DESCRIPTIONS,
                EDP2Constants.EDP2_DESCRIPTIONS_EXTENSION);
        this.repository.eAdapters().add(descAdapter);

        // observe changes on the Descriptions list
        final Adapter expGroupAdapter = new ParquetRepositoryMetaDataResourceAdapter(repository,
                RepositoryPackage.Literals.REPOSITORY__EXPERIMENT_GROUPS,
                EDP2Constants.EDP2_EXPERIMENT_GROUP_EXTENSION);
        repository.eAdapters().add(expGroupAdapter);
    }

    public void loadMetaData(DiagnosticChain diagnosticChain) {
        // load descriptions
        loadDataModels(MetricSpecPackage.Literals.DESCRIPTION,
                RepositoryPackage.Literals.REPOSITORY__DESCRIPTIONS,
                EDP2Constants.EDP2_DESCRIPTIONS_EXTENSION,
                diagnosticChain);
        // load experiment groups
        loadDataModels(ExperimentDataPackage.Literals.EXPERIMENT_GROUP,
                RepositoryPackage.Literals.REPOSITORY__EXPERIMENT_GROUPS,
                EDP2Constants.EDP2_EXPERIMENT_GROUP_EXTENSION,
                diagnosticChain);
        // create experiment contexts
        var runs = repository.getExperimentGroups().stream()
            .flatMap(group -> group.getExperimentSettings().stream())
            .flatMap(setting -> setting.getExperimentRuns().stream());
        runs.forEach(run -> contextFactory.loadAndRegisterExperimentContext(run.getId()));
    }

    public void persistMetaData(final boolean flushOnly) throws DataNotAccessibleException {
        saveDataModels(RepositoryPackage.Literals.REPOSITORY__DESCRIPTIONS, !flushOnly);
        saveDataModels(RepositoryPackage.Literals.REPOSITORY__EXPERIMENT_GROUPS, !flushOnly);
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
            var url = new URL(repository.getDataFolder().toString());
            var fileLocator = FileLocator.toFileURL(url);
            var dirPath = Path.of(fileLocator.getPath().replaceFirst("^/(.:/)", "$1"));
            for (var filePath : Files.newDirectoryStream(dirPath, "*." + fileExtension)) {
                var relativePath = dirPath.relativize(filePath);
                var repoUri = repository.getDataFolder();
                if (!repoUri.hasTrailingPathSeparator()) {
                    repoUri = repoUri.appendSegment("");
                }
                var modelUri = URI.createURI(relativePath.toString()).resolve(repoUri);
                loadDataModel(entityBaseType, reference, modelUri, diagnosticChain);
            }
        } catch (IOException e) {
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
                            var list = (EList<EObject>) repository.eGet(reference);
                            elements.forEach(elem -> list.add(elem));
                        } else {
                            elements.forEach(elem -> repository.eSet(reference, elem));
                        }
                    }
                }
            } catch (final IOException e) {
                diagnosticChain.add(BasicDiagnostic.toDiagnostic(e));
            }
        }
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
        if (!reference.getEContainingClass().isSuperTypeOf(repository.eClass())) {
            throw new IllegalArgumentException(String.format("An illegal reference %swas presented for repository of type %s",
                    reference, repository.eClass()));
        }
        Object gets = repository.eGet(reference, true);
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
                return repository.getDataFolder()
                    .appendSegment(object.getId())
                    .appendFileExtension(EDP2Constants.EDP2_DESCRIPTIONS_EXTENSION);
            };
        }, new ExperimentDataSwitch<URI>() {
            @Override
            public URI caseExperimentGroup(ExperimentGroup object) {
                return repository.getDataFolder()
                    .appendSegment(object.getId())
                    .appendFileExtension(EDP2Constants.EDP2_EXPERIMENT_GROUP_EXTENSION);
            }
        }))).doSwitch(identifier);
    }

    private Resource getResourceForURI(final URI uri) {
        return repository.getRepositories().getCommonResourceSet().getResource(uri, true);
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
