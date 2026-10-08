package cn.pokemmo.ui.twl.theme;

import f.EU;
import f.com3__2;
import f.fe_2;
import f.gn_0;
import f.ob_0;
import f.qq_0;
import f.rb_1;
import f.wl0_2;

/**
 * 动画帧定义 (AnimatedImage.Img)
 */
public class TwlAnimatedImageFrame extends EU {
    public final wl0_2 image;
    public final float r;
    public final float g;
    public final float b;
    public final float a;
    public final float zoomX;
    public final float zoomY;
    public final float anchorX;
    public final float anchorY;

    public TwlAnimatedImageFrame(int duration, wl0_2 image, gn_0 tintColor, float zoomX, float zoomY, float anchorX, float anchorY) {
        if (duration < 0) {
            throw new IllegalArgumentException("duration");
        }
        this.Dh = duration;
        this.image = image;
        this.r = tintColor.HH();
        this.g = tintColor.W1();
        this.b = tintColor.eD0();
        this.a = tintColor.bh();
        this.zoomX = zoomX;
        this.zoomY = zoomY;
        this.anchorX = anchorX;
        this.anchorY = anchorY;
    }

    @Override
    public int zt0() {
        return this.image.Nx();
    }

    @Override
    public int a0() {
        return this.image.Af();
    }

    @Override
    public com3__2 jo() {
        return (com3__2) this;
    }

    @Override
    public void Cs0(int n, com3__2 prevFrame, int x, int y, int width, int height, ob_0 animImg, rb_1 animState) {
        float curR = this.r;
        float curG = this.g;
        float curB = this.b;
        float curA = this.a;
        float curZoomX = this.zoomX;
        float curZoomY = this.zoomY;
        float curAnchorX = this.anchorX;
        float curAnchorY = this.anchorY;
        if (prevFrame != null) {
            float progress = (float) n / (float) this.Dh;
            curR = fe_2.Ga0(prevFrame.kK, curR, progress, curR);
            curG = fe_2.Ga0(prevFrame.mg, curG, progress, curG);
            curB = fe_2.Ga0(prevFrame.Qr, curB, progress, curB);
            curA = fe_2.Ga0(prevFrame.WW, curA, progress, curA);
            curZoomX = fe_2.Ga0(prevFrame.Yc, curZoomX, progress, curZoomX);
            curZoomY = fe_2.Ga0(prevFrame.aM0, curZoomY, progress, curZoomY);
            curAnchorX = fe_2.Ga0(prevFrame.JL0, curAnchorX, progress, curAnchorX);
            curAnchorY = fe_2.Ga0(prevFrame.nl, curAnchorY, progress, curAnchorY);
        }
        float tr = curR * animImg.sr;
        float tg = curG * animImg.bh;
        float tb = curB * animImg.b20;
        float ta = curA * animImg.aq;
        ((qq_0) animImg.e20).g50 = ((qq_0) animImg.e20).g50.j60(tr, tg, tb, ta);
        int renderWidth = (int) ((float) width * curZoomX);
        int renderHeight = (int) ((float) height * curZoomY);
        wl0_2 img;
        try {
            img = this.image;
        } catch (Throwable th) {
            ((qq_0) animImg.e20).kY();
            throw th;
        }
        int posX = x + (int) ((float) (width - renderWidth) * curAnchorX);
        int posY = y + (int) ((float) (height - renderHeight) * curAnchorY);
        img.uf(animState, posX, posY, renderWidth, renderHeight);
        ((qq_0) animImg.e20).kY();
    }
}
