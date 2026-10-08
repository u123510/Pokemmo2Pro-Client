/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战特殊事件/状态动画 - BattleEfAnimation
 * 原始类: f.Ef
 */
public class BattleEfAnimation
extends MU {
    public BattleEfAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleEfAnimation ef = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().y80(this.wn0("entangling_vines")).mz0();
        pw_12.Ms(this.Vs.wP);
        ef.Vs.jH(this.E8);
        ef.Vc();
        return ef;
    }
}

