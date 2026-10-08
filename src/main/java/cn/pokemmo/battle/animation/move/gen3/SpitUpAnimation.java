/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.sn0
 */
/**
 * 宝可梦对战技能招式动画 - 喷出 (SpitUp)
 * 技能编号: 255
 * 原始类: f.sn0_0
 */
public class SpitUpAnimation
extends MU {
    public SpitUpAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1478;
        int n = 2;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.Xq0(14, 1, 1, 0.016f, 0.128f, 0.6999512f, 0.5f)).xi0(this.EN(14, 2, 6, 0.0f, 0.032f, 0.30004883f, 0.0f));
        s = 1867;
        n = 2;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1849;
        n = 1;
        n2 = 14;
        f = 533.3333f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_15 = A2.Kj0(pw_14, this.i6((byte)2, s, n, n2, f, f2, pF), 0.6f).xi0(this.Xq0(14, 1, 1, 0.016f, 0.128f, 1.0f, 1.0f)).y80(this.Qh0(421));
        s = 421;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = pk_1.el(pw_15, this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).p1(0.6f).mz0().Xf0();
        s = 421;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.4f;
        pw_1 pw_17 = A2.Kj0(pw_16, this.fE0(-1, s, n, n2, n3, f2), 0.4f);
        s = 1420;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f3 = 83.333336f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 1;
        n2 = 16;
        f3 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.EN(16, 2, 6, 0.0f, 0.032f, 0.30004883f, 0.0f)).mz0().mz0().mz0().Xf0().p1(0.6f).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

