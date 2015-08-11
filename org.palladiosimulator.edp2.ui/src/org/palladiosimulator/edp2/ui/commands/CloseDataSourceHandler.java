package org.palladiosimulator.edp2.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.palladiosimulator.edp2.EDP2Plugin;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.models.Repository.Repository;
import org.palladiosimulator.edp2.ui.EDP2UIPlugin;
import org.palladiosimulator.edp2.util.MeasurementsUtility;

/**
 * Command for opening the OpenDataSourceWizard.
 *
 * @author groenda, Sebastian Lehrig
 */
public class CloseDataSourceHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);

        if (selection instanceof TreeSelection) {
            final TreeSelection treeSelection = (TreeSelection) selection;
            if (treeSelection.getFirstElement() instanceof Repository) {
                final Repository repo = (Repository) treeSelection.getFirstElement();
                try {
                    MeasurementsUtility.ensureClosedRepository(repo);
                    EDP2Plugin.INSTANCE.getRepositories().getAvailableRepositories().remove(repo);
                } catch (final DataNotAccessibleException e) {
                    // TODO Auto-generated catch block
                }
            } else {
                final Shell shell = EDP2UIPlugin.INSTANCE.getWorkbench().getActiveWorkbenchWindow().getShell();
                ErrorDialog.openError(
                        shell,
                        "Select Repository",
                        "Closing an EDP2 datasource failed.",
                        new Status(IStatus.ERROR, EDP2UIPlugin.PLUGIN_ID, "You need to select a EDP2 Repository to execute the close command"));
            }
        } else {
            // TODO Error message
        }
        return null;
    }
}
