package org.palladiosimulator.edp2.ui.wizards.binding;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.emf.common.util.URI;

public class StringToUriConverter implements IConverter<String, URI> {

	@Override
	public Object getFromType() {
		return String.class;
	}

	@Override
	public Object getToType() {
		return URI.class;
	}

	@Override
	public URI convert(String fromObject) {
		return URI.createURI(fromObject);
	}

}
