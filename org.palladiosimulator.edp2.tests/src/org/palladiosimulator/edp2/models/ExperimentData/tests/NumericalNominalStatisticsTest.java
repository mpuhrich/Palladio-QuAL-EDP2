/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.NumericalNominalStatistics;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Numerical Nominal Statistics</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericalNominalStatisticsTest extends IdentifiableTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(NumericalNominalStatisticsTest.class);
    }

    /**
     * Constructs a new Numerical Nominal Statistics test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericalNominalStatisticsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Numerical Nominal Statistics test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected NumericalNominalStatistics getFixture() {
        return (NumericalNominalStatistics)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createNumericalNominalStatistics());
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

} //NumericalNominalStatisticsTest
