package org.palladiosimulator.edp2.example;
import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository;
import org.palladiosimulator.edp2.util.MeasurementsUtility;


/**Contains an example how data can be loaded with EDP2.
 * @author groenda
 *
 */
public class LoadExample {
    /** (Relative) name of the directory in which the data of the example will be stored. */
    public static String DEFAULT_DIRECTORY = "LocalRepository";
    /** Logger for this class. */
    private static final Logger LOGGER = Logger.getLogger(LoadExample.class.getCanonicalName());

    /** Helper class used to process data for the example. */
    private final ExampleData exampleData;
    /** Repository which is used to store the data. */
    private final LocalDirectoryRepository ldRepo;

    /**Initializes an instance of the class with the default directory.
     */
    public LoadExample() {
        this(DEFAULT_DIRECTORY);
    }

    /**Initializes an instance of this class.
     * @param directory Directory to be used to store measurements.
     */
    public LoadExample(final String directory) {
        super();
        initPathmaps();
        ldRepo = initializeRepository(directory);
        exampleData = new ExampleData(ldRepo.getDescriptions());
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

    private void initPathmaps() {
        final String metricSpecModel = "models/commonMetrics.metricspec";
        final URL url = getClass().getClassLoader().getResource(metricSpecModel);
        if (url == null) {
            throw new RuntimeException("Error getting common metric definitions");
        }
        String urlString = url.toString();
        if (!urlString.endsWith(metricSpecModel)) {
            throw new RuntimeException("Error getting common metric definitions. Got: " + urlString);
        }
        urlString = urlString.substring(0, urlString.length() - metricSpecModel.length() - 1);
        final URI uri = URI.createURI(urlString);
        final URI target = uri.appendSegment("models").appendSegment("");
        URIConverter.URI_MAP.put(URI.createURI("pathmap://METRIC_SPEC_MODELS/"),
                target);

        final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        final Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("metricspec", new XMIResourceFactoryImpl());
    }

    /**Method body which executes all necessary steps to create and store an example.
     */
    public void run() {
        try {
            // Now, the repository can be accessed.
            MeasurementsUtility.ensureOpenRepository(ldRepo);
            System.out
            .println(exampleData.printStoredMeasurements(ldRepo, ldRepo
                    .getExperimentGroups().get(
                            ldRepo.getExperimentGroups().size() - 1)
                            .getId()));
            MeasurementsUtility.ensureClosedRepository(ldRepo);
        } catch (final DataNotAccessibleException e) {
            LOGGER.log(Level.SEVERE, "Error while accessing the datastore.", e);
        }
    }

    /**Main method to run the example.
     * @param args Not used.
     */
    public static void main(final String[] args) {
        final LoadExample example = new LoadExample();
        example.run();
    }
}
