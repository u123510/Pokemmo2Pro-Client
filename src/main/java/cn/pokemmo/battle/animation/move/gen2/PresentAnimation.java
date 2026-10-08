/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 礼物 (Present)
 * 技能编号: 217
 * 原始类: f.JQ
 */
public class PresentAnimation
extends MU {
    public PresentAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        int n = 1510;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.325f)).y80(this.Qh0(383)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1541;
        n2 = 2;
        n3 = 16;
        f = 500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = HB.p30(pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)), this.dA0(383, 3, 9, 11, 0.5f, 240.0f));
        n = 383;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 383;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1));
        n = 383;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.Xq0(16, 2, 1, 0.032f, 0.064f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 0)).xi0(this.tP(0.325f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        return this;
    }

    @Override
    public final MU us() {
        int n = 1510;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.325f)).y80(this.Qh0(384)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1471;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1452;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = HB.p30(pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)), this.dA0(384, 3, 9, 11, 0.5f, 240.0f));
        n = 384;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 384;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 384;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(992);
        pw_1 pw_17 = HB.p30(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(16, f3, f4, f5, color));
        f3 = 0.75f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(992);
        this.E8 = pw_17.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.325f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

