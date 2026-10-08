/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Sm
 */
/**
 * 宝可梦对战技能招式动画 - 翅膀攻击 (WingAttack)
 * 技能编号: 17
 * 原始类: f.sm_0
 */
public class WingAttackAnimation
extends MU {
    public WingAttackAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        WingAttackAnimation sm_02 = this;
        WingAttackAnimation sm_03 = this;
        short s = 1438;
        int n = 2;
        int n2 = 16;
        float f = 200.0f;
        float f2 = 0.9765625f;
        PF pF = sm_03.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)), sm_03.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(178));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 178, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.625f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, 178, s, n, n2, f), 0.08f).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        WingAttackAnimation sm_04 = this;
        s = 1420;
        n = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.859375f;
        pF = sm_04.Vz0;
        this.E8 = pw_12 = pk_1.el(pw_15, sm_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        sm_02.Vs.jH(this.E8);
        sm_02.Vc();
        return sm_02;
    }
}

