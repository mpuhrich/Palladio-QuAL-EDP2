package org.palladiosimulator.edp2.visualization;

import org.palladiosimulator.edp2.datastream.IDataSink;

public interface IVisualisationSingleDatastreamInput
extends IDataSink {

    public String getInputName();
}