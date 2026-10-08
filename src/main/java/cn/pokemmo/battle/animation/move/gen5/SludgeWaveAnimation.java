/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.gz
 */
/**
 * 宝可梦对战技能招式动画 - 污泥波 (SludgeWave)
 * 技能编号: 482
 * 原始类: f.gz_2
 */
public class SludgeWaveAnimation
extends MU {
    public SludgeWaveAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1480;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.3f)).mz0().Xf0().y80(this.Qh0(653)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1863;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_13 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(A2.Kj0(pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1280.0f)).xi0(this.Sv0(1, 1, 640.0f, 640.0f)).xi0(this.Sv0(2, 1, 640.0f, 640.0f)), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.02f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.04f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.06f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.08f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.1f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.12f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.14f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.16f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.18f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.2f), this.dA0(653, 2, 9, 11, 0.5f, 1200.0f), 0.42f).xi0(this.Wt(1, 0.4f)).xi0(this.nM(16, 1)).mz0().mz0().mz0().Xf0();
        n = 1536;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1887;
        n2 = 2;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 653;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 653;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

