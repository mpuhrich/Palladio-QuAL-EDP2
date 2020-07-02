package org.palladiosimulator.edp2.ui.wizards.binding;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

/**
 * Validator which checks that a provided value is not empty.
 *
 * @author groenda
 */
public class NotEmptyValidator implements IValidator<Object> {

    private final String label;

    public NotEmptyValidator(final String label) {
        this.label = label;
    }

    @Override
    public IStatus validate(final Object value) {
        if (value == null || value.toString().trim().length() == 0) {
            return ValidationStatus.error("Please enter a value for " + label + ".");
        }
        return ValidationStatus.ok();
    }
}
