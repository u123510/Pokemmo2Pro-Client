/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleKf0Animation
 * 原始类: f.KF0
 */
public class BattleKf0Animation
extends MU {
    public BattleKf0Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleKf0Animation kF0 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().y80(this.sv0()).mz0();
        pw_12.Ms(this.Vs.wP);
        kF0.Vs.jH(this.E8);
        kF0.Vc();
        return kF0;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

