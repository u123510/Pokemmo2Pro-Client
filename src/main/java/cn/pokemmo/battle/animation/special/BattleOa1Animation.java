/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.oA
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleOa1Animation
 * 原始类: f.oa_1
 */
public class BattleOa1Animation
extends MU {
    public BattleOa1Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BattleOa1Animation oa_12 = this;
        BattleOa1Animation oa_13 = this;
        short s = 1549;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = oa_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().y80(this.Qh0(362)).p1(0.6f).mz0().Xf0().xi0(oa_13.i6((byte)2, s, n, n2, f, f2, pF));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.4f;
        this.E8 = pw_12 = pw_13.xi0(this.fE0(-1, 362, s, n, n2, f)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        oa_12.Vs.jH(this.E8);
        oa_12.Vc();
        return oa_12;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

