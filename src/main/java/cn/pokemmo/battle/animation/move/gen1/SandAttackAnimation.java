/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 泼沙 (SandAttack)
 * 技能编号: 28
 * 原始类: f.ZL
 */
public class SandAttackAnimation
extends MU {
    public SandAttackAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(FB.zd0(0.6f), this.i6((byte)2, s, n, n2, f, f2, pF), 0.12f).y80(this.Qh0(190)).xi0(this.dA0(190, 2, 9, 11, 0.5f, 120.0f)).xi0(this.dA0(190, 3, 9, 11, 0.5f, 120.0f));
        s = 1446;
        n = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1447;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = N4.zr(pw_13, this.i6((byte)2, s, n, n2, f, f2, pF), 0.72f).xi0(this.Wt(1, 0.4f));
        s = 190;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 190;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = N4.zr(pw_15, this.fE0(-1, s, n, n2, n3, f2), 0.92f);
        s = 190;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 190;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = N4.zr(pw_17, this.fE0(-1, s, n, n2, n3, f2), 1.12f);
        s = 190;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 190;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 3, 0.0f, 0.032f, 0.100097656f, -0.100097656f));
        s = 1446;
        n = 1;
        n2 = 16;
        float f3 = 83.333336f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f3 = 83.333336f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_111, this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

