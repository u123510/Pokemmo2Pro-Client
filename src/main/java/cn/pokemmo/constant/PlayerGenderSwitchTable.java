package cn.pokemmo.constant;

import f.ca_2;

public abstract class PlayerGenderSwitchTable {
    public static final int[] nD0;

    static {
        int len;
        try {
            java.lang.reflect.Field f = ca_2.class.getDeclaredField(new String(new char[]{'N', 't', '0'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        nD0 = new int[len];
        try {
            nD0[0] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            nD0[2] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            nD0[9] = 3;
        } catch (NoSuchFieldError unused) {}
        try {
            nD0[10] = 4;
        } catch (NoSuchFieldError unused) {}
    }
}
