/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

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

/*
 * Renamed from f.hV
 */
/**
 * 宝可梦对战技能招式动画 - 闪焰冲锋 (FlareBlitz)
 * 技能编号: 394
 * 原始类: f.hv_1
 */
public class FlareBlitzAnimation
extends MU {
    public FlareBlitzAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1425;
        int bl = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1376;
        int f5 = 1;
        n2 = 14;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, f5, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 960.0f)).xi0(this.Sv0(1, 1, 640.0f, 320.0f));
        n = 1421;
        int bl2 = 2;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, bl2, n2, f, f2, pF));
        n = 1421;
        int f8 = 2;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, f8, n2, f, f2, pF)).y80(this.Qh0(569));
        n = 569;
        int n3 = 0;
        n2 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, n, n3, n2, n4, f2), 0.6f).xi0(this.EN(14, 2, 1, 0.032f, 0.048f, 1.0f, 0.0f)).y80(this.QO(24)).xi0(this.Ue0(3, 0, 0.0f, 0.8125f, 0.025f));
        n = 2;
        boolean bl3 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl3);
        n = 1425;
        int n5 = 0;
        n2 = 14;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pk_1.el(pw_16.y80(ao_1.pc(lpt4__42)), this.Ue0(2, 0, 0.0f, 0.8125f, 0.05f)).xi0(this.i6((byte)2, (short)n, n5, n2, f3, f2, pF)).xi0(this.Sv0(0, 0, 0.0f, 960.0f));
        n = 1376;
        int n6 = 0;
        n2 = 16;
        f3 = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n6, n2, f3, f2, pF)).xi0(this.Wt(1, 0.4f));
        n = 1505;
        int n7 = 2;
        n2 = 16;
        f3 = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n7, n2, f3, f2, pF));
        n = 1475;
        int n8 = 1;
        n2 = 16;
        f3 = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n8, n2, f3, f2, pF));
        n = 1475;
        int n9 = 1;
        n2 = 16;
        f3 = 1083.3334f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n9, n2, f3, f2, pF));
        n = 1475;
        int n10 = 1;
        n2 = 16;
        f3 = 1333.3334f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n10, n2, f3, f2, pF));
        n = 569;
        int n11 = 1;
        n2 = 11;
        int n12 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n11, n2, n12, f2));
        n = 569;
        int n13 = 2;
        n2 = 11;
        n12 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = A2.Kj0(pw_113, this.fE0(-1, n, n13, n2, n12, f2), 0.6f);
        n = 0;
        boolean bl4 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = false;
        float f4 = 0.25f;
        float f6 = 0.0f;
        float f7 = 0.8125f;
        Color color = px_1.ep0(0);
        int n52 = 0;
        boolean bl6 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n52, bl6);
        n52 = 1;
        boolean bl7 = true;
        pw_1 pw_115 = HB.p30(pk_1.el(A2.Kj0(pw_114.y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).mz0().mz0().mz0().Xf0(), this.Ue0(3, 0, 0.8125f, 0.0f, 0.075f), 0.04f).xi0(this.WW(16, f4, f6, f7, color)), this.EN(16, 2, 2, 0.016f, 0.032f, 0.30004883f, 0.0f)), this.Ue0(3, 0, 0.0f, 0.8125f, 0.025f)).y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(new lpt4__4(this, n52, bl7)));
        float f72 = 0.25f;
        float f9 = 0.8125f;
        f7 = 0.0f;
        color = px_1.ep0(0);
        this.E8 = pw_115.xi0(this.WW(16, f72, f9, f7, color)).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.025f)).xi0(this.tP(0.3f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

