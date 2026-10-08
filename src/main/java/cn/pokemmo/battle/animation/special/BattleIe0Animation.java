/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleIe0Animation
 * 原始类: f.IE0
 */
public class BattleIe0Animation
extends MU {
    public BattleIe0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleIe0Animation iE0 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().xi0(this.WW(14, 0.75f, 0.0f, 0.75f, px_1.ep0(31))).y80(this.wn0("fever_dreams_proc")).mz0().p1(0.8f).xi0(this.WW(14, 0.75f, 0.75f, 0.0f, px_1.ep0(31)));
        pw_12.Ms(this.Vs.wP);
        iE0.Vs.jH(this.E8);
        iE0.Vc();
        return iE0;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

