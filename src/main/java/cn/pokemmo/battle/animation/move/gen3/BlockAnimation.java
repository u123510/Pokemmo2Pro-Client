/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 挡路 (Block)
 * 技能编号: 335
 * 原始类: f.W40
 */
public class BlockAnimation
extends MU {
    public BlockAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BlockAnimation w40 = this;
        BlockAnimation w402 = this;
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = w402.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(w402.i6((byte)2, s, n, n2, f, f2, pF));
        BlockAnimation w403 = this;
        s = 1424;
        n = 2;
        n2 = 16;
        f = 283.33334f;
        f2 = 0.9375f;
        pF = w403.Vz0;
        pw_1 pw_14 = pw_13.xi0(w403.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(505));
        s = 1;
        n = 11;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 505, s, n, n2, f));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_15, this.fE0(-1, 505, s, n, n2, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        w40.Vs.jH(this.E8);
        w40.Vc();
        return w40;
    }
}

