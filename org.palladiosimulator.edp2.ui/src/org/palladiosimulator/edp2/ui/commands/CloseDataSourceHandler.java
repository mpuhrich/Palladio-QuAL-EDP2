package org.palladiosimulator.edp2.ui.commands;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.palladiosimulator.edp2.EDP2Plugin;
import org.palladiosimulator.edp2.impl.DataNotAccessibleException;
import org.palladiosimulator.edp2.impl.MeasurementsUtility;
import org.palladiosimulator.edp2.models.Repository.Repository;

/**
 * Command for opening the OpenDataSourceWizard.
 * 
 * @author groenda, Sebastian Lehrig
 */
public class CloseDataSourceHandler extends AbstractHandler implements IHandler {

    private static final String EDP2_NAVIGATOR_PART_ID = "org.palladiosimulator.edp2.ui.views.navigator";

    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        final IWorkbench wb = PlatformUI.getWorkbench();
        final IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
        final IWorkbenchPage page = win.getActivePage();
        final ISelection selection = page.getSelection(EDP2_NAVIGATOR_PART_ID);

        if (selection instanceof TreeSelection) {
            final TreeSelection treeSelection = (TreeSelection) selection;
            final Repository repo = (Repository) treeSelection.getFirstElement();
            try {
                MeasurementsUtility.ensureClosedRepository(repo);
                EDP2Plugin.INSTANCE.getRepositories().getAvailableRepositories().remove(repo);
            } catch (final DataNotAccessibleException e) {
                // TODO Auto-generated catch block
            }
        } else {
            // TODO Error message
        }
        return null;
    }
}
