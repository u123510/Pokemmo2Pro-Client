/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 击落 (SmackDown)
 * 技能编号: 479
 * 原始类: f.W80
 */
public class SmackDownAnimation
extends MU {
    public SmackDownAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1459;
        int bl = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.Wt(1, 0.6f)).y80(this.Qh0(650)).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 650;
        int n3 = 2;
        n2 = 9;
        int n4 = 11;
        f2 = 0.5f;
        pw_1 pw_13 = A2.Kj0(pw_12, this.fE0(-1, n, n3, n2, n4, f2), 0.2f);
        n = 1420;
        int n5 = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n2, f3, f2, pF));
        n = 1518;
        int n6 = 1;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n6, n2, f3, f2, pF)).y80(this.QO(10));
        n = 2;
        boolean bl2 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 650;
        int n7 = 3;
        n2 = 11;
        int n8 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.y80(ao_1.pc(lpt4__42)).xi0(this.fE0(-1, n, n7, n2, n8, f2));
        n = 650;
        int n9 = 4;
        n2 = 11;
        n8 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n9, n2, n8, f2)).xi0(this.nM(16, 1));
        n = 1895;
        int n10 = 2;
        n2 = 16;
        float f4 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n10, n2, f4, f2, pF));
        n = 1420;
        int n11 = 1;
        n2 = 16;
        f4 = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = N4.zr(pw_18.xi0(this.i6((byte)2, (short)n, n11, n2, f4, f2, pF)).xi0(this.Xq0(16, 2, 1, 0.0f, 0.096f, 0.100097656f, -0.100097656f)), this.Ue0(4, 0, 0.0f, 1.0f, 0.025f), 0.24f).y80(this.E2(16, true));
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 1;
        boolean bl4 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 650;
        int n12 = 0;
        n2 = 11;
        int n13 = 8;
        f2 = 0.125f;
        pw_1 pw_110 = A2.Kj0(pw_19.y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).mz0().mz0().mz0().Xf0().xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.025f)), this.mf0(4, 0, 30, 0.48f), 0.4f).xi0(this.Xq0(16, 2, 1, 0.0f, 0.096f, 0.8000488f, -0.8000488f)).xi0(this.Ue0(3, 0, 0.0f, 1.0f, 0.025f)).xi0(this.fE0(-1, n, n12, n2, n13, f2));
        n = 650;
        int n14 = 1;
        n2 = 11;
        n13 = 8;
        f2 = 0.0f;
        pw_1 pw_111 = N4.zr(pw_110, this.fE0(-1, n, n14, n2, n13, f2), 0.44f);
        n = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 1;
        boolean bl6 = true;
        this.E8 = pw_111.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl6))).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.025f)).y80(this.E2(16, false)).mz0().mz0().TD0().p1(0.64f).Xf0().xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

