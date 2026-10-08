/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.sF
 */
/**
 * 宝可梦对战技能招式动画 - 双针 (Twineedle)
 * 技能编号: 41
 * 原始类: f.sf_0
 */
public class TwineedleAnimation
extends MU {
    public TwineedleAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 14;
        float f = 333.33334f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 1;
        n3 = 14;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(202));
        n = 202;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(N4.zr(A2.Kj0(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.dA0(202, 1, 9, 11, 0.5f, 240.0f), 0.2f).xi0(this.nM(16, 1)).xi0(this.EN(16, 2, 2, 0.032f, 0.016f, 0.30004883f, 0.0f)), this.dA0(202, 1, 9, 11, 0.5f, 240.0f), 0.6f), this.EN(16, 2, 2, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

