package cn.pokemmo.constant;

import f.*;

public class FiveByteIdRegistry {
    public static FiveByteIdRegistry eu0;
    public static FiveByteIdRegistry x8;
    public static FiveByteIdRegistry rB;
    public static FiveByteIdRegistry Sg;
    public static bm0_1 Fd;
    public final byte Com3;

    public FiveByteIdRegistry(byte i1) {
        super();
        this.Com3 = i1;
    }

    static {
        if (f.nl0_0.eu0 == null) {
            try {
                Class.forName(f.nl0_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
