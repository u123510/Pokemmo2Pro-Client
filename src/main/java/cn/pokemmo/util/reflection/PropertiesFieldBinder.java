package cn.pokemmo.util.reflection;

import f.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Properties;

public abstract class PropertiesFieldBinder {
    public static final dl_1 XC0 = Cq0.E1(LC.class);

    protected PropertiesFieldBinder() {
    }

    public static void Ox(Class type, Object instance, Properties[] properties) {
        for (Field field : type.getDeclaredFields()) {
            boolean isStatic = Modifier.isStatic(field.getModifiers());
            if ((isStatic && instance != null) || (!isStatic && instance == null)
                    || !field.isAnnotationPresent(_interface.class)) {
                continue;
            }
            if (Modifier.isFinal(field.getModifiers())) {
                RuntimeException exception = new RuntimeException(
                        "Attempt to proceed final field " + field.getName() + " of class " + type.getName());
                XC0.error("", exception);
                throw exception;
            }

            boolean accessible = field.isAccessible();
            try {
                field.setAccessible(true);
                _interface annotation = field.getAnnotation(_interface.class);
                if ("DO_NOT_OVERWRITE_INITIALIZATION_VALUE".equals(annotation.defaultValue())) {
                    String value = null;
                    for (Properties source : properties) {
                        if (source.containsKey(annotation.key())) {
                            value = source.getProperty(annotation.key());
                            break;
                        }
                    }
                    if (value != null) {
                        field.set(instance, Rc0(field, properties));
                    } else if (XC0.isDebugEnabled()) {
                        field.getName();
                        field.getDeclaringClass().getClass();
                    }
                } else {
                    field.set(instance, Rc0(field, properties));
                }
                field.setAccessible(accessible);
            } catch (Exception cause) {
                RuntimeException exception = new RuntimeException(
                        "Can not transform field " + field.getName() + " of class " + field.getDeclaringClass(), cause);
                XC0.error("", exception);
                throw exception;
            }
        }

        if (instance == null) {
            for (Class interfaceType : type.getInterfaces()) {
                Ox(interfaceType, null, properties);
            }
        }
        Class parent = type.getSuperclass();
        if (parent != null && parent != Object.class) {
            Ox(parent, instance, properties);
        }
    }

    public static Object Rc0(Field field, Properties[] properties) {
        _interface annotation = field.getAnnotation(_interface.class);
        String value = annotation.defaultValue();
        String key = annotation.key();
        String configuredValue = null;
        if (key.isEmpty()) {
            XC0.warn("Property {} of class {} has empty key", field.getName(), field.getDeclaringClass().getName());
        } else {
            for (Properties source : properties) {
                if (source.containsKey(key)) {
                    configuredValue = source.getProperty(key);
                    break;
                }
            }
        }
        if (configuredValue != null) {
            value = configuredValue;
        }
        rx_0 transformer = fr_2.B40(field.getType(), annotation.propertyTransformer());
        return transformer.nx0(value, field, annotation.min(), annotation.max());
    }
}
