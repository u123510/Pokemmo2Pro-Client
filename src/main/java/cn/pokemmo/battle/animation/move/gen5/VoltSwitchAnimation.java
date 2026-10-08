/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.ar0
 */
/**
 * 宝可梦对战技能招式动画 - 伏特替换 (VoltSwitch)
 * 技能编号: 521
 * 原始类: f.ar0_0
 */
public class VoltSwitchAnimation
extends MU {
    public VoltSwitchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1589;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(2, 0, 0.0f, 0.75f, 0.125f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1522;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1447;
        n = 2;
        n2 = 14;
        f = 1166.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(687));
        s = 687;
        n = 2;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 687;
        n = 5;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 687;
        n = 3;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).TD0().p1(1.2f).Xf0().xi0(this.dA0(687, 4, 9, 11, 0.5f, 360.0f)).xi0(this.dA0(687, 5, 9, 11, 0.5f, 360.0f)).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(1.6f).Xf0();
        s = 687;
        n = 6;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 687;
        n = 0;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 687;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 1522;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        this.E8 = N4.zr(pw_111, this.i6((byte)2, s, n, n2, f3, f2, pF), 2.0f).xi0(this.Xq0(16, 2, 8, 0.0f, 0.048f, 0.100097656f, -0.100097656f)).xi0(this.nM(16, 0)).mz0().mz0().TD0().p1(2.4f).Xf0().xi0(this.tP(0.25f)).mz0().mz0().TD0().p1(2.6f).Xf0().xi0(this.Ue0(2, 0, 0.75f, 0.0f, 0.125f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

