/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.i40_0;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 诅咒 (Curse)
 * 技能编号: 174
 * 原始类: f.DB
 */
public class CurseAnimation
extends MU {
    public CurseAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        PF pF = this.Vz0;
        if (pF != null) {
            if (pF.y3(i40_0.z2)) {
                this.IO();
            } else {
                int n = 1445;
                int n2 = 1;
                int n3 = 14;
                float f = 0.0f;
                float f2 = 0.8984375f;
                PF pF2 = this.Vz0;
                pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF2));
                n = 1376;
                n2 = 1;
                n3 = 14;
                f = 1666.6666f;
                f2 = 0.0f;
                pF2 = this.Vz0;
                pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF2));
                n = 1535;
                n2 = 2;
                n3 = 14;
                f = 0.0f;
                f2 = 0.859375f;
                pF2 = this.Vz0;
                pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF2));
                n = 1535;
                n2 = 2;
                n3 = 14;
                f = 333.33334f;
                f2 = 0.859375f;
                pF2 = this.Vz0;
                pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF2));
                n = 1535;
                n2 = 2;
                n3 = 14;
                f = 666.6667f;
                f2 = 0.859375f;
                pF2 = this.Vz0;
                pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF2));
                n = 1535;
                n2 = 2;
                n3 = 14;
                f = 1000.0f;
                f2 = 0.859375f;
                pF2 = this.Vz0;
                pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF2));
                n = 1535;
                n2 = 2;
                n3 = 14;
                f = 1333.3334f;
                f2 = 0.859375f;
                pF2 = this.Vz0;
                pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF2)).xi0(this.Sv0(1, 0, 0.0f, 1440.0f)).y80(this.Qh0(340));
                n = 340;
                n2 = 0;
                n3 = 9;
                int n4 = 8;
                f2 = 0.5f;
                float f3 = 0.75f;
                float f4 = 0.0f;
                float f5 = 0.625f;
                Color color = px_1.ep0(31);
                pw_1 pw_19 = pk_1.el(A2.Kj0(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 0.2f).xi0(this.WW(14, f3, f4, f5, color)), this.EN(14, 2, 2, 0.016f, 0.16f, 1.5f, 0.0f));
                f3 = 0.75f;
                f4 = 0.625f;
                f5 = 0.0f;
                color = px_1.ep0(31);
                this.E8 = pw_19.xi0(this.WW(14, f3, f4, f5, color)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
                this.E8.Ms(this.Vs.wP);
                this.Vs.jH(this.E8);
            }
        } else {
            this.IO();
        }
        this.Vc();
        return this;
    }

    public final void IO() {
        int n = 1436;
        int n2 = 2;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 1;
        n3 = 14;
        f = 83.333336f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 0.0f, 320.0f));
        n = 1436;
        n2 = 2;
        n3 = 14;
        f = 416.66666f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 1;
        n3 = 14;
        f = 500.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 0.0f, 320.0f));
        n = 1436;
        n2 = 2;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1441;
        n2 = 1;
        n3 = 14;
        f = 916.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 0.0f, 320.0f)).y80(this.Qh0(341));
        n = 341;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 341;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 341;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 341;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_110, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
    }
}

