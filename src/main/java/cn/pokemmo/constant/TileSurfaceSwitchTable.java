package cn.pokemmo.constant;

import f.yi_0;

public abstract class TileSurfaceSwitchTable {
    public static final int[] QP;

    static {
        int[] arr;
        try {
            arr = new int[yi_0.pI0.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        QP = arr;
        int[] indices = new int[]{0, 1, 2, 4, 3};
        for (int i = 0; i < indices.length; i++) {
            try {
                yi_0 y = yi_0.uI;
                QP[indices[i]] = i + 1;
            } catch (NoSuchFieldError ignored) {}
        }
    }
}
