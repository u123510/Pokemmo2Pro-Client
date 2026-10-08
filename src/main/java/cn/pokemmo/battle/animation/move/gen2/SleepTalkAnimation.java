/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.lX
 */
/**
 * 宝可梦对战技能招式动画 - 梦话 (SleepTalk)
 * 技能编号: 214
 * 原始类: f.lx_1
 */
public class SleepTalkAnimation
extends MU {
    public SleepTalkAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        SleepTalkAnimation lx_12 = this;
        SleepTalkAnimation lx_13 = this;
        short s = 1478;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = lx_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(lx_13.i6((byte)2, s, n, n2, f, f2, pF));
        SleepTalkAnimation lx_14 = this;
        s = 1462;
        n = 2;
        n2 = 14;
        f = 166.66667f;
        f2 = 0.9375f;
        pF = lx_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(lx_14.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(380));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 380, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 11;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_15, this.fE0(-1, 380, s, n, n2, f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        lx_12.Vs.jH(this.E8);
        lx_12.Vc();
        return lx_12;
    }
}

