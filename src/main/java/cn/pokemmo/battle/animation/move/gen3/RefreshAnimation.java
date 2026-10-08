/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;

/*
 * Renamed from f.ik
 */
/**
 * 宝可梦对战技能招式动画 - 焕然一新 (Refresh)
 * 技能编号: 287
 * 原始类: f.ik_2
 */
public class RefreshAnimation
extends MU {
    public RefreshAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        RefreshAnimation ik_22 = this;
        RefreshAnimation ik_23 = this;
        short s = 1483;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = ik_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.75f, 0.075f)).xi0(this.Wt(0, 0.4f)).xi0(ik_23.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 480.0f));
        RefreshAnimation ik_24 = this;
        s = 1509;
        n = 2;
        n2 = 14;
        f = 750.0f;
        f2 = 0.78125f;
        pF = ik_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(ik_24.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(454));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 454, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = Zw0.H(HB.p30(pw_15, this.fE0(-1, 454, s, n, n2, f)).xi0(this.tP(0.4f)), this.Ue0(4, Short.MAX_VALUE, 0.75f, 0.0f, 0.075f));
        pw_12.Ms(this.Vs.wP);
        ik_22.Vs.jH(this.E8);
        ik_22.Vc();
        return ik_22;
    }
}

