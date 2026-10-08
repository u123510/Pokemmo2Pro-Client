/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Sk
 */
/**
 * 宝可梦对战技能招式动画 - 气味侦测 (OdorSleuth)
 * 技能编号: 316
 * 原始类: f.sk_0
 */
public class OdorSleuthAnimation
extends MU {
    public OdorSleuthAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        OdorSleuthAnimation sk_02 = this;
        OdorSleuthAnimation sk_03 = this;
        short s = 1421;
        int n = 1;
        int n2 = 16;
        float f = 166.66667f;
        float f2 = 0.9375f;
        PF pF = sk_03.Vz0;
        pw_1 pw_13 = FB.zd0(0.6f).xi0(sk_03.i6((byte)2, s, n, n2, f, f2, pF));
        OdorSleuthAnimation sk_04 = this;
        s = 1421;
        n = 1;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.46875f;
        pF = sk_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(sk_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).xi0(this.EN(16, 3, 16, 0.0f, 0.016f, 3.0f, 0.0f)).TD0().p1(0.8f).Xf0().p1(0.6f);
        OdorSleuthAnimation sk_05 = this;
        s = 1452;
        n = 2;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = sk_05.Vz0;
        this.E8 = pw_12 = HB.p30(pk_1.el(pw_14, sk_05.i6((byte)2, s, n, n2, f, f2, pF)), this.EN(14, 3, 1, 0.016f, 0.032f, 0.5f, 0.0f)).xi0(this.nM(14, 0)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        sk_02.Vs.jH(this.E8);
        sk_02.Vc();
        return sk_02;
    }
}

