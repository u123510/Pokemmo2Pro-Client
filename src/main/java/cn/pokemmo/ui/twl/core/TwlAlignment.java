package cn.pokemmo.ui.twl.core;

import f.pa0_0;

/**
 * TWL 组件对齐规则枚举 (Alignment)
 * 原始混淆类: f.pa0_0
 */
public enum TwlAlignment {
    LEFT(0, 1),
    CENTER(1, 1),
    RIGHT(2, 1),
    TOP(1, 0),
    BOTTOM(1, 2),
    TOPLEFT(0, 0),
    TOPRIGHT(2, 0),
    BOTTOMLEFT(0, 2),
    BOTTOMRIGHT(2, 2),
    FILL(1, 1);

    public final byte horizontal;
    public final byte vertical;

    TwlAlignment(int horizontal, int vertical) {
        this.horizontal = (byte) horizontal;
        this.vertical = (byte) vertical;
    }

    public int computeXOffset(int parentWidth, int childWidth) {
        return Math.max(parentWidth - childWidth, 0) * this.horizontal / 2;
    }

    public int computeYOffset(int parentHeight, int childHeight) {
        return Math.max(parentHeight - childHeight, 0) * this.vertical / 2;
    }

    public pa0_0 toLegacy() {
        return pa0_0.valueOf(name());
    }

    public static TwlAlignment fromLegacy(pa0_0 legacy) {
        return legacy != null ? valueOf(legacy.name()) : CENTER;
    }
}
