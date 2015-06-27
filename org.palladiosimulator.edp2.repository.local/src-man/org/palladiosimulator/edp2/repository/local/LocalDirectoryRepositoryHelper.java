package org.palladiosimulator.edp2.repository.local;

import java.io.File;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.edp2.local.LocalDirectoryRepository;
import org.palladiosimulator.edp2.local.localFactory;

public class LocalDirectoryRepositoryHelper {

    /** Logger for this class. */
    private static final Logger LOGGER = Logger.getLogger(LocalDirectoryRepositoryHelper.class.getCanonicalName());

    /**
     * Creates and initialized a LocalDirectoryRepository.
     *
     * @param location
     *            The directory on the local machine which should be accessed by the repository.
     * @return Initialized repository instance. <code>null</code> if the initialization failed.
     */
    public static LocalDirectoryRepository initializeLocalDirectoryRepository(final File location) {
        final LocalDirectoryRepository ldRepo = localFactory.eINSTANCE.createLocalDirectoryRepository();
        final String pathToRepo = location.getAbsolutePath();
        if (!location.exists()) {
            final boolean result = location.mkdir();
            if (result == false) {
                LOGGER.severe("Could not create directory at location " + pathToRepo);
                return null;
            }
        } else {
            if (!location.isDirectory()) {
                LOGGER.severe("Directory can't be created. A file of the same name already exists. Location: "
                        + pathToRepo);
                return null;
            }
        }

        final String uriString = URI.createFileURI(pathToRepo).toString();
        ldRepo.setUri(uriString);
        LOGGER.info("The repository has been initialized. Location: " + pathToRepo + ".");
        return ldRepo;
    }

}
