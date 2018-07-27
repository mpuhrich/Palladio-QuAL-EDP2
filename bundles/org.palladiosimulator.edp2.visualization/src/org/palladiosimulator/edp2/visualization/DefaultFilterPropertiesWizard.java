package org.palladiosimulator.edp2.visualization;

import org.eclipse.jface.wizard.Wizard;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.filter.IFilter;
import org.palladiosimulator.edp2.visualization.wizards.FilterWizard;
import org.palladiosimulator.edp2.visualization.wizards.IFilterWizard;
import org.palladiosimulator.edp2.visualization.wizards.SelectFilterPage;

public class DefaultFilterPropertiesWizard extends Wizard implements IFilterWizard {

    private AbstractDataSource source;
    private SelectFilterPage selectFilterPage;
    private IFilter filter;
    private DefaultPropertiesPage propertiesPage;
    private String name;

    @Override
    public void addPages() {
        this.propertiesPage = new DefaultPropertiesPage(this.getFilter(), this.name);
        addPage(this.propertiesPage);
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    @Override
    public boolean performFinish() {
        FilterWizard wiz = (FilterWizard) selectFilterPage.getWizard();
        filter.setDataSource(source);
        wiz.setFilter(filter);
        wiz.setFinishable(true);
        return true;
    }

    @Override
    public IFilter getFilter() {
        return this.filter;
    }
    
    @Override
    public void setFilterFromCaller(IFilter filter) {
        this.filter = filter;
    }
    
    @Override
    public String getWindowTitle() {
        return this.name;
    }

    @Override
    public void setSourceFromCaller(AbstractDataSource source, SelectFilterPage selectFilterPage) {
        this.source = source;
        this.selectFilterPage = selectFilterPage;
    }

}
