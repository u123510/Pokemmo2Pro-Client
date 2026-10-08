/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

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

/*
 * Renamed from f.coM8
 */
/**
 * 宝可梦对战技能招式动画 - 极寒冷焰 (IceBurn)
 * 技能编号: 554
 * 原始类: f.com8__4
 */
public class IceBurnAnimation
extends MU {
    public IceBurnAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        int n = 1440;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 2036;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.E2(18, true)).xi0(this.Wt(0, 0.4f)).y80(this.Qh0(724));
        n = 724;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 724;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 724;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 724;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = A2.Kj0(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.12f);
        n = 724;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = N4.zr(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 0.2f);
        n = 724;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 724;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.EN(14, 2, 16, 0.0f, 0.032f, 0.19995117f, 0.0f)), this.Xq0(14, 2, 1, 0.0f, 0.32f, 0.19995117f, -0.19995117f)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        return this;
    }

    @Override
    public final MU us() {
        int n = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 1895;
        int f5 = 2;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.QO(24)).y80(ao_1.pc(lpt4__42)).xi0(this.Ue0(4, 0, 0.0f, 1.0f, 0.075f)).xi0(this.i6((byte)2, (short)n, f5, n2, f, f2, pF));
        n = 1940;
        int bl2 = 1;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, bl2, n2, f, f2, pF)).xi0(this.Wt(0, 0.4f)).y80(this.Qh0(725));
        n = 725;
        int f8 = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, f8, n2, n3, f2)).y80(this.Qh0(716));
        n = 716;
        int n4 = 0;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n4, n2, n3, f2)).xi0(this.Xq0(14, 2, 1, 0.0f, 0.32f, 0.30004883f, -0.30004883f));
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 1440;
        int n5 = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.y80(ao_1.pc(lpt4__43)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n5, n2, f3, f2, pF));
        n = 1449;
        int n6 = 2;
        n2 = 16;
        f3 = 416.66666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n6, n2, f3, f2, pF));
        n = 1449;
        int n7 = 2;
        n2 = 16;
        f3 = 833.3333f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n7, n2, f3, f2, pF));
        n = 1449;
        int n8 = 2;
        n2 = 16;
        f3 = 1250.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n8, n2, f3, f2, pF));
        n = 1449;
        int n9 = 2;
        n2 = 16;
        f3 = 1666.6666f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n9, n2, f3, f2, pF));
        n = 1488;
        int n10 = 1;
        n2 = 16;
        f3 = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n10, n2, f3, f2, pF));
        n = 1488;
        int n11 = 1;
        n2 = 16;
        f3 = 1166.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n11, n2, f3, f2, pF));
        n = 1516;
        int n12 = 0;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, (short)n, n12, n2, f3, f2, pF)).xi0(this.Wt(1, 0.4f));
        n = 716;
        int n13 = 5;
        n2 = 11;
        int n14 = 8;
        f2 = 0.5f;
        pw_1 pw_114 = pw_113.xi0(this.fE0(-1, n, n13, n2, n14, f2));
        n = 716;
        int n15 = 6;
        n2 = 11;
        n14 = 8;
        f2 = 0.5f;
        pw_1 pw_115 = pw_114.xi0(this.fE0(-1, n, n15, n2, n14, f2));
        n = 716;
        int n16 = 7;
        n2 = 11;
        n14 = 8;
        f2 = 0.5f;
        pw_1 pw_116 = pw_115.xi0(this.fE0(-1, n, n16, n2, n14, f2));
        n = 1;
        boolean bl4 = false;
        float f4 = 0.75f;
        float f6 = 0.0f;
        float f7 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        int n52 = 716;
        int n17 = 2;
        int n18 = 11;
        int n19 = 8;
        f2 = 0.5f;
        pw_1 pw_117 = HB.p30(pk_1.el(A2.Kj0(pw_116.y80(ao_1.pc(new lpt4__4(this, n, bl4))), this.Ue0(4, 0, 1.0f, 0.375f, 0.075f), 0.4f).xi0(this.WW(16, f4, f6, f7, color)), this.fE0(-1, n52, n17, n18, n19, f2)).xi0(this.Ue0(4, 0, 0.375f, 1.0f, 0.075f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.075f));
        n52 = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n52, bl5);
        n52 = 1;
        boolean bl6 = true;
        float f72 = 0.75f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pw_117.y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(new lpt4__4(this, n52, bl6))).xi0(this.WW(16, f72, f9, f10, color2)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

