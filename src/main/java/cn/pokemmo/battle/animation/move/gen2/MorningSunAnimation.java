/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;

/*
 * Renamed from f.pv
 */
/**
 * 宝可梦对战技能招式动画 - 晨光 (MorningSun)
 * 技能编号: 234
 * 原始类: f.pv_2
 */
public class MorningSunAnimation
extends MU {
    public MorningSunAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MorningSunAnimation pv_22 = this;
        MorningSunAnimation pv_23 = this;
        int n = 1820;
        int n2 = 2;
        int n3 = 14;
        float f = 333.33334f;
        float f2 = 0.625f;
        PF pF = pv_23.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.4375f, 0.075f)).xi0(pv_23.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        MorningSunAnimation pv_24 = this;
        n = 1820;
        n2 = 1;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.234375f;
        pF = pv_24.Vz0;
        pw_1 pw_14 = pw_13.xi0(pv_24.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(401));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 401, n, n2, n3, f));
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 401, n, n2, n3, f));
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = Zw0.H(pw_16.xi0(this.fE0(-1, 401, n, n2, n3, f)).mz0().Xf0().p1(0.6f), this.Ue0(4, Short.MAX_VALUE, 0.4375f, 0.0f, 0.075f));
        pw_12.Ms(this.Vs.wP);
        pv_22.Vs.jH(this.E8);
        pv_22.Vc();
        return pv_22;
    }
}

