/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Bs
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleBs0Animation
 * 原始类: f.bs_0
 */
public class BattleBs0Animation
extends MU {
    public BattleBs0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleBs0Animation bs_02 = this;
        BattleBs0Animation bs_03 = this;
        short s = 1805;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = bs_03.Vz0;
        pw_1 pw_13 = FB.zd0(0.6f).xi0(this.nM(14, 1)).y80(this.Qh0(247)).xi0(bs_03.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 480.0f, 480.0f));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.4f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, 247, s, n, n2, f), 0.12f).xi0(this.Xq0(14, 2, 1, 0.0f, 0.48f, 0.100097656f, -0.100097656f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pk_1.el(pw_14, this.fE0(-1, 247, s, n, n2, f)).xi0(this.nM(14, 0)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        bs_02.Vs.jH(this.E8);
        bs_02.Vc();
        return bs_02;
    }
}

