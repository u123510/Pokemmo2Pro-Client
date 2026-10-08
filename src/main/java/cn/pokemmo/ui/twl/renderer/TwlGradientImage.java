package cn.pokemmo.ui.twl.renderer;

import f.A00;
import f.Cu0;
import f.LPT6_;
import f.VT;
import f.ab_2;
import f.gn_0;
import f.gs0_0;
import f.nh0_1;
import f.q8_0;
import f.qq_0;
import f.rb_1;
import f.wl0_2;

/**
 * 渐变色彩图像 (GradientImage)
 */
public class TwlGradientImage implements wl0_2 {
    public final qq_0 mX;
    public final ab_2 v60;
    public final q8_0 jd0;
    public final gs0_0[] COM4;
    public final gn_0 Jt0;
    public final float kJ0;

    public TwlGradientImage(TwlGradientImage src, gn_0 tintColor) {
        this.mX = src.mX;
        this.v60 = src.v60;
        this.jd0 = src.jd0;
        this.COM4 = src.COM4;
        this.kJ0 = src.kJ0;
        this.Jt0 = tintColor;
    }

    public TwlGradientImage(qq_0 renderer, A00 params) {
        if (params.TE0() < 1) {
            throw new IllegalArgumentException("Need at least 1 stop for a gradient");
        }

        this.mX = renderer;
        this.v60 = params.xQ();
        this.Jt0 = gn_0.WHITE;
        if (params.TE0() == 1) {
            gn_0 color = params.mi(0).Ka0();
            this.jd0 = q8_0.Eb;
            gs0_0[] stops = new gs0_0[2];
            stops[0] = new gs0_0(0.0F, color);
            stops[1] = new gs0_0(1.0F, color);
            this.COM4 = stops;
            this.kJ0 = 1.0F;
        } else if (params.NP() == q8_0.S) {
            int count = params.TE0();
            this.jd0 = q8_0.ai0;
            this.COM4 = new gs0_0[count * 2 - 1];

            for (int i = 0; i < count; i++) {
                this.COM4[i] = params.mi(i);
            }

            this.kJ0 = this.COM4[count - 1].YD0() * 2.0F;
            int nextIdx = count;

            for (int j = count - 2; j >= 0; j--) {
                this.COM4[nextIdx] = new gs0_0(this.kJ0 - this.COM4[j].YD0(), this.COM4[j].Ka0());
                nextIdx++;
            }
        } else {
            this.jd0 = params.NP();
            this.COM4 = params.dt();
            this.kJ0 = this.COM4[this.COM4.length - 1].YD0();
        }
    }

    @Override
    public wl0_2 so(gn_0 tintColor) {
        return new Cu0((Cu0) this, this.Jt0.Uy(tintColor));
    }

    @Override
    public int Af() {
        if (this.v60 == ab_2.WD0) {
            return 1;
        }
        return Math.round(this.COM4[this.COM4.length - 1].A5);
    }

    @Override
    public int Nx() {
        if (this.v60 == ab_2.WD0) {
            return Math.round(this.COM4[this.COM4.length - 1].A5);
        }
        return 1;
    }

    @Override
    public void GO(VT vt, int x, int y) {
        if (this.v60 == ab_2.WD0) {
            this.go0(Math.round(this.COM4[this.COM4.length - 1].A5), 1);
        } else {
            this.Dl0(1, Math.round(this.COM4[this.COM4.length - 1].A5));
        }
    }

    @Override
    public void uf(rb_1 state, int x, int y, int width, int height) {
        if (this.v60 == ab_2.WD0) {
            this.go0(width, height);
        } else {
            this.Dl0(width, height);
        }
    }

    @Override
    public LPT6_ LT() {
        return null;
    }

    public void go0(int width, int height) {
        if (width > 0 && height > 0) {
            nh0_1 stack = this.mX.g50;
            float r = this.Jt0.HH();
            float g = this.Jt0.W1();
            float b = this.Jt0.eD0();
            float a = this.Jt0.bh();
            nh0_1 sub = stack.j60(r, g, b, a);
            if (this.jd0 == q8_0.Eb) {
                gs0_0[] arr = this.COM4;
                for (gs0_0 stop : arr) {
                    sub.VF(stop.NJ);
                }
            } else {
                float pos = 0.0F;
                do {
                    gs0_0[] arr = this.COM4;
                    for (gs0_0 stop : arr) {
                        float stopPos = stop.A5 + pos;
                        gn_0 color = stop.NJ;
                        if (stopPos >= (float) width) {
                            return;
                        }
                        sub.VF(color);
                    }
                    pos += this.kJ0;
                } while (this.jd0 == q8_0.ai0);
            }
        }
    }

    public void Dl0(int width, int height) {
        if (width > 0 && height > 0) {
            nh0_1 stack = this.mX.g50;
            float r = this.Jt0.HH();
            float g = this.Jt0.W1();
            float b = this.Jt0.eD0();
            float a = this.Jt0.bh();
            nh0_1 sub = stack.j60(r, g, b, a);
            if (this.jd0 == q8_0.Eb) {
                gs0_0[] arr = this.COM4;
                for (gs0_0 stop : arr) {
                    sub.VF(stop.NJ);
                }
            } else {
                float pos = 0.0F;
                do {
                    gs0_0[] arr = this.COM4;
                    for (gs0_0 stop : arr) {
                        float stopPos = stop.A5 + pos;
                        gn_0 color = stop.NJ;
                        if (stopPos >= (float) height) {
                            return;
                        }
                        sub.VF(color);
                    }
                    pos += this.kJ0;
                } while (this.jd0 == q8_0.ai0);
            }
        }
    }
}
