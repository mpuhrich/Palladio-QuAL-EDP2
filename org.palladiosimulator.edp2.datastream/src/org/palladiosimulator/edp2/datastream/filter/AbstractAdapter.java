package org.palladiosimulator.edp2.datastream.filter;

import org.palladiosimulator.edp2.datastream.DataStream;
import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.metricentity.MetricEntity;
import org.palladiosimulator.edp2.models.ExperimentData.MetricDescription;

public abstract class AbstractAdapter<InputType extends DataStream<InputType>,OutputType extends DataStream<OutputType>>
extends MetricEntity implements IDataSink, IDataSource
{

    protected final IDataStream<InputType> dataStream;
    private final IDataSource datasource;

    public AbstractAdapter(final IDataSource datasource, final MetricDescription metricDescription) {
        super(metricDescription);
        this.datasource = datasource;
        this.dataStream = datasource.getDataStream();
    }

    @Override
    public IDataSource getDataSource() {
        return datasource;
    }

}
