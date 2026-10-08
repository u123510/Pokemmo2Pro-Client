/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Vv
 */
/**
 * 宝可梦对战技能招式动画 - 玩水 (WaterSport)
 * 技能编号: 346
 * 原始类: f.vv_0
 */
public class WaterSportAnimation
extends MU {
    public WaterSportAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1452;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1407;
        n2 = 2;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 1120.0f, 320.0f)).xi0(this.Xq0(14, 2, 3, 0.016f, 0.096f, 0.30004883f, -0.30004883f)).y80(this.Qh0(519));
        n = 519;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 519;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = HB.p30(pw_15, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Wt(0, 0.6f)).mz0().Xf0();
        n = 1511;
        n2 = 1;
        n3 = 16;
        float f3 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1511;
        n2 = 2;
        n3 = 16;
        f3 = 500.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 519;
        n2 = 0;
        n3 = 11;
        int n5 = 8;
        f2 = 0.4f;
        this.E8 = pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.nM(16, 1)).TD0().p1(0.2f).Xf0().xi0(this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).mz0().mz0().mz0().Xf0().p1(0.6f).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

