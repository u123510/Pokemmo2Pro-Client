package ch.qos.logback.core.joran.spi;

import java.util.HashMap;
import java.util.Map;

public class DefaultNestedComponentRegistry {
    Map defaultComponentMap;
    Map tagToClassMap;

    public DefaultNestedComponentRegistry() {
        this.defaultComponentMap = new HashMap();
        this.tagToClassMap = new HashMap();
    }

    private Class oneShotFind(Class hostClass, String propertyName) {
        HostClassAndPropertyDouble key = new HostClassAndPropertyDouble(hostClass, propertyName);
        return (Class) this.defaultComponentMap.get(key);
    }

    public void duplicate(DefaultNestedComponentRegistry registry) {
        this.defaultComponentMap.putAll(registry.defaultComponentMap);
        this.tagToClassMap.putAll(registry.tagToClassMap);
    }

    public void add(Class hostClass, String propertyName, Class componentClass) {
        HostClassAndPropertyDouble key = new HostClassAndPropertyDouble(hostClass, propertyName.toLowerCase());
        this.defaultComponentMap.put(key, componentClass);
        this.tagToClassMap.put(propertyName, componentClass);
    }

    public String findDefaultComponentTypeByTag(String tag) {
        Class componentClass = (Class) this.tagToClassMap.get(tag);
        if (componentClass == null) {
            return null;
        }
        return componentClass.getCanonicalName();
    }

    public Class findDefaultComponentType(Class hostClass, String propertyName) {
        propertyName = propertyName.toLowerCase();
        while (hostClass != null) {
            Class componentClass = oneShotFind(hostClass, propertyName);
            if (componentClass != null) {
                return componentClass;
            }
            hostClass = hostClass.getSuperclass();
        }
        return null;
    }
}
