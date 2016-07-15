package org.palladiosimulator.edp2.visualization;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.palladiosimulator.edp2.datastream.filter.IFilter;
import org.palladiosimulator.edp2.visualization.properties.sections.EDP2PropertiesTable;

public class DefaultPropertiesPage extends WizardPage {

    private IFilter filter;

    public DefaultPropertiesPage(IFilter filter, String name) {
        super("Create " + name);
        this.filter = filter;        
    }

    @Override
    public void createControl(Composite parent) {
        EDP2PropertiesTable table = new EDP2PropertiesTable(parent);
        table.setLastSelection(filter.getConfiguration());
        this.setControl(parent);
    }

}
