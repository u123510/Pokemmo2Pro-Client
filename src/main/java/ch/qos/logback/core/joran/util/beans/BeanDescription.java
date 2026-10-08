package ch.qos.logback.core.joran.util.beans;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

public class BeanDescription {
    private final Class<?> clazz;
    private final Map<String, Method> propertyNameToGetter;
    private final Map<String, Method> propertyNameToSetter;
    private final Map<String, Method> propertyNameToAdder;

    public BeanDescription(Class<?> clazz, Map<String, Method> getters, Map<String, Method> setters, Map<String, Method> adders) {
        this.clazz = clazz;
        this.propertyNameToGetter = Collections.unmodifiableMap(getters);
        this.propertyNameToSetter = Collections.unmodifiableMap(setters);
        this.propertyNameToAdder = Collections.unmodifiableMap(adders);
    }

    public Class<?> getClazz() { return clazz; }
    public Map<String, Method> getPropertyNameToGetter() { return propertyNameToGetter; }
    public Map<String, Method> getPropertyNameToSetter() { return propertyNameToSetter; }
    public Method getGetter(String name) { return (Method) propertyNameToGetter.get(name); }
    public Method getSetter(String name) { return (Method) propertyNameToSetter.get(name); }
    public Map<String, Method> getPropertyNameToAdder() { return propertyNameToAdder; }
    public Method getAdder(String name) { return (Method) propertyNameToAdder.get(name); }
}
