/**
 *
 */
package org.palladiosimulator.edp2.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.models.Repository.Repositories;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;

/**
 * Utility class to manage repositories.
 *
 * @author groenda, Sebastian Lehrig
 *
 * @deprecated Please use the service-based {@link org.palladiosimulator.edp2.RepositoryManager}
 *             instead.
 */
@Deprecated
public class RepositoryManager {
    /** Logger for this class. */
    private static final Logger LOGGER = Logger.getLogger(RepositoryManager.class.getCanonicalName());

    /** Central instance of a repository (singleton). */
    private static Repositories centralRepository = RepositoryFactory.eINSTANCE.createRepositories();

    /**
     * Adds a repository to the list of repositories. The repository is automatically opened, if
     * possible.
     *
     * @param repos
     *            The currently available repositories.
     * @param newRepo
     *            The new repository to add.
     */
    public static Diagnostic addRepository(final Repositories repos, final Repository newRepo) {
        var diagnostics = new BasicDiagnostic(RepositoryManager.class.getName(), Diagnostic.OK, "No problems during import", null);
        if (repos.getAvailableRepositories().stream().noneMatch(repo -> repo.getId().equals(newRepo.getId()))) {
            repos.getAvailableRepositories().add(newRepo);
            
            if (newRepo.canOpen(diagnostics)) {
                newRepo.open(diagnostics);
            }
        } else {
            diagnostics = new BasicDiagnostic(RepositoryManager.class.getName(), Diagnostic.WARNING,
                    "The repository was not added, as a repository with the same ID already existed.", null);
        }
        
        if (diagnostics.getSeverity() == Diagnostic.ERROR) {
            var result = new BasicDiagnostic(RepositoryManager.class.getName(), Diagnostic.ERROR, "The repository could not be opened.", null);
            result.merge(diagnostics);
            return result;
        } else if (diagnostics.getSeverity() == Diagnostic.WARNING) {
            var result = new BasicDiagnostic(RepositoryManager.class.getName(), Diagnostic.WARNING, "The repository could be opened. However, there were problems.", null);
            result.merge(diagnostics);
            return result;
        }
        
        return diagnostics;
    }

    /**
     * Removes a repository from the given list of the available repositories. The repository is
     * automatically closed, if possible.
     *
     * @param repos
     *            The currently available repositories.
     * @param repo
     *            The repository to remove.
     */
    public static void removeRepository(final Repositories repos, final Repository repo) {
        assert (repos.getAvailableRepositories().indexOf(repo) > -1); // repo must be in list
        if (repo.canClose()) {
            try {
                repo.close();
            } catch (final DataNotAccessibleException e) {
                LOGGER.log(Level.WARNING, "Could not close repository before removing it from the list.", e);
            }
        }
        repos.getAvailableRepositories().remove(repo);
        LOGGER.log(Level.INFO, "Repository is removed.");
    }

    /**
     * Provides access to a central repository. Convenience function to provide access to a
     * singleton which can then be managed.
     *
     * @return Reference to the central repository.
     */
    public static Repositories getCentralRepository() {
        return centralRepository;
    }

    /**
     * Returns Repository with given UUID from central repository.
     *
     * @return Reference to the repository with given UUID. Null if not found.
     */
    public static Repository getRepositoryFromUUID(final String uuid) {
        for (final Repository repository : centralRepository.getAvailableRepositories()) {
            if (repository.getId().equals(uuid)) {
                return repository;
            }
        }
        return null;
    }
}
