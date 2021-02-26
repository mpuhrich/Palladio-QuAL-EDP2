package org.palladiosimulator.edp2;

import java.util.Optional;
import java.util.Set;

import org.palladiosimulator.edp2.models.Repository.Repository;

public interface RepositoryAccess {
    
    /**
     * Returns the set of all currently registered repositories, opened and closed. Before using the repository, you need to make sure that is is opened.
     */
    public Set<Repository> availableRepositories();

    /**
     * Returns a suitable repository.
     */
    Optional<Repository> getRepository(String id);
    
    /**
     * 
     */
    Optional<Repository> getAnyRepository();
}
