package cn.pokemmo.constant;

import f.kt_2;

public abstract class PacketCommandSwitchTable {
    public static final int[] td0;

    static {
        int[] arr = null;
        try {
            kt_2[] s3 = (kt_2[]) kt_2.class.getField("s3").get(null);
            arr = new int[s3.length];
        } catch (Throwable t) {
            arr = new int[17];
        }
        td0 = arr;
        int[] indices = new int[]{0, 1, 2, 4, 10, 16, 3, 13, 12};
        for (int i = 0; i < indices.length; i++) {
            try {
                td0[indices[i]] = i + 1;
            } catch (NoSuchFieldError unused) {}
        }
    }
}
