package org.palladiosimulator.edp2.example;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.edp2source.Edp2DataTupleDataSource;
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;
import org.palladiosimulator.edp2.impl.DataNotAccessibleException;
import org.palladiosimulator.edp2.impl.MeasurementsUtility;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository;
import org.palladiosimulator.measurementspec.Measurement;
import org.palladiosimulator.measurementspec.MeasurementTupple;
import org.palladiosimulator.metricspec.MetricSetDescription;

/**
 * 
 */

/**Contains an example how data can be stored with EDP2.
 * @author groenda
 */
public class StoreLoadExample {
    /** (Relative) name of the directory in which the data of the example will be stored. */
    public static String DEFAULT_DIRECTORY = "LocalRepository";
    /** Logger for this class. */
    private static Logger logger = Logger.getLogger(StoreLoadExample.class.getCanonicalName());

    /** Repository which is used to store the data. */
    private final LocalDirectoryRepository ldRepo;
    /** Helper class used to process data for the example. */
    private final ExampleData exampleData;

    /**Initializes an instance of this class with the default directory as target.
     */
    public StoreLoadExample() {
        this(DEFAULT_DIRECTORY);
    }

    /**Initializes an instance of this class.
     * @param directory Directory to be used to store measurements.
     */
    public StoreLoadExample(final String directory) {
        ldRepo = initializeRepository(directory);
        exampleData = new ExampleData();
    }

    /**Initializes the repository in which the data will be stored.
     * @param directory Path to directory in which the data should be stored.
     * @return the initialized repository.
     */
    private LocalDirectoryRepository initializeRepository(final String directory) {
        final LocalDirectoryRepository repo = RepositoryManager.initializeLocalDirectoryRepository(new File(directory));
        /* Add repository to a (optional) central directory of repositories.
         * This can be useful to manage more than one repository or have links
         * between different existing repositories.
         * A repository must be connected to an instance of Repositories in order
         * to be opened.*/
        RepositoryManager.addRepository(RepositoryManager.getCentralRepository(), repo);
        return repo;
    }

    private void createExample() {
        // create metric descriptions and experiment meta data
        ldRepo.getDescriptions().addAll(
                exampleData.createExampleBaseMetricDescriptions(ldRepo
                        .getDescriptions()));
        ldRepo.getDescriptions().addAll(
                exampleData.createExampleMetricSetDescriptions(ldRepo
                        .getDescriptions()));
        exampleData.createExampleExperimentMetadata();
        ldRepo.getExperimentGroups().add(exampleData.getExampleExperimentGroup());
        // create experiment data
        exampleData.simulateExperimentRun();
    }

    /**Method body which executes all necessary steps to create and store an example.
     */
    public void run() {
        try {
            // store
            MeasurementsUtility.ensureOpenRepository(ldRepo);
            createExample();
            final String storedData = exampleData.printStoredMeasurements(ldRepo);
            System.out.println(storedData);
            MeasurementsUtility.ensureClosedRepository(ldRepo);

            // load
            MeasurementsUtility.ensureOpenRepository(ldRepo);
            final String readData = exampleData.printStoredMeasurements(ldRepo);
            if (readData != null && !readData.equals(storedData)) {
                throw new IllegalStateException("Stored and loaded data is not equal. Stored: " + storedData + "\nLoaded: " + readData);
            }
            System.out.println(readData);

            // stream
            final IDataSource dataSource = new Edp2DataTupleDataSource(ldRepo.getExperimentGroups().get(0).getExperimentSettings().get(0).getExperimentRuns().get(0).getMeasurements().get(0).getMeasurementsRanges().get(0).getRawMeasurements());
            final AbstractFilter adapter = new AbstractFilter(dataSource, ldRepo.getExperimentGroups().get(0).getExperimentSettings().get(0).getMeasure().get(0).getMetric()){

                @Override
                protected Measurement computeOutputFromInput(final Measurement data) {
                    final List<Measure> next = new ArrayList<Measure>(2);
                    for (final Measure m : data.asList()) {
                        final Measure<Double,Duration> newM = Measure.valueOf(m.doubleValue(SI.SECOND)+1.0d, m.getUnit());
                        next.add(newM);
                    }
                    return new MeasurementTupple((MetricSetDescription) data.getMetricDesciption(), next);
                }

                @Override
                public String[] getKeys() {
                    return new String[]{};
                }

            };
            final IDataStream<Measurement> dataStream = adapter.getDataStream();
            for (final Measurement tuple : dataStream) {
                System.out.println(tuple);
            }
            dataStream.close();
            MeasurementsUtility.ensureClosedRepository(ldRepo);
        } catch (final DataNotAccessibleException e) {
            logger.log(Level.SEVERE, "Error while accessing the datastore.", e);
        }
    }

    /**Main method to run the example.
     * @param args Not used.
     */
    public static void main(final String[] args) {
        final StoreLoadExample example = new StoreLoadExample();
        example.run();
    }
}
