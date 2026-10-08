package cn.pokemmo.constant;

import f.*;

public class FiveByteStateCodeRegistry {
    public static FiveByteStateCodeRegistry uI;
    public static FiveByteStateCodeRegistry L5;
    public static FiveByteStateCodeRegistry f1;
    public static FiveByteStateCodeRegistry eO;
    public static FiveByteStateCodeRegistry jc;
    public static bm0_1 Yt0;
    public static yi_0[] pI0;
    public final byte ql0;
    public final int zS;

    public FiveByteStateCodeRegistry(byte i1, int i2) {
        this.zS = i2;
        this.ql0 = i1;
    }

    static {
        if (f.yi_0.uI == null) {
            try {
                Class.forName(f.yi_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
