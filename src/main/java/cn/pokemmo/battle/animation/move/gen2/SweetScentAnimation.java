/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.py0
 */
/**
 * 宝可梦对战技能招式动画 - 甜甜香气 (SweetScent)
 * 技能编号: 230
 * 原始类: f.py0_0
 */
public class SweetScentAnimation
extends MU {
    public SweetScentAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        SweetScentAnimation py0_02 = this;
        SweetScentAnimation py0_03 = this;
        int n = 1667;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = py0_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).xi0(this.nM(14, 1)).xi0(py0_03.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(396));
        n = 2;
        n2 = 0;
        n3 = 8;
        f = 0.4f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 396, n, n2, n3, f));
        n = 0;
        n2 = 0;
        n3 = 8;
        f = 0.4f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 396, n, n2, n3, f));
        n = 4;
        n2 = 0;
        n3 = 8;
        f = 0.4f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 396, n, n2, n3, f));
        n = 3;
        n2 = 0;
        n3 = 8;
        f = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 396, n, n2, n3, f));
        n = 1;
        n2 = 0;
        n3 = 8;
        f = 0.4f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, 396, n, n2, n3, f));
        n = 4;
        n2 = 0;
        n3 = 8;
        f = 0.4f;
        this.E8 = pw_12 = A2.Kj0(pw_18.xi0(this.fE0(-1, 396, n, n2, n3, f)), this.Ue0(4, 22943, 0.0f, 0.375f, 0.025f), 1.6f).xi0(this.Ue0(4, 22943, 0.375f, 0.0f, 0.05f)).mz0().mz0().mz0().Xf0().p1(0.6f).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        py0_02.Vs.jH(this.E8);
        py0_02.Vc();
        return py0_02;
    }
}

