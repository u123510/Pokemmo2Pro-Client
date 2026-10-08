package cn.pokemmo.constant;

import f.T4;

public abstract class EntityFacingOffsetSwitchTable {
    public static final int[] Za0;

    static {
        int len;
        try {
            java.lang.reflect.Field f = T4.class.getDeclaredField(new String(new char[]{'l', '8'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        Za0 = new int[len];
        try {
            Za0[0] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            Za0[2] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            Za0[4] = 3;
        } catch (NoSuchFieldError unused) {}
        try {
            Za0[5] = 4;
        } catch (NoSuchFieldError unused) {}
        try {
            Za0[1] = 5;
        } catch (NoSuchFieldError unused) {}
        try {
            Za0[3] = 6;
        } catch (NoSuchFieldError unused) {}
    }
}
