/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.iu0
 */
/**
 * 宝可梦对战技能招式动画 - 大晴天 (SunnyDay)
 * 技能编号: 241
 * 原始类: f.iu0_0
 */
public class SunnyDayAnimation
extends MU {
    public SunnyDayAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1495;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).xi0(this.Ue0(4, 990, 0.0f, 0.375f, 0.1f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 1;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 1;
        n3 = 14;
        f = 2000.0f;
        f2 = 0.078125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(408));
        n = 408;
        n2 = 0;
        n3 = -4096;
        int n4 = 0;
        f2 = 0.75f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 408;
        n2 = 1;
        n3 = -4096;
        n4 = 0;
        f2 = 0.75f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 408;
        n2 = 2;
        n3 = -4096;
        n4 = 0;
        f2 = 0.75f;
        this.E8 = HB.p30(pw_18, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Ue0(4, 990, 0.375f, 0.0f, 0.1f)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

