/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.uq
 */
/**
 * 宝可梦对战技能招式动画 - 愤怒 (Rage)
 * 技能编号: 99
 * 原始类: f.uq_2
 */
public class RageAnimation
extends MU {
    public RageAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = 0.625f;
        Color color = px_1.ep0(31);
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.WW(14, f, f2, f3, color));
        f = 1.0f;
        f2 = 0.625f;
        f3 = 0.0f;
        color = px_1.ep0(31);
        short s = 1463;
        int n = 2;
        int n2 = 14;
        float f4 = 0.0f;
        float f5 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.WW(14, f, f2, f3, color)).xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1376;
        n = 2;
        n2 = 14;
        f4 = 916.6667f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF)).xi0(this.Sv0(2, 0, 0.0f, 880.0f)).xi0(this.Sv0(2, 1, 640.0f, 160.0f));
        s = 1464;
        n = 1;
        n2 = 14;
        f4 = 0.0f;
        f5 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f4 = 916.6667f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF));
        s = 1437;
        n = 1;
        n2 = 14;
        f4 = 1000.0f;
        f5 = 0.9921875f;
        pF = this.Vz0;
        float f6 = 1.0f;
        float f7 = 0.0f;
        float f8 = 0.625f;
        Color color2 = px_1.ep0(31);
        pw_1 pw_17 = HB.p30(pw_16.xi0(this.i6((byte)2, s, n, n2, f4, f5, pF)).xi0(this.Sv0(1, 0, 0.0f, 880.0f)), this.Sv0(1, 1, 640.0f, 160.0f)).xi0(this.WW(14, f6, f7, f8, color2));
        f6 = 1.0f;
        f7 = 0.625f;
        f8 = 0.0f;
        color2 = px_1.ep0(31);
        short s2 = 1427;
        int n3 = 5;
        int n4 = 16;
        float f9 = 0.0f;
        f5 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_18 = N4.zr(A2.Kj0(HB.p30(pw_17, this.WW(14, f6, f7, f8, color2)), this.Xq0(14, 2, 1, 0.016f, 0.048f, 0.30004883f, -0.30004883f), 0.2f).xi0(this.Wt(1, 0.4f)), this.i6((byte)2, s2, n3, n4, f9, f5, pF), 0.4f).y80(this.Qh0(267));
        s2 = 267;
        n3 = 0;
        n4 = 11;
        int n5 = 8;
        f5 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s2, n3, n4, n5, f5));
        s2 = 267;
        n3 = 1;
        n4 = 11;
        n5 = 8;
        f5 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s2, n3, n4, n5, f5)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        s2 = 1424;
        n3 = 2;
        n4 = 16;
        float f10 = 0.0f;
        f5 = 0.9375f;
        pF = this.Vz0;
        this.E8 = N4.zr(pw_110, this.i6((byte)2, s2, n3, n4, f10, f5, pF), 0.6f).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

