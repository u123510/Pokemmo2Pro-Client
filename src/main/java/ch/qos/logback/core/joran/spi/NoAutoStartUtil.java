package ch.qos.logback.core.joran.spi;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

import ch.qos.logback.core.spi.LifeCycle;

public class NoAutoStartUtil {
    public NoAutoStartUtil() {
        super();
    }

    public static boolean notMarkedWithNoAutoStart(Object object) {
        if (object == null) {
            return false;
        }
        return findAnnotation(object.getClass(), NoAutoStart.class) == null;
    }

    private static Annotation findAnnotation(Class<?> type, Class<?> annotationType) {
        return findAnnotation(type, annotationType, new HashSet<Class<?>>());
    }

    private static Annotation findAnnotation(Class<?> type, Class<?> annotationType, Set<Class<?>> visited) {
        Annotation annotation = type.getAnnotation((Class) annotationType);
        if (annotation != null) {
            return annotation;
        }
        Class<?>[] interfaces = type.getInterfaces();
        for (Class<?> iface : interfaces) {
            annotation = findAnnotation(iface, annotationType, visited);
            if (annotation != null) {
                return annotation;
            }
        }
        Class<?> superClass = type.getSuperclass();
        if (superClass != null && superClass != Object.class) {
            return findAnnotation(superClass, annotationType, visited);
        }
        return null;
    }

    public static boolean shouldBeStarted(Object object) {
        if (object instanceof LifeCycle) {
            return notMarkedWithNoAutoStart(object);
        }
        return false;
    }
}
