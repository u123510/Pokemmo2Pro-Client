package cn.pokemmo.constant;

import f.MG0;

public abstract class WindowPlacementSwitchTable {
    public static final int[] dZ;

    static {
        int len;
        try {
            java.lang.reflect.Field f = MG0.class.getDeclaredField("L");
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        dZ = new int[len];
        try {
            MG0 unused = MG0.lpt6;
            dZ[1] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            MG0 unused = MG0.lpt6;
            dZ[2] = 2;
        } catch (NoSuchFieldError unused) {}
    }
}
