/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Ig0
 */
/**
 * 宝可梦对战技能招式动画 - 蓄能焰袭 (FlameCharge)
 * 技能编号: 488
 * 原始类: f.ig0_0
 */
public class FlameChargeAnimation
extends MU {
    public FlameChargeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1535;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1805;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1535;
        n2 = 1;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1805;
        n2 = 2;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1805;
        n2 = 1;
        n3 = 14;
        f = 1666.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1466;
        n2 = 2;
        n3 = 14;
        f = 2166.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(658));
        n = 658;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 658;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 658;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.25f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(31);
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(14, f3, f4, f5, color)).TD0().p1(2.4f).Xf0().mz0().mz0().mz0().Xf0().xi0(this.Wt(1, 0.4f)).TD0().p1(0.4f).Xf0();
        int n5 = 1424;
        int n6 = 1;
        int n7 = 16;
        float f6 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1507;
        n6 = 2;
        n7 = 16;
        f6 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF)).xi0(this.nM(16, 1));
        n5 = 658;
        n6 = 4;
        n7 = 11;
        int n8 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n5, n6, n7, n8, f2));
        n5 = 658;
        n6 = 3;
        n7 = 11;
        n8 = 8;
        f2 = 0.5f;
        float f7 = 0.75f;
        float f8 = 0.5f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(31);
        this.E8 = pk_1.el(pw_113.xi0(this.fE0(-1, n5, n6, n7, n8, f2)), this.Xq0(16, 2, 3, 0.0f, 0.048f, 0.30004883f, -0.30004883f)).xi0(this.WW(14, f7, f8, f9, color2)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

