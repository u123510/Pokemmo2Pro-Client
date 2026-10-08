/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;

/*
 * Renamed from f.v
 */
/**
 * 宝可梦对战技能招式动画 - 吸收拳 (DrainPunch)
 * 技能编号: 409
 * 原始类: f.v_0
 */
public class DrainPunchAnimation
extends MU {
    public DrainPunchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0(), this.Ue0(4, 0, 0.0f, 0.625f, 0.025f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1504;
        n2 = 2;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1480;
        n2 = 1;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 320.0f, 480.0f)).xi0(this.Sv0(1, 1, 1120.0f, 480.0f)).xi0(this.Wt(1, 0.25f)).y80(this.Qh0(584));
        n = 584;
        n2 = 3;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 584;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 584;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 584;
        n2 = 1;
        n3 = 11;
        n4 = 9;
        f2 = 0.25f;
        this.E8 = Zw0.H(A2.Kj0(pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.064f, -0.30004883f, 0.30004883f), 0.6f).xi0(this.Wt(0, 0.25f)).mz0().mz0().mz0().Xf0().xi0(this.tP(0.25f)).xi0(this.nM(16, 0)), this.Ue0(4, 0, 0.625f, 0.0f, 0.025f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

