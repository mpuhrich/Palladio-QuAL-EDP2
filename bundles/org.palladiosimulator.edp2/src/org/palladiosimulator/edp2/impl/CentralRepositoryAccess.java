package org.palladiosimulator.edp2.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.palladiosimulator.edp2.ManagedRepositoriesProvider;
import org.palladiosimulator.edp2.RepositoryAccess;
import org.palladiosimulator.edp2.models.Repository.Repository;

@Component
public class CentralRepositoryAccess implements RepositoryAccess {

    @Reference
    ManagedRepositoriesProvider repositoriesProvider;

    @Override
    public Set<Repository> availableRepositories() {
        return Collections
            .unmodifiableSet(new HashSet<>(Objects.requireNonNull(repositoriesProvider.getSharedRepositories())
                .getAvailableRepositories()));
    }

    @Override
    public Optional<Repository> getRepository(String id) {
        return Objects.requireNonNull(repositoriesProvider.getSharedRepositories())
            .getAvailableRepositories()
            .stream()
            .filter(repo -> repo.getId()
                .equals(id))
            .findAny();
    }
    
    @Override
    public Optional<Repository> getAnyRepository() {
        return availableRepositories().stream().findAny();
    }

}
