package org.palladiosimulator.edp2.visualization.wizards;

import org.eclipse.jface.wizard.IWizard;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;

public interface IFilterWizard extends IWizard {
	public AbstractFilter getFilter();
	public void setSourceFromCaller(AbstractDataSource source, SelectFilterPage selectFilterPage);
}
