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

/*
 * Renamed from f.bs
 */
/**
 * 宝可梦对战技能招式动画 - 抢先一步 (MeFirst)
 * 技能编号: 382
 * 原始类: f.bs_2
 */
public class MeFirstAnimation
extends MU {
    public MeFirstAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1474;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1504;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1509;
        n2 = 1;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(557));
        n = 557;
        n2 = 2;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 557;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = HB.p30(pw_15, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Wt(0, 0.4f));
        n = 1510;
        n2 = 2;
        n3 = 14;
        float f3 = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_17 = HB.p30(pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)), this.dA0(557, 1, 11, 9, 0.5f, 360.0f));
        n = 557;
        n2 = 3;
        n3 = 9;
        int n5 = 8;
        f2 = 0.5f;
        float f4 = 0.25f;
        float f5 = 0.0f;
        float f6 = 0.375f;
        Color color = px_1.ep0(15488);
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.WW(14, f4, f5, f6, color));
        short s = 1452;
        int n6 = 2;
        int n7 = 14;
        float f7 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f8 = 0.25f;
        float f9 = 0.375f;
        float f10 = 0.0f;
        Color color2 = px_1.ep0(15680);
        this.E8 = HB.p30(pw_18, this.i6((byte)2, s, n6, n7, f7, f2, pF)).xi0(this.WW(14, f8, f9, f10, color2)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

