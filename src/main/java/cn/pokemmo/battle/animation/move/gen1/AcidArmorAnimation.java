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
 * Renamed from f.xh
 */
/**
 * 宝可梦对战技能招式动画 - 溶化 (AcidArmor)
 * 技能编号: 151
 * 原始类: f.xh_2
 */
public class AcidArmorAnimation
extends MU {
    public AcidArmorAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1723;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9765625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1120.0f));
        n = 1480;
        n2 = 2;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 560.0f, 800.0f)).y80(this.Qh0(315));
        n = 315;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_15 = HB.p30(pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(14, 1)).y80(this.E2(14, true)).xi0(this.WW(14, f3, f4, f5, color)).y80(this.E2(14, true)), this.Xq0(14, 2, 1, 0.032f, 0.48f, 0.30004883f, -0.30004883f));
        short s = 1452;
        int n5 = 1;
        int n6 = 14;
        float f6 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f7 = 0.5f;
        float f8 = 1.0f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_15.xi0(this.i6((byte)2, s, n5, n6, f6, f2, pF)), this.WW(14, f7, f8, f9, color2)).y80(this.E2(14, false)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

