package org.palladiosimulator.edp2.ui.dialogs.datasource;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.IParameterValues;
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
    private final Optional<IParameter> cmdParam;
    private Runnable commandExecutedCallback;
    private String itemTemplate = "%s";

    public ParameterizedCommandTriggerMenu(final Command command) {
        this.command = command;
        try {
            var params = command.getParameters();
            if (params != null) {
                if (params.length > 1) {
                    throw new IllegalArgumentException("Only commands with at most one parameter are supported");
                } else if (params.length == 1) {
                    cmdParam = Optional.of(command.getParameters()[0]);
                } else {
                    cmdParam = Optional.empty();
                }
            } else {
                cmdParam = Optional.empty();
            }
        } catch (NotDefinedException e) {
            throw new IllegalArgumentException("The Command is not properly defined.", e);
        }
        
    }

    public <ControlType extends Control> void registerWith(final ControlType parent,
            Consumer<SelectionListener> selectionListenerRegistrationFunc) {
        Menu menu = new Menu(parent);
        populateMenu(menu);
        parent.setMenu(menu);
        if (cmdParam.isEmpty()) {
            selectionListenerRegistrationFunc.accept(createExecuteCommandListener(Optional.empty()));
        } else {
            selectionListenerRegistrationFunc.accept(createMenuListener(menu, parent));
        }
    }

    public void setCommandExecutedCallback(Runnable callback) {
        commandExecutedCallback = callback;
    }
    
    public void setItemTemplate(String template) {
        this.itemTemplate = template;
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
            mntmNewItem.setText(String.format(itemTemplate, option.toString()));
            mntmNewItem.addSelectionListener(createExecuteCommandListener(Optional.of(option)));
        });
    }

    protected SelectionListener createExecuteCommandListener(Optional<Object> parameterValue) {
        return SelectionListener.widgetSelectedAdapter(c -> {
            var handlerService = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow()
                .getService(IHandlerService.class);
            var cmd = parameterValue.map(option -> {
                var parameters = Collections.singletonMap(cmdParam.get()
                    .getId(), option);
                return ParameterizedCommand.generateCommand(command, parameters);
            });
            try {
                if (cmd.isPresent()) {
                    handlerService.executeCommand(cmd.get(), null);
                } else {
                    handlerService.executeCommand(command.getId(), null);
                }

            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                throw new RuntimeException(e);
            }
            if (commandExecutedCallback != null) {
                commandExecutedCallback.run();
            }
        });
    }

    @SuppressWarnings("unchecked")
    protected Collection<Object> retrieveOptions() {
        return cmdParam.map(param -> {
            try {
                return param.getValues();
            } catch (ParameterValuesException e) {
                throw new RuntimeException(e);
            }
        })
            .map(IParameterValues::getParameterValues)
            .map(Map::keySet)
            .orElseGet(() -> Collections.emptySet());
    }

}
