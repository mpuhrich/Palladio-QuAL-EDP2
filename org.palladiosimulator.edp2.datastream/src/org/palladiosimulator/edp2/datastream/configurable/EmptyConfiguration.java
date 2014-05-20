package org.palladiosimulator.edp2.datastream.configurable;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class EmptyConfiguration extends PropertyConfigurable {

    @Override
    public Map<String, Object> getDefaultConfiguration() {
        return Collections.emptyMap();
    }

    @Override
    public Set<String> getKeys() {
        return Collections.emptySet();
    }

    @Override
    public Class<?> getPropertyType(final String key) {
        throw new UnsupportedOperationException();
    }

}
