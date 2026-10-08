/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [3464]
 * 原始类: f.IG
 */
public class CustomMove3464Animation
extends MU {
    public CustomMove3464Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, bl);
        s = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, bl2);
        s = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, s, bl3);
        s = 1536;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.QO(39)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.8125f, 0.05f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.mf0(4, 0, -1, 3.84f)).xi0(this.Wt(4, 0.4f)).y80(this.wn0("3464")).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1535;
        int n3 = 2;
        n2 = 16;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n3, n2, f, f2, pF));
        s = 1630;
        int n4 = 1;
        n2 = 16;
        f = 1666.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n4, n2, f, f2, pF)).mz0().p1(1.4f).Xf0();
        s = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, s, bl4);
        s = 1;
        boolean bl5 = true;
        this.E8 = pw_14.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, s, bl5))).mz0().Xf0().xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.05f)).xi0(this.df0(16, 4)).mz0().xi0(this.tP(0.4f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

