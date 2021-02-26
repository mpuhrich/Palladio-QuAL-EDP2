package org.palladiosimulator.edp2;

import org.palladiosimulator.edp2.models.Repository.Repositories;

public interface ManagedRepositoriesProvider {
    
    Repositories getSharedRepositories();

}
