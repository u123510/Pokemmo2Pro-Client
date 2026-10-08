package cn.pokemmo.constant;

import f.yw_0;

public abstract class RenderLayerSwitchTable {
    public static final int[] DS;

    static {
        int len;
        try {
            java.lang.reflect.Field f = yw_0.class.getDeclaredField(new String(new char[]{'T', 'J'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        DS = new int[len];
        try {
            yw_0 unused = yw_0.c0;
            DS[0] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            yw_0 unused = yw_0.c0;
            DS[1] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            yw_0 unused = yw_0.c0;
            DS[2] = 3;
        } catch (NoSuchFieldError unused) {}
    }
}
