package org.palladiosimulator.edp2.ui.wizards.datasource;

import java.util.Optional;

import org.eclipse.jface.wizard.IWizard;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;
import org.palladiosimulator.edp2.ui.dialogs.datasource.FactoryWizardContribution;

public class LocalMemoryRepositoryContribution implements FactoryWizardContribution<Repository> {

    @Override
    public Repository createElement() {
        return RepositoryFactory.eINSTANCE.createLocalMemoryRepository();
    }

    @Override
    public Optional<IWizard> getFactoryWizard() {
        return Optional.empty();
    }

}
