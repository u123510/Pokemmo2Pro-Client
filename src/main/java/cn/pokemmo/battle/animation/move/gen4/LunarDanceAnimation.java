/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/*
 * Renamed from f.sh0
 */
/**
 * 宝可梦对战技能招式动画 - 新月舞 (LunarDance)
 * 技能编号: 461
 * 原始类: f.sh0_1
 */
public class LunarDanceAnimation
extends MU {
    public LunarDanceAnimation(PF pF) {
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
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.QO(37)).y80(ao_1.pc(lpt4__42)).xi0(this.Ue0(4, 0, 0.0f, 0.9375f, 0.025f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).mz0().Xf0().xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.025f)).xi0(this.mf0(4, 0, 2, 1.28f)).y80(this.Qh0(636)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        int n4 = 2;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n4, n3, f, f2, pF));
        n = 1358;
        int n5 = 2;
        n3 = 14;
        f = 500.0f;
        f2 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n5, n3, f, f2, pF));
        n = 636;
        int n6 = 0;
        n3 = 9;
        int n7 = 8;
        f2 = 0.0f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n6, n3, n7, f2));
        n = 636;
        int n8 = 1;
        n3 = 9;
        n7 = 8;
        f2 = 0.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n8, n3, n7, f2));
        n = 636;
        int n9 = 2;
        n3 = 9;
        n7 = 8;
        f2 = 0.07501221f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n9, n3, n7, f2));
        n = 636;
        int n10 = 3;
        n3 = 9;
        n7 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = HB.p30(HB.p30(pw_17, this.fE0(-1, n, n10, n3, n7, f2)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.025f));
        n = 0;
        boolean bl4 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl4);
        n = 1;
        boolean bl5 = true;
        this.E8 = pw_18.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl5))).mz0().Xf0().xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.025f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

