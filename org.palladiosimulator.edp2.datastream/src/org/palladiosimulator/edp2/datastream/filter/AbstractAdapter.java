package org.palladiosimulator.edp2.datastream.filter;

import java.util.Iterator;

import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.configurable.EmptyConfiguration;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.measurementframework.Measurement;
import org.palladiosimulator.metricspec.MetricDescription;

public abstract class AbstractAdapter extends AbstractDataSource implements IDataSink, IDataSource {

    protected final IDataStream<Measurement> inputDataStream;
    private final IDataSource datasource;

    public AbstractAdapter(final IDataSource datasource, final MetricDescription metricDescription) {
        super(metricDescription);
        this.datasource = datasource;
        this.inputDataStream = datasource.getDataStream();
    }

    @Override
    public IDataSource getDataSource() {
        return datasource;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.datastream.IDataSource#getDataStream()
     */
    @Override
    public IDataStream<Measurement> getDataStream() {
        final Iterator<Measurement> inputIterator = this.inputDataStream.iterator();
        return new IDataStream<Measurement>() {

            @Override
            public Iterator<Measurement> iterator() {
                return new Iterator<Measurement>() {

                    @Override
                    public boolean hasNext() {
                        return inputIterator.hasNext();
                    }

                    @Override
                    public Measurement next() {
                        return AbstractAdapter.this.computeOutputFromInput(inputIterator.next());
                    }

                    @Override
                    public void remove() {
                    }
                };
            }

            @Override
            public MetricDescription getMetricDesciption() {
                return AbstractAdapter.this.getMetricDesciption();
            }

            @Override
            public boolean isCompatibleWith(final MetricDescription other) {
                return AbstractAdapter.this.isCompatibleWith(other);
            }

            @Override
            public void close() {
                inputDataStream.close();
            }

            @Override
            public int size() {
                return inputDataStream.size();
            }
        };
    }

    protected abstract Measurement computeOutputFromInput(Measurement next);

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.datastream.AbstractDataSource#createProperties()
     */
    @Override
    protected PropertyConfigurable createProperties() {
        return new EmptyConfiguration();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.datastream.IDataSource#getMeasuringPoint()
     */
    @Override
    public MeasuringPoint getMeasuringPoint() {
        return datasource.getMeasuringPoint();
    }

}
