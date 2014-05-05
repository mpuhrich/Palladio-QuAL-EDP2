package org.palladiosimulator.edp2.visualization.wizards;

import org.eclipse.jface.wizard.IWizard;
import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.filter.AbstractAdapter;

public interface IAdapterWizard extends IWizard {
	public AbstractAdapter getAdapter();
	public void setSourceFromCaller(AbstractDataSource source, SelectAdapterPage selectAdapterPage);
}
