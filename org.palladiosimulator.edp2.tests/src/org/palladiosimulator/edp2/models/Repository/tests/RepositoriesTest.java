/**
 */
package org.palladiosimulator.edp2.models.Repository.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.palladiosimulator.edp2.models.Repository.Repositories;
import org.palladiosimulator.edp2.models.Repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Repositories</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoriesTest extends TestCase {

    /**
     * The fixture for this Repositories test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Repositories fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RepositoriesTest.class);
    }

    /**
     * Constructs a new Repositories test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RepositoriesTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Repositories test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Repositories fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Repositories test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Repositories getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RepositoryFactory.eINSTANCE.createRepositories());
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

} //RepositoriesTest
