package org.palladiosimulator.edp2.metricentity;

import org.palladiosimulator.edp2.models.ExperimentData.MetricDescription;

public interface IMetricEntity {

    /**
     * @return the metricDesciption
     */
    public MetricDescription getMetricDesciption();

    /**
     * @param other
     * @return
     */
    public boolean isCompatibleWith(MetricDescription other);

}