/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Ne0
 */
/**
 * 宝可梦对战技能招式动画 - 大闹一番 (Thrash)
 * 技能编号: 37
 * 原始类: f.ne0_0
 */
public class ThrashAnimation
extends MU {
    public ThrashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1420;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 250.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(199));
        n = 199;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 199;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_15 = A2.Kj0(pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f), 0.4f);
        n = 1420;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f3 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 199;
        n2 = 0;
        n3 = 11;
        int n5 = 8;
        f2 = 0.525f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 199;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f2 = 0.525f;
        pw_1 pw_19 = N4.zr(pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f2)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f), 0.8f);
        n = 1420;
        n2 = 1;
        n3 = 16;
        float f4 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f4 = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f2, pF));
        n = 199;
        n2 = 0;
        n3 = 11;
        int n6 = 8;
        f2 = 0.275f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n6, f2));
        n = 199;
        n2 = 2;
        n3 = 11;
        n6 = 8;
        f2 = 0.275f;
        pw_1 pw_113 = N4.zr(pw_112.xi0(this.fE0(-1, n, n2, n3, n6, f2)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f), 1.2f);
        n = 1420;
        n2 = 2;
        n3 = 16;
        float f5 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_114 = pw_113.xi0(this.i6((byte)2, (short)n, n2, n3, f5, f2, pF));
        n = 199;
        n2 = 0;
        n3 = 11;
        int n7 = 8;
        f2 = 0.4f;
        pw_1 pw_115 = pw_114.xi0(this.fE0(-1, n, n2, n3, n7, f2));
        n = 199;
        n2 = 1;
        n3 = 11;
        n7 = 8;
        f2 = 0.4f;
        this.E8 = pw_115.xi0(this.fE0(-1, n, n2, n3, n7, f2)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 1)).mz0().mz0().mz0().Xf0().xi0(this.nM(16, 0)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

