/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataFactory;
import org.palladiosimulator.edp2.models.ExperimentData.TextualOrdinalStatistics;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Textual Ordinal Statistics</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualOrdinalStatisticsTest extends TextualNominalStatisticsTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(TextualOrdinalStatisticsTest.class);
    }

    /**
     * Constructs a new Textual Ordinal Statistics test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextualOrdinalStatisticsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Textual Ordinal Statistics test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected TextualOrdinalStatistics getFixture() {
        return (TextualOrdinalStatistics)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ExperimentDataFactory.eINSTANCE.createTextualOrdinalStatistics());
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

} //TextualOrdinalStatisticsTest
