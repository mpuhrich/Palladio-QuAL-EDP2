package org.palladiosimulator.edp2.datastream.filter;

import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.metricspec.MetricDescription;

public abstract class AbstractFilter<M> extends AbstractAdapter {

    public AbstractFilter(final IDataSource datasource, final MetricDescription metricDescription) {
        super(datasource, metricDescription);
        if (!this.isCompatibleWith(datasource.getMetricDesciption())) {
            throw new IllegalArgumentException("Datasource metric does not match filter provided metric");
        }
    }

}
