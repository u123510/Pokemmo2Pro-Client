/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 乱击 (FuryAttack)
 * 技能编号: 31
 * 原始类: f._const
 */
public class FuryAttackAnimation
extends MU {
    public FuryAttackAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        FuryAttackAnimation const_ = this;
        FuryAttackAnimation const_2 = this;
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = const_2.Vz0;
        pw_1 pw_13 = A2.Kj0(pw_1.xC().Xf0(), const_2.i6((byte)2, s, n, n2, f, f2, pF), 0.24f).y80(this.Qh0(193));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 193, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 193, s, n, n2, f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        FuryAttackAnimation const_3 = this;
        s = 1420;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.8984375f;
        pF = const_3.Vz0;
        pw_1 pw_16 = pw_15.xi0(const_3.i6((byte)2, s, n, n2, f, f2, pF));
        FuryAttackAnimation const_4 = this;
        s = 1420;
        n = 1;
        n2 = 16;
        f = 83.333336f;
        f2 = 0.8984375f;
        pF = const_4.Vz0;
        this.E8 = pw_12 = pk_1.el(pw_16, const_4.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        const_.Vs.jH(this.E8);
        const_.Vc();
        return const_;
    }
}

