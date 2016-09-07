package org.palladiosimulator.edp2.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.palladiosimulator.edp2.cdo.RemoteCdoRepositoryHelper;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.util.MeasurementsUtility;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.metricspec.MetricSetDescription;

/**
 * Contains an example how data can be stored with EDP2. Please note that repeated execution of this
 * class can lead to errors. This behavior is due to brevity and clarity of the example and does
 * demonstrate a general shortcoming.
 *
 * @author groenda, Sebastian Lehrig
 */
public class CDOStoreAndLoadExample {
	/** (Relative) name of the directory in which the data of the example will be stored. */
    public static final String DEFAULT_DIRECTORY = "LocalRepository";
    
    /** Credentials for CDO Server. */
    public static final String DEFAULT_USER = "";
    public static final String DEFAULT_PASSWORD = "";
    public static final String DEFAULT_ADDRESS = "localhost:2036";
    public static final String DEFAULT_NAME = "repo1";
    
    /** Logger for this class. */
    private static final Logger LOGGER = Logger.getLogger(CDOStoreAndLoadExample.class.getCanonicalName());

    /** Repository which is used to store the data. */
    private final Repository lrRepo;
    
    /** Helper class used to process data for the example. */
    private final ExampleData exampleData;

    /**
     * Initializes an instance of this class with the default directory as target.
     */
    public CDOStoreAndLoadExample() {
        this(DEFAULT_USER, DEFAULT_PASSWORD, DEFAULT_ADDRESS, DEFAULT_NAME, DEFAULT_DIRECTORY);
    }

    /**
     * Initializes an instance of this class.
     *
     * @param directory
     *            Directory to be used to store measurements.
     */
    public CDOStoreAndLoadExample(final String user, final String password, final String address, final String name, final String directory) {
        lrRepo = initializeRepository(user, password, address, name, directory);
        exampleData = new ExampleData(lrRepo.getDescriptions());
    }

    /**
     * Initializes the repository in which the data will be stored.
     *
     * @param directory
     *            Path to directory in which the data should be stored.
     * @return the initialized repository.
     */
    private Repository initializeRepository(final String user, final String password, final String address, final String name, final String directory) {
        final Repository repo = RemoteCdoRepositoryHelper.initializeLocalRemoteRepository(user, password, address, name, new File(directory));
        /*
         * Add repository to a (optional) central directory of repositories. This can be useful to
         * manage more than one repository or have links between different existing repositories. A
         * repository must be connected to an instance of Repositories in order to be opened.
         */
        RepositoryManager.addRepository(RepositoryManager.getCentralRepository(), repo);
        return repo;
    }

    private void createExample() {
        exampleData.createExampleExperimentMetadata();
        lrRepo.getExperimentGroups().add(exampleData.getExampleExperimentGroup());
        // create experiment data
        exampleData.simulateExperimentRun();
    }

    /**
     * Method body which executes all necessary steps to create and store an example.
     */
    public void runStore() {
        try {
        	MeasurementsUtility.ensureOpenRepository(lrRepo);
        	createExample();
            MeasurementsUtility.ensureClosedRepository(lrRepo);
        } catch (final DataNotAccessibleException e) {
            LOGGER.log(Level.SEVERE, "Error while accessing the datastore.", e);
        }
    }
    
    public void runLoad() {
        try {
            // Now, the repository can be accessed.
            MeasurementsUtility.ensureOpenRepository(lrRepo);
            System.out.println(exampleData.printStoredMeasurements(lrRepo,
                    lrRepo.getExperimentGroups().get(lrRepo.getExperimentGroups().size() - 1).getId()));
            MeasurementsUtility.ensureClosedRepository(lrRepo);
        } catch (final DataNotAccessibleException e) {
            LOGGER.log(Level.SEVERE, "Error while accessing the datastore.", e);
        }
    }
    
    public void runStoreLoad() {
        try {
            final String storedData = storeExperimentRun();
            final String readData = loadExperimentRun(storedData);
            if (readData != null && !readData.equals(storedData)) {
                throw new IllegalStateException("Stored and loaded data is not equal. Stored: " + storedData
                        + "\nLoaded: " + readData);
            }
            streamResultData();
        } catch (final DataNotAccessibleException e) {
            LOGGER.log(Level.SEVERE, "Error while accessing the datastore.", e);
        }
    }

    private void streamResultData() throws DataNotAccessibleException {
        MeasurementsUtility.ensureOpenRepository(lrRepo);
        final IDataSource dataSource = new Edp2DataTupleDataSource(lrRepo.getExperimentGroups().get(0)
                .getExperimentSettings().get(0).getExperimentRuns().get(0).getMeasurement().get(0)
                .getMeasurementRanges().get(0).getRawMeasurements());
        final AbstractFilter adapter = new AbstractFilter(dataSource, lrRepo.getExperimentGroups().get(0)
                .getExperimentSettings().get(0).getMeasuringTypes().get(0).getMetric()) {

            @Override
            protected MeasuringValue computeOutputFromInput(final MeasuringValue data) {
                final List<Measure<?, ?>> next = new ArrayList<Measure<?, ?>>(2);
                for (final Measure m : data.asList()) {
                    final Measure<Double, Duration> newM = Measure
                            .valueOf(m.doubleValue(SI.SECOND) + 1.0d, m.getUnit());
                    next.add(newM);
                }
                return new TupleMeasurement((MetricSetDescription) data.getMetricDesciption(), next);
            }

        };
        final IDataStream<MeasuringValue> dataStream = adapter.getDataStream();
        for (final IMeasureProvider tuple : dataStream) {
            System.out.println(tuple);
        }
        dataStream.close();
        MeasurementsUtility.ensureClosedRepository(lrRepo);
    }
    
    private String loadExperimentRun(final String storedData) throws DataNotAccessibleException {
        // load
        MeasurementsUtility.ensureOpenRepository(lrRepo);
        final String readData = exampleData.printStoredMeasurements(lrRepo);
        System.out.println(readData);
        MeasurementsUtility.ensureClosedRepository(lrRepo);

        return readData;
    }

    private String storeExperimentRun() throws DataNotAccessibleException {
        MeasurementsUtility.ensureOpenRepository(lrRepo);
        createExample();
        final String storedData = exampleData.printStoredMeasurements(lrRepo);
        System.out.println(storedData);
        MeasurementsUtility.ensureClosedRepository(lrRepo);
        return storedData;
    }
    
    /**
     * Main method to run the example.
     *
     * @param args
     *            Not used.
     */
    public static void main(final String[] args) {
        final CDOStoreAndLoadExample example = new CDOStoreAndLoadExample();
        example.runStoreLoad();
    }
}
