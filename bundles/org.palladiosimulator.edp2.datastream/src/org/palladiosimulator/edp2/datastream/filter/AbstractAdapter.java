package org.palladiosimulator.edp2.datastream.filter;

import java.util.Iterator;

import org.palladiosimulator.edp2.datastream.AbstractDataSource;
import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.configurable.EmptyConfiguration;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.MetricDescription;

public abstract class AbstractAdapter extends AbstractDataSource implements IDataSink, IDataSource {

    private final class AdapterDataStream implements IDataStream<MeasuringValue> {

        private final class AdapterIterator implements Iterator<MeasuringValue> {

            private MeasuringValue next;
            private MeasuringValue nextNext;
            private int count = 0;

            private final Iterator<MeasuringValue> inputIterator;

            private AdapterIterator(final Iterator<MeasuringValue> inputIterator) {
                this.inputIterator = inputIterator;

                this.next = findNext();
                this.nextNext = findNext();
            }

            @Override
            public boolean hasNext() {
                return this.next != null;
            }

            @Override
            public MeasuringValue next() {
                final MeasuringValue measurement = AbstractAdapter.this.computeOutputFromInput(this.next);

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

            private MeasuringValue findNext() {
                MeasuringValue result = null;

                while (inputIterator.hasNext() && AbstractAdapter.this.shouldSkip(result = inputIterator.next())) {
                    ;
                }

                return inputIterator.hasNext() ? result : null;
            }
        }

        private int cachedSize = -1;

        private final IDataStream<MeasuringValue> inputDataStream;

        private AdapterDataStream(final IDataStream<MeasuringValue> inputDataStream) {
            this.inputDataStream = inputDataStream;
        }

        @Override
        public Iterator<MeasuringValue> iterator() {
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
                    for (final MeasuringValue measurement : this) {
                        this.cachedSize++;
                    }
                }
            }

            return this.cachedSize;
        }
    }

    private IDataSource datasource;

    public AbstractAdapter(final IDataSource datasource, final MetricDescription metricDescription) {
        super(metricDescription);
        this.datasource = datasource;
    }

    public AbstractAdapter(final MetricDescription metricDescription) {
        super(metricDescription);
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
    public IDataStream<MeasuringValue> getDataStream() {
        final IDataStream<MeasuringValue> inputDataStream = datasource.getDataStream();
        return new AdapterDataStream(inputDataStream);
    }

    protected boolean shouldSkip(final MeasuringValue next) {
        return false;
    }

    protected MeasuringValue computeOutputFromInput(final MeasuringValue next) {
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

    public void setDataSource(final IDataSource newDataSource) {
        this.datasource = newDataSource;
        this.datasourceChangedListener.getEventDispatcher().datasourceUpdated();
    }

}
