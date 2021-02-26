package org.palladiosimulator.edp2;

import org.eclipse.emf.common.util.Diagnostic;
import org.palladiosimulator.edp2.models.Repository.Repository;

public interface RepositoryManager {

    /**
     * Adds a repository to the list of repositories. The repository is automatically opened, if
     * possible.
     *
     * @param newRepo
     *            The new repository to add.
     * @return warnings and errors, which were encountered while opening the repository
     */
    public Diagnostic registerRepository(final Repository newRepo);

    /**
     * Tries to remove a repository from the managed list of available repositories. If the
     * repository is still open, it is automatically closed. The repository is only removed if the
     * closing was successfull.
     *
     * @param repo
     *            The repository to remove.
     * @return warnings and errors encountered while closing the repository
     */
    public Diagnostic unregisterRepository(final Repository repo);
    
}
