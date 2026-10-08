package cn.pokemmo.constant;

import f.MG0;

public abstract class AnimationStateSwitchTable {
    public static final int[] Ku0;

    static {
        Ku0 = new int[3];
        try {
            MG0.lpt6.getClass();
            Ku0[0] = 1;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            Ku0[1] = 2;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            Ku0[2] = 3;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
