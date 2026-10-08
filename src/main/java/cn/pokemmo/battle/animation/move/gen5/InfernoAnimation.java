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
 * Renamed from f.Rk
 */
/**
 * 宝可梦对战技能招式动画 - 炼狱 (Inferno)
 * 技能编号: 517
 * 原始类: f.rk_0
 */
public class InfernoAnimation
extends MU {
    public InfernoAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        int n2 = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 0;
        n2 = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 1;
        n2 = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, n2 != 0);
        n = 682;
        n2 = 0;
        int n3 = 11;
        int n4 = 8;
        float f = 0.0f;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.QO(38)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Wt(1, 0.4f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.05f)).xi0(this.mf0(4, 0, 24, 2.88f)).y80(this.E2(18, true)).y80(this.Qh0(682)).xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 1536;
        n2 = 1;
        n3 = 16;
        float f2 = 0.0f;
        f = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1536;
        n2 = 2;
        n3 = 16;
        f2 = 416.66666f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1536;
        n2 = 1;
        n3 = 16;
        f2 = 833.3333f;
        f = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1536;
        n2 = 2;
        n3 = 16;
        f2 = 1250.0f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1536;
        n2 = 1;
        n3 = 16;
        f2 = 1666.6666f;
        f = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1718;
        n2 = 2;
        n3 = 16;
        f2 = 2083.3333f;
        f = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 6, 0.032f, 0.064f, -0.30004883f, 0.30004883f));
        n = 682;
        n2 = 0;
        n3 = 11;
        int n5 = 8;
        f = 0.0f;
        pw_1 pw_19 = A2.Kj0(pw_18, this.fE0(-1, n, n2, n3, n5, f), 0.32f);
        n = 682;
        n2 = 0;
        n3 = 11;
        n5 = 8;
        f = 0.0f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(31);
        pw_1 pw_110 = N4.zr(pw_19.xi0(this.fE0(-1, n, n2, n3, n5, f)), this.WW(16, f3, f4, f5, color), 0.64f);
        int n6 = 682;
        int n7 = 0;
        int n8 = 11;
        int n9 = 8;
        f = 0.0f;
        float f6 = 0.5f;
        float f7 = 0.625f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(31);
        pw_1 pw_111 = N4.zr(pw_110.xi0(this.fE0(-1, n6, n7, n8, n9, f)), this.WW(16, f6, f7, f8, color2), 0.96f);
        f6 = 0.5f;
        f7 = 0.0f;
        f8 = 0.625f;
        color2 = px_1.ep0(28);
        int n10 = 682;
        boolean bl = false;
        int n11 = 11;
        int n12 = 8;
        f = 0.0f;
        pw_1 pw_112 = pk_1.el(pw_111.xi0(this.WW(16, f6, f7, f8, color2)), this.fE0(-1, n10, bl ? 1 : 0, n11, n12, f));
        n10 = 682;
        bl = true;
        n11 = 11;
        n12 = 8;
        f = 0.5f;
        pw_1 pw_113 = HB.p30(pw_112.xi0(this.fE0(-1, n10, bl ? 1 : 0, n11, n12, f)), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f));
        n10 = 0;
        bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n10, bl);
        n10 = 1;
        bl = true;
        float f9 = 0.5f;
        float f10 = 0.625f;
        float f11 = 0.0f;
        Color color3 = px_1.ep0(31);
        this.E8 = pw_113.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n10, bl))).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.05f)).xi0(this.WW(16, f9, f10, f11, color3)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

