package org.palladiosimulator.edp2.impl;

import org.osgi.service.component.annotations.Component;
import org.palladiosimulator.edp2.ManagedRepositoriesProvider;
import org.palladiosimulator.edp2.models.Repository.Repositories;

@Component
public class CentralRepositoriesProvider implements ManagedRepositoriesProvider {

    @Override
    public Repositories getSharedRepositories() {
        return RepositoryManager.getCentralRepository();
    }

}
