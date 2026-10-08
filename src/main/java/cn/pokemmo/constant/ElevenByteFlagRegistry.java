package cn.pokemmo.constant;

import f.*;

public class ElevenByteFlagRegistry {
    public static ElevenByteFlagRegistry rv;
    public static bm0_1 xk0;
    public final byte vz0;
    public final boolean WB0;

    public ElevenByteFlagRegistry(byte i1, boolean i2) {
        super();
        this.vz0 = i1;
        this.WB0 = i2;
    }

    static {
        if (f.xg_1.rv == null) {
            try {
                Class.forName(f.xg_1.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
