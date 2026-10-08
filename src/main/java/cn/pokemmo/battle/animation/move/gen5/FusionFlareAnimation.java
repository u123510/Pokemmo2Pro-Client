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
 * Renamed from f.wk
 */
/**
 * 宝可梦对战技能招式动画 - 交错火焰 (FusionFlare)
 * 技能编号: 558
 * 原始类: f.wk_2
 */
public class FusionFlareAnimation
extends MU {
    public FusionFlareAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        int n = 1589;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1561;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1966;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Wt(0, 0.8f)).y80(this.Qh0(729));
        n = 729;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.0f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(31);
        pw_1 pw_15 = A2.Kj0(pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(14, f3, f4, f5, color), 0.4f).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f));
        int n5 = 729;
        int n6 = 2;
        int n7 = 0;
        int n8 = 0;
        f2 = 2.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n5, n6, n7, n8, f2));
        n5 = 729;
        n6 = 5;
        n7 = 0;
        n8 = 0;
        f2 = 2.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, n5, n6, n7, n8, f2), 1.6f);
        n5 = 729;
        n6 = 3;
        n7 = 0;
        n8 = 0;
        f2 = 2.5f;
        pw_1 pw_18 = N4.zr(pw_17, this.fE0(-1, n5, n6, n7, n8, f2), 1.8f);
        n5 = 729;
        n6 = 4;
        n7 = 1;
        n8 = 0;
        f2 = 0.0f;
        float f6 = 0.5f;
        float f7 = 0.5f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(31);
        pw_1 pw_19 = N4.zr(pw_18.xi0(this.fE0(-1, n5, n6, n7, n8, f2)).xi0(this.Wt(1, 0.3f)), this.WW(14, f6, f7, f8, color2), 2.1f);
        short s = 1885;
        int n9 = 1;
        int n10 = 16;
        float f9 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n9, n10, f9, f2, pF));
        s = 1425;
        n9 = 2;
        n10 = 16;
        f9 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n9, n10, f9, f2, pF)).xi0(this.Sv0(2, 1, 880.0f, 400.0f));
        s = 1376;
        n9 = 2;
        n10 = 16;
        f9 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f10 = 0.5f;
        float f11 = 0.0f;
        float f12 = 0.5f;
        Color color3 = px_1.ep0(31);
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, s, n9, n10, f9, f2, pF)).xi0(this.WW(16, f10, f11, f12, color3)).xi0(this.EN(16, 2, 12, 0.016f, 0.016f, 0.5f, 0.0f));
        int n11 = 729;
        int n12 = 1;
        int n13 = 11;
        int n14 = 8;
        f2 = 0.0f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n11, n12, n13, n14, f2));
        n11 = 729;
        n12 = 3;
        n13 = 11;
        n14 = 8;
        f2 = 0.0f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n11, n12, n13, n14, f2));
        n11 = 729;
        n12 = 6;
        n13 = 11;
        n14 = 8;
        f2 = 0.25f;
        float f13 = 0.5f;
        float f14 = 0.5f;
        float f15 = 0.0f;
        Color color4 = px_1.ep0(31);
        this.E8 = pw_114.xi0(this.fE0(-1, n11, n12, n13, n14, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.5f, -0.5f)).xi0(this.tP(1.0f)).mz0().mz0().TD0().p1(2.7f).Xf0().xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.WW(16, f13, f14, f15, color4)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        return this;
    }

    @Override
    public final MU us() {
        int n = 1589;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1976;
        n2 = 1;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1995;
        n2 = 2;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1966;
        n2 = 1;
        n3 = 14;
        f = 2166.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1885;
        n2 = 1;
        n3 = 2;
        f = 2833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1885;
        n2 = 2;
        n3 = 16;
        f = 3000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Wt(0, 0.8f)).y80(this.Qh0(730));
        n = 730;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.0f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(31);
        pw_1 pw_18 = A2.Kj0(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(14, f3, f4, f5, color), 0.4f).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f));
        int n5 = 730;
        int n6 = 2;
        int n7 = 0;
        int n8 = 0;
        f2 = 3.25f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n5, n6, n7, n8, f2));
        n5 = 730;
        n6 = 5;
        n7 = 0;
        n8 = 0;
        f2 = 3.25f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n5, n6, n7, n8, f2));
        n5 = 730;
        n6 = 6;
        n7 = 0;
        n8 = 0;
        f2 = 3.25f;
        pw_1 pw_111 = N4.zr(pw_110, this.fE0(-1, n5, n6, n7, n8, f2), 1.6f);
        n5 = 730;
        n6 = 1;
        n7 = 0;
        n8 = 0;
        f2 = 3.25f;
        pw_1 pw_112 = N4.zr(pw_111, this.fE0(-1, n5, n6, n7, n8, f2), 2.4f);
        n5 = 730;
        n6 = 3;
        n7 = 0;
        n8 = 0;
        f2 = 3.25f;
        pw_1 pw_113 = N4.zr(pw_112, this.fE0(-1, n5, n6, n7, n8, f2), 2.6f);
        n5 = 730;
        n6 = 4;
        n7 = 1;
        n8 = 0;
        f2 = 0.0f;
        float f6 = 0.5f;
        float f7 = 0.5f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(31);
        pw_1 pw_114 = N4.zr(pw_113.xi0(this.fE0(-1, n5, n6, n7, n8, f2)).xi0(this.Wt(1, 0.3f)), this.WW(14, f6, f7, f8, color2), 2.9f);
        f6 = 0.5f;
        f7 = 0.0f;
        f8 = 0.5f;
        color2 = px_1.ep0(31);
        int n9 = 730;
        int n10 = 1;
        int n11 = 11;
        int n12 = 8;
        f2 = 0.0f;
        pw_1 pw_115 = pw_114.xi0(this.WW(16, f6, f7, f8, color2)).xi0(this.EN(16, 2, 12, 0.016f, 0.016f, 0.5f, 0.0f)).xi0(this.fE0(-1, n9, n10, n11, n12, f2));
        n9 = 730;
        n10 = 3;
        n11 = 11;
        n12 = 8;
        f2 = 0.0f;
        pw_1 pw_116 = pw_115.xi0(this.fE0(-1, n9, n10, n11, n12, f2));
        n9 = 730;
        n10 = 6;
        n11 = 11;
        n12 = 8;
        f2 = 2.5f;
        pw_1 pw_117 = pw_116.xi0(this.fE0(-1, n9, n10, n11, n12, f2));
        n9 = 730;
        n10 = 6;
        n11 = 11;
        n12 = 8;
        f2 = 1.5f;
        pw_1 pw_118 = pw_117.xi0(this.fE0(-1, n9, n10, n11, n12, f2));
        n9 = 730;
        n10 = 6;
        n11 = 11;
        n12 = 8;
        f2 = 0.75f;
        float f9 = 0.5f;
        float f10 = 0.5f;
        float f11 = 0.0f;
        Color color3 = px_1.ep0(31);
        this.E8 = N4.zr(pw_118.xi0(this.fE0(-1, n9, n10, n11, n12, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.5f, -0.5f), 3.7f).xi0(this.tP(1.25f)).mz0().mz0().TD0().p1(4.1f).Xf0().xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.WW(16, f9, f10, f11, color3)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

