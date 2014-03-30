package org.palladiosimulator.edp2.datastream.edp2source;

import javax.measure.quantity.Quantity;

import org.palladiosimulator.edp2.datastream.DataStream;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.metricentity.MetricEntity;
import org.palladiosimulator.edp2.models.ExperimentData.BaseMetricDescription;

public class Edp2BasicDataSource<V,Q extends Quantity> extends MetricEntity implements IDataSource {

    public Edp2BasicDataSource(final BaseMetricDescription metricDescription) {
        super(metricDescription);
    }

    @Override
    public <M extends DataStream<M>> IDataStream<M> getDataStream() {
        return new Edp2BasicDataStream<V,Q>(null, null);
    }


}
