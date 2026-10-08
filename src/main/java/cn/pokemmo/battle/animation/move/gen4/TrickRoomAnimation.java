/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Tk
 */
/**
 * 宝可梦对战技能招式动画 - 戏法空间 (TrickRoom)
 * 技能编号: 433
 * 原始类: f.tk_0
 */
public class TrickRoomAnimation
extends MU {
    public TrickRoomAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 1;
        bl = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl);
        n = 0;
        bl = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl);
        n = 1505;
        bl = true;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pk_1.el(A2.Kj0(HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.nM(14, 1)).xi0(this.nM(16, 1)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f)).y80(this.QO(31)).y80(ao_1.pc(lpt4__42)).mz0().Xf0().xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.05f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)), this.i6((byte)2, (short)n, bl ? 1 : 0, n2, f, f2, pF), 1.0f), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f)).xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.05f));
        n = 1;
        bl = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl);
        n = 0;
        bl = true;
        lpt4__4 lpt4__46 = new lpt4__4(this, n, bl);
        n = 2;
        bl = false;
        this.E8 = pw_12.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(lpt4__46)).y80(ao_1.pc(new lpt4__4(this, n, bl))).xi0(this.nM(14, 0)).p1(0.6f).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

