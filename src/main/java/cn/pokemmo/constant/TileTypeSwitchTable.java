package cn.pokemmo.constant;

import f.hb_2;

public abstract class TileTypeSwitchTable {
    public static final int[] hp0;

    static {
        int len = 32;
        try {
            java.lang.reflect.Field f = hb_2.class.getDeclaredField("uG0");
            f.setAccessible(true);
            len = ((hb_2[]) f.get(null)).clone().length;
        } catch (Throwable ignored) {}
        hp0 = new int[len];
        int[] indices = new int[]{6, 7, 1, 2, 4, 5, 8};
        for (int i = 0; i < indices.length; i++) {
            try {
                hp0[indices[i]] = i + 1;
            } catch (NoSuchFieldError ignored) {}
        }
    }
}
