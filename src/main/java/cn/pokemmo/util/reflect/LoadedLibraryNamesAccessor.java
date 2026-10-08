package cn.pokemmo.util.reflect;

import java.lang.reflect.Field;

public abstract class LoadedLibraryNamesAccessor {
    public static final Field aA0;

    static {
        Field f = null;
        try {
            f = ClassLoader.class.getDeclaredField("loadedLibraryNames");
            f.setAccessible(true);
        } catch (Exception unused) {}
        aA0 = f;
    }
}
