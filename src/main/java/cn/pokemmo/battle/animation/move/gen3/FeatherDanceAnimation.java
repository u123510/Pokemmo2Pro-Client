/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.xw
 */
/**
 * 宝可梦对战技能招式动画 - 羽毛舞 (FeatherDance)
 * 技能编号: 297
 * 原始类: f.xw_2
 */
public class FeatherDanceAnimation
extends MU {
    public FeatherDanceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1478;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1478;
        n2 = 2;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1478;
        n2 = 1;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = HB.p30(pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)), this.Xq0(14, 2, 3, 0.0f, 0.32f, -0.39990234f, 0.39990234f)).xi0(this.Wt(1, 0.4f)).mz0().Xf0();
        n = 1438;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1845;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.703125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 640.0f));
        n = 1438;
        n2 = 1;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1845;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 720.0f, 640.0f));
        n = 1845;
        n2 = 2;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.0390625f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 1280.0f, 640.0f)).y80(this.Qh0(463));
        n = 463;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(0);
        pw_1 pw_110 = HB.p30(pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(16, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(0);
        pw_1 pw_111 = HB.p30(pw_110, this.WW(16, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(0);
        pw_1 pw_112 = HB.p30(pw_111, this.WW(16, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(0);
        pw_1 pw_113 = HB.p30(pw_112, this.WW(16, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(0);
        pw_1 pw_114 = HB.p30(pw_113, this.WW(16, f3, f4, f5, color));
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(0);
        this.E8 = HB.p30(pw_114, this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

