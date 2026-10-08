/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 雷电拳 (ThunderPunch)
 * 技能编号: 9
 * 原始类: f.Ln0
 */
public class ThunderPunchAnimation
extends MU {
    public ThunderPunchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1424;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)), this.Ue0(4, 0, 0.0f, 0.75f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1522;
        n2 = 2;
        n3 = 16;
        f = 83.333336f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(169));
        n = 169;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 169;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n, n2, n3, n4, f2), 0.2f);
        n = 169;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(660);
        pw_1 pw_16 = pk_1.el(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).xi0(this.WW(16, f3, f4, f5, color)), this.EN(16, 2, 4, 0.0f, 0.032f, 0.5f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0();
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(660);
        this.E8 = Zw0.H(pw_16.xi0(this.WW(16, f3, f4, f5, color)), this.Ue0(4, 0, 0.75f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

