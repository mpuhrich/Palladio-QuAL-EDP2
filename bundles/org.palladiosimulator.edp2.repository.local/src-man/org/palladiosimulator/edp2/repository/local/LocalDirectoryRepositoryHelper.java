package org.palladiosimulator.edp2.repository.local;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.local.LocalDirectoryRepository;
import org.palladiosimulator.edp2.local.LocalFactory;

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
        final LocalDirectoryRepository ldRepo = LocalFactory.eINSTANCE.createLocalDirectoryRepository();
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

        final var uri = URI.createFileURI(pathToRepo);
        ldRepo.setDataFolder(uri);
        LOGGER.info("The repository has been initialized. Location: " + pathToRepo + ".");
        return ldRepo;
    }
    
    /**
     * Converts a supplied URI to a file on the local file system, if possible.
     *
     * @param uri
     *            The URI to convert.
     * @return Local file.
     * @throws DataNotAccessibleException
     *             For conversion errors. Details are provided in the message.
     */
    public static File convertToFile(final URI uri) throws DataNotAccessibleException {
        String fileLocation;
        if (uri.isPlatform()) {
            URL urlToFoo = null;
            try {
                urlToFoo = FileLocator.toFileURL(new URL(uri.toString()));
                fileLocation = urlToFoo.getFile();
            } catch (final MalformedURLException e) {
                throw new DataNotAccessibleException("The URI is not well-formed.", e);
            } catch (final IOException e) {
                throw new DataNotAccessibleException("The URI could not be converted.", e);
            }
        } else {
            fileLocation = uri.toFileString();
        }
        if (fileLocation == null) {
            // URI is valid but does not point to a file
            throw new DataNotAccessibleException("The URI could not be converted to a local file.", null);
        } 
        return new File(fileLocation);
    }
    
    /**
     * Converts a supplied URI to a file on the local file system, if possible.
     *
     * @param uri
     *            The URI to convert.
     * @return Local file.
     * @throws DataNotAccessibleException
     *             For conversion errors. Details are provided in the message.
     */
    public static File convertToDirectory(final URI uri) throws DataNotAccessibleException {
        File directory = convertToFile(uri);
        if (!directory.isDirectory()) {
            // URI does not point to a directory.
            throw new DataNotAccessibleException("The URI does not point to a directory.", null);
        }
        return directory;
    }
    
    /**
     * Converts a supplied URI to a file on the local file system, if possible.
     *
     * @param uri
     *            The URI to convert.
     * @return Local file.
     * @throws DataNotAccessibleException
     *             For conversion errors. Details are provided in the message.
     * 
     * @deprecated For legacy purposes, this method calls {@link #convertUriToDirectory(URI)}.
     *             Please use either, {@link #convertToDirectory(URI)} or
     *             {@link #convertToFile(URI)} directly.
     */
    @Deprecated
    public static File convertUriStringToFile(final String uriString) throws DataNotAccessibleException {
        return convertToDirectory(URI.createURI(uriString));
    }

}
