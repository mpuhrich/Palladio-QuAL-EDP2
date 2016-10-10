package org.palladiosimulator.edp2.distancemetrics.tests;

import static org.junit.Assert.assertEquals;

import org.jscience.physics.amount.Amount;
import org.junit.Test;
import org.palladiosimulator.edp2.distancemetrics.DistanceMetric;
import org.palladiosimulator.edp2.distancemetrics.DynamicTimeWarping;
import org.palladiosimulator.edp2.distancemetrics.EditDistanceOnRealSequence;
import org.palladiosimulator.edp2.distancemetrics.EuclideanDistance;
import org.palladiosimulator.edp2.distancemetrics.util.Utility;

/**
 * This class is for test cases that must be valid for all distance metric algorithms.
 * 
 * @author Christian Schaf
 */
public class CommonTests {
	private final TestDataSource testDataSourceA = new TestDataSource(1, 100);
	private final TestDataSource testDataSourceB = new TestDataSource(2, 100);
	private final EditDistanceOnRealSequence edr = new EditDistanceOnRealSequence();
	private final DynamicTimeWarping dtw = new DynamicTimeWarping();
	private final EuclideanDistance ed = new EuclideanDistance();
	
	/**
	 * Tests if the result is equal to zero, if distance of two identical measurements is calculated.
	 * @param dm Distance Metric, that should be tested.
	 */
	public void identicalMeasurementTest(DistanceMetric dm) {
		Amount<?> result = dm.calculateDistance(testDataSourceA.getDataStream(), testDataSourceA.getDataStream());
		assertEquals(0.0, result.getEstimatedValue(), Utility.DELTA);
	}
	
	/**
	 * Instance of identicalMeasurementTest for DTW
	 */
	@Test
	public void identicalMeasurementDTWTest() {
		identicalMeasurementTest(dtw);
	}
	
	/**
	 * Instance of identicalMeasurementTest for EDR
	 */
	@Test
	public void identicalMeasurementEDRTest() {
		identicalMeasurementTest(edr);
	}
	
	/**
	 * Instance of identicalMeasurementTest for Eucliden Distance
	 */
	@Test
	public void identicalMeasurementEDTest() {
		identicalMeasurementTest(ed);
	}

	/**
	 * Tests if the result is identical if the measurements a and b have swapped.
	 * @param dm Distance Metric, that should be tested.
	 */
	private void swapMeasurementsTest(DistanceMetric dm) {
		Amount<?> amount1;
		Amount<?> amount2;
		amount1 = dm.calculateDistance(testDataSourceA.getDataStream(), testDataSourceB.getDataStream());
		amount2 = dm.calculateDistance(testDataSourceB.getDataStream(), testDataSourceA.getDataStream());
		Amount<?> result = amount1.minus(amount2);
		assertEquals(0.0, result.getEstimatedValue(), Utility.DELTA);
	}
	
	/**
	 * Instance of swapMeasurementsTest for DTW
	 */
	@Test
	public void swapMeasurementsDTWTest() {
		swapMeasurementsTest(dtw);
	}
	
	/**
	 * Instance of swapMeasurementsTest for EDR
	 */
	@Test
	public void swapMeasurementsEDRTest() {
		swapMeasurementsTest(edr);
	}
	
	/**
	 * Instance of swapMeasurementsTest for Eucliden Distance
	 */
	@Test
	public void swapMeasurementsEDTest() {
		swapMeasurementsTest(ed);
	}
}
