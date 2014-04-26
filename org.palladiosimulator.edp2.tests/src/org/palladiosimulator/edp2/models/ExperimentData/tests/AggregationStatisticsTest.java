/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.AggregationStatistics;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aggregation Statistics</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregationStatisticsTest extends IdentifiableTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AggregationStatisticsTest.class);
    }

    /**
     * Constructs a new Aggregation Statistics test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AggregationStatisticsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Aggregation Statistics test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected AggregationStatistics getFixture() {
        return (AggregationStatistics)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createAggregationStatistics());
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

} //AggregationStatisticsTest
