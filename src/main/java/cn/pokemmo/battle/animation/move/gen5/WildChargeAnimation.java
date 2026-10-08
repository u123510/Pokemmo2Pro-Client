/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Pw
 */
/**
 * 宝可梦对战技能招式动画 - 疯狂伏特 (WildCharge)
 * 技能编号: 528
 * 原始类: f.pw_0
 */
public class WildChargeAnimation
extends MU {
    public WildChargeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.5f;
        float f2 = 0.0f;
        float f3 = 0.875f;
        Color color = px_1.ep0(13014);
        int n = 1522;
        int n2 = 1;
        int n3 = 14;
        float f4 = 0.0f;
        float f5 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.Ue0(2, 13311, 0.0f, 0.5f, 0.05f)).xi0(this.WW(14, f, f2, f3, color)).y80(this.Qh0(375)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1431;
        n2 = 1;
        n3 = 14;
        f4 = 1250.0f;
        f5 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1431;
        n2 = 1;
        n3 = 14;
        f4 = 1750.0f;
        f5 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1401;
        n2 = 3;
        n3 = 14;
        f4 = 1166.6666f;
        f5 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1401;
        n2 = 3;
        n3 = 14;
        f4 = 1666.6666f;
        f5 = 0.46875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 375;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f5 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 375;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f5 = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.875f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(13014);
        pw_1 pw_18 = HB.p30(HB.p30(HB.p30(HB.p30(pk_1.el(A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f5), 0.6f).xi0(this.Ue0(2, 13311, 0.5f, 0.0f, 0.05f)), this.WW(14, f6, f7, f8, color2)), this.Ue0(2, 13311, 0.0f, 0.5f, 0.025f)), this.Ue0(2, 13311, 0.5f, 0.0f, 0.025f)), this.Ue0(2, 13311, 0.0f, 0.5f, 0.025f)), this.Ue0(2, 13311, 0.5f, 0.0f, 0.025f)).xi0(this.Wt(1, 0.4f)).TD0().p1(0.24f).Xf0();
        int n5 = 1514;
        int n6 = 2;
        int n7 = 16;
        float f9 = 0.0f;
        f5 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n5, n6, n7, f9, f5, pF));
        n5 = 375;
        n6 = 0;
        n7 = 11;
        int n8 = 8;
        f5 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n5, n6, n7, n8, f5));
        n5 = 375;
        n6 = 3;
        n7 = 11;
        n8 = 8;
        f5 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n5, n6, n7, n8, f5));
        n5 = 375;
        n6 = 4;
        n7 = 11;
        n8 = 8;
        f5 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n5, n6, n7, n8, f5));
        n5 = 375;
        n6 = 5;
        n7 = 11;
        n8 = 8;
        f5 = 0.5f;
        this.E8 = pk_1.el(pw_112, this.fE0(-1, n5, n6, n7, n8, f5)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

