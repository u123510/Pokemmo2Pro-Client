package cn.pokemmo.constant;

import f.zp_0;

public abstract class CameraStateSwitchTable {
    public static final int[] MC0;

    static {
        int[] arr;
        try {
            arr = new int[zp_0.EO.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        MC0 = arr;
        int[] indices = new int[]{5, 9, 6, 10, 12, 19};
        for (int i = 0; i < indices.length; i++) {
            try {
                boolean[] b = zp_0.Wk;
                MC0[indices[i]] = i + 1;
            } catch (NoSuchFieldError ignored) {}
        }
    }
}
