/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.mC
 */
/**
 * 宝可梦对战技能招式动画 - 搏命 (FinalGambit)
 * 技能编号: 515
 * 原始类: f.mc_1
 */
public class FinalGambitAnimation
extends MU {
    public FinalGambitAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1589;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1654;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1489;
        n = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1438;
        n = 2;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.875f;
        Color color = px_1.ep0(13014);
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).xi0(this.WW(14, f3, f4, f5, color)).y80(this.Qh0(680));
        int n3 = 680;
        int n4 = 0;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.875f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(13014);
        pw_1 pw_16 = HB.p30(HB.p30(HB.p30(pw_15.xi0(this.fE0(-1, n3, n4, n5, n6, f2)).xi0(this.WW(14, f6, f7, f8, color2)), this.Ue0(2, Short.MAX_VALUE, 0.0f, 0.5f, 0.025f)), this.Ue0(2, Short.MAX_VALUE, 0.5f, 0.0f, 0.025f)), this.Ue0(2, Short.MAX_VALUE, 0.0f, 0.5f, 0.025f)).xi0(this.Ue0(2, Short.MAX_VALUE, 0.5f, 0.0f, 0.025f)).mz0().Xf0().TD0().p1(0.32f).Xf0().xi0(this.Wt(1, 0.4f));
        int n7 = 680;
        int n8 = 0;
        int n9 = 11;
        int n10 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, n7, n8, n9, n10, f2), 0.52f);
        n7 = 680;
        n8 = 2;
        n9 = 11;
        n10 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n7, n8, n9, n10, f2));
        n7 = 1420;
        n8 = 1;
        n9 = 16;
        float f9 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n7, n8, n9, f9, f2, pF));
        n7 = 1420;
        n8 = 2;
        n9 = 16;
        f9 = 116.666664f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n7, n8, n9, f9, f2, pF));
        n7 = 1420;
        n8 = 1;
        n9 = 16;
        f9 = 216.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n7, n8, n9, f9, f2, pF));
        n7 = 1420;
        n8 = 2;
        n9 = 16;
        f9 = 366.66666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n7, n8, n9, f9, f2, pF));
        n7 = 1420;
        n8 = 1;
        n9 = 16;
        f9 = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_113 = N4.zr(pw_112, this.i6((byte)2, (short)n7, n8, n9, f9, f2, pF), 0.72f);
        n7 = 680;
        n8 = 1;
        n9 = 11;
        int n11 = 8;
        f2 = 0.5f;
        this.E8 = N4.zr(pw_113, this.fE0(-1, n7, n8, n9, n11, f2), 0.92f).xi0(this.Xq0(16, 2, 2, 0.0f, 0.064f, -0.19995117f, 0.19995117f)).xi0(this.nM(14, 0)).mz0().mz0().TD0().p1(1.32f).Xf0().xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

