package org.palladiosimulator.edp2.datastream.chaindescription;

import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.edp2.datastream.IDataSink;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.datastream.filter.AbstractAdapter;

/**
 * Instances of {@link ChainDescription} represent predefined chain of {@link IDataSource}
 * -elements.
 *
 * @author Dominik Ernst
 *
 */
public class ChainDescription {

    private final String chainID;
    private final String chainName;

    private final IDataSource lastChainElement;
    private final IPropertyConfigurable visualization;

    public ChainDescription(
            final String sequenceID,
            final String sequenceName,
            final IDataSource lastDataSource,
            final IPropertyConfigurable visualization) {
        super();
        this.chainID = sequenceID;
        this.chainName = sequenceName;
        this.lastChainElement = lastDataSource;
        this.visualization = visualization;
    }

    /**
     * @return the sequenceID
     */
    public String getSequenceID() {
        return chainID;
    }

    /**
     * @return the sequenceName
     */
    public String getSequenceName() {
        return chainName;
    }

    /**
     * @return the sequenceElements
     */
    public List<IDataSource> getSequenceElements() {
        final LinkedList<IDataSource> result = new LinkedList<IDataSource>();
        IDataSource current = this.lastChainElement;
        do {
            result.offer(current);
            if (current instanceof IDataSink) {
                current = ((IDataSink)current).getDataSource();
            } else {
                current = null;
            }
        } while (current != null);
        return result;
    }

    /**
     * Convenience method.
     *
     * @return the first element in <sequenceElements>
     */
    public IDataSource getFirstSequenceElement() {
        return getSequenceElements().get(0);
    }

    /**
     * Convenience method.
     *
     * @return the number of elements in <sequenceElements>
     */
    public int getSize() {
        return getSequenceElements().size();
    }

    /**
     * @return the visualization
     */
    public IPropertyConfigurable getVisualizationInput() {
        return visualization;
    }

    public IDataSource attachRootDataSource(final IDataSource rootDataSource) {
        if (this.lastChainElement != null) {
            AbstractAdapter current = (AbstractAdapter) this.lastChainElement;
            while (current instanceof AbstractAdapter && current.getDataSource() != null) {
                current = (AbstractAdapter) current.getDataSource();
            }
            current.setDataSource(rootDataSource);
            return this.lastChainElement;
        }
        return rootDataSource;
    }
}
