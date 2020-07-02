package org.palladiosimulator.edp2.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ToolItem;

public class AddDataSourceDropDownHandler extends AbstractHandler implements IHandler {
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		if (!(event.getTrigger() instanceof Event)) {
		    return null;
		}

		Event eventWidget = (Event)event.getTrigger();
		if (!(eventWidget.widget instanceof ToolItem)) {
		    return null;
		}

		ToolItem toolItem = (ToolItem)eventWidget.widget;

		// Creates fake selection event.
		Event newEvent = new Event();
		newEvent.button = 1;
		newEvent.widget = toolItem;
		newEvent.detail = SWT.ARROW;
		newEvent.x = toolItem.getBounds().x;
		newEvent.y = toolItem.getBounds().y + toolItem.getBounds().height;

		// Dispatches the event.
		toolItem.notifyListeners(SWT.Selection, newEvent);

		return null;	
	}
}
