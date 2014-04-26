/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.Edp2Measure;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edp2 Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Edp2MeasureTest extends IdentifiableTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(Edp2MeasureTest.class);
    }

    /**
     * Constructs a new Edp2 Measure test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Edp2MeasureTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Edp2 Measure test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Edp2Measure getFixture() {
        return (Edp2Measure)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createEdp2Measure());
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

} //Edp2MeasureTest
