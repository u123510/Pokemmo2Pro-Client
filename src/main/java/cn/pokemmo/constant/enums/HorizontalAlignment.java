package cn.pokemmo.constant.enums;

import f.*;

public enum HorizontalAlignment {
    LEFT(jh_0.zN, 0, 1),
    CENTER(jh_0.WV, 1, 1),
    RIGHT(jh_0.dq, 2, 1),
    TOP(jh_0.WV, 1, 0),
    BOTTOM(jh_0.WV, 1, 2),
    TOPLEFT(jh_0.zN, 0, 0),
    TOPRIGHT(jh_0.dq, 2, 0),
    BOTTOMLEFT(jh_0.zN, 0, 2),
    BOTTOMRIGHT(jh_0.dq, 2, 2),
    FILL(jh_0.WV, 1, 1);

    // Obfuscated source names are retained as aliases for existing callers.
    public static final HorizontalAlignment xE = LEFT;
    public static final HorizontalAlignment Ol = CENTER;
    public static final HorizontalAlignment up0 = RIGHT;
    public static final HorizontalAlignment dC0 = TOP;
    public static final HorizontalAlignment L00 = BOTTOM;
    public static final HorizontalAlignment qQ = TOPLEFT;
    public static final HorizontalAlignment Mk = TOPRIGHT;
    public static final HorizontalAlignment rr0 = BOTTOMLEFT;
    public static final HorizontalAlignment Ht0 = BOTTOMRIGHT;
    public static final HorizontalAlignment Vp0 = FILL;

    public final jh_0 uf;
    public final byte CB0;
    public final byte V4;

    HorizontalAlignment(jh_0 axis, int horizontal, int vertical) {
        this.uf = axis;
        this.CB0 = (byte) horizontal;
        this.V4 = (byte) vertical;
    }

    public final int uD0(int first, int second) {
        return Math.max(first - second, 0) * this.CB0 / 2;
    }

    public final int Kr0(int first, int second) {
        return Math.max(first - second, 0) * this.V4 / 2;
    }

    public f.pa0_0 toLegacy() {
        return f.pa0_0.valueOf(name());
    }
}