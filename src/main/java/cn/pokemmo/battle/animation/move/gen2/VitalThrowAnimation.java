/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.dU
 */
/**
 * 宝可梦对战技能招式动画 - 借力摔 (VitalThrow)
 * 技能编号: 233
 * 原始类: f.du_1
 */
public class VitalThrowAnimation
extends MU {
    public VitalThrowAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 1;
        n3 = 14;
        f = 583.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12, this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1421;
        n2 = 1;
        n3 = 14;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.EN(14, 2, 1, 0.016f, 0.048f, 1.0f, 0.0f)).mz0().Xf0().p1(0.6f).mz0().Xf0();
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(400));
        n = 400;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 400;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        this.E8 = HB.p30(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, -0.19995117f, 0.19995117f)).xi0(this.nM(16, 0)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

