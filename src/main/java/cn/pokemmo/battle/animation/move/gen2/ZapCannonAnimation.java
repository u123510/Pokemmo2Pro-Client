/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.FB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.fL
 */
/**
 * 宝可梦对战技能招式动画 - 电磁炮 (ZapCannon)
 * 技能编号: 192
 * 原始类: f.fl_1
 */
public class ZapCannonAnimation
extends MU {
    public ZapCannonAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1458;
        int bl = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.Qh0(358)).xi0(this.Ue0(2, 0, 0.0f, 0.8125f, 0.075f)).xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF));
        n = 1425;
        int n3 = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF));
        n = 1376;
        int n4 = 2;
        n2 = 14;
        f = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 320.0f)).xi0(this.dA0(358, 0, 9, 11, 0.5f, 360.0f)).xi0(this.Wt(1, 0.4f));
        n = 358;
        int n5 = 1;
        n2 = 11;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n5, n2, n6, f2));
        n = 358;
        int n7 = 2;
        n2 = 11;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n7, n2, n6, f2)).xi0(this.nM(16, 1)).TD0().p1(0.4f).Xf0().y80(this.QO(19)).xi0(this.mf0(2, 0, 8, 0.016f));
        n = 2;
        boolean bl2 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 0;
        boolean bl4 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 1475;
        int n8 = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9765625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, (short)n, n8, n2, f3, f2, pF));
        n = 1458;
        int n9 = 1;
        n2 = 16;
        f3 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pk_1.el(pw_17.xi0(this.i6((byte)2, (short)n, n9, n2, f3, f2, pF)), this.Xq0(16, 2, 7, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.075f));
        n = 1;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 0;
        boolean bl6 = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl6);
        n = 2;
        boolean bl7 = false;
        this.E8 = pw_18.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl7))).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

