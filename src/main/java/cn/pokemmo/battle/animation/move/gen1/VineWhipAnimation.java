/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.rq
 */
/**
 * 宝可梦对战技能招式动画 - 藤鞭 (VineWhip)
 * 技能编号: 22
 * 原始类: f.rq_2
 */
public class VineWhipAnimation
extends MU {
    public VineWhipAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0(), this.i6((byte)2, s, n, n2, f, f2, pF), 0.2f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.4f).Xf0().y80(this.Qh0(184));
        s = 184;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 184;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1));
        s = 184;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.Xq0(16, 2, 1, 0.032f, 0.064f, 0.19995117f, -0.19995117f));
        s = 1443;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1442;
        n = 2;
        n2 = 16;
        f3 = 116.666664f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = N4.zr(pw_16, this.i6((byte)2, s, n, n2, f3, f2, pF), 0.8f).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

