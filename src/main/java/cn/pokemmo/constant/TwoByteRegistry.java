package cn.pokemmo.constant;

import f.*;

public class TwoByteRegistry {
    public static TwoByteRegistry YS;
    public static TwoByteRegistry[] sC0;
    public final byte yI;

    public TwoByteRegistry(byte i1) {
        super();
        this.yI = i1;
    }

    public static ur_0 pv0(byte i0) {
        return f.ur_0.pv0(i0);
    }

    static {
        if (f.ur_0.YS == null) {
            try {
                Class.forName(f.ur_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
