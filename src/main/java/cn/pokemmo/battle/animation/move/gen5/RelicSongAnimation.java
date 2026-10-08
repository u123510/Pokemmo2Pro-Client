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
import f.Zw0;
import f.pw_1;

/*
 * Renamed from f.Df0
 */
/**
 * 宝可梦对战技能招式动画 - 古老之歌 (RelicSong)
 * 技能编号: 547
 * 原始类: f.df0_0
 */
public class RelicSongAnimation
extends MU {
    public RelicSongAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1916;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.625f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 1600.0f, 1600.0f)).y80(this.Qh0(714));
        n = 714;
        n2 = 5;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = A2.Kj0(pw_12, this.fE0(-1, n, n2, n3, n4, f2), 0.12f);
        n = 714;
        n2 = 6;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(N4.zr(pw_13, this.fE0(-1, n, n2, n3, n4, f2), 0.24f), this.dA0(714, 2, 9, 11, 0.5f, 1800.0f), 0.36f), this.dA0(714, 3, 9, 11, 0.5f, 1800.0f), 0.48f), this.dA0(714, 4, 9, 11, 0.5f, 1800.0f), 0.6f), this.dA0(714, 2, 9, 11, 0.5f, 1800.0f), 0.72f), this.dA0(714, 4, 9, 11, 0.5f, 1800.0f), 0.84f), this.dA0(714, 2, 9, 11, 0.5f, 1800.0f), 0.96f).xi0(this.dA0(714, 3, 9, 11, 0.5f, 1800.0f)).xi0(this.Wt(1, 0.6f)).mz0().mz0().TD0().p1(1.08f).Xf0(), this.dA0(714, 4, 9, 11, 0.5f, 1800.0f), 1.2f), this.dA0(714, 2, 9, 11, 0.5f, 1800.0f), 1.32f), this.dA0(714, 4, 9, 11, 0.5f, 1800.0f), 1.52f).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(2.32f).Xf0();
        n = 1867;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1867;
        n2 = 2;
        n3 = 16;
        f3 = 500.0f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.Xq0(16, 2, 6, 0.0f, 0.096f, 0.19995117f, -0.19995117f)).xi0(this.EN(16, 2, 20, 0.0f, 0.032f, 0.30004883f, 0.0f));
        n = 714;
        n2 = 0;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = N4.zr(pw_16, this.fE0(-1, n, n2, n3, n5, f2), 2.52f);
        n = 714;
        n2 = 0;
        n3 = 11;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 714;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = N4.zr(pw_18, this.fE0(-1, n, n2, n3, n5, f2), 2.72f);
        n = 714;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f2 = 0.5f;
        this.E8 = Zw0.H(pw_19.xi0(this.fE0(-1, n, n2, n3, n5, f2)).mz0().mz0().mz0().Xf0().mz0().Xf0().xi0(this.tP(0.25f)).xi0(this.nM(16, 0)), this.Ue0(4, Short.MAX_VALUE, 0.625f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

