package org.palladiosimulator.edp2.datastream.filter;

import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.metricspec.MetricDescription;

public abstract class AbstractFilter extends AbstractAdapter implements IFilter {

    public AbstractFilter(final IDataSource datasource, final MetricDescription metricDescription) {
        super(datasource, metricDescription);
        if (!canAccept(datasource)) {
            throw new IllegalArgumentException("Datasource metric does not match filter provided metric");
        }
    }

    public AbstractFilter(final MetricDescription metricDescription) {
        super(metricDescription);
    }

    /**
     * Determines whether this instance can handle the given data source.
     * 
     * @param dataSource
     *            The {@link IDataSource} to be processed by this instance.
     * @return {@code false} iff the metric of the given data source is incompatible, otherwise
     *         {@code true}.
     * @throws IllegalArgumentException
     *             In case {@code dataSource == null}.
     * @throws IllegalStateException
     *             In case this instance has not been initialized.
     * @see #isCompatibleWith(MetricDescription)
     */
    @Override
    public boolean canAccept(final IDataSource dataSource) {
        if (dataSource == null) {
            throw new IllegalArgumentException("Given data source must not be null.");
        }
        return this.isCompatibleWith(dataSource.getMetricDesciption());
    }

}
