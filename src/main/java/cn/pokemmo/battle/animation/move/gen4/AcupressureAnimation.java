/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 穴位点穴 (Acupressure)
 * 技能编号: 367
 * 原始类: f.JE
 */
public class AcupressureAnimation
extends MU {
    public AcupressureAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1505;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.703125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1721;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1867;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 720.0f, 432.0f)).xi0(this.Sv0(1, 0, 320.0f, 320.0f)).y80(this.Qh0(541));
        n = 541;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 541;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 541;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 541;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(990);
        pw_1 pw_18 = HB.p30(pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(16, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(990);
        this.E8 = pw_18.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

