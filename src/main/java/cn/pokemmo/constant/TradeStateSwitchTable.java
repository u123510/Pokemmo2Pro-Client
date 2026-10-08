package cn.pokemmo.constant;

import f.ez0_0;

public abstract class TradeStateSwitchTable {
    public static final int[] xz;

    static {
        int[] arr;
        try {
            arr = new int[ez0_0.HR.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        xz = arr;
        try {
            xz[ez0_0.CoM3.fE0] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            xz[ez0_0.JC0.fE0] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            xz[ez0_0.kO.fE0] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            xz[ez0_0.kp0.fE0] = 4;
        } catch (NoSuchFieldError ignored) {}
    }
}
