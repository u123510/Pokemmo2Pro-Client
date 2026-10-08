/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.FB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.COm9
 */
/**
 * 宝可梦对战技能招式动画 - 长嚎 (Howl)
 * 技能编号: 336
 * 原始类: f.com9__0
 */
public class HowlAnimation
extends MU {
    public HowlAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        HowlAnimation com9__02 = this;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f = 0.4f;
        pw_1 pw_13 = FB.zd0(0.6f).xi0(this.Uv(false, 0.0f)).mz0().Xf0().y80(this.Qh0(506)).xi0(this.fE0(-1, 506, n, n2, n3, f));
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_13.xi0(this.fE0(-1, 506, n, n2, n3, f)).xi0(this.Xq0(14, 2, 1, 0.032f, 0.144f, -0.39990234f, 0.39990234f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        com9__02.Vs.jH(this.E8);
        com9__02.Vc();
        return com9__02;
    }
}

