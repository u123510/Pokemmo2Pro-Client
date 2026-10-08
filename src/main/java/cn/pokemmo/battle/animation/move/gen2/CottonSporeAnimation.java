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

/*
 * Renamed from f.ns
 */
/**
 * 宝可梦对战技能招式动画 - 棉孢子 (CottonSpore)
 * 技能编号: 178
 * 原始类: f.ns_2
 */
public class CottonSporeAnimation
extends MU {
    public CottonSporeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 345;
        int n2 = 0;
        int n3 = 11;
        int n4 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(345)).xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 345;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f = 0.5f;
        float f2 = 0.5f;
        float f3 = 0.0f;
        float f4 = 0.8125f;
        Color color = px_1.ep0(31710);
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f)).xi0(this.WW(16, f2, f3, f4, color));
        short s = 1718;
        int n5 = 1;
        int n6 = 16;
        float f5 = 0.0f;
        f = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n5, n6, f5, f, pF));
        s = 1438;
        n5 = 2;
        n6 = 16;
        f5 = 0.0f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n5, n6, f5, f, pF));
        s = 1463;
        n5 = 2;
        n6 = 16;
        f5 = 500.0f;
        f = 0.9375f;
        pF = this.Vz0;
        float f6 = 0.5f;
        float f7 = 0.8125f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(31710);
        this.E8 = HB.p30(HB.p30(pw_15.xi0(this.i6((byte)2, s, n5, n6, f5, f, pF)).xi0(this.Sv0(2, 1, 1280.0f, 320.0f)), this.Sv0(2, 0, 320.0f, 1760.0f)).xi0(this.WW(16, f6, f7, f8, color2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.050048828f, -0.050048828f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

