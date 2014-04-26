/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalOrdinalStatistics;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Numerical Ordinal Statistics</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericalOrdinalStatisticsTest extends NumericalNominalStatisticsTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(NumericalOrdinalStatisticsTest.class);
    }

    /**
     * Constructs a new Numerical Ordinal Statistics test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericalOrdinalStatisticsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Numerical Ordinal Statistics test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected NumericalOrdinalStatistics getFixture() {
        return (NumericalOrdinalStatistics)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createNumericalOrdinalStatistics());
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

} //NumericalOrdinalStatisticsTest
