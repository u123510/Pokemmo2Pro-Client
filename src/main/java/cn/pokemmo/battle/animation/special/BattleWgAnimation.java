/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleWgAnimation
 * 原始类: f.Wg
 */
public class BattleWgAnimation
extends MU {
    public BattleWgAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleWgAnimation wg = this;
        BattleWgAnimation wg2 = this;
        short s = 1552;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = wg2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.Qh0(148)).p1(0.6f).mz0().Xf0().xi0(wg2.i6((byte)2, s, n, n2, f, f2, pF));
        BattleWgAnimation wg3 = this;
        s = 1552;
        n = 2;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.859375f;
        pF = wg3.Vz0;
        pw_1 pw_14 = pw_13.xi0(wg3.i6((byte)2, s, n, n2, f, f2, pF));
        BattleWgAnimation wg4 = this;
        s = 1552;
        n = 1;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.78125f;
        pF = wg4.Vz0;
        pw_1 pw_15 = pw_14.xi0(wg4.i6((byte)2, s, n, n2, f, f2, pF));
        BattleWgAnimation wg5 = this;
        s = 1552;
        n = 2;
        n2 = 14;
        f = 500.0f;
        f2 = 0.9375f;
        pF = wg5.Vz0;
        pw_1 pw_16 = pw_15.xi0(wg5.i6((byte)2, s, n, n2, f, f2, pF));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_16.xi0(this.fE0(-1, 148, s, n, n2, f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        wg.Vs.jH(this.E8);
        wg.Vc();
        return wg;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

