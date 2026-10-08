/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.vm0
 */
/**
 * 宝可梦对战技能招式动画 - 光墙 (LightScreen)
 * 技能编号: 113
 * 原始类: f.vm0_0
 */
public class LightScreenAnimation
extends MU {
    public LightScreenAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        LightScreenAnimation vm0_02 = this;
        int n = 1;
        int n2 = 9;
        int n3 = 8;
        float f = 0.375f;
        pw_1 pw_13 = FB.zd0(0.4f).y80(this.Qh0(278)).y80(this.Qh0(279)).xi0(this.fE0(-1, 278, n, n2, n3, f));
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 278, n, n2, n3, f));
        LightScreenAnimation vm0_03 = this;
        n = 1472;
        n2 = 1;
        n3 = 14;
        f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = vm0_03.Vz0;
        pw_1 pw_15 = A2.Kj0(pw_14, vm0_03.i6((byte)2, (short)n, n2, n3, f, f2, pF), 0.2f);
        n = 0;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 279, n, n2, n3, f));
        LightScreenAnimation vm0_04 = this;
        n = 1470;
        n2 = 1;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.8984375f;
        pF = vm0_04.Vz0;
        pw_1 pw_17 = pw_16.xi0(vm0_04.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        LightScreenAnimation vm0_05 = this;
        n = 1471;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.703125f;
        pF = vm0_05.Vz0;
        pw_1 pw_18 = N4.zr(pw_17, vm0_05.i6((byte)2, (short)n, n2, n3, f, f2, pF), 1.4f);
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_18, this.fE0(-1, 278, n, n2, n3, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        vm0_02.Vs.jH(this.E8);
        vm0_02.Vc();
        return vm0_02;
    }
}

