package cn.pokemmo.constant;

import f.fq_2;

public abstract class StatTypeSwitchTable {
    public static final int[] vm0;

    static {
        int[] arr = null;
        try {
            fq_2[] d00 = (fq_2[]) fq_2.class.getField("d00").get(null);
            arr = new int[d00.length];
        } catch (Throwable t) {
            arr = new int[9];
        }
        vm0 = arr;
        for (int i = 0; i < 9; i++) {
            try {
                vm0[i] = i + 1;
            } catch (NoSuchFieldError unused) {}
        }
    }
}
