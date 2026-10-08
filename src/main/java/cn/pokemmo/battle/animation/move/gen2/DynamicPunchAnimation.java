/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

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
 * 宝可梦对战技能招式动画 - 爆裂拳 (DynamicPunch)
 * 技能编号: 223
 * 原始类: f.Sn0
 */
public class DynamicPunchAnimation
extends MU {
    public DynamicPunchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1475;
        int bl = 1;
        int n2 = 16;
        float f = 333.33334f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1425;
        int f4 = 2;
        n2 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, f4, n2, f, f2, pF));
        n = 1376;
        int bl2 = 2;
        n2 = 16;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, bl2, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 960.0f, 640.0f));
        n = 1475;
        int f7 = 1;
        n2 = 16;
        f = 500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, f7, n2, f, f2, pF));
        n = 1475;
        int n3 = 1;
        n2 = 16;
        f = 666.6667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF));
        n = 1475;
        int n4 = 1;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF));
        n = 1475;
        int n5 = 1;
        n2 = 16;
        f = 1000.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF)).y80(this.QO(1)).mz0().Xf0().y80(this.Qh0(389));
        n = 389;
        int n6 = 6;
        n2 = 11;
        int n7 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n6, n2, n7, f2));
        n = 389;
        int n8 = 5;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n8, n2, n7, f2));
        n = 389;
        int n9 = 2;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n9, n2, n7, f2));
        n = 389;
        int n10 = 4;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n10, n2, n7, f2));
        n = 389;
        int n11 = 3;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n11, n2, n7, f2));
        n = 389;
        int n12 = 1;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = A2.Kj0(pw_113, this.fE0(-1, n, n12, n2, n7, f2), 0.2f);
        n = 389;
        int n13 = 0;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_115 = pw_114.xi0(this.fE0(-1, n, n13, n2, n7, f2)).xi0(this.Xq0(16, 2, 2, 0.0f, 0.064f, -0.19995117f, 0.19995117f)).xi0(this.Ue0(2, 0, 0.0f, 0.8125f, 0.05f)).xi0(this.mf0(2, 0, 4, 0.016f));
        n = 2;
        boolean bl3 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl3);
        n = 0;
        boolean bl4 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = false;
        float f3 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(0);
        int n42 = 0;
        boolean bl6 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n42, bl6);
        n42 = 1;
        boolean bl7 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n42, bl7);
        n42 = 2;
        boolean bl8 = false;
        pw_1 pw_116 = HB.p30(pk_1.el(pw_115.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).xi0(this.WW(16, f3, f5, f6, color)).xi0(this.nM(16, 1)), this.EN(16, 2, 16, 0.016f, 0.016f, 0.30004883f, 0.0f)), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.05f)).y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n42, bl8))).xi0(this.tP(0.4f));
        float f62 = 0.25f;
        float f8 = 0.75f;
        f6 = 0.0f;
        color = px_1.ep0(0);
        this.E8 = pw_116.xi0(this.WW(16, f62, f8, f6, color)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

