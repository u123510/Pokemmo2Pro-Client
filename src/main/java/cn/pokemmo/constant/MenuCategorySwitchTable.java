package cn.pokemmo.constant;

import f.con__6;

public abstract class MenuCategorySwitchTable {
    public static final int[] AZ;

    static {
        int len = 32;
        try {
            java.lang.reflect.Field f = con__6.class.getDeclaredField("pc0");
            f.setAccessible(true);
            len = ((con__6[]) f.get(null)).clone().length;
        } catch (Throwable ignored) {}
        AZ = new int[len];
        int[] indices = new int[]{0, 1, 2, 3, 5, 4, 6};
        for (int i = 0; i < indices.length; i++) {
            try {
                con__6 c = con__6.Qs;
                AZ[indices[i]] = i + 1;
            } catch (NoSuchFieldError ignored) {}
        }
    }
}
