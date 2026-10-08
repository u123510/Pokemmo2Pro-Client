/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.cv0
 */
/**
 * 宝可梦对战技能招式动画 - 龙之波动 (DragonPulse)
 * 技能编号: 406
 * 原始类: f.cv0_0
 */
public class DragonPulseAnimation
extends MU {
    public DragonPulseAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1445;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).y80(this.E2(18, true)).y80(this.Qh0(581)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1120.0f));
        n = 1425;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 2833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 2240.0f, 480.0f));
        n = 1407;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 2833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1460;
        n2 = 2;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1460;
        n2 = 2;
        n3 = 16;
        f = 1766.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1460;
        n2 = 2;
        n3 = 16;
        f = 1866.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1460;
        n2 = 2;
        n3 = 16;
        f = 1966.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1600.0f)).xi0(this.Sv0(1, 1, 2240.0f, 480.0f));
        n = 581;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 581;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 581;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = A2.Kj0(pw_113, this.fE0(-1, n, n2, n3, n4, f2), 1.2f).xi0(this.Wt(1, 0.8f));
        n = 581;
        n2 = 0;
        n3 = 9;
        n4 = 11;
        f2 = 0.5f;
        this.E8 = pk_1.el(N4.zr(pw_114, this.fE0(-1, n, n2, n3, n4, f2), 1.6f).xi0(this.nM(16, 1)), this.EN(16, 2, 14, 0.032f, 0.016f, 0.30004883f, 0.0f)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)).y80(this.E2(18, false)).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

