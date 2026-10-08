/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleEe0Animation
 * 原始类: f.EE0
 */
public class BattleEe0Animation
extends MU {
    public BattleEe0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleEe0Animation eE0 = this;
        BattleEe0Animation eE02 = this;
        short s = 1548;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = eE02.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.Qh0(213)).p1(0.3f).mz0().Xf0().xi0(eE02.i6((byte)2, s, n, n2, f, f2, pF));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_13.xi0(this.fE0(-1, 213, s, n, n2, f)).mz0();
        pw_12.Ms(this.Vs.wP);
        eE0.Vs.jH(this.E8);
        eE0.Vc();
        return eE0;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

