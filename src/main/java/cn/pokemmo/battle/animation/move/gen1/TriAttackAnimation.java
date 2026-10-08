/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.mc
 */
/**
 * 宝可梦对战技能招式动画 - 三重攻击 (TriAttack)
 * 技能编号: 161
 * 原始类: f.mc_2
 */
public class TriAttackAnimation
extends MU {
    public TriAttackAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1496;
        int n2 = 2;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)), this.Ue0(4, 0, 0.0f, 0.75f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1496;
        n2 = 1;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(325)).y80(this.Qh0(326)).y80(this.Qh0(327));
        n = 325;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 326;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 327;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 325;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 326;
        n2 = 2;
        n3 = 9;
        n4 = 11;
        f2 = 0.5f;
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 1.2f).xi0(this.Wt(1, 0.4f));
        n = 1497;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.Sv0(2, 1, 480.0f, 640.0f));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f3 = 166.66667f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f3 = 250.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f3 = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f3 = 416.66666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 325;
        n2 = 1;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = N4.zr(pw_113.xi0(this.fE0(-1, n, n2, n3, n5, f2)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f), 2.0f);
        n = 1522;
        n2 = 1;
        n3 = 16;
        float f4 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_115 = pw_114.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 327;
        n2 = 0;
        n3 = 11;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_116 = N4.zr(pw_115.xi0(this.fE0(-1, n, n2, n3, n6, f2)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f), 2.8f);
        n = 1488;
        n2 = 2;
        n3 = 16;
        float f5 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_117 = pw_116.xi0(this.i6((byte)2, (short)n, n2, n3, f5, f2, pF));
        n = 326;
        n2 = 0;
        n3 = 11;
        int n7 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_117.xi0(this.fE0(-1, n, n2, n3, n7, f2)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

