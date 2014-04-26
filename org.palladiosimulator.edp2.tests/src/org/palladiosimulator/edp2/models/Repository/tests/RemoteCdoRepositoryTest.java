/**
 */
package org.palladiosimulator.edp2.models.Repository.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.Repository.RemoteCdoRepository;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remote Cdo Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteCdoRepositoryTest extends RepositoryTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RemoteCdoRepositoryTest.class);
    }

    /**
     * Constructs a new Remote Cdo Repository test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoteCdoRepositoryTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Remote Cdo Repository test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected RemoteCdoRepository getFixture() {
        return (RemoteCdoRepository)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RepositoryFactory.eINSTANCE.createRemoteCdoRepository());
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

} //RemoteCdoRepositoryTest
