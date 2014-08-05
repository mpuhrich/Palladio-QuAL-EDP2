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

    private final class AdapterDataStream implements IDataStream<Measurement> {

        private final class AdapterIterator implements Iterator<Measurement> {

            private Measurement next;
            private Measurement nextNext;
            private int count = 0;

            private final Iterator<Measurement> inputIterator;

            private AdapterIterator(Iterator<Measurement> inputIterator) {
                this.inputIterator = inputIterator;

                this.next = findNext();
                this.nextNext = findNext();
            }

            @Override
            public boolean hasNext() {
                return this.next != null;
            }

            @Override
            public Measurement next() {
                final Measurement measurement = AbstractAdapter.this.computeOutputFromInput(this.next);

                if (!isCompatibleWith(measurement.getMetricDesciption())) {
                    throw new RuntimeException("Metric \"" + measurement.getMetricDesciption().getName()
                            + "\" is incompatible with expected output metric \""
                            + AbstractAdapter.this.getMetricDesciption().getName() + "\"");
                }

                this.next = this.nextNext;
                this.nextNext = findNext();

                count++;
                if (!hasNext()) {
                    AdapterDataStream.this.cachedSize = count;
                }
                return measurement;
            }

            @Override
            public void remove() {
            }

            private Measurement findNext() {
                Measurement result = null;

                while (inputIterator.hasNext() && AbstractAdapter.this.shouldSkip(result = inputIterator.next())) {
                    ;
                }

                return inputIterator.hasNext() ? result : null;
            }
        }

        private int cachedSize = -1;

        private final IDataStream<Measurement> inputDataStream;

        private AdapterDataStream(final IDataStream<Measurement> inputDataStream) {
            this.inputDataStream = inputDataStream;
        }

        @Override
        public Iterator<Measurement> iterator() {
            return new AdapterIterator(this.inputDataStream.iterator());
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
            if (this.cachedSize < 0) {

                this.cachedSize = 0;

                if (this.inputDataStream.size() != 0) {
                    for (final Measurement measurement : this) {
                        this.cachedSize++;
                    }
                }
            }

            return this.cachedSize;
        }
    }

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
        return new AdapterDataStream(this.inputDataStream);
    }

    protected boolean shouldSkip(Measurement next) {
        return false;
    }

    protected Measurement computeOutputFromInput(Measurement next) {
        return next;
    }

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
