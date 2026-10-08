package cn.pokemmo.constant;

import f.VY;

public abstract class EntityFacingStateSwitchTable {
    public static final int[] hO;

    static {
        int len;
        try {
            java.lang.reflect.Field f = VY.class.getDeclaredField(new String(new char[]{'a', 'y', '0'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        hO = new int[len];
        try {
            hO[1] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            hO[2] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            hO[3] = 3;
        } catch (NoSuchFieldError unused) {}
    }
}
