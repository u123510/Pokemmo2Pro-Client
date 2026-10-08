package cn.pokemmo.ui.twl.core;

/**
 * TWL 边框与边缘度量类 (Border)
 * 原始混淆类: f.ux0_0
 */
public class TwlBorder {
    public static final TwlBorder ZERO = new TwlBorder(0);

    public final int top;
    public final int left;
    public final int bottom;
    public final int right;

    // 混淆字段兼容别名
    public final int aP;
    public final int ZK0;
    public final int W30;
    public final int Ar0;

    public TwlBorder(int all) {
        this(all, all, all, all);
    }

    public TwlBorder(int horizontal, int vertical) {
        this(vertical, horizontal, vertical, horizontal);
    }

    public TwlBorder(int top, int left, int bottom, int right) {
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;

        this.aP = top;
        this.ZK0 = left;
        this.W30 = bottom;
        this.Ar0 = right;
    }

    public int getTop() {
        return this.top;
    }

    public int getLeft() {
        return this.left;
    }

    public int getBottom() {
        return this.bottom;
    }

    public int getRight() {
        return this.right;
    }

    @Override
    public String toString() {
        return "[Border top=" + this.top + " left=" + this.left + " bottom=" + this.bottom + " right=" + this.right + "]";
    }
}
