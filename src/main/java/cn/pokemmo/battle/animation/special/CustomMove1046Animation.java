/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.pw_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1046, 1051]
 * 原始类: f.V80
 */
public class CustomMove1046Animation
extends MU {
    public CustomMove1046Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f;
        float f2;
        long l = System.currentTimeMillis();
        ao_1 ao_12 = ao_1.DX(this.Vz0.LpT9, 13, 1.0f);
        ao_12.h5[0] = f2 = 1.85f;
        short s = 1426;
        int n2 = 1;
        int n3 = 14;
        float f3 = 150.0f;
        float f4 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.8f)), this.Ue0(4, 8470, 0.0f, 0.75f, 0.05f)).y80(ao_12).xi0(this.i6((byte)2, s, n2, n3, f3, f4, pF));
        s = 1426;
        n2 = 1;
        n3 = 14;
        f3 = 650.0f;
        f4 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n2, n3, f3, f4, pF));
        s = 1426;
        n2 = 1;
        n3 = 14;
        f3 = 1150.0f;
        f4 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n2, n3, f3, f4, pF));
        s = 1426;
        n2 = 1;
        n3 = 14;
        f3 = 1650.0f;
        f4 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n2, n3, f3, f4, pF));
        s = 1426;
        n2 = 1;
        n3 = 14;
        f3 = 2150.0f;
        f4 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n2, n3, f3, f4, pF));
        s = 1426;
        n2 = 1;
        n3 = 14;
        f3 = 2650.0f;
        f4 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n2, n3, f3, f4, pF));
        s = 1907;
        n2 = 2;
        n3 = 14;
        f3 = 2650.0f;
        f4 = 0.9921875f;
        pF = this.Vz0;
        ao_1 ao_13 = ao_1.DX(this.Vz0.LpT9, 13, 1.0f);
        ao_13.h5[0] = f = this.Vz0.qs0();
        this.E8 = pw_17.xi0(this.i6((byte)2, s, n2, n3, f3, f4, pF)).mz0().y80(this.wn0("1046")).p1(2.0f).Xf0().xi0(this.Wt(1, 0.4f)).y80(ao_1.pc((n, d2) -> this.Vz0.U7(0.8f))).y80(ao_13).xi0(this.Ue0(4, 8470, 0.75f, 0.0f, 0.2f)).mz0().xi0(this.tP(0.4f)).y80(ao_1.pc((n, d2) -> System.out.println(System.currentTimeMillis() - l)));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

