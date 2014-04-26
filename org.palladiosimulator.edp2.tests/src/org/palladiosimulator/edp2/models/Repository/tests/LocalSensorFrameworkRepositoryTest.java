/**
 */
package org.palladiosimulator.edp2.models.Repository.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.Repository.LocalSensorFrameworkRepository;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local Sensor Framework Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalSensorFrameworkRepositoryTest extends RepositoryTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(LocalSensorFrameworkRepositoryTest.class);
    }

    /**
     * Constructs a new Local Sensor Framework Repository test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSensorFrameworkRepositoryTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Local Sensor Framework Repository test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected LocalSensorFrameworkRepository getFixture() {
        return (LocalSensorFrameworkRepository)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RepositoryFactory.eINSTANCE.createLocalSensorFrameworkRepository());
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

} //LocalSensorFrameworkRepositoryTest
