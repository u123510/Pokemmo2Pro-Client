package cn.pokemmo.constant;

import f.nk_0;

public abstract class WeatherEffectSwitchTable {
    public static final int[] sL;

    static {
        int len;
        try {
            java.lang.reflect.Field f = nk_0.class.getDeclaredField(new String(new char[]{'k', 'b', '0'}));
            f.setAccessible(true);
            len = ((Object[]) f.get(null)).length;
        } catch (Throwable t) {
            len = 16;
        }
        sL = new int[len];
        try {
            sL[nk_0.Zm0.Xy0] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            sL[nk_0.cOM2.Xy0] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            sL[nk_0.as0.Xy0] = 3;
        } catch (NoSuchFieldError unused) {}
    }
}
