/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 暴风 (Hurricane)
 * 技能编号: 542
 * 原始类: f.Q70
 */
public class HurricaneAnimation
extends MU {
    public HurricaneAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, s, bl);
        s = 1920;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.QO(30)).y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 1.0f, 0.05f)).xi0(this.Wt(1, 0.4f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        int n3 = 1;
        n2 = 16;
        f = 4166.6665f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n3, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 2400.0f, 640.0f));
        s = 1497;
        int n4 = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n4, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 0.0f, 800.0f)).xi0(this.Sv0(2, 1, 1600.0f, 1600.0f));
        s = 0;
        boolean bl2 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, s, bl2);
        s = 1;
        boolean bl3 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, s, bl3);
        s = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, s, bl4);
        s = 1;
        boolean bl5 = true;
        this.E8 = HB.p30(HB.p30(pw_14.y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 1.0f, 0.0f, 0.05f)).xi0(this.mf0(4, 24, 0, 3.68f)).y80(this.E2(14, true)).y80(this.E2(16, true)).y80(this.Qh0(705)).xi0(this.nM(16, 1)).xi0(this.EN(16, 2, 13, 0.0f, 0.096f, 2.0f, 0.0f)), this.Xq0(16, 2, 6, 0.032f, 0.064f, -0.30004883f, 0.30004883f)), this.Ue0(4, 0, 0.0f, 1.0f, 0.05f)).y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, s, bl5))).mz0().Xf0().xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.05f)).xi0(this.nM(16, 0)).y80(this.E2(14, false)).y80(this.E2(16, false)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

