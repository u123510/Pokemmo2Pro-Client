package cn.pokemmo.ui.twl.theme;

import f.EU;
import f.LPT6_;
import f.MD0;
import f.VT;
import f.gn_0;
import f.h6_0;
import f.ix_1;
import f.ob_0;
import f.pc0_1;
import f.rb_1;
import f.ux0_0;
import f.wl0_2;

/**
 * 动画图像渲染器 (AnimatedImage)
 */
public class TwlAnimatedImage implements wl0_2, ix_1 {
    public final pc0_1 renderer;
    public final EU animation;
    public final MD0 stateKey;
    public final ux0_0 border;
    public final float r;
    public final float g;
    public final float b;
    public final float a;
    public final int width;
    public final int height;
    public final int duration;

    public TwlAnimatedImage(pc0_1 renderer, h6_0 animation, String stateKeyName, ux0_0 border, gn_0 tintColor, int duration) {
        this.renderer = renderer;
        this.animation = animation;
        this.stateKey = MD0.cB(stateKeyName);
        this.border = border;
        this.r = tintColor.HH();
        this.g = tintColor.W1();
        this.b = tintColor.eD0();
        this.a = tintColor.bh();
        this.width = animation.zt0();
        this.height = animation.a0();
        this.duration = duration;
    }

    public TwlAnimatedImage(TwlAnimatedImage src, gn_0 tintColor) {
        this.renderer = src.renderer;
        this.animation = src.animation;
        this.stateKey = src.stateKey;
        this.border = src.border;
        this.r = tintColor.HH() * src.r;
        this.g = tintColor.W1() * src.g;
        this.b = tintColor.eD0() * src.b;
        this.a = tintColor.bh() * src.a;
        this.width = src.width;
        this.height = src.height;
        this.duration = src.duration;
    }

    @Override
    public int Nx() {
        return this.width;
    }

    @Override
    public int Af() {
        return this.height;
    }

    @Override
    public void GO(VT vt, int x, int y) {
        this.uf(vt, x, y, this.width, this.height);
    }

    @Override
    public void uf(rb_1 state, int x, int y, int width, int height) {
        int animTime = 0;
        if (state != null) {
            animTime = this.duration >= 0 && !state.tI0(this.stateKey) ? this.duration : state.Bd(this.stateKey);
        }
        this.animation.Cs0(animTime, null, x, y, width, height, (ob_0) this, state);
    }

    @Override
    public ux0_0 MY() {
        return this.border;
    }

    @Override
    public wl0_2 so(gn_0 tintColor) {
        return new ob_0((ob_0) this, tintColor);
    }

    @Override
    public LPT6_ LT() {
        return null;
    }
}
