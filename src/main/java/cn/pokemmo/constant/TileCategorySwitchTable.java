package cn.pokemmo.constant;

import f.og0_2;

public abstract class TileCategorySwitchTable {
    public static final int[] ao;

    static {
        int len;
        try {
            java.lang.reflect.Field f = og0_2.class.getDeclaredField(new String(new char[]{'m', 'g'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        ao = new int[len];
        try {
            ao[og0_2.gK0.P70] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            ao[og0_2.c9.P70] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            ao[og0_2.oK0.P70] = 3;
        } catch (NoSuchFieldError unused) {}
    }
}
