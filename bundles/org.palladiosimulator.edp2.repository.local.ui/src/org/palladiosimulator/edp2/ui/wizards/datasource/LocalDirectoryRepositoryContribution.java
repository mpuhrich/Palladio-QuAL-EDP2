package org.palladiosimulator.edp2.ui.wizards.datasource;

import java.util.Optional;

import org.eclipse.jface.wizard.IWizard;
import org.palladiosimulator.edp2.local.LocalDirectoryRepository;
import org.palladiosimulator.edp2.local.localFactory;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.ui.dialogs.datasource.FactoryWizardContribution;
import org.palladiosimulator.edp2.ui.wizards.OnePageStandardWizard;
import org.palladiosimulator.edp2.ui.wizards.WorkspaceOrFileSystemLocationPage;

/**
 * Wizard contribution to discover and select a local directory based repository.
 */
public class LocalDirectoryRepositoryContribution implements FactoryWizardContribution<Repository> {
	LocalDirectoryRepository result = localFactory.eINSTANCE.createLocalDirectoryRepository();

	@Override
	public Repository createElement() {
		return result;
	}

	@Override
	public Optional<IWizard> getFactoryWizard() {
		var page = new WorkspaceOrFileSystemLocationPage();
		page.setTitle("Discover Local File Data Source");
		page.setDescription("Please select the data source you want to open.");
		
		var wizard = OnePageStandardWizard.create(page, p -> result.setUri(p.getPath().toString()));
		return Optional.of(wizard);
	}


}
