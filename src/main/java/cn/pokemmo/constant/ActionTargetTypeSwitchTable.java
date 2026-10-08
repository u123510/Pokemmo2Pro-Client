package cn.pokemmo.constant;

import f.K10;

public abstract class ActionTargetTypeSwitchTable {
    public static final int[] PO;

    static {
        int len;
        try {
            java.lang.reflect.Field f = K10.class.getDeclaredField(new String(new char[]{'S', 'f'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        PO = new int[len];
        try {
            PO[0] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            PO[1] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            PO[2] = 3;
        } catch (NoSuchFieldError unused) {}
        try {
            PO[3] = 4;
        } catch (NoSuchFieldError unused) {}
        try {
            PO[4] = 5;
        } catch (NoSuchFieldError unused) {}
    }
}
