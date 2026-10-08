/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.dh
 */
/**
 * 宝可梦对战技能招式动画 - 辅助力量 (StoredPower)
 * 技能编号: 500
 * 原始类: f.dh_2
 */
public class StoredPowerAnimation
extends MU {
    public StoredPowerAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        StoredPowerAnimation dh_22 = this;
        StoredPowerAnimation dh_23 = this;
        short s = 1654;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = dh_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(dh_23.i6((byte)2, s, n, n2, f, f2, pF));
        StoredPowerAnimation dh_24 = this;
        s = 1593;
        n = 1;
        n2 = 14;
        f = 700.0f;
        f2 = 0.9921875f;
        pF = dh_24.Vz0;
        pw_1 pw_14 = HB.p30(pw_13.xi0(dh_24.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Ue0(2, 0, 0.0f, 0.625f, 0.075f)), this.WW(14, 0.25f, 0.0f, 0.625f, px_1.ep0(31))).y80(this.Qh0(667));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 667, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_15.xi0(this.fE0(-1, 667, s, n, n2, f)), this.WW(14, 0.25f, 0.625f, 0.0f, px_1.ep0(31))).xi0(this.nM(16, 0)).xi0(this.Ue0(2, 0, 0.625f, 0.0f, 0.075f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        dh_22.Vs.jH(this.E8);
        dh_22.Vc();
        return dh_22;
    }
}

