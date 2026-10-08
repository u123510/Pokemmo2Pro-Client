package cn.pokemmo.constant;

import f.GV;

public abstract class ReflectionSwitchTableB {
    public static final int[] COM7;

    static {
        int len;
        try {
            java.lang.reflect.Field f = GV.class.getDeclaredField(new String(new char[]{'T', 'V'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        COM7 = new int[len];
        try {
            COM7[GV.Uu0.Po] = 1;
        } catch (NoSuchFieldError unused) {}
    }
}
