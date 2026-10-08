/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 熔岩风暴 (MagmaStorm)
 * 技能编号: 463
 * 原始类: f.hw0
 */
public class MagmaStormAnimation
extends MU {
    public MagmaStormAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1976;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.QO(38));
        s = 2;
        n = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, n != 0);
        s = 0;
        n = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, n != 0);
        s = 1;
        n = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, s, n != 0);
        s = 1425;
        n = 1;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12.y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.8125f, 0.05f)).xi0(this.Wt(1, 0.4f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.mf0(4, 0, 24, 2.88f)).y80(this.E2(14, true)).y80(this.E2(16, true)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f = 2666.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 2240.0f)).xi0(this.Sv0(1, 1, 1920.0f, 640.0f));
        s = 1475;
        n = 2;
        n2 = 16;
        f = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f = 1166.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f = 1333.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f = 1500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f = 1833.3334f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1475;
        n = 2;
        n2 = 16;
        f = 2000.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(31);
        pw_1 pw_113 = A2.Kj0(pw_112.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(639)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 6, 0.032f, 0.064f, -0.30004883f, 0.30004883f), 0.64f).xi0(this.WW(16, f3, f4, f5, color)).mz0().mz0().TD0().p1(0.96f).Xf0();
        f3 = 0.5f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        pw_1 pw_114 = N4.zr(pw_113, this.WW(16, f3, f4, f5, color), 1.28f);
        f3 = 0.5f;
        f4 = 0.0f;
        f5 = 0.625f;
        color = px_1.ep0(31);
        int n3 = 0;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n3, bl);
        n3 = 1;
        bl = true;
        pw_1 pw_115 = HB.p30(pk_1.el(pw_114, this.WW(16, f3, f4, f5, color)), this.Ue0(3, 0, 0.0f, 0.9375f, 0.05f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n3, bl))).xi0(this.Ue0(2, 0, 0.9375f, 0.0f, 0.05f));
        float f6 = 0.5f;
        float f7 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        short s2 = 1376;
        int n4 = 1;
        int n5 = 16;
        float f8 = 0.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        this.E8 = pw_115.xi0(this.WW(16, f6, f7, f5, color)).xi0(this.nM(16, 0)).y80(this.E2(14, false)).y80(this.E2(16, false)).xi0(this.tP(0.4f)).xi0(this.i6((byte)2, s2, n4, n5, f8, f2, pF)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

