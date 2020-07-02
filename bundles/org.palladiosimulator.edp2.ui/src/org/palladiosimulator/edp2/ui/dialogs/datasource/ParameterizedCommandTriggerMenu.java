package org.palladiosimulator.edp2.ui.dialogs.datasource;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.ParameterValuesException;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;

public class ParameterizedCommandTriggerMenu {
    private final Command command;
    private final IParameter cmdParam;

    public ParameterizedCommandTriggerMenu(final Command command) {
        this.command = command;

        try {
            var params = command.getParameters();
            if (params == null || params.length != 1) {
                throw new IllegalArgumentException("Only commands with exactly one parameter are supported");
            }
            cmdParam = command.getParameters()[0];
        } catch (NotDefinedException e) {
            throw new IllegalArgumentException("The Command is not properly defined.", e);
        }
    }

    public <ControlType extends Control> void registerWith(final ControlType parent,
            Consumer<SelectionListener> selectionListenerRegistrationFunc) {
        Menu menu = new Menu(parent);
        populateMenu(menu);
        parent.setMenu(menu);
        selectionListenerRegistrationFunc.accept(createMenuListener(menu, parent));
    }

    protected SelectionListener createMenuListener(final Menu menu, final Control parent) {
        return SelectionListener.widgetSelectedAdapter(c -> {
            Rectangle bounds = parent.getBounds();
            Point point = parent.getParent()
                .toDisplay(bounds.x, bounds.y + bounds.height);
            menu.setLocation(point);
            menu.setVisible(true);
        });
    }

    protected void populateMenu(final Menu menu) {
        retrieveOptions().forEach(option -> {
            MenuItem mntmNewItem = new MenuItem(menu, SWT.NONE);
            mntmNewItem.setText(option.toString());
            mntmNewItem.addSelectionListener(SelectionListener.widgetSelectedAdapter(c -> {
                var handlerService = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow()
                    .getService(IHandlerService.class);
                var parameters = Collections.singletonMap(cmdParam.getId(), option);
                var cmd = ParameterizedCommand.generateCommand(command, parameters);
                try {
                    handlerService.executeCommand(cmd, null);
                } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                    throw new RuntimeException(e);
                }
            }));
        });
    }

    @SuppressWarnings("unchecked")
    protected Collection<Object> retrieveOptions() {
        try {
            return cmdParam.getValues()
                .getParameterValues()
                .keySet();
        } catch (ParameterValuesException e) {
            throw new RuntimeException(e);
        }
    }

}
