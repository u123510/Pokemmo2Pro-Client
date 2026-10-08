/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Ky
 */
/**
 * 宝可梦对战技能招式动画 - 自然之力 (NaturePower)
 * 技能编号: 267
 * 原始类: f.ky_0
 */
public class NaturePowerAnimation
extends MU {
    public NaturePowerAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        NaturePowerAnimation ky_02 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ky_02.Vs.jH(this.E8);
        ky_02.Vc();
        return ky_02;
    }
}

