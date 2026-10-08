/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.aL0
 */
/**
 * 宝可梦对战技能招式动画 - 换档 (ShiftGear)
 * 技能编号: 508
 * 原始类: f.al0_1
 */
public class ShiftGearAnimation
extends MU {
    public ShiftGearAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1448;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1448;
        n2 = 2;
        n3 = 14;
        f = 83.333336f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1678;
        n2 = 1;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1654;
        n2 = 2;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 1280.0f, 160.0f));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(673));
        n = 673;
        n2 = 6;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 673;
        n2 = 7;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 0.2f);
        n = 673;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 673;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 673;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 673;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 673;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 673;
        n2 = 5;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_113.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 1)).mz0().mz0().TD0().p1(0.92f).Xf0(), this.Xq0(14, 2, 12, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

