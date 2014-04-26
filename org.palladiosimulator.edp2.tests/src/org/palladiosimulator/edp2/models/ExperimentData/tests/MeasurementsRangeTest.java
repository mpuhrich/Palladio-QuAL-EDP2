/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.MeasurementsRange;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measurements Range</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementsRangeTest extends PropertyableTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MeasurementsRangeTest.class);
    }

    /**
     * Constructs a new Measurements Range test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasurementsRangeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Measurements Range test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected MeasurementsRange getFixture() {
        return (MeasurementsRange)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createMeasurementsRange());
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

} //MeasurementsRangeTest
