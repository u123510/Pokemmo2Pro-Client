package cn.pokemmo.constant;

import f.JU;

public abstract class PokemonGenderSwitchTable {
    public static final int[] ua0;

    static {
        ua0 = new int[JU.X90.clone().length];
        try {
            ua0[JU.Dv0.Ap0] = 1;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            ua0[JU.re0.Ap0] = 2;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            ua0[JU.fv0.Ap0] = 3;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
