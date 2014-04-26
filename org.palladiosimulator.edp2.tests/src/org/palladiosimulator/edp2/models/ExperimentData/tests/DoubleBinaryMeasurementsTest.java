/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.DoubleBinaryMeasurements;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Double Binary Measurements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DoubleBinaryMeasurementsTest extends DataSeriesTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DoubleBinaryMeasurementsTest.class);
    }

    /**
     * Constructs a new Double Binary Measurements test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DoubleBinaryMeasurementsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Double Binary Measurements test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected DoubleBinaryMeasurements<?> getFixture() {
        return (DoubleBinaryMeasurements<?>)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createDoubleBinaryMeasurements());
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

} //DoubleBinaryMeasurementsTest
