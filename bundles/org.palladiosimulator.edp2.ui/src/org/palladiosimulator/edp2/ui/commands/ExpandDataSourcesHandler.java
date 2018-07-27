package org.palladiosimulator.edp2.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.palladiosimulator.edp2.ui.views.navigator.Navigator;

/**
 * Command for opening the ExpandDataSourcesWizard.
 * 
 * @author Sebastian Lehrig
 */
public class ExpandDataSourcesHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        final IWorkbenchPart activeWorkbenchPart = HandlerUtil.getActivePart(event);

        if (activeWorkbenchPart instanceof Navigator) {
            final Navigator navigator = (Navigator) activeWorkbenchPart;
            navigator.expandTree();
        } else {
            throw new IllegalArgumentException("No Navigator found!");
        }

        return null;
    }
}
