package cn.pokemmo.constant;

import f.C70;

public abstract class MenuActionOptionSwitchTable {
    public static final int[] nX;

    static {
        int len;
        try {
            java.lang.reflect.Field f = C70.class.getDeclaredField(new String(new char[]{'K', 'd', '0'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        nX = new int[len];
        try {
            nX[1] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            nX[2] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            nX[0] = 3;
        } catch (NoSuchFieldError unused) {}
        try {
            nX[4] = 4;
        } catch (NoSuchFieldError unused) {}
    }
}
