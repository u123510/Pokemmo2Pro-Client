package cn.pokemmo.constant;

import f.*;

public class ThreeByteCodeRegistry {
    public static ThreeByteCodeRegistry At;
    public static bm0_1 H70;
    public final byte GH0;
    public final byte xA;
    public final int px;

    public ThreeByteCodeRegistry(byte first, byte second, int id) {
        this.GH0 = first;
        this.xA = second;
        this.px = id;
    }

    static {
        if (f.k80_0.At == null) {
            try {
                Class.forName(f.k80_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    @Override
    public final String toString() {
        return sm0_0.cU.l90(this.px) ? sm0_0.c0(this.px) : super.toString();
    }
}
