package cn.pokemmo.ui.widget.model;

import f.*;

public class ThemeStateFlagConstants {
    public static ThemeStateFlagConstants Bf0;
    public static ThemeStateFlagConstants BV;
    public static ThemeStateFlagConstants Ch;
    public static ThemeStateFlagConstants JR;
    public static ThemeStateFlagConstants kA0;
    public static ThemeStateFlagConstants Ic;
    public static ThemeStateFlagConstants CG0;
    public static ThemeStateFlagConstants Kb;
    public static ThemeStateFlagConstants cN;
    public static ThemeStateFlagConstants Nk0;
    public static ThemeStateFlagConstants[] pG0;
    public static ThemeStateFlagConstants[] VA;
    public static ThemeStateFlagConstants[] COm9;
    public static bm0_1 zs0;
    public static ThemeStateFlagConstants[] e4;
    public final byte Go0;
    public final int fq;
    public final boolean FL0;
    public final boolean zK0;
    public final boolean Uf0;
    public final boolean vr0;
    public final int Hf;

    public ThemeStateFlagConstants(int h, byte group, int frequency, boolean flag1, boolean flag2, boolean flag3, boolean flag4) {
        this.Hf = h;
        this.Go0 = group;
        this.fq = frequency;
        this.FL0 = flag1;
        this.zK0 = flag2;
        this.Uf0 = flag3;
        this.vr0 = flag4;
    }

    static {
        if (f._volatile.Bf0 == null) {
            try {
                Class.forName(f._volatile.class.getName());
            } catch (Throwable ignored) {}
        }
    }

    public final boolean TV() {
        return this.FL0;
    }

    public final boolean JX() {
        return this.Uf0;
    }

    public final boolean Fs() {
        return this.vr0;
    }
}
