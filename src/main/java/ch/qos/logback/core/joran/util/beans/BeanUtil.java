package ch.qos.logback.core.joran.util.beans;

import java.lang.reflect.Method;

public class BeanUtil {
    public static final String PREFIX_GETTER_IS = "is";
    public static final String PREFIX_GETTER_GET = "get";
    public static final String PREFIX_SETTER = "set";
    public static final String PREFIX_ADDER = "add";

    public BeanUtil() {
        super();
    }

    public static boolean isAdder(Method method) {
        return getParameterCount(method) == 1 && method.getReturnType() == Void.TYPE && method.getName().startsWith("add");
    }

    public static boolean isGetter(Method method) {
        if (getParameterCount(method) > 0) {
            return false;
        }
        Class<?> returnType = method.getReturnType();
        if (returnType == Void.TYPE) {
            return false;
        }
        String name = method.getName();
        if (!name.startsWith("get") && !name.startsWith("is")) {
            return false;
        }
        if (name.startsWith("is") && returnType != Boolean.TYPE && returnType != Boolean.class) {
            return false;
        }
        return true;
    }

    private static int getParameterCount(Method method) {
        return method.getParameterTypes().length;
    }

    public static boolean isSetter(Method method) {
        return getParameterCount(method) == 1 && method.getReturnType() == Void.TYPE && method.getName().startsWith("set");
    }

    public static String getPropertyName(Method method) {
        String methodName = method.getName();
        String propertyName = getSubstringIfPrefixMatches(methodName, "get");
        if (propertyName == null) {
            propertyName = getSubstringIfPrefixMatches(methodName, "set");
        }
        if (propertyName == null) {
            propertyName = getSubstringIfPrefixMatches(methodName, "is");
        }
        if (propertyName == null) {
            propertyName = getSubstringIfPrefixMatches(methodName, "add");
        }
        return toLowerCamelCase(propertyName);
    }

    public static String toLowerCamelCase(String value) {
        if (value == null || value.isEmpty()) {
            return value;
        }
        if (value.length() > 1 && Character.isUpperCase(value.charAt(0)) && Character.isUpperCase(value.charAt(1))) {
            return value;
        }
        char[] chars = value.toCharArray();
        chars[0] = Character.toLowerCase(chars[0]);
        return new String(chars);
    }

    private static String getSubstringIfPrefixMatches(String value, String prefix) {
        if (value.startsWith(prefix)) {
            return value.substring(prefix.length());
        }
        return null;
    }
}
