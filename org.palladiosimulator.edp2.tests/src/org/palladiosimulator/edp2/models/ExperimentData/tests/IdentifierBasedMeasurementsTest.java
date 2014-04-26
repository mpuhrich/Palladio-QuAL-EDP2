/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.IdentifierBasedMeasurements;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Identifier Based Measurements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifierBasedMeasurementsTest extends DataSeriesTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(IdentifierBasedMeasurementsTest.class);
    }

    /**
     * Constructs a new Identifier Based Measurements test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentifierBasedMeasurementsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Identifier Based Measurements test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected IdentifierBasedMeasurements getFixture() {
        return (IdentifierBasedMeasurements)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createIdentifierBasedMeasurements());
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

} //IdentifierBasedMeasurementsTest
