/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleF6Animation
 * 原始类: f.F6
 */
public class BattleF6Animation
extends MU {
    public BattleF6Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleF6Animation f6 = this;
        BattleF6Animation f62 = this;
        short s = 1546;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = f62.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.Qh0(320)).p1(0.6f).mz0().Xf0().xi0(f62.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_13.xi0(this.fE0(-1, 320, s, n, n2, f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        f6.Vs.jH(this.E8);
        f6.Vc();
        return f6;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

