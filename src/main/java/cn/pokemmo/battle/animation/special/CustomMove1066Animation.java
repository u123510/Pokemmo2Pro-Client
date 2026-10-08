/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.oB
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1066]
 * 原始类: f.ob_1
 */
public class CustomMove1066Animation
extends MU {
    public CustomMove1066Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove1066Animation ob_12 = this;
        this.E8 = pw_12 = pw_1.xC().xi0(this.Wt(4, 0.4f)).Xf0().y80(this.wn0("1066")).mz0().p1(1.35f).xi0(this.tP(0.4f));
        pw_12.Ms(this.Vs.wP);
        ob_12.Vs.jH(this.E8);
        ob_12.Vc();
        return ob_12;
    }
}

