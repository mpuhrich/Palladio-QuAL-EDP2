package org.palladiosimulator.edp2.datastream.filter;

import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.metricspec.MetricDescription;

public abstract class AbstractFilter extends AbstractAdapter {

    public AbstractFilter(final IDataSource datasource, final MetricDescription metricDescription) {
        super(datasource, metricDescription);
        if (!canAccept(datasource)) {
            throw new IllegalArgumentException("Datasource metric does not match filter provided metric");
        }
    }

    public AbstractFilter(final MetricDescription metricDescription) {
        super(metricDescription);
    }

    @Override
    public boolean canAccept(final IDataSource dataSource) {
        return this.isCompatibleWith(getDataSource().getMetricDesciption());
    }

}
