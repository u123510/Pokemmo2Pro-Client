/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.tD0
 */
/**
 * 宝可梦对战技能招式动画 - 极光束 (AuroraBeam)
 * 技能编号: 62
 * 原始类: f.td0_1
 */
public class AuroraBeamAnimation
extends MU {
    public AuroraBeamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1455;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(223)).xi0(this.dA0(223, 0, 9, 11, 0.5f, 0.0f)).xi0(this.dA0(223, 1, 9, 11, 0.5f, 0.0f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1450;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        this.E8 = pk_1.el(A2.Kj0(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.Ue0(2, 0, 0.0f, 0.8125f, 0.075f), 0.4f).xi0(this.Wt(1, 0.25f)).xi0(this.nM(16, 1)), this.EN(16, 2, 12, 0.016f, 0.032f, 0.19995117f, 0.0f)).xi0(this.tP(0.25f)).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.075f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

