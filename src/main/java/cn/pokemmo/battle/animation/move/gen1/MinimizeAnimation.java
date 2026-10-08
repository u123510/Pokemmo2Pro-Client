/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Sn
 */
/**
 * 宝可梦对战技能招式动画 - 变小 (Minimize)
 * 技能编号: 107
 * 原始类: f.sn_0
 */
public class MinimizeAnimation
extends MU {
    public MinimizeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1414;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).mz0().Xf0().y80(this.E2(14, true)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1414;
        n = 1;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)), this.Xq0(14, 2, 2, 0.016f, 0.128f, -0.5f, -0.5f));
        s = 1483;
        n = 1;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = A2.Kj0(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 800.0f)).xi0(this.Sv0(1, 1, 0.0f, 640.0f)), this.Xq0(14, 2, 1, 0.016f, 0.256f, -0.89990234f, -0.89990234f), 0.64f).y80(this.E2(14, false)).mz0().mz0().mz0().Xf0().xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

