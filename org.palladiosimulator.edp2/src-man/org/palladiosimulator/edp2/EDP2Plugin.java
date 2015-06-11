package org.palladiosimulator.edp2;

import java.io.IOException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.BackingStoreException;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository;
import org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository;
import org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository;
import org.palladiosimulator.edp2.models.Repository.Repositories;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

/**
 * The EDP2 plugin. The plugin persists created Repositories in its meta data location and allows to
 * access these.
 * 
 * @author Sebastian Lehrig
 */
public class EDP2Plugin extends Plugin {

    /** Logger for this class. */
    private static final Logger LOGGER = Logger.getLogger(EDP2Plugin.class.getCanonicalName());

    /** Setting: Should there be an initial population or mock-up data of repositories? */
    private static String SETTING_INITIALLY_POPULATE_REPOSITORY = "populate_repository";

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "org.palladiosimulator.edp2";

    /** Instance of this plugin. */
    public static EDP2Plugin INSTANCE;

    /** Metadata location for persistent repositories storage. */
    private static final String METADATA_LOCATION_REPOSITORIES = "platform:/meta/" + PLUGIN_ID + "/repositories.edp2";

    /** Resource set used to persist repositories. */
    ResourceSet rs = new ResourceSetImpl();

    /** Resource used to persist repositories. */
    Resource resource = null;

    /**
     * Constructor.
     */
    public EDP2Plugin() {
        // initialize
        final IScopeContext context = new ConfigurationScope();
        final IEclipsePreferences node = context.getNode(PLUGIN_ID);
        Boolean populate = false;
        if (node != null) {
            populate = node.getBoolean(SETTING_INITIALLY_POPULATE_REPOSITORY, false);
            node.putBoolean(SETTING_INITIALLY_POPULATE_REPOSITORY, populate);
            try {
                node.flush();
            } catch (final BackingStoreException e) {
                LOGGER.log(Level.SEVERE, "Could not load/store preferences. ", e);
            }
        }
        if (populate) {
            populateRepository();
        }

        INSTANCE = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);

        // initialize persistent repositories storage
        initializeResource();
        initializeRepositories();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        saveRepositories();
        super.stop(context);
    }

    /**
     * Initializes available repositories based on this plugin's data file for persistent storage.
     * 
     * @param context
     *            This plugin's bundle context
     */
    private void initializeRepositories() {
        try {
            final Repositories repositories = (Repositories) this.resource.getContents().get(0);

            getRepositories().getAvailableRepositories().addAll(repositories.getAvailableRepositories());
            for (final Repository repo : getRepositories().getAvailableRepositories()) {
                if (repo.canOpen()) {
                    try {
                        repo.open();
                    } catch (final DataNotAccessibleException e) {
                        LOGGER.log(Level.WARNING, "Could not open repository after reloading. Repository is " + repo);
                    }
                }
            }
        } catch (final Exception e) {
            LOGGER.warning("No preexisting EDP2 dataset configuration file. Resetting configuration...");
            if (getRepositories().getAvailableRepositories().size() == 0) {
                // TODO add EDP2 main memory repository once available
            }
        }
    }

    /**
     * Stores available repositories into this plugin's data file for persistent storage.
     * 
     * @param context
     *            This plugin's bundle context
     */
    private void saveRepositories() {
        this.resource.getContents().clear();
        this.resource.getContents().add(getRepositories());
        try {
            this.resource.save(Collections.EMPTY_MAP);
        } catch (final IOException e) {
            LOGGER.warning("Saving dataset configuration failed.");
        }
    }

    /**
     * Initializes the resource for persistent repositories storage. Creates The resource if it did
     * not exist.
     */
    private void initializeResource() {
        // register repositories package for persistent storage
        this.rs.getPackageRegistry().put(RepositoryPackage.eNS_URI, RepositoryPackage.eINSTANCE);

        // File file = context.getDataFile(PLUGIN_ID);
        final URI uri = URI.createURI(METADATA_LOCATION_REPOSITORIES, true);

        try {
            this.resource = this.rs.getResource(uri, true);
        } catch (final Exception e) {
            this.resource = this.rs.createResource(uri);
        }
    }

    /**
     * Populates the repositories instance with mock-up data. Only used and important for testing.
     * Creation is controlled via a properties file.
     */
    private void populateRepository() {
        final RepositoryFactory repoFactory = RepositoryFactory.eINSTANCE;
        final Repositories repos = getRepositories();

        final LocalDirectoryRepository ldRepo = repoFactory.createLocalDirectoryRepository();
        ldRepo.setUri(URI.createPlatformPluginURI("/org.palladiosimulator.edp2.examples/LocalRepository", true)
                .toString());
        RepositoryManager.addRepository(repos, ldRepo);

        final RemoteCdoRepository rcRepo = repoFactory.createRemoteCdoRepository();
        rcRepo.setUrl("tcp://localhost:2036");
        RepositoryManager.addRepository(repos, rcRepo);

        final LocalMemoryRepository lmRepo = repoFactory.createLocalMemoryRepository();
        lmRepo.setDomain("Domain 1");
        RepositoryManager.addRepository(repos, lmRepo);
    }

    /**
     * Central method for receiving repositories.
     * 
     * @return The Repositories instance containing all available repositories.
     */
    public Repositories getRepositories() {
        return RepositoryManager.getCentralRepository();
    }

}
