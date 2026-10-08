/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 吸血 (LeechLife)
 * 技能编号: 141
 * 原始类: f.Av0
 */
public class LeechLifeAnimation
extends MU {
    public LeechLifeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1466;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(306)).xi0(this.dA0(306, 3, 9, 11, 0.5f, 240.0f));
        n = 306;
        n2 = 1;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = N4.zr(A2.Kj0(pw_13, this.fE0(-1, n, n2, n3, n4, f2), 0.2f), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f), 0.4f).xi0(this.Wt(0, 0.8f));
        n = 1504;
        n2 = 2;
        n3 = 16;
        float f3 = 166.66667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1480;
        n2 = 1;
        n3 = 16;
        f3 = 333.33334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f3 = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.Sv0(1, 0, 320.0f, 480.0f)).xi0(this.Sv0(1, 1, 1120.0f, 480.0f));
        n = 306;
        n2 = 0;
        n3 = 11;
        int n5 = 9;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 306;
        n2 = 2;
        n3 = 9;
        n5 = 8;
        f2 = 0.5f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_19 = N4.zr(N4.zr(pw_18, this.fE0(-1, n, n2, n3, n5, f2), 1.2f), this.WW(14, f4, f5, f6, color), 1.84f);
        f4 = 0.5f;
        f5 = 0.75f;
        f6 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pk_1.el(pw_19, this.WW(14, f4, f5, f6, color)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

