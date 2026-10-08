/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 火焰弹 (SearingShot)
 * 技能编号: 545
 * 原始类: f.X9
 */
public class SearingShotAnimation
extends MU {
    public SearingShotAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        int n2 = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 0;
        n2 = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 1;
        n2 = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, n2 != 0);
        n = 1487;
        n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.46875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(this.QO(1)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 1.0f, 0.05f), 0.2f).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 720.0f, 144.0f));
        n = 1536;
        n2 = 1;
        n3 = 14;
        f = 916.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(708));
        n = 708;
        n2 = 5;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 708;
        n2 = 6;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 708;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 708;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 708;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(31);
        pw_1 pw_18 = N4.zr(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(14, f3, f4, f5, color), 1.8f);
        f3 = 1.0f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        int n5 = 1460;
        int n6 = 2;
        int n7 = 16;
        float f6 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.WW(14, f3, f4, f5, color)).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(2.2f).Xf0().xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1536;
        n6 = 1;
        n7 = 16;
        f6 = 166.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1460;
        n6 = 2;
        n7 = 16;
        f6 = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1536;
        n6 = 1;
        n7 = 16;
        f6 = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1460;
        n6 = 2;
        n7 = 16;
        f6 = 666.6667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1536;
        n6 = 2;
        n7 = 16;
        f6 = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1895;
        n6 = 1;
        n7 = 16;
        f6 = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_115 = pw_114.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF)).xi0(this.Xq0(14, 2, 1, 0.0f, 0.128f, 0.39990234f, -0.39990234f)).xi0(this.nM(16, 1));
        n5 = 708;
        n6 = 1;
        n7 = 11;
        int n8 = 8;
        f2 = 0.375f;
        float f7 = 1.0f;
        float f8 = 0.0f;
        float f9 = 0.625f;
        Color color2 = px_1.ep0(31);
        pw_1 pw_116 = N4.zr(pw_115, this.fE0(-1, n5, n6, n7, n8, f2), 2.4f).xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.Xq0(16, 2, 9, 0.0f, 0.064f, 0.30004883f, -0.30004883f));
        int n9 = 708;
        int n10 = 4;
        int n11 = 11;
        int n12 = 8;
        f2 = 0.25f;
        float f10 = 1.0f;
        float f11 = 0.625f;
        float f12 = 0.0f;
        Color color3 = px_1.ep0(31);
        int n13 = 0;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n13, bl);
        n13 = 1;
        bl = true;
        this.E8 = HB.p30(pk_1.el(pw_116.xi0(this.fE0(-1, n9, n10, n11, n12, f2)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.075f)), this.mf0(2, 6, 0, 0.032f)).xi0(this.WW(16, f10, f11, f12, color3)), this.Ue0(4, 0, 0.0f, 1.0f, 0.075f)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.075f)).xi0(this.tP(0.4f)).y80(ao_1.pc(lpt4__45)).xi0(this.nM(16, 0)).y80(ao_1.pc(new lpt4__4(this, n13, bl))).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

