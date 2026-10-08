package cn.pokemmo.constant;

import f.ry_0;

public abstract class BattleTurnPhaseSwitchTable {
    public static final int[] Lr;

    static {
        int len = 32;
        try {
            java.lang.reflect.Field f = ry_0.class.getDeclaredField("dI");
            f.setAccessible(true);
            len = ((ry_0[]) f.get(null)).clone().length;
        } catch (Throwable ignored) {}
        Lr = new int[len];
        try {
            Lr[ry_0.J30.ys] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            Lr[ry_0.Rz0.ys] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            Lr[ry_0.zm.ys] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            Lr[ry_0.w30.ys] = 4;
        } catch (NoSuchFieldError ignored) {}
        try {
            Lr[ry_0.hq.ys] = 5;
        } catch (NoSuchFieldError ignored) {}
    }
}
