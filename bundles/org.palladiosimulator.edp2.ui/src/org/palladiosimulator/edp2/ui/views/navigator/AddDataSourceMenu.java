package org.palladiosimulator.edp2.ui.views.navigator;

import java.util.Collections;
import java.util.Set;

import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.ParameterValuesException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.jface.resource.ResourceLocator;
import org.eclipse.swt.SWT;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;
import org.palladiosimulator.edp2.ui.EDP2UIPlugin;
import org.palladiosimulator.edp2.ui.commands.AddDataSourceHandler;

public class AddDataSourceMenu extends ExtensionContributionFactory {

	@Override
	public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {
	    var cmdService = serviceLocator.getService(ICommandService.class);
	    var cmd = cmdService.getCommand("org.palladiosimulator.edp2.ui.commands.OpenDataSource");
	    
	    IParameter dsTypeParam; 
	    Set<Object> dsTypes;
	    try {
	        dsTypeParam = cmd.getParameter(AddDataSourceHandler.DATASOURCE_TYPE);
	        dsTypes = dsTypeParam.getValues().getParameterValues().keySet();
	    } catch (NotDefinedException | ParameterValuesException e) {
            throw new RuntimeException(e);
        }
	    
		for (var dsType : dsTypes) {
			final CommandContributionItemParameter p = new CommandContributionItemParameter(serviceLocator, null,
			        cmd.getId(), SWT.PUSH);
			p.label = "Add " + dsType.toString();
			p.parameters = Collections.singletonMap(dsTypeParam.getId(), dsType.toString());
			ResourceLocator.imageDescriptorFromBundle(EDP2UIPlugin.class, "icons/add_datasource.gif")
					.ifPresent(image -> p.icon = image);

			CommandContributionItem item = new CommandContributionItem(p);
			item.setVisible(true);
			additions.addContributionItem(item, null);
		}

	}

}
