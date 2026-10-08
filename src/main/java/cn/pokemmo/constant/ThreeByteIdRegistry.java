package cn.pokemmo.constant;

import f.*;

public class ThreeByteIdRegistry {
    public static ThreeByteIdRegistry cH;
    public static ThreeByteIdRegistry RN;
    public static bm0_1 N8;
    public final byte Hz;

    public ThreeByteIdRegistry(int i1) {
        super();
        this.Hz = (byte) i1;
    }

    public static void hL0(byte i0) {
        tW unused = (tW) N8.BM(i0);
    }

    static {
        if (f.tW.cH == null) {
            try {
                Class.forName(f.tW.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
