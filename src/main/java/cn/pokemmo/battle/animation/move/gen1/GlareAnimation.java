/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.g9
 */
/**
 * 宝可梦对战技能招式动画 - 大蛇瞪眼 (Glare)
 * 技能编号: 137
 * 原始类: f.g9_0
 */
public class GlareAnimation
extends MU {
    public GlareAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        GlareAnimation g9_02 = this;
        GlareAnimation g9_03 = this;
        short s = 1474;
        int n = 1;
        int n2 = 14;
        float f = 250.0f;
        float f2 = 0.8984375f;
        PF pF = g9_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(g9_03.i6((byte)2, s, n, n2, f, f2, pF));
        GlareAnimation g9_04 = this;
        s = 1509;
        n = 2;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.78125f;
        pF = g9_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(g9_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 240.0f, 800.0f)).xi0(this.nM(14, 1)).y80(this.Qh0(302));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_14, this.fE0(-1, 302, s, n, n2, f), 0.24f), this.Xq0(14, 2, 1, 0.016f, 0.224f, 0.0f, 0.30004883f)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        g9_02.Vs.jH(this.E8);
        g9_02.Vc();
        return g9_02;
    }
}

