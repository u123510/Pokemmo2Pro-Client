/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/*
 * Renamed from f.dK0
 */
/**
 * 宝可梦对战技能招式动画 - 高速移动 (Agility)
 * 技能编号: 97
 * 原始类: f.dk0_0
 */
public class AgilityAnimation
extends MU {
    public AgilityAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1421;
        int bl = 1;
        int n2 = 14;
        float f = 333.33334f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1421;
        int n3 = 2;
        n2 = 14;
        f = 416.66666f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF));
        n = 1421;
        int n4 = 1;
        n2 = 14;
        f = 500.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF));
        n = 1421;
        int n5 = 2;
        n2 = 14;
        f = 583.3333f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF));
        n = 1421;
        int n6 = 1;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n6, n2, f, f2, pF));
        n = 1421;
        int n7 = 1;
        n2 = 14;
        f = 916.6667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n7, n2, f, f2, pF));
        n = 1421;
        int n8 = 1;
        n2 = 14;
        f = 1250.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n8, n2, f, f2, pF));
        n = 1445;
        int n9 = 2;
        n2 = 14;
        f = 750.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n9, n2, f, f2, pF));
        n = 1376;
        int n10 = 2;
        n2 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_110 = A2.Kj0(pw_19.xi0(this.i6((byte)2, (short)n, n10, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 960.0f, 480.0f)).y80(this.QO(29)), this.Ue0(2, 0, 0.0f, 1.0f, 0.025f), 0.32f).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.025f));
        n = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 2;
        boolean bl4 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 1;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 2;
        boolean bl7 = false;
        this.E8 = N4.zr(pw_110.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.mf0(4, 60, 0, 1.28f)).mz0().mz0().TD0().p1(0.44f).Xf0().mz0().mz0().TD0().p1(1.24f).Xf0(), this.Ue0(3, 0, 0.0f, 1.0f, 0.05f), 1.56f).xi0(this.Ue0(2, 0, 1.0f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl7))).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

