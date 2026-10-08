package f;

import cn.pokemmo.constant.enums.HorizontalAlignment;
import cn.pokemmo.ui.twl.core.TwlAlignment;

/**
 * TWL 对齐枚举兼容垫片 - pa0_0 -> TwlAlignment
 */
public enum pa0_0 {
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
    public static final pa0_0 xE = LEFT;
    public static final pa0_0 Ol = CENTER;
    public static final pa0_0 up0 = RIGHT;
    public static final pa0_0 dC0 = TOP;
    public static final pa0_0 L00 = BOTTOM;
    public static final pa0_0 qQ = TOPLEFT;
    public static final pa0_0 Mk = TOPRIGHT;
    public static final pa0_0 rr0 = BOTTOMLEFT;
    public static final pa0_0 Ht0 = BOTTOMRIGHT;
    public static final pa0_0 Vp0 = FILL;

    public final jh_0 uf;
    public final byte CB0;
    public final byte V4;

    pa0_0(jh_0 axis, int horizontal, int vertical) {
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

    public TwlAlignment toModern() {
        return TwlAlignment.valueOf(name());
    }

    public static pa0_0 fromModern(TwlAlignment alignment) {
        return alignment != null ? valueOf(alignment.name()) : CENTER;
    }
}