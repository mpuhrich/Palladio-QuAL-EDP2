/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.edp2.models.Repository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.edp2.dao.MeasurementsDaoFactory;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;
import org.palladiosimulator.edp2.dao.impl.MetaDaoImpl;
import org.palladiosimulator.edp2.dao.memory.impl.MemoryMeasurementsDaoFactory;
import org.palladiosimulator.edp2.models.Repository.LocalMemoryRepository;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Local Memory Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.edp2.models.Repository.impl.LocalMemoryRepositoryImpl#getDomain
 * <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalMemoryRepositoryImpl extends RepositoryImpl implements LocalMemoryRepository {

    /**
     * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDomain()
     * @generated
     * @ordered
     */
    protected static final String DOMAIN_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    protected LocalMemoryRepositoryImpl() {
        super();
        this.metaDao = new MetaDaoImpl() {

            private final MeasurementsDaoFactory daoFactory = new MemoryMeasurementsDaoFactory();

            @Override
            public void flush() {
            }

            /*
             * (non-Javadoc)
             * 
             * @see org.palladiosimulator.edp2.dao.impl.Edp2DaoImpl#open()
             */
            @Override
            public synchronized void open() throws DataNotAccessibleException {
                super.open();
                this.setOpen();
            }

            /*
             * (non-Javadoc)
             * 
             * @see org.palladiosimulator.edp2.dao.impl.Edp2DaoImpl#close()
             */
            @Override
            public synchronized void close() throws DataNotAccessibleException {
                super.close();
                this.setClosed();
            }

            /*
             * (non-Javadoc)
             * 
             * @see org.palladiosimulator.edp2.dao.impl.MetaDaoImpl#getMeasurementsDaoFactory()
             */
            @Override
            public MeasurementsDaoFactory getMeasurementsDaoFactory() {
                super.getMeasurementsDaoFactory();
                return this.daoFactory;
            }

        };
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RepositoryPackage.Literals.LOCAL_MEMORY_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDomain() {
        return (String) this.eDynamicGet(RepositoryPackage.LOCAL_MEMORY_REPOSITORY__DOMAIN,
                RepositoryPackage.Literals.LOCAL_MEMORY_REPOSITORY__DOMAIN, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDomain(final String newDomain) {
        this.eDynamicSet(RepositoryPackage.LOCAL_MEMORY_REPOSITORY__DOMAIN,
                RepositoryPackage.Literals.LOCAL_MEMORY_REPOSITORY__DOMAIN, newDomain);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case RepositoryPackage.LOCAL_MEMORY_REPOSITORY__DOMAIN:
            return this.getDomain();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case RepositoryPackage.LOCAL_MEMORY_REPOSITORY__DOMAIN:
            this.setDomain((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID)
        {
        case RepositoryPackage.LOCAL_MEMORY_REPOSITORY__DOMAIN:
            this.setDomain(DOMAIN_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID)
        {
        case RepositoryPackage.LOCAL_MEMORY_REPOSITORY__DOMAIN:
            return DOMAIN_EDEFAULT == null ? this.getDomain() != null : !DOMAIN_EDEFAULT.equals(this.getDomain());
        }
        return super.eIsSet(featureID);
    }

} // LocalMemoryRepositoryImpl
