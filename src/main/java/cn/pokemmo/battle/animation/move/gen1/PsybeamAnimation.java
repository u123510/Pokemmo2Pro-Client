/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 幻象光线 (Psybeam)
 * 技能编号: 60
 * 原始类: f.Cy0
 */
public class PsybeamAnimation
extends MU {
    public PsybeamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1455;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1450;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 14;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(30735);
        pw_1 pw_14 = pk_1.el(A2.Kj0(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 1280.0f)).y80(this.Qh0(221)), this.dA0(221, 0, 9, 11, 0.5f, 0.0f), 0.4f).xi0(this.nM(16, 1)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f)), this.EN(16, 2, 6, 0.016f, 0.032f, 0.19995117f, 0.0f));
        f3 = 1.0f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(30735);
        this.E8 = pw_14.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

