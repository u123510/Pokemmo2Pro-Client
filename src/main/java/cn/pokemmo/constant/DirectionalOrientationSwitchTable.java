package cn.pokemmo.constant;

import f.Pv0;

public abstract class DirectionalOrientationSwitchTable {
    public static final int[] XC;

    static {
        int len;
        try {
            java.lang.reflect.Field f = Pv0.class.getDeclaredField(new String(new char[]{'n', 'b'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        XC = new int[len];
        try {
            XC[2] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            XC[3] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            XC[4] = 3;
        } catch (NoSuchFieldError unused) {}
    }
}
