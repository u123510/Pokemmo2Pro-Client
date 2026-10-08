/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleXn0Animation
 * 原始类: f.Xn0
 */
public class BattleXn0Animation
extends MU {
    public BattleXn0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleXn0Animation xn0 = this;
        BattleXn0Animation xn02 = this;
        short s = 1550;
        int n = 1;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = xn02.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.Qh0(248)).p1(0.6f).mz0().Xf0().xi0(xn02.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = HB.p30(pw_13.xi0(this.fE0(-1, 248, s, n, n2, f)), this.WW(14, 0.5f, 0.0f, 0.625f, px_1.ep0(0))).xi0(this.WW(14, 0.5f, 0.625f, 0.0f, px_1.ep0(0))).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        xn0.Vs.jH(this.E8);
        xn0.Vc();
        return xn0;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

