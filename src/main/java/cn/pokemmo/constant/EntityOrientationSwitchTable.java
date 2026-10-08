package cn.pokemmo.constant;

import f.dn_1;

public abstract class EntityOrientationSwitchTable {
    public static final int[] VC;

    static {
        int[] arr;
        try {
            arr = new int[dn_1.hs0.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        VC = arr;
        try {
            VC[dn_1.sn.LP] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            VC[dn_1.AR.LP] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            VC[dn_1.o2.LP] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            VC[dn_1.vI.LP] = 4;
        } catch (NoSuchFieldError ignored) {}
    }
}
