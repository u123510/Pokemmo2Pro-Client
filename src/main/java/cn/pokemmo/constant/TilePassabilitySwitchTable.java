package cn.pokemmo.constant;

import f._volatile;

public abstract class TilePassabilitySwitchTable {
    public static final int[] ff = new int[_volatile.e4.clone().length];

    static {
        try {
            ff[_volatile.BV.Hf] = 1;
        } catch (NoSuchFieldError unused) {}
        try {
            ff[_volatile.Bf0.Hf] = 2;
        } catch (NoSuchFieldError unused) {}
        try {
            ff[_volatile.Kb.Hf] = 3;
        } catch (NoSuchFieldError unused) {}
        try {
            ff[_volatile.JR.Hf] = 4;
        } catch (NoSuchFieldError unused) {}
        try {
            ff[_volatile.cN.Hf] = 5;
        } catch (NoSuchFieldError unused) {}
        try {
            ff[_volatile.kA0.Hf] = 6;
        } catch (NoSuchFieldError unused) {}
        try {
            ff[_volatile.CG0.Hf] = 7;
        } catch (NoSuchFieldError unused) {}
        try {
            ff[_volatile.Nk0.Hf] = 8;
        } catch (NoSuchFieldError unused) {}
    }
}
