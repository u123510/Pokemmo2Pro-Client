package cn.pokemmo.constant;

import f.ib0_0;

public abstract class ChatMessageScopeSwitchTable {
    public static final int[] U30;

    static {
        int[] arr;
        try {
            arr = new int[ib0_0.Ie.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        U30 = arr;
        try {
            U30[ib0_0.sh.ku0] = 1;
        } catch (NoSuchFieldError ignored) {}
        try {
            U30[ib0_0.Ah0.ku0] = 2;
        } catch (NoSuchFieldError ignored) {}
        try {
            U30[ib0_0.LpT4.ku0] = 3;
        } catch (NoSuchFieldError ignored) {}
        try {
            U30[ib0_0.ms.ku0] = 4;
        } catch (NoSuchFieldError ignored) {}
        try {
            U30[ib0_0.V70.ku0] = 5;
        } catch (NoSuchFieldError ignored) {}
    }
}
