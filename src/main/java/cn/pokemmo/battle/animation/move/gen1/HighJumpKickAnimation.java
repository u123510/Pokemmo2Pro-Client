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

/**
 * 宝可梦对战技能招式动画 - 飞膝踢 (HighJumpKick)
 * 技能编号: 136
 * 原始类: f.L9
 */
public class HighJumpKickAnimation
extends MU {
    public HighJumpKickAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        HighJumpKickAnimation l9 = this;
        HighJumpKickAnimation l92 = this;
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = l92.Vz0;
        pw_1 pw_13 = FB.zd0(0.6f).xi0(this.EN(14, 2, 1, 0.032f, 0.032f, 1.0f, 1.0f)).xi0(l92.i6((byte)2, s, n, n2, f, f2, pF)).mz0().Xf0().p1(0.6f).mz0().Xf0();
        HighJumpKickAnimation l93 = this;
        s = 1424;
        n = 2;
        n2 = 16;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = l93.Vz0;
        pw_1 pw_14 = pw_13.xi0(l93.i6((byte)2, s, n, n2, f, f2, pF));
        HighJumpKickAnimation l94 = this;
        s = 1420;
        n = 1;
        n2 = 16;
        f = 250.0f;
        f2 = 0.78125f;
        pF = l94.Vz0;
        pw_1 pw_15 = HB.p30(pw_14, l94.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(301));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.4f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 301, s, n, n2, f));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = HB.p30(pw_16.xi0(this.fE0(-1, 301, s, n, n2, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 0)).p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        l9.Vs.jH(this.E8);
        l9.Vc();
        return l9;
    }
}

