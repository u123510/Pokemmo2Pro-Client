package cn.pokemmo.constant;

import f.oc_2;

public abstract class TileInteractionCategorySwitchTable {
    public static final int[] Mk;

    static {
        int[] arr;
        try {
            arr = new int[oc_2.Ge.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        Mk = arr;
        try {
            Mk[oc_2.y70.He0] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            Mk[oc_2.UJ.He0] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            Mk[oc_2.TF.He0] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            Mk[oc_2.Yn.He0] = 4;
        } catch (NoSuchFieldError ignored) {}
        try {
            Mk[oc_2.pK.He0] = 5;
        } catch (NoSuchFieldError ignored) {}
    }
}
