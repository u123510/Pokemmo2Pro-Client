package cn.pokemmo.constant;

import f.rh0_1;

public abstract class CombatBattleSlotSwitchTable {
    public static final int[] fu0;

    static {
        int[] arr;
        try {
            arr = new int[rh0_1.Rx.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        fu0 = arr;
        try {
            fu0[rh0_1.yu0.t3] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            fu0[rh0_1.QB0.t3] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            fu0[rh0_1.gI.t3] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            fu0[rh0_1.fh0.t3] = 4;
        } catch (NoSuchFieldError ignored) {}
    }
}
