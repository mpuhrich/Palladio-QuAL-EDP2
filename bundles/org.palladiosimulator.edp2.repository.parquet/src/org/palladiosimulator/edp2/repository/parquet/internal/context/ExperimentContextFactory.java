package org.palladiosimulator.edp2.repository.parquet.internal.context;

import java.net.URL;

import org.apache.hadoop.fs.Path;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.edp2.repository.parquet.internal.context.mode.ExperimentContextWriteMode;
import org.palladiosimulator.edp2.repository.parquet.internal.schema.SchemaFactory;
import org.palladiosimulator.monitorrepository.MonitorRepository;

public class ExperimentContextFactory {

    private ExperimentContextRegistry registry;
    private SchemaFactory schemaFactory;
    private String basePath;

    public ExperimentContext createAndRegisterExperimentContext(final String experimentId, final MonitorRepository monitorRepository) {
        final var schema = schemaFactory.createSchemaFromMonitorRepository(monitorRepository);
        final var path = new Path(basePath, experimentId + ".parquet");
        final var context = new ExperimentContext();
        context.setPath(path);
        final var mode = new ExperimentContextWriteMode(context);
        mode.setSchema(schema);
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

    public SchemaFactory getSchemaFactory() {
        return schemaFactory;
    }

    public void setSchemaFactory(SchemaFactory schemaFactory) {
        this.schemaFactory = schemaFactory;
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
