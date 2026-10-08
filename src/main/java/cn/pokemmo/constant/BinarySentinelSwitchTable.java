package cn.pokemmo.constant;

import f.ud_2;

public abstract class BinarySentinelSwitchTable {
    public static final int[] Hh0;

    static {
        int len;
        try {
            java.lang.reflect.Field f = ud_2.class.getDeclaredField(new String(new char[]{'b', 'n', '0'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        Hh0 = new int[len];
        try {
            Hh0[1] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            Hh0[0] = 2;
        } catch (NoSuchFieldError unused) {}
    }
}
