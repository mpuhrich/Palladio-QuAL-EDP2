package org.palladiosimulator.edp2.visualization.datasource;

import java.io.File;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.impl.DataNotAccessibleException;
import org.palladiosimulator.edp2.impl.MeasurementsUtility;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentGroup;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentRun;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentSetting;
import org.palladiosimulator.edp2.models.ExperimentData.Measurements;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange;
import org.palladiosimulator.edp2.models.ExperimentData.RawMeasurements;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.visualization.AbstractDataSource;
import org.palladiosimulator.edp2.visualization.AbstractTransformation;
import org.palladiosimulator.edp2.visualization.IDataSink;
import org.palladiosimulator.edp2.visualization.util.RepositoryUtility;

/**
 * Instances of this class serve as connectors between data in repositories and
 * classes implementing {@link IDataSink} or {@link AbstractTransformation}.
 * 
 * @author Dominik Ernst
 * 
 */
public class EDP2Source extends AbstractDataSource {

    /**
     * Logger for this class.
     */
    private final static Logger logger = Logger.getLogger(EDP2Source.class
            .getCanonicalName());

    /**
     * Key under which this class' name is stored in the properties.
     */
    private static final String ELEMENT_KEY = "elementName";
    /**
     * Name constant, which is used to identify this class in properties.
     */
    private static final String ELEMENT_NAME = "EDP2Source";
    /**
     * Key for properties, that is used to store the {@link Repository} URI.
     */
    private static final String REPOSITORY_KEY = "repositoryURI";
    /**
     * Key for properties, that is used to store the {@link RawMeasurements} UUID.
     */
    private static final String RAW_MEASUREMENTS_KEY = "rawMeasurementsUUID";

    /**
     * The {@link Repository} of this {@link EDP2Source}. It is the {@link Repository} in which
     * the original experiment date are located.
     */
    private Repository repository;
    /**
     * UUID of the {@link RawMeasurements} object, based on which this {@link EDP2Source} is created.
     */
    private String rawMeasurementsUUID;
    /**
     * URI ({@link String}) of the {@link Repository} ({@link #repository}).
     */
    private String repositoryURI;
    /**
     * Default constructor.
     */
    public EDP2Source(){
        super();
    }

    /**
     * Creates a new {@link EDP2Source} using the reference on an {@link RawMeasurements} object.
     * @param data the referenced {@link RawMeasurements} element
     */
    public EDP2Source(final RawMeasurements data) {
        setRepositoryURI(CommonPlugin.resolve(
                data.eResource().getURI().trimSegments(1)).toFileString());
        setRawMeasurementsUUID(data.getUuid());
        //findRawMeasurementsByUUID(rawMeasurementsUUID);
        this.measurementsRange = data.getMeasurementsRange();
        this.originalMeasurementsRange = data.getMeasurementsRange();
        this.dataSeries = data.getDataSeries();
    }

    /**
     * Constructor that uses Strings to reconstruct an {@link EDP2Source} element, e.g. for persistence.
     * @param repoURI the URI ({@link String}) of the {@link Repository}
     * @param rmUUID the UUID ({@link String}) of the {@link RawMeasurements}
     */
    public EDP2Source(final String repoURI, final String rmUUID) {
        this.repositoryURI = repoURI;
        this.rawMeasurementsUUID = rmUUID;
        findRawMeasurementsByUUID(rmUUID);
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    @Override
    public Object getAdapter(final Class adapter) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Opens the {@link Repository} of this {@link EDP2Source} and adds it to
     * the central Repository, if necessary.
     */
    private void openRepository() {
        try {
            this.repository = RepositoryManager
                    .initializeLocalDirectoryRepository(new File(repositoryURI));
            RepositoryManager.addRepository(RepositoryManager
                    .getCentralRepository(), repository);
            MeasurementsUtility.ensureOpenRepository(repository);
        } catch (final DataNotAccessibleException e) {
            logger.log(Level.SEVERE, "Repository could not be opened.");
        }
    }

    /**
     * Closes the {@link Repository} of this {@link EDP2Source}.
     */
    private void closeRepository() {
        try {
            MeasurementsUtility.ensureClosedRepository(repository);
        } catch (final DataNotAccessibleException e) {
            logger.log(Level.SEVERE, "Repository could not be closed. Data might be corrupted.");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
     */
    @Override
    public void saveState(final IMemento memento) {
        EDP2SourceFactory.saveState(memento, this);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IPersistableElement#getFactoryId()
     */
    @Override
    public String getFactoryId() {
        return EDP2SourceFactory.getFactoryId();
    }

    /**
     * Method which retrieves the selected {@link RawMeasurements} by their
     * UUID.
     * 
     * @param rmUUID
     *            the {@link RawMeasurements} UUID.
     */
    public void findRawMeasurementsByUUID(final String rmUUID) {
        openRepository();
        for (final ExperimentGroup group : repository.getExperimentGroups()) {
            for (final ExperimentSetting setting : group.getExperimentSettings()) {
                for (final ExperimentRun run : setting.getExperimentRuns()) {
                    for (final Measurements measurements : run.getMeasurements()) {
                        for (final MeasurementsRange range : measurements
                                .getMeasurementsRanges()) {
                            if (range.getRawMeasurements().getUuid().equals(
                                    rmUUID)) {
                                originalMeasurementsRange = range;
                                measurementsRange = RepositoryUtility.copyRawMeasurements(range.getRawMeasurements());
                            }
                        }
                    }
                }
            }
        }
        if (measurementsRange == null) {
            logger.log(Level.SEVERE, "MeasurementsRange is null -> No RawMeasurements found!");
            throw new RuntimeException();
        }
        this.dataSeries = measurementsRange.getRawMeasurements()
                .getDataSeries();
        closeRepository();
    }

    /**
     * Returns the UUID as a String of the {@link RawMeasurements} , which were
     * selected to produce this {@link AbstractDataSource} .
     * 
     * @return The {@link ExperimentSetting} for this {@link AbstractDataSource}.
     */
    public String getRawMeasurementsUUID() {
        return rawMeasurementsUUID;
    }

    /**
     * Sets the UUID of the {@link RawMeasurements} object, which is connected
     * with this source to the specified UUID. WARNING: The UUID must actually
     * exist in the {@link AbstractDataSource} 's {@link Repository} !
     * 
     * @param rawMeasurementsUUID
     *            the new UUID of the {@link RawMeasurements}
     * */
    private void setRawMeasurementsUUID(final String rawMeasurementsUUID) {
        this.rawMeasurementsUUID = rawMeasurementsUUID;
    }

    /**
     * Returns the URI (absolute path, String representation) of the
     * {@link Repository} in which the {@link RawMeasurements} of this source
     * were selected.
     * 
     * @return The URI of the attached repository {@link String} for this
     *         {@link AbstractDataSource}.
     */
    public String getRepositoryURI() {
        return repositoryURI;
    }

    /**
     * Sets the associated {@link Repository} 's URI (a String representation of
     * the absolute path) to the specified parameter.
     * 
     * @param repositoryURI
     *            the value of the new {@link Repository} 's URI.
     */
    private void setRepositoryURI(final String repositoryURI) {
        this.repositoryURI = repositoryURI;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.visualization.IDataSource#getProperties()
     */
    @Override
    public HashMap<String, Object> getProperties() {
        properties.put(ELEMENT_KEY, ELEMENT_NAME);
        properties.put(REPOSITORY_KEY, getRepositoryURI());
        properties.put(RAW_MEASUREMENTS_KEY, getRawMeasurementsUUID());
        return properties;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.edp2.visualization.IDataSource#setProperties(java.util
     * .HashMap)
     */
    @Override
    public void setProperties(final HashMap<String, Object> newProperties) {
        properties.put(REPOSITORY_KEY, newProperties.get(REPOSITORY_KEY));
        this.repositoryURI = newProperties.get(REPOSITORY_KEY).toString();
        properties.put(RAW_MEASUREMENTS_KEY, newProperties
                .get(RAW_MEASUREMENTS_KEY));
        this.rawMeasurementsUUID = newProperties.get(RAW_MEASUREMENTS_KEY).toString();
        findRawMeasurementsByUUID(rawMeasurementsUUID);
    }

    @Override
    public String getName() {
        return ELEMENT_NAME;
    }

}
