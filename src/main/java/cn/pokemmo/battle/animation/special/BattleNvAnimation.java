/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleNvAnimation
 * 原始类: f.NV
 */
public class BattleNvAnimation
extends MU {
    public BattleNvAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleNvAnimation nV = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().y80(this.wn0("type_override_ghost")).mz0();
        pw_12.Ms(this.Vs.wP);
        nV.Vs.jH(this.E8);
        nV.Vc();
        return nV;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

