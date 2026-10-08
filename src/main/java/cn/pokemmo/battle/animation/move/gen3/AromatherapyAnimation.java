/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.t2
 */
/**
 * 宝可梦对战技能招式动画 - 芳香治疗 (Aromatherapy)
 * 技能编号: 312
 * 原始类: f.t2_0
 */
public class AromatherapyAnimation
extends MU {
    public AromatherapyAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 483;
        int n = 2;
        int n2 = 0;
        int n3 = 0;
        float f = 0.0f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.nM(14, 1)).y80(this.Qh0(483)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 483;
        n = 0;
        n2 = 0;
        n3 = 0;
        f = 0.0f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 1869;
        n = 1;
        n2 = 16;
        float f2 = 0.0f;
        f = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.Sv0(1, 1, 1040.0f, 288.0f));
        s = 1376;
        n = 1;
        n2 = 16;
        f2 = 1383.3334f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1869;
        n = 2;
        n2 = 14;
        f2 = 83.333336f;
        f = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.Sv0(2, 1, 1040.0f, 288.0f));
        s = 1376;
        n = 2;
        n2 = 14;
        f2 = 1383.3334f;
        f = 0.0f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(23254);
        pw_1 pw_17 = A2.Kj0(pw_16.xi0(this.i6((byte)2, s, n, n2, f2, f, pF)), this.Ue0(4, 8896, 0.0f, 0.75f, 0.05f), 0.2f).y80(this.E2(18, true)).mz0().mz0().TD0().p1(1.6f).Xf0().xi0(this.Wt(0, 0.6f)).xi0(this.WW(14, f3, f4, f5, color));
        short s2 = 483;
        int n4 = 3;
        int n5 = 9;
        int n6 = 8;
        f = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s2, n4, n5, n6, f));
        s2 = 483;
        n4 = 1;
        n5 = 9;
        n6 = 8;
        f = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, s2, n4, n5, n6, f));
        s2 = 1786;
        n4 = 2;
        n5 = 14;
        float f6 = 83.333336f;
        f = 0.9921875f;
        pF = this.Vz0;
        float f7 = 0.5f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(23254);
        this.E8 = pk_1.el(N4.zr(pw_19, this.i6((byte)2, s2, n4, n5, f6, f, pF), 2.4f).xi0(this.Ue0(4, 8896, 0.75f, 0.0f, 0.05f)), this.WW(14, f7, f8, f9, color2)).y80(this.E2(18, false)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

