package ch.qos.logback.core.joran.util.beans;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;

public class BeanDescriptionFactory extends ContextAwareBase {
    public BeanDescriptionFactory(Context context) {
        super();
        setContext(context);
    }

    public BeanDescription create(Class<?> clazz) {
        Map<String, Method> getters = new HashMap<>();
        Map<String, Method> setters = new HashMap<>();
        Map<String, Method> adders = new HashMap<>();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isBridge()) {
                continue;
            }
            if (BeanUtil.isGetter(method)) {
                String propertyName = BeanUtil.getPropertyName(method);
                Method previous = getters.put(propertyName, method);
                if (previous != null && previous.getName().startsWith("is")) {
                    getters.put(propertyName, previous);
                } else if (previous != null) {
                    addWarn(String.format("Class '%s' contains multiple getters for the same property '%s'.", clazz.getCanonicalName(), propertyName));
                }
            } else if (BeanUtil.isSetter(method)) {
                String propertyName = BeanUtil.getPropertyName(method);
                Method previous = setters.put(propertyName, method);
                if (previous != null) {
                    addWarn(String.format("Class '%s' contains multiple setters for the same property '%s'.", clazz.getCanonicalName(), propertyName));
                }
            } else if (BeanUtil.isAdder(method)) {
                String propertyName = BeanUtil.getPropertyName(method);
                Method previous = adders.put(propertyName, method);
                if (previous != null) {
                    addWarn(String.format("Class '%s' contains multiple adders for the same property '%s'.", clazz.getCanonicalName(), propertyName));
                }
            }
        }
        return new BeanDescription(clazz, getters, setters, adders);
    }
}
