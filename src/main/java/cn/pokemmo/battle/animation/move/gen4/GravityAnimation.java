/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.n50
 */
/**
 * 宝可梦对战技能招式动画 - 重力 (Gravity)
 * 技能编号: 356
 * 原始类: f.n50_0
 */
public class GravityAnimation
extends MU {
    public GravityAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1497;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.E2(18, true)).xi0(this.nM(16, 1)).y80(this.Qh0(529)).y80(this.Qh0(530)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1833.3334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1760.0f)).xi0(this.Sv0(1, 1, 1440.0f, 320.0f));
        n = 1535;
        n2 = 2;
        n3 = 16;
        f = 750.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 529;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.025024414f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 530;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.025024414f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 529;
        n2 = 1;
        n3 = 0;
        n4 = 8;
        f2 = 0.0f;
        this.E8 = pk_1.el(A2.Kj0(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Ue0(4, 0, 0.0f, 0.375f, 0.05f), 0.4f).xi0(this.tP(1.05f)).xi0(this.EN(16, 2, 15, 0.032f, 0.016f, 0.0f, 0.19995117f)), this.Xq0(16, 2, 1, 0.016f, 0.352f, 0.0f, -0.6999512f)).y80(this.E2(18, false)).xi0(this.Ue0(4, 0, 0.375f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

