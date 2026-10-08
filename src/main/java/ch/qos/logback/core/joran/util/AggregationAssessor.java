package ch.qos.logback.core.joran.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.util.beans.BeanDescription;
import ch.qos.logback.core.joran.util.beans.BeanDescriptionCache;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.StringUtil;

public class AggregationAssessor extends ContextAwareBase {
    protected final Class<?> objClass;
    protected final BeanDescription beanDescription;

    public AggregationAssessor(BeanDescriptionCache beanDescriptionCache, Class<?> objClass) {
        this.objClass = objClass;
        this.beanDescription = beanDescriptionCache.getBeanDescription(objClass);
    }

    private AggregationType computeRawAggregationType(Method method) {
        Class<?> parameterClass = getParameterClassForMethod(method);
        if (parameterClass == null) {
            return AggregationType.NOT_FOUND;
        }
        if (StringToObjectConverter.canBeBuiltFromSimpleString(parameterClass)) {
            return AggregationType.AS_BASIC_PROPERTY;
        }
        return AggregationType.AS_COMPLEX_PROPERTY;
    }

    private Class<?> getParameterClassForMethod(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            return null;
        }
        return parameterTypes[0];
    }

    private boolean isUnequivocallyInstantiable(Class<?> type) {
        if (type.isInterface()) {
            return false;
        }
        try {
            Constructor<?> constructor = type.getDeclaredConstructor();
            return constructor.newInstance() != null;
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            return false;
        }
    }

    public AggregationType computeAggregationType(String name) {
        Method adder = findAdderMethod(StringUtil.capitalizeFirstLetter(name));
        if (adder != null) {
            AggregationType raw = computeRawAggregationType(adder);
            if (raw == AggregationType.NOT_FOUND) {
                return AggregationType.NOT_FOUND;
            }
            if (raw == AggregationType.AS_BASIC_PROPERTY) {
                return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
            }
            if (raw == AggregationType.AS_COMPLEX_PROPERTY) {
                return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
            }
            addError("Unexpected AggregationType " + String.valueOf(raw));
        }
        Method setter = findSetterMethod(name);
        if (setter != null) {
            return computeRawAggregationType(setter);
        }
        return AggregationType.NOT_FOUND;
    }

    public Method findAdderMethod(String name) {
        return beanDescription.getAdder(ch.qos.logback.core.joran.util.beans.BeanUtil.toLowerCamelCase(name));
    }

    public Method findSetterMethod(String name) {
        return beanDescription.getSetter(ch.qos.logback.core.joran.util.beans.BeanUtil.toLowerCamelCase(name));
    }

    public Class<?> getClassNameViaImplicitRules(String name, AggregationType aggregationType, DefaultNestedComponentRegistry registry) {
        Class<?> defaultType = registry.findDefaultComponentType(objClass, name);
        if (defaultType != null) {
            return defaultType;
        }
        Method method = getRelevantMethod(name, aggregationType);
        if (method == null) {
            return null;
        }
        Class<?> annotationType = getDefaultClassNameByAnnonation(name, method);
        if (annotationType != null) {
            return annotationType;
        }
        return getByConcreteType(name, method);
    }

    public Annotation getAnnotation(String name, Class<?> annotationClass, Method method) {
        if (method == null) {
            return null;
        }
        return method.getAnnotation((Class) annotationClass);
    }

    public Class<?> getDefaultClassNameByAnnonation(String name, Method method) {
        DefaultClass annotation = (DefaultClass) getAnnotation(name, DefaultClass.class, method);
        return annotation == null ? null : annotation.value();
    }

    public Method getRelevantMethod(String name, AggregationType aggregationType) {
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION) {
            return findAdderMethod(name);
        }
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY) {
            return findSetterMethod(name);
        }
        throw new IllegalStateException(String.valueOf(aggregationType) + " not allowed here");
    }

    public Class<?> getByConcreteType(String name, Method method) {
        Class<?> parameterClass = getParameterClassForMethod(method);
        if (parameterClass == null) {
            return null;
        }
        return isUnequivocallyInstantiable(parameterClass) ? parameterClass : null;
    }
}
