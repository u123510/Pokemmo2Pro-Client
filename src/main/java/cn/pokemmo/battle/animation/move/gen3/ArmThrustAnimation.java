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
 * Renamed from f.u0
 */
/**
 * 宝可梦对战技能招式动画 - 猛推 (ArmThrust)
 * 技能编号: 292
 * 原始类: f.u0_0
 */
public class ArmThrustAnimation
extends MU {
    public ArmThrustAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        ArmThrustAnimation u0_02 = this;
        ArmThrustAnimation u0_03 = this;
        int n = 1422;
        int n2 = 1;
        int n3 = 16;
        float f = 333.33334f;
        float f2 = 0.9375f;
        PF pF = u0_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(u0_03.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        ArmThrustAnimation u0_04 = this;
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.859375f;
        pF = u0_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(u0_04.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(459));
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, 459, n, n2, n3, f), 0.2f);
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 459, n, n2, n3, f));
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 459, n, n2, n3, f));
        n = 3;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_17.xi0(this.fE0(-1, 459, n, n2, n3, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, -0.30004883f, 0.30004883f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        u0_02.Vs.jH(this.E8);
        u0_02.Vc();
        return u0_02;
    }
}

