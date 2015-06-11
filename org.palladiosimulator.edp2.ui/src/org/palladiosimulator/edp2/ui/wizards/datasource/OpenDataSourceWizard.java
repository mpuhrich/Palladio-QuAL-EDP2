package org.palladiosimulator.edp2.ui.wizards.datasource;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.palladiosimulator.edp2.EDP2Plugin;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.LocalDirectoryRepository;
import org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository;
import org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;

/**
 * @author groenda, Sebastian Lehrig
 */
public class OpenDataSourceWizard extends Wizard {

    private final LocalDirectoryRepository ldRepo;
    private final LocalMemoryRepository lmRepo;
    private final RemoteCdoRepository rcRepo;

    private DiscoverLocalDirectoryPage discoverLocalFilePage;
    private DiscoverLocalMemoryPage discoverLocalMemoryPage;
    private DiscoverRemotePage discoverRemotePage;
    private SelectDataSourceTypePage selectDataSourceTypePage;

    public OpenDataSourceWizard() {
        // Create empty list of storage nodes
        this.ldRepo = RepositoryFactory.eINSTANCE.createLocalDirectoryRepository();
        this.lmRepo = RepositoryFactory.eINSTANCE.createLocalMemoryRepository();
        this.rcRepo = RepositoryFactory.eINSTANCE.createRemoteCdoRepository();
    }

    @Override
    public void addPages() {
        // Select type of storage node and store it in the list of nodes
        this.selectDataSourceTypePage = new SelectDataSourceTypePage();
        addPage(this.selectDataSourceTypePage);
        this.discoverLocalFilePage = new DiscoverLocalDirectoryPage(this.ldRepo);
        addPage(this.discoverLocalFilePage);
        this.discoverLocalMemoryPage = new DiscoverLocalMemoryPage(this.lmRepo);
        addPage(this.discoverLocalMemoryPage);
        this.discoverRemotePage = new DiscoverRemotePage(this.rcRepo);
    }

    @Override
    public String getWindowTitle() {
        return "Open Data Source";
    }

    @Override
    public IWizardPage getNextPage(final IWizardPage page) {
        if (page == this.selectDataSourceTypePage) {
            // Initial Data Source Selection Page
            if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.NO_TYPE_SELECTED)) {
                return null;
            } else if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.FILE_DATA_SOURCE)) {
                return this.discoverLocalFilePage;
            } else if (this.selectDataSourceTypePage.getSelection().equals(
                    SelectDataSourceTypePage.IN_MEMORY_DATA_SOURCE)) {
                return this.discoverLocalMemoryPage;
            } else if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.REMOTE_DATA_SOURCE)) {
                return this.discoverRemotePage;
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
                if (this.discoverLocalMemoryPage.isPageComplete()) {
                    return true;
                }
            } else if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.REMOTE_DATA_SOURCE)) {
                if (this.discoverRemotePage.isPageComplete()) {
                    return true;
                }
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
        assert (!this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.NO_TYPE_SELECTED));

        if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.FILE_DATA_SOURCE)) {
            RepositoryManager.addRepository(EDP2Plugin.INSTANCE.getRepositories(), this.ldRepo);
        } else if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.IN_MEMORY_DATA_SOURCE)) {
            RepositoryManager.addRepository(EDP2Plugin.INSTANCE.getRepositories(), this.lmRepo);
        } else if (this.selectDataSourceTypePage.getSelection().equals(SelectDataSourceTypePage.REMOTE_DATA_SOURCE)) {
            RepositoryManager.addRepository(EDP2Plugin.INSTANCE.getRepositories(), this.rcRepo);
        } else {
            // This line should never be reached. Otherwise there likely are unaccounted data source
            // types.
            assert (false);
            return false;
        }
        return true;
    }

}
