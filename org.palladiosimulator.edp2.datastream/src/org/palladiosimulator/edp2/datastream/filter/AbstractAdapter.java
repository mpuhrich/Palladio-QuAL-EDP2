package org.palladiosimulator.edp2.datastream.filter;

import java.util.Iterator;

import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.metricentity.MetricEntity;
import org.palladiosimulator.edp2.models.ExperimentData.MetricDescription;

public abstract class AbstractAdapter<InputType,OutputType>
extends MetricEntity
implements IDataSink, IDataSource
{

    protected final IDataStream<InputType> inputDataStream;
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

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.datastream.IDataSource#getDataStream()
     */
    @Override
    public <OutputType> IDataStream<OutputType> getDataStream() {
        final Iterator<InputType> inputIterator = this.inputDataStream.iterator();
        return new IDataStream<OutputType>() {

            @Override
            public Iterator<OutputType> iterator() {
                return new Iterator<OutputType>() {

                    @Override
                    public boolean hasNext() {
                        return inputIterator.hasNext();
                    }

                    @Override
                    public OutputType next() {
                        return (OutputType) AbstractAdapter.this.computeOutputFromInput(inputIterator.next());
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
        };
    }

    protected abstract OutputType computeOutputFromInput(InputType next);

}
