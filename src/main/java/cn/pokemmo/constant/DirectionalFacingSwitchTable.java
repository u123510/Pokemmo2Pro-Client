package cn.pokemmo.constant;

import f.Pv0;

public abstract class DirectionalFacingSwitchTable {
    public static final int[] C8;

    static {
        int len;
        try {
            java.lang.reflect.Field f = Pv0.class.getDeclaredField(new String(new char[]{'n', 'b'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        C8 = new int[len];
        try {
            C8[2] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            C8[3] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            C8[4] = 3;
        } catch (NoSuchFieldError unused) {}
    }
}
