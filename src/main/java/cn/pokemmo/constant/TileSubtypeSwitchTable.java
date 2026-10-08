package cn.pokemmo.constant;

import f.hb_2;

public abstract class TileSubtypeSwitchTable {
    public static final int[] cW;

    static {
        int len;
        try {
            java.lang.reflect.Field f = hb_2.class.getDeclaredField(new String(new char[]{'u', 'G', '0'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        cW = new int[len];
        try {
            cW[1] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            cW[2] = 2;
        } catch (NoSuchFieldError unused) {}
    }
}
