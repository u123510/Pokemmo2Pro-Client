package cn.pokemmo.constant;

import f.zd0_1;

public abstract class NetworkProtocolSwitchTable {
    public static final int[] bT;

    static {
        int len;
        try {
            java.lang.reflect.Field f = zd0_1.class.getDeclaredField(new String(new char[]{'v', '6'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        bT = new int[len];
        try {
            bT[0] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            bT[1] = 2;
        } catch (NoSuchFieldError unused) {}
    }
}
