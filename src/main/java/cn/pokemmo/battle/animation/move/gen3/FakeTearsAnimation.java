/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 假哭 (FakeTears)
 * 技能编号: 313
 * 原始类: f.N6
 */
public class FakeTearsAnimation
extends MU {
    public FakeTearsAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        FakeTearsAnimation n6 = this;
        FakeTearsAnimation n62 = this;
        short s = 1508;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = n62.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).mz0().Xf0().xi0(n62.i6((byte)2, s, n, n2, f, f2, pF));
        FakeTearsAnimation n63 = this;
        s = 1508;
        n = 2;
        n2 = 14;
        f = 416.66666f;
        f2 = 0.9375f;
        pF = n63.Vz0;
        pw_1 pw_14 = pw_13.xi0(n63.i6((byte)2, s, n, n2, f, f2, pF));
        FakeTearsAnimation n64 = this;
        s = 1508;
        n = 2;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = n64.Vz0;
        pw_1 pw_15 = pw_14.xi0(n64.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(484));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 484, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.25f;
        this.E8 = pw_12 = HB.p30(pw_16, this.fE0(-1, 484, s, n, n2, f)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        n6.Vs.jH(this.E8);
        n6.Vc();
        return n6;
    }
}

