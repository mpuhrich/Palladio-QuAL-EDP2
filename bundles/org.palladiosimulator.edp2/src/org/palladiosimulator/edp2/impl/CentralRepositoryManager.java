package org.palladiosimulator.edp2.impl;

import java.util.Objects;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.palladiosimulator.edp2.ManagedRepositoriesProvider;
import org.palladiosimulator.edp2.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.Repository;

@Component
public class CentralRepositoryManager implements RepositoryManager {
    
    @Reference
    private ManagedRepositoriesProvider repositoriesProvider;
    

    @Override
    public Diagnostic registerRepository(Repository newRepo) {
        var repositories = Objects.requireNonNull(repositoriesProvider).getSharedRepositories();
        return org.palladiosimulator.edp2.impl.RepositoryManager.addRepository(repositories, newRepo);
    }

    @Override
    public Diagnostic unregisterRepository(Repository repo) {
        var repositories = Objects.requireNonNull(repositoriesProvider).getSharedRepositories();
        org.palladiosimulator.edp2.impl.RepositoryManager.removeRepository(repositories, repo);
        return BasicDiagnostic.OK_INSTANCE;
    }

}
