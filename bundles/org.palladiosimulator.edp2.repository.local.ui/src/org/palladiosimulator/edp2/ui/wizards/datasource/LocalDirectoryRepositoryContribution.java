package org.palladiosimulator.edp2.ui.wizards.datasource;

import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.palladiosimulator.edp2.EDP2Constants;
import org.palladiosimulator.edp2.local.LocalDirectoryRepository;
import org.palladiosimulator.edp2.local.LocalFactory;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.ui.dialogs.datasource.FactoryWizardContribution;
import org.palladiosimulator.edp2.ui.wizards.OnePageStandardWizard;
import org.palladiosimulator.edp2.ui.wizards.WorkspaceOrFileSystemLocationPage;

/**
 * Wizard contribution to discover and select a local directory based repository.
 */
public class LocalDirectoryRepositoryContribution implements FactoryWizardContribution<Repository> {
	URI path;
	
	@Override
	public Optional<Repository> createElement(Shell parent) throws IOException {
	    ResourceSet temporarySet = new ResourceSetImpl();
	    URI modelPath = path.appendSegment("repository." + EDP2Constants.EDP2_REPOSITORY_EXTENSION);
	    boolean doCreate = true;
	    boolean doLoad = false;
	    if (temporarySet.getURIConverter().exists(modelPath, Collections.emptyMap())) {
	        MessageBox mb = new MessageBox(parent, SWT.YES | SWT.NO | SWT.ICON_QUESTION);
	        mb.setMessage("The repository already exists. Would you like to open it instead?");
	        if (mb.open() == SWT.NO) {
	            mb.setMessage("Would you like to override the existing one?");
	            doCreate = mb.open() == SWT.YES;
	        } else {
	            doCreate = false;
	            doLoad = true;
	        }
	    }
	    var resource = temporarySet.createResource(modelPath);
	    if (doLoad) {
	        resource.load(Collections.emptyMap());
	    }
	    if (resource.getContents().isEmpty()) {
	        resource.getContents().add(LocalFactory.eINSTANCE.createLocalDirectoryRepository());
	    }
	    if (doCreate) {
	        resource.save(Collections.emptyMap());
	    }
	    
	    if (!doLoad && !doCreate) return Optional.empty();
	    
	    return Optional.of((LocalDirectoryRepository) resource.getContents().get(0));
	}

	@Override
	public Optional<IWizard> getFactoryWizard() {
		var page = new WorkspaceOrFileSystemLocationPage();
		page.setTitle("Create Local Directory Data Source");
		page.setDescription("Please select the folder where you would like to store the measurement data.");
		
		var wizard = OnePageStandardWizard.create(page, p -> this.path = p.getPath());
		return Optional.of(wizard);
	}


}
