package cn.pokemmo.constant;

import f.*;

public class SevenByteOffsetRegistry {
    public static SevenByteOffsetRegistry Jr;
    public static SevenByteOffsetRegistry HH0;
    public static SevenByteOffsetRegistry oG;
    public static SQ yz0;
    public static SevenByteOffsetRegistry[] Su0;
    public final int YD;
    public final int gk;
    public final int al0;

    public SevenByteOffsetRegistry(int i1, int i2, int i3) {
        this.al0 = i1;
        this.YD = i2;
        this.gk = i3;
    }

    static {
        if (f.xj_0.Jr == null) {
            try {
                Class.forName(f.xj_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
