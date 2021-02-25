/**
 * 
 */
package org.palladiosimulator.edp2.dao.impl;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.edp2.dao.Edp2Dao;
import org.palladiosimulator.edp2.dao.exception.DataNotAccessibleException;

/**
 * Abstract base class of all EDP2 DAOs. Implements the basic DAO protocol all DAOs can rely on.
 * 
 * @author groenda
 *
 */
public abstract class Edp2DaoImpl implements Edp2Dao {

    /** Status flag. Determine if the data behind the DAO is open or not. */
    private boolean open = false;

    /** Status flag. Determine if the data has been deleted. */
    private boolean deleted = false;

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.Edp2Dao#open()
     */
    public synchronized void open(DiagnosticChain diagnosticChain) {
        if (isDeleted()) {
            throw new IllegalStateException("Data has already been deleted.");
        }
        if (isOpen()) {
            throw new IllegalStateException("DAO has already been opened.");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.Edp2Dao#close()
     */
    @Override
    public synchronized void close() throws DataNotAccessibleException {
        if (!isOpen()) {
            throw new IllegalStateException("State must be open to be changed by close().");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.Edp2Dao#delete()
     */
    @Override
    public synchronized void delete() throws DataNotAccessibleException {
        if (isOpen()) {
            throw new IllegalStateException("Data cannot be deleted if the status is open.");
        }
        if (isDeleted()) {
            throw new IllegalStateException("Data can only be deleted once.");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.Edp2Dao#isDeleted()
     */
    @Override
    public synchronized boolean isDeleted() {
        return deleted;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.Edp2Dao#isOpen()
     */
    @Override
    public synchronized boolean isOpen() {
        return open;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.Edp2Dao#canClose()
     */
    @Override
    public synchronized boolean canClose() {
        if (open && !deleted) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.Edp2Dao#canDelete()
     */
    @Override
    public synchronized boolean canDelete() {
        if (!deleted && !open) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.Edp2Dao#canOpen()
     */
    @Override
    public boolean canOpen(DiagnosticChain diagnosticChain) {
        if (!open && !deleted) {
            return true;
        }
        return false;
    }

    protected void setOpen() {
        open = true;
    }

    protected void setClosed() {
        open = false;
    }

    protected void setDeleted(boolean newValue) {
        deleted = newValue;
    }

}
