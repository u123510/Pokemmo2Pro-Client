package cn.pokemmo.constant;

import f.cr_0;

public abstract class ShopTabSwitchTable {
    public static final int[] KA;

    static {
        int[] arr;
        try {
            arr = new int[cr_0.QD0.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        KA = arr;
        try {
            KA[cr_0.u90.MM] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            KA[cr_0.l3.MM] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            KA[cr_0.Lk0.MM] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            KA[cr_0.Xz0.MM] = 4;
        } catch (NoSuchFieldError ignored) {}
    }
}
