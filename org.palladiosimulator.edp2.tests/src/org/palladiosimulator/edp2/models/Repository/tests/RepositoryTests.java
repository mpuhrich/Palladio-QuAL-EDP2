/**
 */
package org.palladiosimulator.edp2.models.Repository.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Repository</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryTests extends TestSuite {

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
        TestSuite suite = new RepositoryTests("Repository Tests");
        suite.addTestSuite(LocalDirectoryRepositoryTest.class);
        suite.addTestSuite(LocalMemoryRepositoryTest.class);
        suite.addTestSuite(RemoteCdoRepositoryTest.class);
        suite.addTestSuite(LocalSensorFrameworkRepositoryTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepositoryTests(String name) {
        super(name);
    }

} //RepositoryTests
