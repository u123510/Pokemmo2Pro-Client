/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.dS
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleDs1Animation
 * 原始类: f.ds_1
 */
public class BattleDs1Animation
extends MU {
    public BattleDs1Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        float f = 2.0f;
        PF pF = this.Vz0;
        if (pF != null && pF.COm2()) {
            f = -2.0f;
        }
        BattleDs1Animation ds_12 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().TD0().Xf0().xi0(this.EN(16, 14, 1, 0.016f, 1.0f, f, 0.0f)).mz0().mz0().mz0();
        pw_12.Ms(this.Vs.wP);
        ds_12.Vs.jH(this.E8);
        ds_12.Vc();
        return ds_12;
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        BattleDs1Animation ds_12 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().TD0().Xf0().xi0(this.EN(16, 15, 1, 0.016f, 1.0f, 2.0f, 0.0f)).mz0().mz0().mz0();
        pw_12.Ms(this.Vs.wP);
        ds_12.Vs.jH(this.E8);
        ds_12.Vc();
        return ds_12;
    }
}

