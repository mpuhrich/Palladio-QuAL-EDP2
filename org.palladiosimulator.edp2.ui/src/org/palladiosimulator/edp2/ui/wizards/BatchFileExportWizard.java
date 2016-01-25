package org.palladiosimulator.edp2.ui.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.palladiosimulator.edp2.batchexport.BatchExporter;
import org.palladiosimulator.edp2.models.Repository.Repository;

public class BatchFileExportWizard extends Wizard {
    
    private final Repository exportedRepository;
    public BatchFileExportWizard(Repository exportedRepository) {
        this.exportedRepository = exportedRepository;
    }

    private TargetDirectoryPage selectTargetDirectoryPage;

    @Override
    public void addPages() {
        this.selectTargetDirectoryPage = new TargetDirectoryPage();
        addPage(this.selectTargetDirectoryPage);
    }
    
    @Override
    public String getWindowTitle() {
        return "Select Batch Export Target Folder";
    }
    
    @Override
    public boolean canFinish() {
        if(this.selectTargetDirectoryPage.isPageComplete()) {
            return true;
        }
        return false;
    }
    @Override
    public boolean performFinish() {
        BatchExporter.batchExport(exportedRepository, selectTargetDirectoryPage.getTargetDirectoryOnFinish());
        return true;
    }
}
