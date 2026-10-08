package cn.pokemmo.constant;

import f.JU;

public abstract class CompassDirectionSwitchTable {
    public static final int[] wV;

    static {
        int[] arr;
        try {
            arr = new int[JU.X90.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        wV = arr;
        try {
            wV[JU.es.Ap0] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            wV[JU.NA.Ap0] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            wV[JU.hD.Ap0] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            wV[JU.xj.Ap0] = 4;
        } catch (NoSuchFieldError ignored) {}
    }
}
