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

/*
 * Renamed from f.cM0
 */
/**
 * 宝可梦对战技能招式动画 - 飞踢 (JumpKick)
 * 技能编号: 26
 * 原始类: f.cm0_0
 */
public class JumpKickAnimation
extends MU {
    public JumpKickAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1444;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.Qh0(188)).xi0(this.dA0(188, 0, 9, 11, 0.5f, 0.0f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1437;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = A2.Kj0(pw_14, this.i6((byte)2, (short)n, n2, n3, f, f2, pF), 0.4f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.52f).Xf0();
        n = 188;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 3, 0.016f, 0.032f, -0.19995117f, 0.100097656f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

