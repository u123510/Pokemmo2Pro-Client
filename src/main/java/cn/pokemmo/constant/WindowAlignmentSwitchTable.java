package cn.pokemmo.constant;

import f.MG0;

public abstract class WindowAlignmentSwitchTable {
    public static final int[] cz0;

    static {
        int len;
        try {
            java.lang.reflect.Field f = MG0.class.getDeclaredField("L");
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        cz0 = new int[len];
        try {
            MG0 unused = MG0.lpt6;
            cz0[2] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            MG0 unused = MG0.lpt6;
            cz0[1] = 2;
        } catch (NoSuchFieldError unused) {}
    }
}
