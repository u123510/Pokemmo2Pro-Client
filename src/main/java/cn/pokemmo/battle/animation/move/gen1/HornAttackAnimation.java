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

/**
 * 宝可梦对战技能招式动画 - 角撞 (HornAttack)
 * 技能编号: 30
 * 原始类: f.Ki
 */
public class HornAttackAnimation
extends MU {
    public HornAttackAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 16;
        float f = 166.66667f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.nM(14, 1)).xi0(this.nM(16, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(192)).xi0(this.dA0(192, 2, 9, 11, 0.5f, 240.0f));
        n = 1424;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1904;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = A2.Kj0(pw_13, this.i6((byte)2, (short)n, n2, n3, f, f2, pF), 0.2f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.4f).Xf0();
        n = 192;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 192;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.25f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

