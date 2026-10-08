package cn.pokemmo.constant;

import f._volatile;

public abstract class MovementPassageSwitchTable {
    public static final int[] Z8;

    static {
        int[] arr;
        try {
            arr = new int[_volatile.e4.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        Z8 = arr;
        try {
            Z8[_volatile.BV.Hf] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            Z8[_volatile.CG0.Hf] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            Z8[_volatile.Bf0.Hf] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            Z8[_volatile.Kb.Hf] = 4;
        } catch (NoSuchFieldError ignored) {}
        try {
            Z8[_volatile.JR.Hf] = 5;
        } catch (NoSuchFieldError ignored) {}
        try {
            Z8[_volatile.cN.Hf] = 6;
        } catch (NoSuchFieldError ignored) {}
    }
}
