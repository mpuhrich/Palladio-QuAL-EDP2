package org.palladiosimulator.edp2.visualization.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;
import org.palladiosimulator.metricspec.util.MetricSpecSwitch;

public class DefaultUnitSwitch extends MetricSpecSwitch<String> {

    /**
     * Logger for this class.
     */
    private final static Logger logger = Logger
            .getLogger(DefaultUnitSwitch.class.getSimpleName());

    private final MetricDescription metric;

    public DefaultUnitSwitch(final MetricDescription metric) {
        this.metric = metric;
    }

    @Override
    public String caseNumericalBaseMetricDescription(
            final NumericalBaseMetricDescription object) {
        return ((NumericalBaseMetricDescription)metric).getDefaultUnit().toString();
    }

    @Override
    public String caseTextualBaseMetricDescription(
            final TextualBaseMetricDescription object) {
        return ((TextualBaseMetricDescription)metric).getIdentifiers().get(0).toString();
    }

    @Override
    public String caseBaseMetricDescription(final BaseMetricDescription object) {
        logger.log(
                Level.SEVERE,
                "Unsupported Base Metric: the selected measurements could not be opened, because it is neither described by a TextualBaseMetricDescription nor a NumericalBaseMetricDescription.");
        throw new RuntimeException("Unsupported Base Metric.");
    }
}
