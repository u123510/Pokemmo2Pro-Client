/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.yl
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleYl1Animation
 * 原始类: f.yl_1
 */
public class BattleYl1Animation
extends MU {
    public BattleYl1Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleYl1Animation yl_12 = this;
        BattleYl1Animation yl_13 = this;
        short s = 1471;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = yl_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(this.Qh0(2)).xi0(yl_13.i6((byte)2, s, n, n2, f, f2, pF));
        BattleYl1Animation yl_14 = this;
        s = 1358;
        n = 2;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.8984375f;
        pF = yl_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(yl_14.i6((byte)2, s, n, n2, f, f2, pF));
        BattleYl1Animation yl_15 = this;
        s = 1358;
        n = 2;
        n2 = 14;
        f = 500.0f;
        f2 = 0.4609375f;
        pF = yl_15.Vz0;
        pw_1 pw_15 = pw_14.xi0(yl_15.i6((byte)2, s, n, n2, f, f2, pF));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 2, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.25f;
        this.E8 = pw_12 = HB.p30(pw_16, this.fE0(-1, 2, s, n, n2, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        yl_12.Vs.jH(this.E8);
        yl_12.Vc();
        return yl_12;
    }
}

