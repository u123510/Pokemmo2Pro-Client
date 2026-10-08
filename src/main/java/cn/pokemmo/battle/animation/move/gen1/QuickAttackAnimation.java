/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Gy
 */
/**
 * 宝可梦对战技能招式动画 - 电光一闪 (QuickAttack)
 * 技能编号: 98
 * 原始类: f.gy_0
 */
public class QuickAttackAnimation
extends MU {
    public QuickAttackAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        QuickAttackAnimation gy_02 = this;
        QuickAttackAnimation gy_03 = this;
        short s = 1437;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = gy_03.Vz0;
        pw_1 pw_13 = FB.zd0(0.6f).xi0(gy_03.i6((byte)2, s, n, n2, f, f2, pF)).mz0().Xf0().p1(0.6f).mz0().Xf0();
        QuickAttackAnimation gy_04 = this;
        s = 1420;
        n = 1;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = gy_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(gy_04.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(266));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.4f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 266, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = HB.p30(pw_15.xi0(this.fE0(-1, 266, s, n, n2, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, -0.19995117f, 0.19995117f)).xi0(this.nM(16, 0)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        gy_02.Vs.jH(this.E8);
        gy_02.Vc();
        return gy_02;
    }
}

