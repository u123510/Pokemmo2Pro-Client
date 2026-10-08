/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.fu
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1061]
 * 原始类: f.fu_1
 */
public class CustomMove1061Animation
extends MU {
    public CustomMove1061Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove1061Animation fu_12 = this;
        this.E8 = pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).y80(this.wn0("1061")).mz0().p1(1.6f).xi0(this.tP(0.4f));
        pw_12.Ms(this.Vs.wP);
        fu_12.Vs.jH(this.E8);
        fu_12.Vc();
        return fu_12;
    }
}

