/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.Descriptions;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Descriptions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionsTest extends IdentifiableTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DescriptionsTest.class);
    }

    /**
     * Constructs a new Descriptions test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DescriptionsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Descriptions test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Descriptions getFixture() {
        return (Descriptions)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createDescriptions());
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

} //DescriptionsTest
