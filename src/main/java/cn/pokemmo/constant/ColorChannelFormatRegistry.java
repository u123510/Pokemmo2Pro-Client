package cn.pokemmo.constant;

import f.*;

public class ColorChannelFormatRegistry {
    public static ColorChannelFormatRegistry Wd0;
    public static ColorChannelFormatRegistry Jk0;
    public static ColorChannelFormatRegistry wi;
    public static ColorChannelFormatRegistry lA0;
    public static ColorChannelFormatRegistry[] L60;
    public final byte ei0;
    public final int cOn;
    public final byte p8;
    public final int FH;

    public ColorChannelFormatRegistry(int i1, byte i2, byte i3, int i4) {
        this.FH = i1;
        this.ei0 = i2;
        this.p8 = i3;
        this.cOn = i4;
    }

    static {
        if (f.ol0_0.Wd0 == null) {
            try {
                Class.forName(f.ol0_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
