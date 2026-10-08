/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 寄生种子 (LeechSeed)
 * 技能编号: 73
 * 原始类: f.Zr0
 */
public class LeechSeedAnimation
extends MU {
    public LeechSeedAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1513;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 160.0f));
        n = 1513;
        n2 = 2;
        n3 = 14;
        f = 233.33333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1513;
        n2 = 1;
        n3 = 14;
        f = 466.66666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1513;
        n2 = 2;
        n3 = 14;
        f = 700.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1513;
        n2 = 2;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1513;
        n2 = 1;
        n3 = 16;
        f = 1833.3334f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1513;
        n2 = 2;
        n3 = 16;
        f = 2000.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(234)).y80(this.Qh0(235)).y80(this.Qh0(236));
        n = 234;
        n2 = 2;
        n3 = 2;
        int n4 = 9;
        f2 = 0.0f;
        pw_1 pw_19 = A2.Kj0(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 0.2f);
        n = 234;
        n2 = 2;
        n3 = 2;
        n4 = 9;
        f2 = 0.0f;
        pw_1 pw_110 = N4.zr(pw_19, this.fE0(-1, n, n2, n3, n4, f2), 0.4f);
        n = 234;
        n2 = 2;
        n3 = 2;
        n4 = 9;
        f2 = 0.0f;
        pw_1 pw_111 = N4.zr(pw_110, this.fE0(-1, n, n2, n3, n4, f2), 0.6f);
        n = 234;
        n2 = 2;
        n3 = 2;
        n4 = 9;
        f2 = 0.0f;
        pw_1 pw_112 = N4.zr(pw_111, this.fE0(-1, n, n2, n3, n4, f2), 1.2f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(1.4f).Xf0();
        n = 235;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 236;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 235;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.125f;
        pw_1 pw_115 = pw_114.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 235;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.125f;
        pw_1 pw_116 = pw_115.xi0(this.fE0(-1, n, n2, n3, n4, f2)).mz0().mz0().TD0().p1(1.5f).Xf0().mz0().mz0().TD0().p1(1.5f).Xf0().y80(this.Qh0(234));
        n = 234;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.125f;
        pw_1 pw_117 = pw_116.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 234;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.125f;
        pw_1 pw_118 = N4.zr(pw_117, this.fE0(-1, n, n2, n3, n4, f2), 1.6f);
        n = 236;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.125f;
        pw_1 pw_119 = pw_118.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 236;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.125f;
        this.E8 = pk_1.el(pw_119, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

