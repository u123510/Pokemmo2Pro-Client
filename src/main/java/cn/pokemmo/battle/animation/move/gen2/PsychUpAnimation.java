/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;

/*
 * Renamed from f.Jo
 */
/**
 * 宝可梦对战技能招式动画 - 自我暗示 (PsychUp)
 * 技能编号: 244
 * 原始类: f.jo_0
 */
public class PsychUpAnimation
extends MU {
    public PsychUpAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        PsychUpAnimation jo_02 = this;
        PsychUpAnimation jo_03 = this;
        short s = 1455;
        int n = 2;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = jo_03.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(4, 0, 0.0f, 0.75f, 0.075f)).y80(this.Qh0(411)).xi0(jo_03.i6((byte)2, s, n, n2, f, f2, pF));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = Zw0.H(HB.p30(pw_13, this.fE0(-1, 411, s, n, n2, f)).xi0(this.tP(0.4f)).mz0().Xf0(), this.Ue0(4, 0, 0.75f, 0.0f, 0.075f));
        pw_12.Ms(this.Vs.wP);
        jo_02.Vs.jH(this.E8);
        jo_02.Vc();
        return jo_02;
    }
}

