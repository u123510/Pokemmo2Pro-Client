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
 * 宝可梦对战技能招式动画 - 自爆 (SelfDestruct)
 * 技能编号: 120
 * 原始类: f.FA
 */
public class SelfDestructAnimation
extends MU {
    public SelfDestructAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1;
        byte n2 = 0;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 0;
        n2 = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 2;
        n2 = 1;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, n2 != 0);
        n = 1475;
        n2 = 2;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(2, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.025f)).y80(this.QO(14)).xi0(this.mf0(2, 0, 8, 0.016f)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 14;
        f = 500.0f;
        f2 = 0.7421875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.7421875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(285));
        n = 285;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 285;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 285;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(12);
        pw_1 pw_112 = A2.Kj0(pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(14, f3, f4, f5, color)), this.EN(14, 2, 12, 0.0f, 0.032f, 0.5f, 0.0f), 0.48f).xi0(this.EN(16, 2, 3, 0.0f, 0.032f, 0.5f, 0.0f));
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(12);
        int n5 = 1;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n5, bl);
        n5 = 0;
        bl = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n5, bl);
        n5 = 2;
        bl = false;
        this.E8 = HB.p30(pk_1.el(pw_112, this.WW(14, f3, f4, f5, color)), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n5, bl))).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

