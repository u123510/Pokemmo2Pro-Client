package cn.pokemmo.ui.twl.theme;

import f.a7_0;
import f.gn_0;
import f.le0_2;
import f.ou_1;
import f.t5_0;

/**
 * 颜色渐变与着色动画控制器 (TintAnimator)
 */
public class TwlTintAnimator {
    public final ou_1 sl0;
    public final float[] gh0;
    public int MB0;
    public boolean pb0;
    public boolean LpT8;
    public Runnable[] so0;

    public TwlTintAnimator(ou_1 timer, gn_0 color) {
        if (color == null) {
            throw new NullPointerException("color");
        }
        this.sl0 = timer;
        this.gh0 = new float[12];
        this.i10(color);
    }

    public TwlTintAnimator(le0_2 owner, gn_0 color) {
        this(new t5_0(owner), color);
    }

    public TwlTintAnimator(t5_0 timer) {
        this(timer, gn_0.WHITE);
    }

    public TwlTintAnimator(le0_2 owner) {
        this(new t5_0(owner));
    }

    public final void setColor(gn_0 color) {
        this.i10(color);
    }

    public final void i10(gn_0 color) {
        this.gh0[0] = color.HH();
        this.gh0[1] = color.W1();
        this.gh0[2] = color.eD0();
        this.gh0[3] = color.bh();
        this.gh0[4] = color.HH();
        this.gh0[5] = color.W1();
        this.gh0[6] = color.eD0();
        this.gh0[7] = color.bh();
        this.LpT8 = !gn_0.WHITE.equals(color);
        this.pb0 = false;
        this.MB0 = 0;
        this.sl0.oM();
    }

    public final void addCallback(Runnable callback) {
        this.Q4(callback);
    }

    public final void Q4(Runnable callback) {
        this.so0 = (Runnable[]) a7_0.gE(this.so0, callback, Runnable.class);
    }

    public final void fadeTo(gn_0 color, int duration) {
        this.bT(color, duration);
    }

    public final void bT(gn_0 color, int duration) {
        if (duration <= 0) {
            this.i10(color);
            return;
        }
        this.gh0[8] = color.HH();
        this.gh0[9] = color.W1();
        this.gh0[10] = color.eD0();
        this.gh0[11] = color.bh();
        System.arraycopy(this.gh0, 0, this.gh0, 4, 4);
        this.pb0 = true;
        this.MB0 = duration;
        this.LpT8 = true;
        this.sl0.oM();
    }

    public final void fadeOut(int duration) {
        this.iG0(duration);
    }

    public final void iG0(int duration) {
        if (duration <= 0) {
            this.gh0[3] = 0.0F;
            this.pb0 = false;
            this.MB0 = 0;
            this.LpT8 = true;
            return;
        }
        System.arraycopy(this.gh0, 0, this.gh0, 4, 8);
        this.gh0[11] = 0.0F;
        this.pb0 = !(this.gh0[3] <= 0.001F);
        this.MB0 = duration;
        this.LpT8 = true;
        this.sl0.oM();
    }

    public final void update() {
        this.dn0();
    }

    public final void dn0() {
        if (!this.pb0) {
            return;
        }
        int elapsed = this.sl0.Oe();
        float progress = (float) Math.min(elapsed, this.MB0) / (float) this.MB0;
        float inverse = 1.0F - progress;
        float[] colors = this.gh0;
        for (int i = 0; i < 4; i++) {
            float start = colors[i + 4] * inverse;
            colors[i] = colors[i + 8] * progress + start;
        }
        if (elapsed < this.MB0) {
            return;
        }
        this.pb0 = false;
        boolean belowThreshold = colors[0] < 0.9990000129F
                || colors[1] < 0.9990000129F
                || colors[2] < 0.9990000129F
                || colors[3] < 0.9990000129F;
        this.LpT8 = belowThreshold;
        a7_0.bH(this.so0);
    }

    public final boolean isFading() {
        return this.pb0;
    }

    public final boolean dL0() {
        return this.pb0;
    }
}
