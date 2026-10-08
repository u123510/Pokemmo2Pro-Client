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
 * 宝可梦对战技能招式动画 - 同命 (DestinyBond)
 * 技能编号: 194
 * 原始类: f.L2
 */
public class DestinyBondAnimation
extends MU {
    public DestinyBondAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1480;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0(), this.Ue0(4, 0, 0.0f, 1.0f, 0.075f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 640.0f, 640.0f)).y80(this.Qh0(360)), this.dA0(360, 0, 9, 11, 0.5f, 600.0f)).xi0(this.nM(16, 1));
        s = 1478;
        n = 0;
        n2 = 16;
        f = 0.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1728;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 16;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(31710);
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 960.0f, 320.0f)).xi0(this.Sv0(2, 0, 0.0f, 1280.0f)).xi0(this.WW(14, f3, f4, f5, color));
        f3 = 0.75f;
        f4 = 0.0f;
        f5 = 0.625f;
        color = px_1.ep0(31710);
        pw_1 pw_17 = HB.p30(pw_16, this.WW(16, f3, f4, f5, color));
        f3 = 0.75f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31710);
        pw_1 pw_18 = pw_17.xi0(this.WW(14, f3, f4, f5, color));
        f3 = 0.75f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(31710);
        this.E8 = pw_18.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 0)).xi0(this.Ue0(4, 0, 1.0f, 0.0f, 0.075f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

