package org.palladiosimulator.edp2.filter.warmup;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.MetricDescription;

public class PredicateFilterStream implements IDataStream<TupleMeasurement> {

	final IDataStream<TupleMeasurement> encapsulatedStream;
	final Predicate<? super TupleMeasurement> predicate;
	
	
	public PredicateFilterStream(IDataStream<TupleMeasurement> encapsulatedStream, Predicate<? super TupleMeasurement> predicate) {
		this.encapsulatedStream = encapsulatedStream;
		this.predicate = predicate;
	}

	@Override
	public Iterator<TupleMeasurement> iterator() {
		return StreamSupport.stream(encapsulatedStream.spliterator(), false).filter(predicate).iterator();
	}

	@Override
	public MetricDescription getMetricDesciption() {
		return encapsulatedStream.getMetricDesciption();
	}

	@Override
	public boolean isCompatibleWith(MetricDescription other) {
		return encapsulatedStream.isCompatibleWith(other);
	}

	@Override
	public void close() {
		encapsulatedStream.close();
	}

	@Override
	public int size() {
		return (int) StreamSupport.stream(encapsulatedStream.spliterator(), false).filter(predicate).count();
	}

}
