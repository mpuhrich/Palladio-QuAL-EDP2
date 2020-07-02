package org.palladiosimulator.edp2.ui.wizards.binding;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.common.util.URI;

/**
 * Validator which checks if that the content of a field points to a directory
 * within the local file system.
 *
 * @author groenda
 */
public class UriPointsToLocalDirectoryValidator implements IValidator<URI> {
	/**
	 * Name/Identifier of the field containing the validated data. Used to refer to
	 * the field in the messages.
	 */
	private final String label;

	public UriPointsToLocalDirectoryValidator(final String label) {
		this.label = label;
	}

	@Override
	public IStatus validate(final URI value) {
		Path path;
		try {
			var uri = new java.net.URI(value.toString());
			var fileUrl = FileLocator.toFileURL(uri.toURL());
			path = Paths.get(URIUtil.toURI(fileUrl));
		} catch (IOException | URISyntaxException e) {
			return ValidationStatus
					.error(String.format("The value entered in %s is not valid: %s", label, e.getMessage()));
		}

		if (Files.notExists(path) || !Files.isDirectory(path)) {
			return ValidationStatus.error("The value entered in " + label + " is not a valid directory.");
		}
		return ValidationStatus.ok();
	}

}