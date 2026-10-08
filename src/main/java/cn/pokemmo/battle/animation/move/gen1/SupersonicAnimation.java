/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.wF
 */
/**
 * 宝可梦对战技能招式动画 - 超音波 (Supersonic)
 * 技能编号: 48
 * 原始类: f.wf_1
 */
public class SupersonicAnimation
extends MU {
    public SupersonicAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1450;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().p1(0.6f), this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1451;
        n2 = 2;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1451;
        n2 = 1;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_15 = N4.zr(N4.zr(A2.Kj0(pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(209)), this.dA0(209, 0, 9, 11, 0.5f, 240.0f), 0.04f), this.dA0(209, 0, 9, 11, 0.5f, 240.0f), 0.08f), this.dA0(209, 0, 9, 11, 0.5f, 240.0f), 0.28f).xi0(this.Wt(1, 0.25f)).xi0(this.nM(16, 1));
        n = 209;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = Zw0.H(pk_1.el(N4.zr(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.88f), this.EN(16, 2, 3, 0.0f, 0.032f, 0.30004883f, 0.0f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)), this.Ue0(4, 0, 0.75f, 0.0f, 0.05f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

