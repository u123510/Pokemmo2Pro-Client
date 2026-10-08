package cn.pokemmo.constant;

import f.RL0;

public abstract class AudioFormatSwitchTable {
    public static final int[] Fw0;

    static {
        int[] arr;
        try {
            arr = new int[RL0.Af0.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        Fw0 = arr;
        int[] indices = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < indices.length; i++) {
            try {
                RL0 r = RL0.S60;
                Fw0[indices[i]] = i + 1;
            } catch (NoSuchFieldError ignored) {}
        }
    }
}
