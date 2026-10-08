/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.xs0
 */
/**
 * 宝可梦对战技能招式动画 - 觉醒力量 (HiddenPower)
 * 技能编号: 237
 * 原始类: f.xs0_0
 */
public class HiddenPowerAnimation
extends MU {
    public HiddenPowerAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1483;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).y80(this.E2(18, true)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1417;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1280.0f)).xi0(this.Sv0(2, 0, 0.0f, 1280.0f)).y80(this.Qh0(404));
        n = 404;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = HB.p30(pw_14, this.fE0(-1, n, n2, n3, n4, f2));
        n = 1509;
        n2 = 1;
        n3 = 14;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1358;
        n2 = 2;
        n3 = 14;
        f3 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 404;
        n2 = 3;
        n3 = 9;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 404;
        n2 = 4;
        n3 = 9;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 404;
        n2 = 2;
        n3 = 9;
        n5 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 404;
        n2 = 0;
        n3 = 9;
        n5 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_110.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.tP(0.3f)).xi0(this.nM(16, 1)).TD0().p1(0.4f).Xf0(), this.Xq0(16, 2, 1, 0.016f, 0.064f, -0.30004883f, 0.30004883f)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f)).y80(this.E2(18, false)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

