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
import f.pw_1;

/*
 * Renamed from f.eG0
 */
/**
 * 宝可梦对战技能招式动画 - 精神波 (Psywave)
 * 技能编号: 149
 * 原始类: f.eg0_1
 */
public class PsywaveAnimation
extends MU {
    public PsywaveAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1434;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.3f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1434;
        n2 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1434;
        n2 = 1;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1434;
        n2 = 2;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(313)), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.02f), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.04f), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.06f), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.08f), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.1f), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.12f), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.14f), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.16f), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.18f), this.dA0(313, 0, 9, 11, 0.5f, 1200.0f), 0.58f).xi0(this.Wt(1, 0.3f)).mz0().mz0().mz0().Xf0();
        n = 1475;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1483;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.8203125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1280.0f)).xi0(this.Sv0(2, 1, 960.0f, 320.0f));
        n = 313;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

