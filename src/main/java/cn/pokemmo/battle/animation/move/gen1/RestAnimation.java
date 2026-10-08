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
import f.pw_1;

/*
 * Renamed from f.mn
 */
/**
 * 宝可梦对战技能招式动画 - 睡觉 (Rest)
 * 技能编号: 156
 * 原始类: f.mn_2
 */
public class RestAnimation
extends MU {
    public RestAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2033;
        int n2 = 1;
        int n3 = 14;
        float f = 333.33334f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 2033;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 2033;
        n2 = 1;
        n3 = 14;
        f = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1462;
        n2 = 2;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1462;
        n2 = 2;
        n3 = 14;
        f = 1416.6666f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_16 = HB.p30(pw_15, this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(320));
        n = 320;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 320;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 0.6f);
        n = 320;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = N4.zr(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 1.2f);
        n = 320;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 320;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 1)).mz0().mz0().mz0().Xf0().xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

