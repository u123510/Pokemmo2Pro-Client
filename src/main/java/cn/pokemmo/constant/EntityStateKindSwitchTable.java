package cn.pokemmo.constant;

import f.UE;

public abstract class EntityStateKindSwitchTable {
    public static final int[] vb0;

    static {
        int len;
        try {
            java.lang.reflect.Field f = UE.class.getDeclaredField(new String(new char[]{'C', 'o', 'M', '2'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        vb0 = new int[len];
        try {
            vb0[0] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            vb0[1] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            vb0[2] = 3;
        } catch (NoSuchFieldError unused) {}
        try {
            vb0[3] = 4;
        } catch (NoSuchFieldError unused) {}
        try {
            vb0[4] = 5;
        } catch (NoSuchFieldError unused) {}
    }
}
