package cn.pokemmo.constant;

import f.b;
import f.bm0_1;

public abstract class OptionCategorySwitchTable {
    public static final int[] U;

    static {
        int len;
        try {
            java.lang.reflect.Field f = b.class.getDeclaredField(new String(new char[]{'v', 'J', '0'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        U = new int[len];
        try {
            bm0_1 unused = b.JW;
            U[0] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            bm0_1 unused = b.JW;
            U[1] = 2;
        } catch (NoSuchFieldError unused) {}
    }
}
