/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.gn0
 */
/**
 * 宝可梦对战技能招式动画 - 变身 (Transform)
 * 技能编号: 144
 * 原始类: f.gn0_0
 */
public class TransformAnimation
extends MU {
    public TransformAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        TransformAnimation gn0_02 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        gn0_02.Vs.jH(this.E8);
        gn0_02.Vc();
        return gn0_02;
    }
}

