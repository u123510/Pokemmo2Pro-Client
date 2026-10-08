/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.pI0
 */
/**
 * 宝可梦对战技能招式动画 - 交错闪电 (FusionBolt)
 * 技能编号: 559
 * 原始类: f.pi0_0
 */
public class FusionBoltAnimation
extends MU {
    public FusionBoltAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 2006;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 640.0f, 320.0f));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1976;
        n = 2;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1590;
        n = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1995;
        n = 2;
        n2 = 16;
        f = 2166.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(22912);
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 2080.0f, 160.0f)).xi0(this.Wt(0, 0.8f)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.WW(14, f3, f4, f5, color)).y80(this.Qh0(731));
        short s2 = 731;
        int n3 = 4;
        int n4 = 9;
        int n5 = 8;
        f2 = 0.75f;
        pw_1 pw_17 = A2.Kj0(pw_16, this.fE0(-1, s2, n3, n4, n5, f2), 0.6f);
        s2 = 731;
        n3 = 4;
        n4 = 9;
        n5 = 8;
        f2 = 0.75f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s2, n3, n4, n5, f2));
        s2 = 731;
        n3 = 0;
        n4 = 9;
        n5 = 8;
        f2 = 0.75f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s2, n3, n4, n5, f2)).y80(this.E2(14, true)).mz0().mz0().TD0().p1(1.4f).Xf0().xi0(this.EN(14, 1, 0, 0.016f, 0.384f, 0.0f, 12.0f));
        s2 = 731;
        n3 = 3;
        n4 = 9;
        n5 = 8;
        f2 = 0.25f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s2, n3, n4, n5, f2));
        s2 = 731;
        n3 = 1;
        n4 = 9;
        n5 = 8;
        f2 = 0.25f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, s2, n3, n4, n5, f2));
        s2 = 731;
        n3 = 6;
        n4 = 9;
        n5 = 8;
        f2 = 0.75f;
        pw_1 pw_112 = N4.zr(pw_111, this.fE0(-1, s2, n3, n4, n5, f2), 1.8f).xi0(this.df0(14, 3));
        s2 = 731;
        n3 = 4;
        n4 = 0;
        n5 = 0;
        f2 = 2.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, s2, n3, n4, n5, f2));
        s2 = 731;
        n3 = 7;
        n4 = 0;
        n5 = 0;
        f2 = 2.5f;
        pw_1 pw_114 = N4.zr(pw_113, this.fE0(-1, s2, n3, n4, n5, f2), 3.4f);
        s2 = 731;
        n3 = 2;
        n4 = 2;
        n5 = 0;
        f2 = 0.0f;
        pw_1 pw_115 = pw_114.xi0(this.fE0(-1, s2, n3, n4, n5, f2)).xi0(this.Wt(1, 0.3f));
        s2 = 1816;
        n3 = 1;
        n4 = 16;
        float f6 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_116 = pw_115.xi0(this.i6((byte)2, s2, n3, n4, f6, f2, pF));
        s2 = 1981;
        n3 = 2;
        n4 = 16;
        f6 = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f7 = 0.5f;
        float f8 = 0.0f;
        float f9 = 0.75f;
        Color color2 = px_1.ep0(22912);
        pw_1 pw_117 = N4.zr(pw_116, this.i6((byte)2, s2, n3, n4, f6, f2, pF), 3.7f).xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.30004883f, -0.30004883f)).xi0(this.EN(16, 2, 12, 0.016f, 0.016f, 0.5f, 0.0f));
        int n6 = 731;
        int n7 = 3;
        int n8 = 11;
        int n9 = 8;
        f2 = 0.25f;
        pw_1 pw_118 = pw_117.xi0(this.fE0(-1, n6, n7, n8, n9, f2));
        n6 = 731;
        n7 = 5;
        n8 = 11;
        n9 = 8;
        f2 = 0.75f;
        pw_1 pw_119 = pw_118.xi0(this.fE0(-1, n6, n7, n8, n9, f2));
        n6 = 731;
        n7 = 1;
        n8 = 11;
        n9 = 8;
        f2 = 0.75f;
        float f10 = 0.5f;
        float f11 = 0.75f;
        float f12 = 0.0f;
        Color color3 = px_1.ep0(22912);
        pw_1 pw_120 = N4.zr(pw_119.xi0(this.fE0(-1, n6, n7, n8, n9, f2)).xi0(this.nM(16, 1)).xi0(this.df0(14, 4)), this.EN(14, 5, 0, 0.016f, 0.128f, 0.0f, 0.0f), 4.3f).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.WW(14, f10, f11, f12, color3));
        f10 = 0.5f;
        f11 = 0.75f;
        f12 = 0.0f;
        color3 = px_1.ep0(22912);
        this.E8 = pw_120.xi0(this.WW(16, f10, f11, f12, color3)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().mz0().TD0().p1(4.82f).Xf0().y80(this.E2(14, false)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

