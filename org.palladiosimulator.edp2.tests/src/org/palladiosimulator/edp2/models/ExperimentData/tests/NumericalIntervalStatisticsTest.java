/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalIntervalStatistics;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Numerical Interval Statistics</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericalIntervalStatisticsTest extends NumericalOrdinalStatisticsTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(NumericalIntervalStatisticsTest.class);
    }

    /**
     * Constructs a new Numerical Interval Statistics test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericalIntervalStatisticsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Numerical Interval Statistics test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected NumericalIntervalStatistics getFixture() {
        return (NumericalIntervalStatistics)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createNumericalIntervalStatistics());
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

} //NumericalIntervalStatisticsTest
