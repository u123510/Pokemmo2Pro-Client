/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleKs0Animation
 * 原始类: f.Ks0
 */
public class BattleKs0Animation
extends MU {
    public BattleKs0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleKs0Animation ks0 = this;
        BattleKs0Animation ks02 = this;
        short s = 1559;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = ks02.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.Qh0(155)).p1(0.6f).mz0().Xf0().xi0(ks02.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.4f;
        pw_1 pw_14 = A2.Kj0(pw_13, this.fE0(-1, 155, s, n, n2, f), 0.6f);
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_14.xi0(this.fE0(-1, 155, s, n, n2, f)).mz0().mz0().mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ks0.Vs.jH(this.E8);
        ks0.Vc();
        return ks0;
    }
}

