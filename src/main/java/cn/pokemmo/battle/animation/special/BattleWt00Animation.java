/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.wt0
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleWt00Animation
 * 原始类: f.wt0_0
 */
public class BattleWt00Animation
extends MU {
    public BattleWt00Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleWt00Animation wt0_02 = this;
        BattleWt00Animation wt0_03 = this;
        short s = 1551;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = wt0_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.Qh0(147)).p1(0.6f).mz0().Xf0().xi0(wt0_03.i6((byte)2, s, n, n2, f, f2, pF));
        BattleWt00Animation wt0_04 = this;
        s = 1551;
        n = 2;
        n2 = 14;
        f = 250.0f;
        f2 = 0.9140625f;
        pF = wt0_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(wt0_04.i6((byte)2, s, n, n2, f, f2, pF));
        BattleWt00Animation wt0_05 = this;
        s = 1551;
        n = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.953125f;
        pF = wt0_05.Vz0;
        pw_1 pw_15 = pw_14.xi0(wt0_05.i6((byte)2, s, n, n2, f, f2, pF));
        BattleWt00Animation wt0_06 = this;
        s = 1551;
        n = 2;
        n2 = 14;
        f = 750.0f;
        f2 = 0.9921875f;
        pF = wt0_06.Vz0;
        pw_1 pw_16 = pw_15.xi0(wt0_06.i6((byte)2, s, n, n2, f, f2, pF));
        BattleWt00Animation wt0_07 = this;
        s = 1551;
        n = 1;
        n2 = 14;
        f = 1000.0f;
        f2 = 0.9140625f;
        pF = wt0_07.Vz0;
        pw_1 pw_17 = pw_16.xi0(wt0_07.i6((byte)2, s, n, n2, f, f2, pF));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_17.xi0(this.fE0(-1, 147, s, n, n2, f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        wt0_02.Vs.jH(this.E8);
        wt0_02.Vc();
        return wt0_02;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

