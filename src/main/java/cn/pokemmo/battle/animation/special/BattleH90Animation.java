/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleH90Animation
 * 原始类: f.H90
 */
public class BattleH90Animation
extends MU {
    public BattleH90Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleH90Animation h90 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().y80(this.wn0("fever_dreams_target")).mz0();
        pw_12.Ms(this.Vs.wP);
        h90.Vs.jH(this.E8);
        h90.Vc();
        return h90;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

