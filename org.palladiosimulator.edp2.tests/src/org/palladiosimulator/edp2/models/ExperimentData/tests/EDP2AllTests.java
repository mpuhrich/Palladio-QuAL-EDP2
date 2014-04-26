/**
 */
package org.palladiosimulator.edp2.models.ExperimentData.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.Repository.tests.RepositoryTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>EDP2</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class EDP2AllTests extends TestSuite {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Test suite() {
        TestSuite suite = new EDP2AllTests("EDP2 Tests");
        suite.addTest(RepositoryTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDP2AllTests(String name) {
        super(name);
    }

} //EDP2AllTests
