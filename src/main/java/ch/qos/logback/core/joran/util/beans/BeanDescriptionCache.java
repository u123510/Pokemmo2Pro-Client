package ch.qos.logback.core.joran.util.beans;

import java.util.HashMap;
import java.util.Map;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;

public class BeanDescriptionCache extends ContextAwareBase {
    private Map<Class<?>, BeanDescription> classToBeanDescription;
    private BeanDescriptionFactory beanDescriptionFactory;

    public BeanDescriptionCache(Context context) {
        classToBeanDescription = new HashMap<>();
        setContext(context);
    }

    private BeanDescriptionFactory getBeanDescriptionFactory() {
        if (beanDescriptionFactory == null) {
            beanDescriptionFactory = new BeanDescriptionFactory(getContext());
        }
        return beanDescriptionFactory;
    }

    public BeanDescription getBeanDescription(Class<?> clazz) {
        if (!classToBeanDescription.containsKey(clazz)) {
            BeanDescription description = getBeanDescriptionFactory().create(clazz);
            classToBeanDescription.put(clazz, description);
        }
        return classToBeanDescription.get(clazz);
    }
}
