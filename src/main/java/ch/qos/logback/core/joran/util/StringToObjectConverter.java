package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

import ch.qos.logback.core.spi.ContextAware;

public class StringToObjectConverter {
    private static final Class<?>[] STRING_CLASS_PARAMETER = new Class<?>[] { String.class };

    public StringToObjectConverter() {
        super();
    }

    public static boolean canBeBuiltFromSimpleString(Class<?> type) {
        Package pkg = type.getPackage();
        if (type.isPrimitive()) {
            return true;
        }
        if (pkg != null && "java.lang".equals(pkg.getName())) {
            return true;
        }
        if (followsTheValueOfConvention(type)) {
            return true;
        }
        if (type.isEnum()) {
            return true;
        }
        if (isOfTypeCharset(type)) {
            return true;
        }
        return false;
    }

    public static Object convertArg(ContextAware contextAware, String value, Class<?> targetType) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        if (String.class.isAssignableFrom(targetType)) {
            return trimmed;
        }
        if (Integer.TYPE.isAssignableFrom(targetType)) {
            return Integer.valueOf(trimmed);
        }
        if (Long.TYPE.isAssignableFrom(targetType)) {
            return Long.valueOf(trimmed);
        }
        if (Float.TYPE.isAssignableFrom(targetType)) {
            return Float.valueOf(trimmed);
        }
        if (Double.TYPE.isAssignableFrom(targetType)) {
            return Double.valueOf(trimmed);
        }
        if (Boolean.TYPE.isAssignableFrom(targetType)) {
            if ("true".equalsIgnoreCase(trimmed)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(trimmed)) {
                return Boolean.FALSE;
            }
        }
        if (targetType.isEnum()) {
            return convertToEnum(contextAware, trimmed, targetType);
        }
        if (followsTheValueOfConvention(targetType)) {
            return convertByValueOfMethod(contextAware, targetType, trimmed);
        }
        if (isOfTypeCharset(targetType)) {
            return convertToCharset(contextAware, value);
        }
        return null;
    }

    private static boolean isOfTypeCharset(Class<?> type) {
        return Charset.class.isAssignableFrom(type);
    }

    private static Charset convertToCharset(ContextAware contextAware, String value) {
        try {
            return Charset.forName(value);
        } catch (UnsupportedCharsetException e) {
            contextAware.addError("Failed to get charset [" + value + "]", e);
            return null;
        }
    }

    public static Method getValueOfMethod(Class<?> type) {
        try {
            return type.getMethod("valueOf", STRING_CLASS_PARAMETER);
        } catch (SecurityException e) {
            return null;
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    public static boolean followsTheValueOfConvention(Class<?> type) {
        Method method = getValueOfMethod(type);
        return method != null && Modifier.isStatic(method.getModifiers());
    }

    private static Object convertByValueOfMethod(ContextAware contextAware, Class<?> type, String value) {
        try {
            Method method = type.getMethod("valueOf", STRING_CLASS_PARAMETER);
            return method.invoke(null, new Object[] { value });
        } catch (Exception e) {
            contextAware.addError("Failed to invoke valueOf{} method in class [" + type.getName() + "] with value [" + value + "]");
            return null;
        }
    }

    private static Object convertToEnum(ContextAware contextAware, String value, Class<?> type) {
        return Enum.valueOf((Class) type, value);
    }

    public boolean isBuildableFromSimpleString() {
        return false;
    }
}
