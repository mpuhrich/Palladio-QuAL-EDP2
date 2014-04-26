/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalRatioStatistics;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Numerical Ratio Statistics</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericalRatioStatisticsTest extends NumericalIntervalStatisticsTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(NumericalRatioStatisticsTest.class);
    }

    /**
     * Constructs a new Numerical Ratio Statistics test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericalRatioStatisticsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Numerical Ratio Statistics test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected NumericalRatioStatistics getFixture() {
        return (NumericalRatioStatistics)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createNumericalRatioStatistics());
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

} //NumericalRatioStatisticsTest
