/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.Ja
 */
/**
 * 宝可梦对战技能招式动画 - 回声 (EchoedVoice)
 * 技能编号: 497
 * 原始类: f.ja_0
 */
public class EchoedVoiceAnimation
extends MU {
    public EchoedVoiceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1467;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.625f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 640.0f));
        n = 1589;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Xq0(14, 2, 12, 0.0f, 0.032f, 0.100097656f, -0.100097656f)).y80(this.Qh0(208));
        n = 208;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 208;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2)).y80(this.Qh0(664));
        n = 664;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(A2.Kj0(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.8f).xi0(this.Wt(1, 0.25f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 2, 0.0f, 0.096f, 0.19995117f, -0.19995117f)).xi0(this.nM(16, 0)).xi0(this.Ue0(4, Short.MAX_VALUE, 0.625f, 0.0f, 0.075f)).xi0(this.tP(0.25f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

