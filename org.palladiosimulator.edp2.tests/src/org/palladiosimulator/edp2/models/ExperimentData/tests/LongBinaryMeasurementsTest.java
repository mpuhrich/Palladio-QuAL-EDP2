/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.LongBinaryMeasurements;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Long Binary Measurements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LongBinaryMeasurementsTest extends DataSeriesTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(LongBinaryMeasurementsTest.class);
    }

    /**
     * Constructs a new Long Binary Measurements test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LongBinaryMeasurementsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Long Binary Measurements test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected LongBinaryMeasurements getFixture() {
        return (LongBinaryMeasurements)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createLongBinaryMeasurements());
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

} //LongBinaryMeasurementsTest
