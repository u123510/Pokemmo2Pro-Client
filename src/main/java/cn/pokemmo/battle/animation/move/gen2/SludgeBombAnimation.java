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
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.ah0
 */
/**
 * 宝可梦对战技能招式动画 - 污泥炸弹 (SludgeBomb)
 * 技能编号: 188
 * 原始类: f.ah0_2
 */
public class SludgeBombAnimation
extends MU {
    public SludgeBombAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1727;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = A2.Kj0(pw_1.xC().Xf0().y80(this.E2(18, true)).p1(0.6f).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(354)), this.dA0(354, 2, 9, 11, 0.5f, 360.0f), 0.2f).xi0(this.Wt(1, 0.4f)).mz0().mz0().mz0().Xf0();
        n = 1452;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1480;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 320.0f, 480.0f));
        n = 354;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 354;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(31775);
        pw_1 pw_17 = HB.p30(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.064f, 0.19995117f, -0.19995117f)), this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f));
        f3 = 0.75f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31775);
        this.E8 = pw_17.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

