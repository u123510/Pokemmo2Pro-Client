package cn.pokemmo.util.reflect;

import f.*;

public class DynamicClassReflectionUtils {
    public DynamicClassReflectionUtils() {
        super();
    }

    public static Class oy0(String name) {
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException error) {
            throw DynamicClassReflectionUtils.<RuntimeException>raise(new ua_0(jj0_0.hw0("Class not found: ", name), error));
        }
    }

    public static boolean wn(Class type, Class candidate) {
        return type.isAssignableFrom(candidate);
    }

    public static I40 kl(Class type, Class... parameterTypes) {
        try {
            return new I40(type.getDeclaredConstructor(parameterTypes));
        } catch (NoSuchMethodException error) {
            throw DynamicClassReflectionUtils.<RuntimeException>raise(new ua_0("Constructor not found for class: ".concat(type.getName()), error));
        } catch (SecurityException error) {
            throw DynamicClassReflectionUtils.<RuntimeException>raise(new ua_0("Security violation while getting constructor for class: ".concat(type.getName()), error));
        }
    }

    public static I40 Vk0(Class type) {
        Class<?>[] noParameters = null;
        try {
            return new I40(type.getConstructor(noParameters));
        } catch (NoSuchMethodException error) {
            throw DynamicClassReflectionUtils.<RuntimeException>raise(new ua_0("Constructor not found for class: ".concat(type.getName()), error));
        } catch (SecurityException error) {
            throw DynamicClassReflectionUtils.<RuntimeException>raise(new ua_0("Security violation occurred while getting constructor for class: '"
                    .concat(type.getName()).concat("'."), error));
        }
    }

    private static <T extends Throwable> T raise(Throwable error) throws T {
        throw (T)error;
    }
}
