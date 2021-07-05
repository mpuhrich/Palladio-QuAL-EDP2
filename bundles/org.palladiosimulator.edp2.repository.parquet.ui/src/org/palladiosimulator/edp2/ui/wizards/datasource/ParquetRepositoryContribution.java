package org.palladiosimulator.edp2.ui.wizards.datasource;

import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Shell;
import org.palladiosimulator.edp2.EDP2Constants;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.repository.parquet.ParquetFactory;
import org.palladiosimulator.edp2.repository.parquet.ParquetRepository;
import org.palladiosimulator.edp2.ui.dialogs.datasource.FactoryWizardContribution;
import org.palladiosimulator.edp2.ui.wizards.OnePageStandardWizard;
import org.palladiosimulator.edp2.ui.wizards.WorkspaceOrFileSystemLocationPage;

public class ParquetRepositoryContribution implements FactoryWizardContribution<Repository> {

    private URI path;

    @Override
    public Optional<Repository> createElement(final Shell parent) throws IOException {
        final var resourceSet = new ResourceSetImpl();
        final var repositoryUri = path.appendSegment("repository." + EDP2Constants.EDP2_REPOSITORY_EXTENSION);
        final var resource = resourceSet.createResource(repositoryUri);
        resource.getContents().add(ParquetFactory.eINSTANCE.createParquetRepository());
        resource.save(Collections.EMPTY_MAP);
        return Optional.of((ParquetRepository) resource.getContents().get(0));
    }

    @Override
    public Optional<IWizard> getFactoryWizard() {
        final var page = new WorkspaceOrFileSystemLocationPage();
        page.setTitle("Create Parquet Repository Data Source");
        page.setDescription("Please select the folder where you would like to store the measurement data.");

        final var wizard = OnePageStandardWizard.create(page, p -> this.path = p.getPath());
        return Optional.of(wizard);
    }

}
