package org.palladiosimulator.edp2.filter.warmup;

import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.configurable.DataSinkElementFactory;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationInputFactory;

public class WarmupFilterFactory extends DataSinkElementFactory {

    public static final String FACTORY_ID = WarmupFilterFactory.class.getCanonicalName();

    @Override
    protected IPropertyConfigurable createElementInternal(final IMemento memento) {
        return new WarmUpFilter();
    }

}
