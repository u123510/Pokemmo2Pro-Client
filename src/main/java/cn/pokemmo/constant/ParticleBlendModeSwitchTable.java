package cn.pokemmo.constant;

import f.Ct0;
import f.bm0_1;

public abstract class ParticleBlendModeSwitchTable {
    public static final int[] WZ;

    static {
        int[] arr;
        try {
            arr = new int[Ct0.fE.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        WZ = arr;
        int[] indices = new int[]{3, 0, 1, 2, 4};
        for (int i = 0; i < indices.length; i++) {
            try {
                bm0_1 b = Ct0.p70;
                WZ[indices[i]] = i + 1;
            } catch (NoSuchFieldError ignored) {}
        }
    }
}
