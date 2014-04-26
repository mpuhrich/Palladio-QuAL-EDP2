/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.FixedWidthAggregatedMeasurements;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fixed Width Aggregated Measurements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FixedWidthAggregatedMeasurementsTest extends AggregatedMeasurementsTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(FixedWidthAggregatedMeasurementsTest.class);
    }

    /**
     * Constructs a new Fixed Width Aggregated Measurements test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FixedWidthAggregatedMeasurementsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Fixed Width Aggregated Measurements test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected FixedWidthAggregatedMeasurements getFixture() {
        return (FixedWidthAggregatedMeasurements)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createFixedWidthAggregatedMeasurements());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} //FixedWidthAggregatedMeasurementsTest
