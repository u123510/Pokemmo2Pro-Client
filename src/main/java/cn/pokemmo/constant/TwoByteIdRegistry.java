package cn.pokemmo.constant;

import f.bm0_1;
import f.lpt6__2;

public class TwoByteIdRegistry {
    public static TwoByteIdRegistry Q80;
    public static TwoByteIdRegistry YG0;
    public static bm0_1 If;
    public static TwoByteIdRegistry[] Qm;
    public final byte UB0;

    public TwoByteIdRegistry(int i1) {
        this.UB0 = (byte) i1;
    }

    public static TwoByteIdRegistry rI0(byte i0) {
        return lpt6__2.rI0(i0);
    }

    static {
        if (lpt6__2.Q80 == null) {
            try {
                Class.forName(lpt6__2.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
