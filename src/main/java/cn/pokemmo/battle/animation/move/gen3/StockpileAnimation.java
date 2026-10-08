/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 蓄力 (Stockpile)
 * 技能编号: 254
 * 原始类: f.Vp0
 */
public class StockpileAnimation
extends MU {
    public StockpileAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        short s = 420;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f4 = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(0, 0.4f)).xi0(this.nM(16, 1)).mz0().Xf0().xi0(this.WW(14, f, f2, f3, color)).y80(this.Qh0(420)).xi0(this.fE0(-1, s, n, n2, n3, f4)).xi0(this.Xq0(14, 2, 2, 0.016f, 0.128f, 0.30004883f, -0.30004883f));
        s = 1470;
        n = 1;
        n2 = 14;
        float f5 = 0.0f;
        f4 = 0.234375f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1779;
        n = 2;
        n2 = 14;
        f5 = 0.0f;
        f4 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f5, f4, pF));
        s = 1779;
        n = 2;
        n2 = 14;
        f5 = 333.33334f;
        f4 = 0.9375f;
        pF = this.Vz0;
        float f6 = 1.0f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_14, this.i6((byte)2, s, n, n2, f5, f4, pF)).xi0(this.tP(0.3f)).xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.nM(16, 0)).y80(this.E2(18, false)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

