/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Wx
 */
/**
 * 宝可梦对战技能招式动画 - 巨声 (HyperVoice)
 * 技能编号: 304
 * 原始类: f.wx_0
 */
public class HyperVoiceAnimation
extends MU {
    public HyperVoiceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        HyperVoiceAnimation wx_02 = this;
        HyperVoiceAnimation wx_03 = this;
        short s = 1865;
        int n = 2;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = wx_03.Vz0;
        pw_1 pw_13 = A2.Kj0(pw_1.xC().Xf0().xi0(this.Wt(0, 0.3f)).mz0().Xf0().xi0(this.Uv(true, 0.0f)).xi0(this.Uv(false, 266.66666f)).y80(this.Qh0(470)).xi0(this.Ue0(4, 990, 0.0f, 0.375f, 0.1f)), this.dA0(470, 1, 9, 11, 0.5f, 0.0f), 0.6f).xi0(this.Wt(1, 0.25f)).xi0(wx_03.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.EN(16, 2, 4, 0.032f, 0.032f, 0.5f, 0.0f));
        s = 0;
        n = 11;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pk_1.el(pw_13, this.fE0(-1, 470, s, n, n2, f)), this.Ue0(4, 990, 0.375f, 0.0f, 0.1f)).xi0(this.tP(0.3f)).mz0().Xf0().mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        wx_02.Vs.jH(this.E8);
        wx_02.Vc();
        return wx_02;
    }
}

