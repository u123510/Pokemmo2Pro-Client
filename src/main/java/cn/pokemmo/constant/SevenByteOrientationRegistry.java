package cn.pokemmo.constant;

import f.bm0_1;

public class SevenByteOrientationRegistry {
    public static SevenByteOrientationRegistry sn;
    public static SevenByteOrientationRegistry AR;
    public static SevenByteOrientationRegistry vI;
    public static SevenByteOrientationRegistry o2;
    public static bm0_1 JR;
    public static SevenByteOrientationRegistry[] hs0;
    public final byte NC;
    public final int LP;

    public SevenByteOrientationRegistry(int i1, int i2) {
        this.LP = i2;
        this.NC = (byte) i1;
    }

    static {
        if (f.dn_1.sn == null) {
            try {
                Class.forName(f.dn_1.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
