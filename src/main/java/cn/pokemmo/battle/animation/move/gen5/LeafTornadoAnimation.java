/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 青草搅拌器 (LeafTornado)
 * 技能编号: 536
 * 原始类: f.GU
 */
public class LeafTornadoAnimation
extends MU {
    public LeafTornadoAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1445;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 960.0f)).xi0(this.Sv0(1, 1, 800.0f, 160.0f));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).y80(this.Qh0(700));
        s = 700;
        n = 1;
        n2 = 9;
        int n3 = 8;
        f2 = 0.049987793f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 700;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.049987793f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, s, n, n2, n3, f2), 0.64f).y80(this.E2(18, true)).xi0(this.nM(16, 1)).xi0(this.Wt(1, 0.4f));
        s = 700;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 700;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.049987793f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 700;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.049987793f;
        pw_1 pw_18 = N4.zr(pw_17, this.fE0(-1, s, n, n2, n3, f2), 1.04f);
        s = 700;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1445;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1280.0f)).xi0(this.Sv0(2, 1, 800.0f, 480.0f));
        s = 1376;
        n = 2;
        n2 = 16;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1568;
        n = 1;
        n2 = 16;
        f3 = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_111.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)), this.EN(16, 2, 12, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

