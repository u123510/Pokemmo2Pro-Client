/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.fA0
 */
/**
 * 宝可梦对战技能招式动画 - 鹦鹉学舌 (MirrorMove)
 * 技能编号: 119
 * 原始类: f.fa0_1
 */
public class MirrorMoveAnimation
extends MU {
    public MirrorMoveAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MirrorMoveAnimation fa0_12 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        fa0_12.Vs.jH(this.E8);
        fa0_12.Vc();
        return fa0_12;
    }
}

