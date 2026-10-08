/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 月光 (Moonlight)
 * 技能编号: 236
 * 原始类: f.VD
 */
public class MoonlightAnimation
extends MU {
    public MoonlightAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 1;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl2);
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl3);
        n = 1471;
        int n2 = 1;
        int n3 = 14;
        float f = 333.33334f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f)).y80(this.QO(23)).xi0(this.mf0(4, 0, 1, 1.92f)).xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.05f)).y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1471;
        int n4 = 2;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF)).xi0(this.nM(14, 1)).y80(this.Qh0(403));
        n = 403;
        int n5 = 0;
        n3 = 9;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = HB.p30(HB.p30(pw_13, this.fE0(-1, n, n5, n3, n6, f2)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f)).xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.05f));
        n = 1;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl5);
        n = 2;
        boolean bl6 = false;
        this.E8 = pw_14.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl6))).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

