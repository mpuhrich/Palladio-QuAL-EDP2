package org.palladiosimulator.edp2.ui.commands;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.handlers.HandlerUtil;
import org.palladiosimulator.edp2.EDP2Constants;
import org.palladiosimulator.edp2.EDP2Plugin;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.ui.dialogs.FileExtensionFilteringResourceDialog;

public class OpenDataSourceHandler extends AbstractHandler {
    public static final String COMMAND_ID = "org.palladiosimulator.edp2.ui.commands.OpenDataSource";

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        FileExtensionFilteringResourceDialog diag = new FileExtensionFilteringResourceDialog(HandlerUtil.getActiveShell(event), 
                "Select model file containing EDP2 Repository",
                SWT.OPEN | SWT.MULTI, EDP2Constants.EDP2_REPOSITORY_EXTENSION) {
            protected boolean processResources() {
                ResourceSet set = new ResourceSetImpl();
                getURIs().forEach(set::createResource);
                var repos = set.getResources().stream()
                    .peek(OpenDataSourceHandler::ensureLoadedResource)
                    .map(Resource::getContents)
                    .flatMap(Collection::stream)
                    .filter(RepositoryPackage.Literals.REPOSITORY::isInstance)
                    .map(Repository.class::cast)
                    .collect(Collectors.toList());
                if (repos.isEmpty()) {
                    var msgBox = new MessageBox(getShell(), SWT.OK | SWT.ICON_ERROR | SWT.APPLICATION_MODAL);
                    msgBox.setMessage("No EDP2 Repositories found in the selected models.");
                    msgBox.open();
                    return false;
                } else {
                    BasicDiagnostic resultComposite = new BasicDiagnostic();
                    repos.forEach(repo -> resultComposite.add(RepositoryManager.addRepository(EDP2Plugin.INSTANCE.getRepositories(), repo)));
                    if (resultComposite.getSeverity() > Diagnostic.OK) {
                        DiagnosticDialog.openProblem(HandlerUtil.getActiveShell(event), "", "", resultComposite);
                    }
                    return true;
                }
            }
        };
        diag.open();
        
        return null;
    }
    
    private static void ensureLoadedResource(Resource resource) {
        if (!resource.isLoaded()) {
            try {
                resource.load(Collections.emptyMap());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
