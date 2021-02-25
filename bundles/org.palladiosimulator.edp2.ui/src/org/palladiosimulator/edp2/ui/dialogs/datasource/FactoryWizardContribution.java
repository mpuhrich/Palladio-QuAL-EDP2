package org.palladiosimulator.edp2.ui.dialogs.datasource;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Shell;

public interface FactoryWizardContribution<ElementType> {
	
	Optional<ElementType> createElement(Shell parent) throws IOException;
	
	Optional<IWizard> getFactoryWizard();
	
}