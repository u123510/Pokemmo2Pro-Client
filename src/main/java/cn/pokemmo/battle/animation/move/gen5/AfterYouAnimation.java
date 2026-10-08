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
 * Renamed from f.tF
 */
/**
 * 宝可梦对战技能招式动画 - 您先请 (AfterYou)
 * 技能编号: 495
 * 原始类: f.tf_0
 */
public class AfterYouAnimation
extends MU {
    public AfterYouAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1731;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1731;
        n = 1;
        n2 = 14;
        f = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = N4.zr(N4.zr(N4.zr(A2.Kj0(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.Xq0(14, 2, 1, 0.0f, 0.064f, 0.30004883f, -0.30004883f), 0.08f).y80(this.E2(14, true)), this.EN(14, 2, 1, 0.0f, 0.256f, 0.0f, 3.0f), 0.68f).xi0(this.Xq0(14, 2, 1, 0.0f, 0.064f, 0.30004883f, -0.30004883f)).y80(this.E2(14, false)).mz0().mz0().mz0().Xf0().TD0().p1(0.12f).Xf0(), this.Xq0(14, 2, 1, 0.0f, 0.064f, 0.30004883f, -0.30004883f), 0.2f).y80(this.E2(14, true)), this.EN(14, 2, 1, 0.0f, 0.32f, 0.0f, 4.0f), 1.0f).y80(this.E2(14, false)).xi0(this.Xq0(14, 2, 1, 0.0f, 0.064f, 0.30004883f, -0.30004883f)).mz0().mz0().mz0().Xf0().mz0().Xf0().xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

