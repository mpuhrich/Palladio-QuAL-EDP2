package org.palladiosimulator.edp2.repository.parquet.internal.context;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.edp2.repository.parquet.internal.context.mode.ExperimentContextReadMode;
import org.palladiosimulator.edp2.repository.parquet.internal.context.mode.ExperimentContextWriteMode;

public class ExperimentContextFactory {

    private ExperimentContextRegistry registry;
    private String basePath;

    public ExperimentContext createAndRegisterExperimentContext(final String experimentId) {
        final var context = new ExperimentContext();
        context.setExperimentId(experimentId);
        context.setBasePath(basePath);
        final var mode = new ExperimentContextWriteMode(context);
        context.setMode(mode);
        registry.register(experimentId, context);
        return context;
    }

    public ExperimentContext loadAndRegisterExperimentContext(final String experimentId) {
        final var context = new ExperimentContext();
        context.setExperimentId(experimentId);
        context.setBasePath(basePath);
        final var mode = new ExperimentContextReadMode(context);
        context.setMode(mode);
        registry.register(experimentId, context);
        return context;
    }

    public ExperimentContextRegistry getExperimentContextRegistry() {
        return registry;
    }

    public void setExperimentContextRegistry(ExperimentContextRegistry registry) {
        this.registry = registry;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(URI baseUri) {
        try {
            this.basePath = FileLocator.toFileURL(new URL(baseUri.toString())).getPath();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

}
