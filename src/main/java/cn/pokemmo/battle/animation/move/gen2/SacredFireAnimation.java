/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

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
 * 宝可梦对战技能招式动画 - 神圣之火 (SacredFire)
 * 技能编号: 221
 * 原始类: f.Ug0
 */
public class SacredFireAnimation
extends MU {
    public SacredFireAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1815;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)), this.Ue0(2, 0, 0.0f, 1.0f, 0.025f)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.025f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1434;
        n2 = 2;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1600.0f));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 1750.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1426;
        n2 = 2;
        n3 = 16;
        f = 1583.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.QO(22));
        n = 0;
        n2 = 0;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 1;
        n2 = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 2;
        n2 = 1;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, n2 != 0);
        n = 388;
        n2 = 3;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = A2.Kj0(pw_16.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.mf0(1, -1600, 0, 2.24f)).y80(this.Qh0(388)), this.fE0(-1, n, n2, n3, n4, f2), 0.2f);
        n = 388;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 388;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = N4.zr(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 0.8f);
        n = 388;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.8125f;
        Color color = px_1.ep0(31);
        pw_1 pw_110 = pk_1.el(pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).xi0(this.WW(16, f3, f4, f5, color)), this.EN(16, 2, 10, 0.016f, 0.032f, 0.5f, 0.0f)).xi0(this.Ue0(3, 0, 0.0f, 1.0f, 0.025f));
        f3 = 0.25f;
        f4 = 0.8125f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        int n5 = 0;
        boolean bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n5, bl);
        n5 = 1;
        bl = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n5, bl);
        n5 = 2;
        bl = false;
        this.E8 = HB.p30(pw_110, this.WW(16, f3, f4, f5, color)).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n5, bl))).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

