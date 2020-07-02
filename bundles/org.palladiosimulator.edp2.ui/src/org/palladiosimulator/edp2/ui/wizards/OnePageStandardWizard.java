package org.palladiosimulator.edp2.ui.wizards;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class OnePageStandardWizard<WizardPageType extends IWizardPage> extends Wizard {
	private final WizardPageType page;
	private final Function<WizardPageType, Boolean> finisher;

	public OnePageStandardWizard(WizardPageType page, Function<WizardPageType, Boolean> finisher) {
		this.page = Objects.requireNonNull(page);
		this.finisher = Objects.requireNonNull(finisher);
	}

	@Override
	public void addPages() {
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		return finisher.apply(page);
	}

	public static <PageType extends IWizardPage> OnePageStandardWizard<PageType> create(PageType page,
			Consumer<PageType> finisher) {
		var result = new OnePageStandardWizard<PageType>(page, p -> {
			finisher.accept(p);
			return true;
		});
		return result;
	}

}
 