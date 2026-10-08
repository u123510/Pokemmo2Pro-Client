package cn.pokemmo.constant;

import f.NA0;

public abstract class EntityDirectionSwitchTable {
    public static final int[] UC;

    static {
        int[] arr;
        try {
            arr = new int[NA0.UK.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        UC = arr;
        int[] indices = new int[]{2, 3, 6, 5, 4};
        for (int i = 0; i < indices.length; i++) {
            try {
                NA0 n = NA0.T70;
                UC[indices[i]] = i + 1;
            } catch (NoSuchFieldError ignored) {}
        }
    }
}
