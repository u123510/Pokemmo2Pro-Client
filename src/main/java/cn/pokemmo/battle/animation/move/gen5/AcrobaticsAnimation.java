/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.hD0
 */
/**
 * 宝可梦对战技能招式动画 - 杂技 (Acrobatics)
 * 技能编号: 512
 * 原始类: f.hd0_1
 */
public class AcrobaticsAnimation
extends MU {
    public AcrobaticsAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1450;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 400.0f)).xi0(this.Sv0(1, 1, 0.0f, 400.0f));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 416.66666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 0;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = A2.Kj0(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.EN(14, 2, 4, 0.0f, 0.032f, 2.0f, 0.0f), 0.32f).xi0(this.df0(14, 3)).xi0(this.nM(16, 1)).xi0(this.Wt(1, 0.4f));
        s = 1420;
        n = 2;
        n2 = 16;
        f = 250.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(677));
        s = 677;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2)).mz0().mz0().TD0().p1(0.56f).Xf0().xi0(this.Xq0(16, 2, 1, 0.0f, 0.064f, 0.30004883f, -0.30004883f)).mz0().mz0().TD0().p1(0.96f).Xf0().xi0(this.tP(0.4f));
        s = 1637;
        n = 1;
        n2 = 14;
        float f3 = 250.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = N4.zr(pw_17, this.i6((byte)2, s, n, n2, f3, f2, pF), 1.36f).xi0(this.EN(14, 2, 2, 0.0f, 0.032f, 2.0f, 0.0f)).xi0(this.nM(16, 0)).xi0(this.df0(14, 4)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

