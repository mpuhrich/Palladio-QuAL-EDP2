package org.palladiosimulator.edp2.visualization.jfreechart.input.serviceLevelObjective;

import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationInputFactory;

/**
 * @author Andreas Flohre
 *
 */
public class SLOQualitativePlotInputFactory extends
		JFreeChartVisualizationInputFactory {

	public static final String FACTORY_ID = SLOQualitativePlotInputFactory.class
			.getCanonicalName();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.palladiosimulator.edp2.datastream.configurable.
	 * PropertyConfigurableElementFactory
	 * #createElementInternal(org.eclipse.ui.IMemento)
	 */
	@Override
	protected IPropertyConfigurable createElementInternal(IMemento arg0) {
		return new SLOQualitativePlotInput();
	}

}
