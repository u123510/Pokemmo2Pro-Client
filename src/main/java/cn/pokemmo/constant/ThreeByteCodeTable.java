package cn.pokemmo.constant;

import f.bm0_1;
import f.io_0;

public class ThreeByteCodeTable {
    public static ThreeByteCodeTable L0;
    public static ThreeByteCodeTable kj0;
    public static bm0_1 UP;
    public final byte t8;

    public ThreeByteCodeTable(byte i1) {
        this.t8 = i1;
    }

    public static ThreeByteCodeTable WB0(int i0) {
        return io_0.WB0(i0);
    }

    static {
        if (io_0.L0 == null) {
            try {
                Class.forName(io_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
