/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

import f.L;
import f.N1;
import f.TO;
import f.a7_0;
import f.e60_0;
import f.fy_2;
import f.gn_0;
import f.gt_0;
import f.kj0_0;
import f.qc_0;
import f.rk0_0;
import f.w10_0;
import f.zk0_1;

public abstract class BorderContainerLayout extends BaseLayoutBox {
    public static final String[] K4 = new String[]{"Red", "Green", "Blue", "Alpha"};
    public kj0_0 PW;
    public float[] Ou;
    public qc_0[] LT;
    public boolean Sc = true;
    public boolean qc0 = false;
    public boolean OR = true;
    public boolean xm = false;
    public boolean RE = true;
    public boolean Wy0 = true;
    public final boolean qj0;
    public Runnable[] jm0;
    public int u20 = gn_0.WHITE.ls();
    public TO[] yD;
    public e60_0 Lpt7;
    public N1 jj0;
    public boolean LPT8;

    public BorderContainerLayout(L l) {
        this.qj0 = true;
        this.cM(l);
    }

    @Override
    public final String Ck() {
        return "colorselector";
    }

    public final void LC(boolean bl) {
        if (bl) {
            this.u20 = this.u20 & 0xFF000000 | this.PW.a80(this.Ou);
        }
        a7_0.bH(this.jm0);
        TO[] components = this.yD;
        if (components != null) {
            int n = components.length;
            for (int j = 0; j < n; ++j) {
                a7_0.bH(components[j].RD0);
            }
        }
        N1 preview = this.jj0;
        if (preview != null) {
            preview.i10(new gn_0(this.u20));
        }
        e60_0 hexField = this.Lpt7;
        if (hexField != null) {
            hexField.Gv(String.format("%08X", this.u20));
        }
    }

    public final void cS(int n) {
        this.u20 = n;
        int rgb = n & 0xFFFFFF;
        float red = (rgb >> 16 & 0xFF) / 255.0f;
        float green = (rgb >> 8 & 0xFF) / 255.0f;
        float blue = (n & 0xFF) / 255.0f;
        float max = Math.max(Math.max(red, green), blue);
        float min = Math.min(Math.min(red, green), blue);
        float lightness = max + min;
        float delta = max - min;
        float saturation = delta > 0.0f ? delta / (lightness > 1.0f ? 2.0f - lightness : lightness) : delta;
        float hue = 0.0f;
        if (delta > 0.0f) {
            if (max == red) {
                hue = (green - blue) / delta;
                if (hue < 0.0f) {
                    hue += 6.0f;
                }
            } else if (max == green) {
                hue = (blue - red) / delta + 2.0f;
            } else {
                hue = (red - green) / delta + 4.0f;
            }
            hue /= 6.0f;
        }
        this.Ou = new float[]{hue * 360.0f, saturation * 100.0f, lightness * 50.0f};
        qc_0[] qc_0Array = this.LT;
        if (qc_0Array != null) {
            int n4 = qc_0Array.length;
            for (int j = 0; j < n4; ++j) {
                a7_0.bH(qc_0Array[j].RD0);
            }
            this.LC(false);
        }
    }

    public final int T1() {
        return this.PW.oj.length;
    }

    @Override
    public final void K8() {
        if (this.LPT8) {
            this.rX();
        }
        super.K8();
    }

    @Override
    public final int R1() {
        if (this.LPT8) {
            this.rX();
        }
        return super.R1();
    }

    @Override
    public final int Se() {
        if (this.LPT8) {
            this.rX();
        }
        return super.Se();
    }

    @Override
    public final int pi0() {
        if (this.LPT8) {
            this.rX();
        }
        return super.pi0();
    }

    @Override
    public final int zs0() {
        if (this.LPT8) {
            this.rX();
        }
        return super.zs0();
    }

    public abstract void rX();

    @Override
    public final void C(zk0_1 zk0_12) {
        this.uc = false;
    }

    @Override
    public final void N00(zk0_1 zk0_12) {
    }

    public final void Eg() {
        this.Lpt7 = new e60_0();
        this.Lpt7.uf("hexColorEditField");
        this.Lpt7.jA0 = 8;
        rk0_0 handler = new rk0_0((w10_0)this);
        this.Lpt7.em = (gt_0[])a7_0.gE(this.Lpt7.em, handler, gt_0.class);
    }

    public final void cM(L l) {
        Object object = this.PW;
        if (object != l) {
            this.PW = l;
            this.Ou = new float[l.oj.length];
            if (object != null) {
                BorderContainerLayout v7 = this;
                v7.cS(v7.u20);
            } else {
                this.u20 = gn_0.WHITE.ls();
                for (int j = 0; j < this.PW.oj.length; ++j) {
                    float[] values = this.Ou;
                    float f = j == 0 ? 0.0f : 50.0f;
                    values[j] = f;
                }
                qc_0[] qc_0Array = this.LT;
                if (this.LT != null) {
                    int n = qc_0Array.length;
                    for (int j = 0; j < n; ++j) {
                        a7_0.bH(qc_0Array[j].RD0);
                    }
                    this.LC(false);
                }
                this.LC(true);
            }
            this.LPT8 = true;
            this.COm3();
        }
    }
}
