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

/*
 * Renamed from f.Ch
 */
/**
 * 宝可梦对战技能招式动画 - 怪力 (Strength)
 * 技能编号: 70
 * 原始类: f.ch_0
 */
public class StrengthAnimation
extends MU {
    public StrengthAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 1.25f;
        float f2 = 0.75f;
        float f3 = 0.0f;
        Color color = px_1.ep0(28);
        int n = 1474;
        int n2 = 1;
        int n3 = 14;
        float f4 = 0.0f;
        float f5 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.WW(14, f, f2, f3, color)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.Sv0(1, 0, 0.0f, 320.0f));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f4 = 1000.0f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f4 = 1166.6666f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1475;
        n2 = 1;
        n3 = 16;
        f4 = 1333.3334f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1475;
        n2 = 2;
        n3 = 16;
        f4 = 1500.0f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = N4.zr(A2.Kj0(pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).xi0(this.EN(14, 2, 4, 0.032f, 0.016f, 0.0f, 0.19995117f)), this.Xq0(14, 1, 1, 0.016f, 0.192f, 0.8000488f, 0.8000488f), 0.88f).xi0(this.Xq0(14, 1, 1, 0.016f, 0.032f, 1.0f, 1.0f)), this.EN(14, 2, 2, 0.032f, 0.016f, 0.0f, 0.19995117f), 0.96f).xi0(this.Wt(1, 0.4f)).y80(this.Qh0(231));
        n = 231;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f5 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 231;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f5 = 0.5f;
        this.E8 = pk_1.el(N4.zr(pw_17, this.fE0(-1, n, n2, n3, n4, f5), 1.16f), this.EN(16, 3, 3, 0.032f, 0.016f, 1.0f, 0.0f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

