package cn.pokemmo.util.reflect;

import java.util.HashMap;

public abstract class ClassMapRegistry {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void m(Class clazz, HashMap hashMap, String string, Class clazz2, String string2) {
        hashMap.put(string, clazz.getName());
        hashMap.put(string2, clazz2.getName());
    }
}
