package f;

import cn.pokemmo.ui.twl.theme.TwlAnimatedImageFrame;

/**
 * 动画帧兼容垫片
 * @see cn.pokemmo.ui.twl.theme.TwlAnimatedImageFrame
 */
public final class com3__2 extends TwlAnimatedImageFrame {
    public final wl0_2 lp;
    public final float kK;
    public final float mg;
    public final float Qr;
    public final float WW;
    public final float Yc;
    public final float aM0;
    public final float JL0;
    public final float nl;

    public com3__2(int duration, wl0_2 image, gn_0 tintColor, float zoomX, float zoomY, float anchorX, float anchorY) {
        super(duration, image, tintColor, zoomX, zoomY, anchorX, anchorY);
        this.lp = image;
        this.kK = this.r;
        this.mg = this.g;
        this.Qr = this.b;
        this.WW = this.a;
        this.Yc = zoomX;
        this.aM0 = zoomY;
        this.JL0 = anchorX;
        this.nl = anchorY;
    }
}
