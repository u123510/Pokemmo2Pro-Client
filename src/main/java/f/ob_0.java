package f;

import cn.pokemmo.ui.twl.theme.TwlAnimatedImage;

/**
 * 动画图像兼容垫片
 * @see cn.pokemmo.ui.twl.theme.TwlAnimatedImage
 */
public final class ob_0 extends TwlAnimatedImage {
    public final pc0_1 e20;
    public final EU Wo0;
    public final MD0 U9;
    public final ux0_0 o00;
    public final float sr;
    public final float bh;
    public final float b20;
    public final float aq;
    public final int Ox;
    public final int TU;
    public final int Bv;

    public ob_0(pc0_1 pc0_12, h6_0 h6_02, String string, ux0_0 ux0_02, gn_0 gn_02, int n) {
        super(pc0_12, h6_02, string, ux0_02, gn_02, n);
        this.e20 = pc0_12;
        this.Wo0 = h6_02;
        this.U9 = this.stateKey;
        this.o00 = ux0_02;
        this.sr = this.r;
        this.bh = this.g;
        this.b20 = this.b;
        this.aq = this.a;
        this.Ox = this.width;
        this.TU = this.height;
        this.Bv = n;
    }

    public ob_0(ob_0 ob_02, gn_0 gn_02) {
        super(ob_02, gn_02);
        this.e20 = ob_02.e20;
        this.Wo0 = ob_02.Wo0;
        this.U9 = ob_02.U9;
        this.o00 = ob_02.o00;
        this.sr = this.r;
        this.bh = this.g;
        this.b20 = this.b;
        this.aq = this.a;
        this.Ox = ob_02.Ox;
        this.TU = ob_02.TU;
        this.Bv = ob_02.Bv;
    }
}
