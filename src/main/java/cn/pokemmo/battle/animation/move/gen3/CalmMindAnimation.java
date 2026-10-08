/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 冥想 (CalmMind)
 * 技能编号: 347
 * 原始类: f.Y0
 */
public class CalmMindAnimation
extends MU {
    public CalmMindAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CalmMindAnimation y0 = this;
        int n = 0;
        boolean bl = false;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        CalmMindAnimation y02 = this;
        n = 1509;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = y02.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).y80(ao_1.pc(lpt4__42)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(y02.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        CalmMindAnimation y03 = this;
        n = 1434;
        int n4 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = y03.Vz0;
        pw_1 pw_14 = pw_13.xi0(y03.i6((byte)2, (short)n, n4, n3, f, f2, pF)).y80(this.Qh0(520));
        n = 0;
        int n5 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 520, n, n5, n3, f));
        n = 1;
        int n6 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 520, n, n6, n3, f));
        n = 2;
        int n7 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = HB.p30(pw_16, this.fE0(-1, 520, n, n7, n3, f)).xi0(this.tP(0.4f));
        n = 0;
        boolean bl2 = true;
        this.E8 = pw_12 = Zw0.H(pw_17.y80(ao_1.pc(new lpt4__4(this, n, bl2))), this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f));
        pw_12.Ms(this.Vs.wP);
        y0.Vs.jH(this.E8);
        y0.Vc();
        return y0;
    }
}

