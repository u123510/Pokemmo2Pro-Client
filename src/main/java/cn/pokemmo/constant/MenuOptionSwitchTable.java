package cn.pokemmo.constant;

import f.Pv0;

public abstract class MenuOptionSwitchTable {
    public static final int[] gC;

    static {
        Pv0 initialized = Pv0.o6;
        gC = new int[5];
        try {
            gC[1] = 1;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            gC[3] = 2;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
