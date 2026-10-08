package cn.pokemmo.constant;

import f.d70_0;

public abstract class WeatherConditionSwitchTable {
    public static final int[] p1;

    static {
        int[] arr;
        try {
            arr = new int[d70_0.SN.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        p1 = arr;
        try {
            p1[d70_0.Sl0.Mf] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            p1[d70_0.Ga0.Mf] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            p1[d70_0.Mt0.Mf] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            p1[d70_0.gl.Mf] = 4;
        } catch (NoSuchFieldError ignored) {}
        try {
            p1[d70_0.tA.Mf] = 5;
        } catch (NoSuchFieldError ignored) {}
        try {
            p1[d70_0.gh.Mf] = 6;
        } catch (NoSuchFieldError ignored) {}
    }
}
