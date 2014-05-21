package org.palladiosimulator.edp2.datastream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.palladiosimulator.measurementframework.BasicMeasurement;
import org.palladiosimulator.measurementframework.Measurement;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.MetricSetDescription;

public class DataTupleStream extends DataStream<TupleMeasurement> {

    private final List<BasicDataStream<?, ?>> childStreams;

    public DataTupleStream(final List<BasicDataStream<?, ?>> childLists, final MetricSetDescription metricSetDescription) {
        super(metricSetDescription);
        this.childStreams = Collections.unmodifiableList(childLists);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterator<TupleMeasurement> iterator() {
        final List<Iterator<BasicMeasurement<?, ?>>> subIterators = new ArrayList<Iterator<BasicMeasurement<?, ?>>>(
                childStreams.size());
        for (@SuppressWarnings("rawtypes")
        final BasicDataStream childList : childStreams) {
            subIterators.add(childList.iterator());
        }
        return new Iterator<TupleMeasurement>() {

            @Override
            public boolean hasNext() {
                for (final Iterator<BasicMeasurement<?, ?>> subIterator : subIterators) {
                    if (!subIterator.hasNext()) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public TupleMeasurement next() {
                final List<Measurement> result = new ArrayList<Measurement>(subIterators.size());
                for (final Iterator<BasicMeasurement<?, ?>> subIterator : subIterators) {
                    result.add(subIterator.next());
                }
                return new TupleMeasurement(result, (MetricSetDescription) DataTupleStream.this.getMetricDesciption());
            }

            @Override
            public void remove() {
                for (final Iterator<BasicMeasurement<?, ?>> subIterator : subIterators) {
                    subIterator.remove();
                }
            }
        };
    }

    @Override
    public void close() {
        for (final BasicDataStream<?, ?> childStream : childStreams) {
            childStream.close();
        }
    }

    @Override
    public int size() {
        return childStreams.get(0).size();
    }

}
