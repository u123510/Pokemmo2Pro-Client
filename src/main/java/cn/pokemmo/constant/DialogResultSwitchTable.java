package cn.pokemmo.constant;

import f.ff0_0;

public abstract class DialogResultSwitchTable {
    public static final int[] gu0;

    static {
        int len;
        try {
            java.lang.reflect.Field f = ff0_0.class.getDeclaredField(new String(new char[]{'X', 'f', '0'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        gu0 = new int[len];
        try {
            ff0_0 unused = ff0_0.Pd;
            gu0[0] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            ff0_0 unused = ff0_0.Pd;
            gu0[1] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            ff0_0 unused = ff0_0.Pd;
            gu0[3] = 3;
        } catch (NoSuchFieldError unused) {}
        try {
            ff0_0 unused = ff0_0.Pd;
            gu0[2] = 4;
        } catch (NoSuchFieldError unused) {}
    }
}
