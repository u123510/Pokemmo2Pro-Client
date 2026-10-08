/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Fl
 */
/**
 * 宝可梦对战技能招式动画 - 挺住 (Endure)
 * 技能编号: 203
 * 原始类: f.fl_0
 */
public class EndureAnimation
extends MU {
    public EndureAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1418;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1418;
        n2 = 1;
        n3 = 14;
        f = 200.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 366.66666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1418;
        n2 = 1;
        n3 = 14;
        f = 400.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 566.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1418;
        n2 = 1;
        n3 = 14;
        f = 600.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 766.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1418;
        n2 = 1;
        n3 = 14;
        f = 800.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 966.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1418;
        n2 = 1;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 320.0f, 1600.0f)).y80(this.Qh0(369));
        n = 369;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(31);
        pw_1 pw_114 = pk_1.el(pw_113.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 1)).TD0().p1(0.2f).Xf0().xi0(this.WW(14, f3, f4, f5, color)).xi0(this.EN(14, 2, 4, 0.016f, 0.016f, 0.19995117f, 0.0f)), this.Xq0(14, 2, 1, 0.016f, 0.16f, 0.100097656f, -0.100097656f));
        f3 = 1.0f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        this.E8 = pw_114.xi0(this.WW(14, f3, f4, f5, color)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

