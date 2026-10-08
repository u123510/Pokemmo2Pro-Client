package cn.pokemmo.constant;

import f.*;

public class SixByteIdRegistry {
    public static SixByteIdRegistry y70;
    public static SixByteIdRegistry TF;
    public static SixByteIdRegistry UJ;
    public static SixByteIdRegistry Yn;
    public static SixByteIdRegistry w80;
    public static SixByteIdRegistry pK;
    public static bm0_1 CL0;
    public static SixByteIdRegistry[] Ge;
    public final byte ld0;
    public final int He0;

    public SixByteIdRegistry(int i1, int i2) {
        this.He0 = i1;
        this.ld0 = (byte) i2;
    }

    static {
        if (f.oc_2.y70 == null) {
            try {
                Class.forName(f.oc_2.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
