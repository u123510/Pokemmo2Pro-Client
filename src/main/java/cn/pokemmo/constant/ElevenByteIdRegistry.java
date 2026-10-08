package cn.pokemmo.constant;

import f.*;

public class ElevenByteIdRegistry {
    public static ElevenByteIdRegistry dX;
    public static ElevenByteIdRegistry xm0;
    public static ElevenByteIdRegistry cD0;
    public static bm0_1 rx0;
    public static ElevenByteIdRegistry[] Kq0;
    public final byte Rl0;
    public final int n10;
    public final int wx0;

    public ElevenByteIdRegistry(int first, int second, int third) {
        this.wx0 = first;
        this.Rl0 = (byte) second;
        this.n10 = third;
    }

    static {
        if (f.tc_1.dX == null) {
            try {
                Class.forName(f.tc_1.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public final int Q3() {
        return this.n10;
    }
}
