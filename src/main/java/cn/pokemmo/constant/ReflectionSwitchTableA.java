package cn.pokemmo.constant;

import f.iz_1;

public abstract class ReflectionSwitchTableA {
    public static final int[] wx;

    static {
        int len;
        try {
            java.lang.reflect.Field f = iz_1.class.getDeclaredField(new String(new char[]{'X', 'D'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        wx = new int[len];
        try {
            wx[0] = 1;
        } catch (NoSuchFieldError unused) {}
    }
}
