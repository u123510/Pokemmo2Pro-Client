/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.of
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleOf2Animation
 * 原始类: f.of_2
 */
public class BattleOf2Animation
extends MU {
    public BattleOf2Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleOf2Animation of_22 = this;
        short s = 0;
        int n = 9;
        int n2 = 8;
        float f = 0.4f;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.Qh0(156)).p1(0.6f).mz0().Xf0().xi0(this.fE0(-1, 156, s, n, n2, f));
        BattleOf2Animation of_23 = this;
        s = 1560;
        n = 1;
        n2 = 14;
        f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = of_23.Vz0;
        pw_1 pw_14 = pw_13.xi0(of_23.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_14.xi0(this.fE0(-1, 156, s, n, n2, f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        of_22.Vs.jH(this.E8);
        of_22.Vc();
        return of_22;
    }
}

