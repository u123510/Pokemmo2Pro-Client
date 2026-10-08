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
 * 宝可梦对战技能招式动画 - 回收利用 (Recycle)
 * 技能编号: 278
 * 原始类: f.RA
 */
public class RecycleAnimation
extends MU {
    public RecycleAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        RecycleAnimation rA = this;
        RecycleAnimation rA2 = this;
        short s = 1713;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = rA2.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(rA2.i6((byte)2, s, n, n2, f, f2, pF));
        RecycleAnimation rA3 = this;
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = rA3.Vz0;
        pw_1 pw_14 = pw_13.xi0(rA3.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 1120.0f, 480.0f)).xi0(this.nM(14, 1)).y80(this.Qh0(444));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_14, this.fE0(-1, 444, s, n, n2, f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        rA.Vs.jH(this.E8);
        rA.Vc();
        return rA;
    }
}

