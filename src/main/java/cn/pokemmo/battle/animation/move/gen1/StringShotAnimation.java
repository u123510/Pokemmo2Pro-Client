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
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.fh0
 */
/**
 * 宝可梦对战技能招式动画 - 吐丝 (StringShot)
 * 技能编号: 81
 * 原始类: f.fh0_1
 */
public class StringShotAnimation
extends MU {
    public StringShotAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1410;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.3f)), this.Ue0(2, 0, 0.0f, 0.8125f, 0.05f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1445;
        n2 = 2;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 2;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(245)), this.dA0(245, 0, 9, 11, 0.5f, 480.0f), 0.02f), this.dA0(245, 0, 9, 11, 0.5f, 480.0f), 0.04f), this.dA0(245, 0, 9, 11, 0.5f, 480.0f), 0.06f), this.dA0(245, 0, 9, 11, 0.5f, 480.0f), 0.08f), this.dA0(245, 0, 9, 11, 0.5f, 480.0f), 0.1f), this.dA0(245, 0, 9, 11, 0.5f, 480.0f), 0.12f), this.dA0(245, 0, 9, 11, 0.5f, 480.0f), 0.14f), this.dA0(245, 0, 9, 11, 0.5f, 480.0f), 0.16f).xi0(this.Wt(1, 0.25f));
        n = 245;
        n2 = 2;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 245;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 245;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(N4.zr(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 0.96f).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.288f, -0.30004883f, 0.100097656f)).xi0(this.tP(0.4f)).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

