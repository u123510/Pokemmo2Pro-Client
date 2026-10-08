/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.qL
 */
/**
 * 宝可梦对战技能招式动画 - 治愈波动 (HealPulse)
 * 技能编号: 505
 * 原始类: f.ql_1
 */
public class HealPulseAnimation
extends MU {
    public HealPulseAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1589;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(2, 0, 0.0f, 0.375f, 0.075f)).y80(this.Qh0(671)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1504;
        n = 2;
        n2 = 14;
        f = 250.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.3125f;
        Color color = px_1.ep0(16927);
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(16, 1)).xi0(this.Wt(0, 0.4f)).xi0(this.Xq0(16, 2, 6, 0.016f, 0.016f, 0.020019531f, -0.020019531f)).xi0(this.WW(14, f3, f4, f5, color));
        int n3 = 671;
        int n4 = 0;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n3, n4, n5, n6, f2));
        n3 = 671;
        n4 = 1;
        n5 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, n3, n4, n5, n6, f2), 0.3f);
        n3 = 671;
        n4 = 0;
        n5 = 9;
        n6 = 8;
        f2 = 0.5f;
        float f6 = 0.75f;
        float f7 = 0.3125f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(16927);
        this.E8 = pk_1.el(pw_15, this.fE0(-1, n3, n4, n5, n6, f2)).xi0(this.WW(14, f6, f7, f8, color2)).xi0(this.Ue0(2, 0, 0.375f, 0.0f, 0.075f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

