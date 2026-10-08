/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.La0
 */
/**
 * 宝可梦对战技能招式动画 - 戏法 (Trick)
 * 技能编号: 271
 * 原始类: f.la0_0
 */
public class TrickAnimation
extends MU {
    public TrickAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1452;
        int n2 = 2;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().xi0(this.nM(14, 1)).xi0(this.Xq0(14, 3, 1, 0.016f, 0.032f, 0.0f, 0.30004883f)), this.i6((byte)2, (short)n, n2, n3, f, f2, pF), 0.24f).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f));
        n = 1497;
        n2 = 1;
        n3 = 14;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 320.0f));
        n = 1394;
        n2 = 1;
        n3 = 2;
        f = 333.33334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1394;
        n2 = 1;
        n3 = 2;
        f = 666.6667f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1560;
        n2 = 2;
        n3 = 2;
        f = 1083.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1560;
        n2 = 1;
        n3 = 2;
        f = 1616.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1560;
        n2 = 2;
        n3 = 2;
        f = 2166.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 2240.0f, 480.0f)).y80(this.Qh0(437));
        n = 437;
        n2 = 0;
        n3 = 0;
        int n4 = 0;
        f2 = 0.0f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 437;
        n2 = 1;
        n3 = 0;
        n4 = 0;
        f2 = 0.0f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 437;
        n2 = 2;
        n3 = 0;
        n4 = 0;
        f2 = 0.0f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 437;
        n2 = 3;
        n3 = 0;
        n4 = 0;
        f2 = 0.0f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 437;
        n2 = 4;
        n3 = 0;
        n4 = 0;
        f2 = 0.0f;
        this.E8 = pk_1.el(pw_113, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

