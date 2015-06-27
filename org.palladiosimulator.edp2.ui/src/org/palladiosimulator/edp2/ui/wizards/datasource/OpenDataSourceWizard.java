package org.palladiosimulator.edp2.ui.wizards.datasource;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.palladiosimulator.edp2.EDP2Plugin;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;

/**
 * @author groenda, Sebastian Lehrig
 */
public class OpenDataSourceWizard extends Wizard {

    private DiscoverLocalDirectoryPage discoverLocalFilePage;
    private SelectDataSourceTypePage selectDataSourceTypePage;

    public OpenDataSourceWizard() {
        super();
    }

    @Override
    public void addPages() {
        this.selectDataSourceTypePage = new SelectDataSourceTypePage();
        addPage(this.selectDataSourceTypePage);
        this.discoverLocalFilePage = new DiscoverLocalDirectoryPage();
        addPage(this.discoverLocalFilePage);
    }

    @Override
    public String getWindowTitle() {
        return "Open EDP2 Data Source";
    }

    @Override
    public IWizardPage getNextPage(final IWizardPage page) {
        if (page == this.selectDataSourceTypePage) {
            if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.FILE_DATA_SOURCE)) {
                return this.discoverLocalFilePage;
            } else if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.IN_MEMORY_DATA_SOURCE)) {
                //return this.discoverLocalMemoryPage;
                return null;
            } else {
                // This line should never be reached. Otherwise there likely are unaccounted data
                // source types.
                assert (false);
            }
        }
        return null;
    }

    @Override
    public boolean canFinish() {
        if (this.selectDataSourceTypePage.isPageComplete()) {
            if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.FILE_DATA_SOURCE)) {
                if (this.discoverLocalFilePage.isPageComplete()) {
                    return true;
                }
            } else if (this.selectDataSourceTypePage.getSelection().equals(
                    SelectDataSourceTypePage.IN_MEMORY_DATA_SOURCE)) {
                return true;
            }
        }
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    @Override
    public boolean performFinish() {
        if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.FILE_DATA_SOURCE)) {
            RepositoryManager.addRepository(EDP2Plugin.INSTANCE.getRepositories(), discoverLocalFilePage.getRepositoryOnFinish());
        } else if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.IN_MEMORY_DATA_SOURCE)) {
            RepositoryManager.addRepository(EDP2Plugin.INSTANCE.getRepositories(), RepositoryFactory.eINSTANCE.createLocalMemoryRepository());
        } else {
            // This line should never be reached. Otherwise there likely are unaccounted data source
            // types.
            assert (false);
            return false;
        }
        return true;
    }

}
