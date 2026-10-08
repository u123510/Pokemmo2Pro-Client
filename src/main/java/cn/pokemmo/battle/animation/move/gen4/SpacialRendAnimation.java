/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/*
 * Renamed from f.ia
 */
/**
 * 宝可梦对战技能招式动画 - 亚空裂斩 (SpacialRend)
 * 技能编号: 460
 * 原始类: f.ia_2
 */
public class SpacialRendAnimation
extends MU {
    public SpacialRendAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1407;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1280.0f)).xi0(this.Sv0(1, 1, 960.0f, 320.0f));
        s = 1907;
        n = 2;
        n2 = 14;
        f = 833.3333f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(635));
        s = 635;
        n = 4;
        n2 = 9;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 635;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2)).y80(this.QO(36));
        s = 635;
        n = 0;
        n2 = 9;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = HB.p30(pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2)), this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).xi0(this.Wt(1, 0.3f)).mz0().Xf0();
        s = 0;
        n = 0;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, n != 0);
        s = 1;
        n = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, n != 0);
        s = 2;
        n = 1;
        lpt4__4 lpt4__44 = new lpt4__4(this, s, n != 0);
        s = 1407;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.y80(ao_1.pc(lpt4__42)).y80(ao_1.pc(lpt4__43)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.025f)).y80(ao_1.pc(lpt4__44)).xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1376;
        n = 1;
        n2 = 16;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1280.0f)).xi0(this.Sv0(1, 1, 960.0f, 320.0f));
        s = 1941;
        n = 2;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.nM(16, 1));
        s = 635;
        n = 1;
        n2 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 635;
        n = 3;
        n2 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, s, n, n2, n4, f2));
        s = 635;
        n = 5;
        n2 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = HB.p30(HB.p30(pw_112.xi0(this.fE0(-1, s, n, n2, n4, f2)), this.Xq0(16, 2, 6, 0.016f, 0.032f, 0.19995117f, -0.19995117f)), this.Ue0(3, 0, 0.0f, 0.8125f, 0.05f));
        s = 0;
        n = 1;
        lpt4__4 lpt4__45 = new lpt4__4(this, s, n != 0);
        s = 1;
        n = 1;
        lpt4__4 lpt4__46 = new lpt4__4(this, s, n != 0);
        s = 1376;
        n = 2;
        n2 = 16;
        float f4 = 0.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        this.E8 = Zw0.H(pw_113.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.05f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)), this.i6((byte)2, s, n, n2, f4, f2, pF));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

