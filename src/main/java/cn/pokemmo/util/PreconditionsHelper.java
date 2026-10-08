package cn.pokemmo.util;

public abstract class PreconditionsHelper {
    public static Object checkNotNull(Object object, Class clazz, byte by) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException("Undefined " + clazz.getSimpleName() + " " + by);
    }

    public static Object BI0(Object object, Class clazz, byte by) {
        return checkNotNull(object, clazz, by);
    }
}
