package org.palladiosimulator.edp2.datastream.configurable.reflective;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.edp2.datastream.configurable.IPropertyListener;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;

public class ReflectivePropertyConfigurable extends PropertyConfigurable implements IPropertyListener {

    private Map<String, Field> keyFieldMap;

    public ReflectivePropertyConfigurable() {
        super();
        addObserver(this);
        setProperties(getDefaultConfiguration());
    }

    @Override
    public Map<String, Object> getDefaultConfiguration() {
        final Map<String, Object> result = new HashMap<String, Object>();

        try {
            for (final Field f : keyFieldMap.values()) {
                f.setAccessible(true);
                result.put(getKeynameForField(f),f.get(this));
            }
        } catch (final IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }

        return result;
    }

    @Override
    public Set<String> getKeys() {
        initKeyFieldMap();
        return new HashSet<String>(keyFieldMap.keySet());
    }

    @Override
    public void propertyChanged(final String key, final Object oldValue, final Object newValue) {
        if (keyFieldMap.containsKey(key)) {
            final Field f = keyFieldMap.get(key);
            try {
                f.setAccessible(true);
                f.set(this,newValue);
            } catch (final IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (final IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void propertyChangeCompleted() {
    }

    /**
     * 
     */
    private void initKeyFieldMap() {
        if (keyFieldMap == null) {
            final Map<String,Field> keys = new HashMap<String,Field>();
            Class<?> currentClass = getClass();
            while (currentClass != null) {
                for (final Field f : currentClass.getDeclaredFields()) {
                    final ConfigurationProperty configField = f.getAnnotation(ConfigurationProperty.class);
                    if (configField != null) {
                        keys.put(getKeynameForField(f), f);
                    }
                }
                currentClass = currentClass.getSuperclass();
            }
            keyFieldMap = Collections.unmodifiableMap(keys);
        }
    }

    /**
     * @param f
     * @return
     */
    private String getKeynameForField(final Field f) {
        return f.getName();
    }

    @Override
    public Class<?> getPropertyType(final String key) {
        return keyFieldMap.get(key).getType();
    }

}
