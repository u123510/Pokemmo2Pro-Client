/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Tp
 */
/**
 * 宝可梦对战技能招式动画 - 加农水炮 (HydroCannon)
 * 技能编号: 308
 * 原始类: f.tp_0
 */
public class HydroCannonAnimation
extends MU {
    public HydroCannonAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1418;
        int bl = 3;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1376;
        int n3 = 3;
        n2 = 14;
        f = 2166.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 960.0f)).xi0(this.Ue0(4, 0, 0.0f, 0.9375f, 0.075f)).y80(this.Qh0(475));
        n = 475;
        int n4 = 3;
        n2 = 9;
        int n5 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = HB.p30(pw_13, this.fE0(-1, n, n4, n2, n5, f2));
        n = 1450;
        int n6 = 1;
        n2 = 14;
        float f3 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n6, n2, f3, f2, pF));
        n = 1376;
        int n7 = 1;
        n2 = 14;
        f3 = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n7, n2, f3, f2, pF));
        n = 1407;
        int n8 = 2;
        n2 = 14;
        f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n8, n2, f3, f2, pF));
        n = 1376;
        int n9 = 2;
        n2 = 14;
        f3 = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n9, n2, f3, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 800.0f)).xi0(this.Sv0(1, 0, 0.0f, 800.0f)).xi0(this.Sv0(1, 1, 1120.0f, 480.0f)).xi0(this.Sv0(2, 1, 1120.0f, 480.0f)).xi0(this.dA0(475, 0, 9, 11, 0.25f, 0.0f)).xi0(this.dA0(475, 1, 9, 11, 0.25f, 0.0f)).xi0(this.dA0(475, 2, 9, 11, 0.25f, 0.0f)).y80(this.QO(30));
        n = 2;
        boolean bl2 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 1;
        boolean bl4 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 1;
        boolean bl6 = true;
        this.E8 = HB.p30(pk_1.el(pw_18.y80(ao_1.pc(lpt4__42)).xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.025f)).xi0(this.mf0(4, -32, 0, 1.6f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).TD0().p1(0.4f).Xf0().xi0(this.tP(0.4f)).y80(this.E2(14, true)).y80(this.E2(16, true)).xi0(this.nM(16, 1)), this.EN(16, 2, 8, 0.016f, 0.032f, -0.5f, 0.0f)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f)).y80(this.E2(14, false)).y80(this.E2(16, false)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl6))).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

