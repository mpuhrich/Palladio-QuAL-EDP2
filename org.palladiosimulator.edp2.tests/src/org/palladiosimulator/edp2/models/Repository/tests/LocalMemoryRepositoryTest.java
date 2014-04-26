/**
 */
package org.palladiosimulator.edp2.models.Repository.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local Memory Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalMemoryRepositoryTest extends RepositoryTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(LocalMemoryRepositoryTest.class);
    }

    /**
     * Constructs a new Local Memory Repository test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalMemoryRepositoryTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Local Memory Repository test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected LocalMemoryRepository getFixture() {
        return (LocalMemoryRepository)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RepositoryFactory.eINSTANCE.createLocalMemoryRepository());
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

} //LocalMemoryRepositoryTest
