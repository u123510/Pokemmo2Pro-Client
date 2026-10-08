/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.cx
 */
/**
 * 宝可梦对战技能招式动画 - 蘑菇孢子 (Spore)
 * 技能编号: 147
 * 原始类: f.cx_2
 */
public class SporeAnimation
extends MU {
    public SporeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 312;
        int n2 = 0;
        int n3 = 11;
        int n4 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(312)).xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 312;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f = 0.5f;
        float f2 = 0.5f;
        float f3 = 0.0f;
        float f4 = 0.8125f;
        Color color = px_1.ep0(990);
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f)).xi0(this.WW(16, f2, f3, f4, color));
        short s = 1718;
        int n5 = 1;
        int n6 = 16;
        float f5 = 0.0f;
        f = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n5, n6, f5, f, pF));
        s = 1718;
        n5 = 2;
        n6 = 16;
        f5 = 500.0f;
        f = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n5, n6, f5, f, pF));
        s = 1463;
        n5 = 1;
        n6 = 16;
        f5 = 833.3333f;
        f = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n5, n6, f5, f, pF));
        s = 1376;
        n5 = 1;
        n6 = 16;
        f5 = 3000.0f;
        f = 0.0f;
        pF = this.Vz0;
        float f6 = 0.5f;
        float f7 = 0.8125f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(990);
        pw_1 pw_17 = HB.p30(HB.p30(pw_16.xi0(this.i6((byte)2, s, n5, n6, f5, f, pF)).xi0(this.Sv0(1, 0, 800.0f, 2080.0f)), this.Sv0(1, 1, 2080.0f, 800.0f)), this.WW(16, f6, f7, f8, color2));
        f6 = 0.5f;
        f7 = 0.0f;
        f8 = 0.8125f;
        color2 = px_1.ep0(990);
        pw_1 pw_18 = HB.p30(pw_17, this.WW(16, f6, f7, f8, color2));
        f6 = 0.5f;
        f7 = 0.8125f;
        f8 = 0.0f;
        color2 = px_1.ep0(990);
        pw_1 pw_19 = HB.p30(pw_18, this.WW(16, f6, f7, f8, color2));
        f6 = 0.5f;
        f7 = 0.0f;
        f8 = 0.8125f;
        color2 = px_1.ep0(990);
        pw_1 pw_110 = HB.p30(pw_19, this.WW(16, f6, f7, f8, color2));
        f6 = 0.5f;
        f7 = 0.8125f;
        f8 = 0.0f;
        color2 = px_1.ep0(990);
        this.E8 = HB.p30(HB.p30(pw_110, this.WW(16, f6, f7, f8, color2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 4, 0.016f, 0.032f, 0.050048828f, -0.050048828f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

