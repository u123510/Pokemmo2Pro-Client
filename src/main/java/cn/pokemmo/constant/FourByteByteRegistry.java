package cn.pokemmo.constant;

import f.*;

public class FourByteByteRegistry {
    public static FourByteByteRegistry Hi;
    public static FourByteByteRegistry Z;
    public static FourByteByteRegistry th0;
    public static FourByteByteRegistry ee0;
    public static bm0_1 v7;
    public static j30_0[] Wg0;
    public final byte pU;
    public final int Jr;

    public FourByteByteRegistry(int i1, byte i2) {
        super();
        this.Jr = i1;
        this.pU = i2;
    }

    static {
        if (f.j30_0.Hi == null) {
            try {
                Class.forName(f.j30_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
