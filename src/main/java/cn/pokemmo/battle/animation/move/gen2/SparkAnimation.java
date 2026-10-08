/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 电光 (Spark)
 * 技能编号: 209
 * 原始类: f.XE0
 */
public class SparkAnimation
extends MU {
    public SparkAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1458;
        int n = 1;
        int n2 = 14;
        float f = 333.33334f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1483;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1421;
        n = 1;
        n2 = 14;
        f = 2333.3333f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.875f;
        Color color = px_1.ep0(13014);
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1440.0f)).xi0(this.nM(14, 1)).xi0(this.Ue0(2, 13311, 0.0f, 0.5f, 0.05f)).xi0(this.WW(14, f3, f4, f5, color)).y80(this.Qh0(375));
        int n3 = 375;
        int n4 = 1;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 375;
        n4 = 2;
        n5 = 9;
        n6 = 8;
        f2 = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.875f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(13014);
        pw_1 pw_17 = HB.p30(HB.p30(HB.p30(HB.p30(pk_1.el(A2.Kj0(pw_16, this.fE0(-1, n3, n4, n5, n6, f2), 1.2f).xi0(this.Ue0(2, 13311, 0.5f, 0.0f, 0.05f)), this.WW(14, f6, f7, f8, color2)), this.Ue0(2, 13311, 0.0f, 0.5f, 0.025f)), this.Ue0(2, 13311, 0.5f, 0.0f, 0.025f)), this.Ue0(2, 13311, 0.0f, 0.5f, 0.025f)).xi0(this.Ue0(2, 13311, 0.5f, 0.0f, 0.025f)), this.EN(14, 2, 1, 0.016f, 0.032f, 1.0f, 0.0f)).xi0(this.Wt(1, 0.4f));
        int n7 = 1505;
        int n8 = 1;
        int n9 = 16;
        float f9 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n7, n8, n9, f9, f2, pF));
        n7 = 1458;
        n8 = 2;
        n9 = 16;
        f9 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = A2.Kj0(pw_18, this.i6((byte)2, (short)n7, n8, n9, f9, f2, pF), 0.24f);
        n7 = 375;
        n8 = 0;
        n9 = 11;
        int n10 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n7, n8, n9, n10, f2));
        n7 = 375;
        n8 = 3;
        n9 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n7, n8, n9, n10, f2));
        n7 = 375;
        n8 = 4;
        n9 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n7, n8, n9, n10, f2));
        n7 = 375;
        n8 = 5;
        n9 = 11;
        n10 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_112.xi0(this.fE0(-1, n7, n8, n9, n10, f2)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

