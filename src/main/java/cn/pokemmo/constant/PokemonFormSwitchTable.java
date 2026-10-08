package cn.pokemmo.constant;

import f.pg0_0;

public abstract class PokemonFormSwitchTable {
    public static final int[] Gs;

    static {
        int[] arr;
        try {
            arr = new int[pg0_0.C2.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        Gs = arr;
        try {
            Gs[pg0_0.ze0.Com4] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            Gs[pg0_0.Ix0.Com4] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            Gs[pg0_0.DK.Com4] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            Gs[pg0_0.Zr0.Com4] = 4;
        } catch (NoSuchFieldError ignored) {}
        try {
            Gs[pg0_0.s60.Com4] = 5;
        } catch (NoSuchFieldError ignored) {}
    }
}
