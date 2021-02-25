package org.palladiosimulator.edp2.ui.commands;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IParameterValues;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;
import org.palladiosimulator.edp2.EDP2Plugin;
import org.palladiosimulator.edp2.impl.RepositoryManager;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.ui.EDP2UIPlugin;
import org.palladiosimulator.edp2.ui.dialogs.datasource.FactoryWizardContribution;

/**
 * Command for opening the OpenDataSourceWizard.
 * 
 * @author groenda, Sebastian Lehrig
 */
public class AddDataSourceHandler extends AbstractHandler implements IHandler, IParameterValues {
    public static final String COMMAND_ID = "org.palladiosimulator.edp2.ui.commands.AddDataSource";
	public static final String DATASOURCE_TYPE = "org.palladiosimulator.edp2.ui.commands.AddDataSource.datasourcetype";

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		var datasourceName = event.getParameter(DATASOURCE_TYPE);
		
		@SuppressWarnings("unchecked")
        var ext = (FactoryWizardContribution<Repository>) ExtensionHelper.getExecutableExtension(
				EDP2UIPlugin.CREATE_DATASOURCE_WIZARD_EXTENSIONPOINT_ID,
				EDP2UIPlugin.CREATE_DATASOURCE_WIZARD_EXTENSION_ELEMENT,
				EDP2UIPlugin.CREATE_DATASOURCE_WIZARD_CLASS_ATTRIBUTE,
				EDP2UIPlugin.CREATE_DATASOURCE_WIZARD_NAME_ATTRIBUTE, datasourceName,
				FactoryWizardContribution.class);
		
		var wizard = ext.getFactoryWizard();
		if (wizard.isEmpty()
				|| (new WizardDialog(HandlerUtil.getActiveShell(event), wizard.get()).open() == Dialog.OK)) {
		    Optional<Repository> repo;
            try {
                repo = ext.createElement(HandlerUtil.getActiveShell(event));
            } catch (IOException e) {
                throw new ExecutionException("An error occured during command execution.", e);
            }
            repo.ifPresent(r -> {
                var diag = RepositoryManager.addRepository(EDP2Plugin.INSTANCE.getRepositories(), r);
                if (diag.getSeverity() > Diagnostic.OK) {
                    DiagnosticDialog.openProblem(HandlerUtil.getActiveShell(event), "", "", diag);
                }
            });
		}
		return null;
	}

	@Override
	public Map getParameterValues() {
		return ExtensionHelper.getAttributes(EDP2UIPlugin.CREATE_DATASOURCE_WIZARD_EXTENSIONPOINT_ID,
				EDP2UIPlugin.CREATE_DATASOURCE_WIZARD_EXTENSION_ELEMENT,
				EDP2UIPlugin.CREATE_DATASOURCE_WIZARD_NAME_ATTRIBUTE).stream().collect(Collectors.toMap(name -> name, 
						name -> name));
	}
}
