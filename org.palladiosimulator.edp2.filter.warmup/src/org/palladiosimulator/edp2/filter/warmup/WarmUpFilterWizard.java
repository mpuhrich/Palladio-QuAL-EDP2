package org.palladiosimulator.edp2.filter.warmup;

import org.eclipse.jface.wizard.Wizard;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.filter.IFilter;
import org.palladiosimulator.edp2.visualization.wizards.FilterWizard;
import org.palladiosimulator.edp2.visualization.wizards.IFilterWizard;
import org.palladiosimulator.edp2.visualization.wizards.SelectFilterPage;

public class WarmUpFilterWizard extends Wizard implements IFilterWizard {

	private AbstractDataSource source;
	private WarmUpFilterPage filterPage;
	SelectFilterPage selectFilterPage;
    private IFilter filter;
	

	@Override
    public void addPages() {
        filterPage = new WarmUpFilterPage("Configure WarmUp Filter");
        addPage(filterPage);
    }

	@Override
	public IFilter getFilter() {
	    return this.filter;
	}

	@Override
	public String getWindowTitle() {
		
		return "WarmUp Filter";
	}

	@Override
	public void setSourceFromCaller(AbstractDataSource source, SelectFilterPage selectFilterPage) {
		this.source = source;
		this.selectFilterPage = selectFilterPage;
	}

	@Override
	public boolean performFinish() {
		FilterWizard wiz = (FilterWizard) selectFilterPage.getWizard();
		IFilter filter = getFilter();
		filter.setDataSource(source);
				wiz.setFilter(filter);
				wiz.setFinishable(true);
		
		// TODO Auto-generated method stub
		return true;
	}

    @Override
    public void setFilterFromCaller(IFilter filter) {
        this.filter = filter;
    }

    @Override
    public void setName(String string) {
    }

}
