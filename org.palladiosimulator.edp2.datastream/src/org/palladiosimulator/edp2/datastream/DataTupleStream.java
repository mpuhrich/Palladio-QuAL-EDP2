package org.palladiosimulator.edp2.datastream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.palladiosimulator.measurementspec.Measurement;
import org.palladiosimulator.measurementspec.MeasurementTupple;
import org.palladiosimulator.metricspec.MetricSetDescription;

public class DataTupleStream extends DataStream<MeasurementTupple> {

    private final List<BasicDataStream<?,?>> childStreams;

    public DataTupleStream(final List<BasicDataStream<?,?>> childLists, final MetricSetDescription metricSetDescription) {
        super(metricSetDescription);
        this.childStreams = Collections.unmodifiableList(childLists);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterator<MeasurementTupple> iterator() {
        final List<Iterator<Measurement>> subIterators = new ArrayList<Iterator<Measurement>>(childStreams.size());
        for (@SuppressWarnings("rawtypes") final BasicDataStream childList : childStreams) {
            subIterators.add(childList.iterator());
        }
        return new Iterator<MeasurementTupple>() {

            @Override
            public boolean hasNext() {
                for (final Iterator<Measurement> subIterator : subIterators) {
                    if (!subIterator.hasNext()) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public MeasurementTupple next() {
                final List<Measurement> result = new ArrayList<Measurement>(subIterators.size());
                for (final Iterator<Measurement> subIterator : subIterators) {
                    result.add(subIterator.next());
                }
                return new MeasurementTupple(result,(MetricSetDescription) DataTupleStream.this.getMetricDesciption());
            }

            @Override
            public void remove() {
                for (final Iterator<Measurement> subIterator : subIterators) {
                    subIterator.remove();
                }
            }
        };
    }

    @Override
    public void close() {
        for (final BasicDataStream<?,?> childStream : childStreams) {
            childStream.close();
        }
    }

}
