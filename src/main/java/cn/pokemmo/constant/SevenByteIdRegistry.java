package cn.pokemmo.constant;

import f.*;

public class SevenByteIdRegistry {
    public static SevenByteIdRegistry cZ;
    public static SevenByteIdRegistry U4;
    public static SevenByteIdRegistry sm0;
    public static SevenByteIdRegistry cOm9;
    public static SevenByteIdRegistry lV;
    public static SevenByteIdRegistry vz;
    public static bm0_1 S0;
    public static SevenByteIdRegistry[] oH;
    public final byte Dz;
    public final int f50;

    public SevenByteIdRegistry(byte i1, int i2) {
        this.f50 = i2;
        this.Dz = i1;
    }

    static {
        if (f.gw0_0.cZ == null) {
            try {
                Class.forName(f.gw0_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
