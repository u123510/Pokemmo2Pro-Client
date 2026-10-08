package cn.pokemmo.util.reflect;

import java.lang.reflect.Array;

public final class ArrayInstanceHelper {
    public static Object ix(Class clazz, int n) {
        return Array.newInstance(clazz, n);
    }
}
