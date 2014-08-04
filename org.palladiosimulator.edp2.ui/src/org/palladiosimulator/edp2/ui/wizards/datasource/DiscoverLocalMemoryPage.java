package org.palladiosimulator.edp2.ui.wizards.datasource;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository;

/**
 * Wizard page to discover and select a local memory repository.
 * 
 * @author groenda, Sebastian Lehrig
 */
public class DiscoverLocalMemoryPage extends WizardPage {

    private final LocalMemoryRepository localMemoryRepository;

    protected DiscoverLocalMemoryPage(LocalMemoryRepository localMemoryRepository) {
        super("wizardPage");
        this.localMemoryRepository = localMemoryRepository;

        setTitle("Discover Local Memory Data Source");
        setDescription("Please select the data source you want to open.");

        setPageComplete(true);
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        setControl(container);
    }

}
