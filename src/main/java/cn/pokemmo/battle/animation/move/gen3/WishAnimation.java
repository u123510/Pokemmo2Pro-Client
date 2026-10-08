/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 祈愿 (Wish)
 * 技能编号: 273
 * 原始类: f.Y70
 */
public class WishAnimation
extends MU {
    public WishAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl2);
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl3);
        n = 1471;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.QO(25)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.8125f, 0.05f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).mz0().Xf0().xi0(this.mf0(1, 0, 32, 0.96f)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.05f)).y80(this.E2(14, true)).y80(this.E2(16, true)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1473;
        int n4 = 2;
        n3 = 14;
        f = 750.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF)).y80(this.Qh0(438));
        n = 438;
        int n5 = 2;
        n3 = 0;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n5, n3, n6, f2));
        n = 438;
        int n7 = 3;
        n3 = 0;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n7, n3, n6, f2)).TD0().p1(0.4f).Xf0().p1(0.6f).mz0().mz0().TD0().p1(0.8f).Xf0();
        n = 438;
        int n8 = 0;
        n3 = 9;
        n6 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = pk_1.el(pw_15.xi0(this.fE0(-1, n, n8, n3, n6, f2)), this.Ue0(3, 0, 0.0f, 0.8125f, 0.075f)).y80(this.E2(14, false)).y80(this.E2(16, false));
        n = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = true;
        this.E8 = pw_16.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.025f)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

