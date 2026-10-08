/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 大字爆炎 (FireBlast)
 * 技能编号: 126
 * 原始类: f.Ar0
 */
public class FireBlastAnimation
extends MU {
    public FireBlastAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1426;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.Qh0(291)).xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1497;
        n2 = 0;
        n3 = 14;
        f = 0.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 0;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(0, 0, 0.0f, 720.0f));
        n = 291;
        n2 = 6;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n, n2, n3, n4, f2), 0.6f).xi0(this.Wt(1, 0.8f));
        n = 291;
        n2 = 7;
        n3 = 9;
        n4 = 11;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Ue0(2, 31, 0.0f, 0.8125f, 0.05f));
        n = 1425;
        n2 = 1;
        n3 = 14;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pk_1.el(pw_16, this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 0;
        n3 = 16;
        f3 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f3 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 291;
        n2 = 0;
        n3 = 11;
        int n5 = 8;
        f2 = 0.75f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 291;
        n2 = 1;
        n3 = 11;
        n5 = 8;
        f2 = 0.75f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 291;
        n2 = 2;
        n3 = 11;
        n5 = 8;
        f2 = 0.75f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 291;
        n2 = 3;
        n3 = 11;
        n5 = 8;
        f2 = 0.75f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 291;
        n2 = 4;
        n3 = 11;
        n5 = 8;
        f2 = 0.75f;
        pw_1 pw_115 = pw_114.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 291;
        n2 = 5;
        n3 = 11;
        n5 = 8;
        f2 = 0.75f;
        float f4 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.625f;
        Color color = px_1.ep0(31);
        int n6 = 1;
        boolean bl = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, n6, bl);
        n6 = 0;
        bl = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n6, bl);
        n6 = 2;
        bl = true;
        pw_1 pw_116 = HB.p30(pw_115.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.WW(16, f4, f5, f6, color)).xi0(this.Xq0(16, 2, 6, 0.016f, 0.032f, -0.19995117f, 0.30004883f)).y80(this.QO(15)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(new lpt4__4(this, n6, bl))), this.mf0(2, 0, 8, 0.032f));
        float f7 = 0.75f;
        float f8 = 0.625f;
        f6 = 0.0f;
        color = px_1.ep0(31);
        int n7 = 1;
        boolean bl2 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n7, bl2);
        n7 = 0;
        bl2 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n7, bl2);
        n7 = 2;
        bl2 = false;
        this.E8 = A2.Kj0(pw_116.xi0(this.WW(16, f7, f8, f6, color)), this.Ue0(3, 0, 0.0f, 1.0f, 0.025f), 0.32f).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).xi0(this.nM(16, 0)).y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n7, bl2))).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

