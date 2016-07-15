package org.palladiosimulator.edp2.visualization.wizards;

import org.eclipse.jface.wizard.IWizard;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;
import org.palladiosimulator.edp2.datastream.filter.IFilter;

public interface IFilterWizard extends IWizard {
    public IFilter getFilter();

    public void setSourceFromCaller(AbstractDataSource source, SelectFilterPage selectFilterPage);
}
