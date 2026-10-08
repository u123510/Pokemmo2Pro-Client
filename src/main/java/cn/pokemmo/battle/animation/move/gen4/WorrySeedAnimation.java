/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.LPt3
 */
/**
 * 宝可梦对战技能招式动画 - 烦恼种子 (WorrySeed)
 * 技能编号: 388
 * 原始类: f.lpt3__0
 */
public class WorrySeedAnimation
extends MU {
    public WorrySeedAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1459;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1484;
        n2 = 1;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = A2.Kj0(pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 656.0f, 640.0f)).xi0(this.Sv0(1, 1, 640.0f, 800.0f)).y80(this.Qh0(563)), this.dA0(563, 1, 9, 11, 0.5f, 360.0f), 0.6f).xi0(this.Wt(1, 0.4f));
        n = 563;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.25f;
        this.E8 = pk_1.el(pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(0.76f).Xf0(), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

