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
 * Renamed from f.kb
 */
/**
 * 宝可梦对战技能招式动画 - 求雨 (RainDance)
 * 技能编号: 240
 * 原始类: f.kb_1
 */
public class RainDanceAnimation
extends MU {
    public RainDanceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        RainDanceAnimation kb_12 = this;
        RainDanceAnimation kb_13 = this;
        short s = 1680;
        int n = 2;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.9921875f;
        PF pF = kb_13.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.1f)).xi0(kb_13.i6((byte)2, s, n, n2, f, f2, pF));
        RainDanceAnimation kb_14 = this;
        s = 1376;
        n = 2;
        n2 = 14;
        f = 2000.0f;
        f2 = 0.0f;
        pF = kb_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(kb_14.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 1280.0f, 640.0f)).y80(this.Qh0(407));
        s = 0;
        n = 0;
        n2 = 0;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_14, this.fE0(-1, 407, s, n, n2, f)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.075f)).p1(0.6f).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        kb_12.Vs.jH(this.E8);
        kb_12.Vc();
        return kb_12;
    }
}

