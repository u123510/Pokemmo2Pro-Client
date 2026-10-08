package cn.pokemmo.constant;

import f.ry_0;

public abstract class ReflectionSwitchTableC {
    public static final int[] mn0;

    static {
        int len;
        try {
            java.lang.reflect.Field f = ry_0.class.getDeclaredField(new String(new char[]{'d', 'I'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        mn0 = new int[len];
        try {
            mn0[ry_0.J30.ys] = 1;
        } catch (NoSuchFieldError unused) {}
    }
}
