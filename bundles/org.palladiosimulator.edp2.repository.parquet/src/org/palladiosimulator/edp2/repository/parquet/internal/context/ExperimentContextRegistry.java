package org.palladiosimulator.edp2.repository.parquet.internal.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExperimentContextRegistry {

    /**
     * Key: ExperimentRunId
     */
    private ConcurrentHashMap<String, ExperimentContext> registry;

    public ExperimentContextRegistry() {
        registry = new ConcurrentHashMap<String, ExperimentContext>();
    }

    public void register(final String experimentId, ExperimentContext experimentContext) {
        registry.put(experimentId, experimentContext);
    }

    public ExperimentContext getByExperimentId(final String experimentId) {
        return registry.get(experimentId);
    }

    public Map<String, ExperimentContext> getData() {
        return registry;
    }

}
