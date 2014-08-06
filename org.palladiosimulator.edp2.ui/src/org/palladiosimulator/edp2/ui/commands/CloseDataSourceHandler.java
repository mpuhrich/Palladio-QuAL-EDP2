package org.palladiosimulator.edp2.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.palladiosimulator.edp2.EDP2Plugin;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.models.Repository.Repository;
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
