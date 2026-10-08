package cn.pokemmo.constant;

import f.bm0_1;
import f.j00_0;

public abstract class WeatherTypeSwitchTable {
    public static final int[] vi0;

    static {
        int[] arr;
        try {
            arr = new int[j00_0.Ra.clone().length];
        } catch (Throwable t) {
            arr = new int[32];
        }
        vi0 = arr;
        int[] indices = new int[]{1, 10, 0, 5, 9, 12};
        for (int i = 0; i < indices.length; i++) {
            try {
                bm0_1 b = j00_0.gD0;
                vi0[indices[i]] = i + 1;
            } catch (NoSuchFieldError ignored) {}
        }
    }
}
