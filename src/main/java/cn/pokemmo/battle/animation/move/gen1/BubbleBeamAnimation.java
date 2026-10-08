/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Ot
 */
/**
 * 宝可梦对战技能招式动画 - 泡沫光线 (BubbleBeam)
 * 技能编号: 61
 * 原始类: f.ot_0
 */
public class BubbleBeamAnimation
extends MU {
    public BubbleBeamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1480;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1529;
        n2 = 1;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1529;
        n2 = 2;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1529;
        n2 = 1;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1529;
        n2 = 2;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1529;
        n2 = 1;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1529;
        n2 = 2;
        n3 = 16;
        f = 1833.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(222));
        n = 222;
        n2 = 0;
        n3 = 9;
        int n4 = 11;
        f2 = 0.625f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 222;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.625f;
        this.E8 = pk_1.el(A2.Kj0(pw_19, this.fE0(-1, n, n2, n3, n4, f2), 0.6f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(1.4f).Xf0(), this.EN(16, 2, 4, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

