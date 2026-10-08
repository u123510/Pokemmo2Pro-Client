/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 高温重压 (HeatCrash)
 * 技能编号: 535
 * 原始类: f.mt0
 */
public class HeatCrashAnimation
extends MU {
    public HeatCrashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1427;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).y80(this.Qh0(699)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1507;
        n2 = 2;
        n3 = 16;
        f = 250.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1535;
        n2 = 0;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1416;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 1280.0f, 320.0f));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 699;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 699;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 699;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 699;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_110 = A2.Kj0(pw_19, this.fE0(-1, n, n2, n3, n4, f2), 0.2f).xi0(this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.5f, -0.5f));
        n = 699;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.375f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(31);
        pw_1 pw_111 = pk_1.el(pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1)), this.EN(16, 2, 8, 0.0f, 0.064f, 0.5f, 0.0f)).y80(this.E2(18, false)).xi0(this.nM(16, 0));
        f3 = 0.75f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        this.E8 = pw_111.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

