package org.palladiosimulator.edp2.ui.dialogs.datasource;

import java.util.Optional;

import org.eclipse.jface.wizard.IWizard;

public interface FactoryWizardContribution<ElementType> {
	
	ElementType createElement();
	
	Optional<IWizard> getFactoryWizard();
	
}