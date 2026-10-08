/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Ew
 */
/**
 * 宝可梦对战技能招式动画 - 火焰拳 (FirePunch)
 * 技能编号: 7
 * 原始类: f.ew_0
 */
public class FirePunchAnimation
extends MU {
    public FirePunchAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        float f = 0.25f;
        float f2 = 0.0f;
        float f3 = 0.625f;
        Color color = px_1.ep0(31);
        int n = 1421;
        int n2 = 2;
        int n3 = 16;
        float f4 = 0.0f;
        float f5 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(1, 0.4f)), this.Ue0(4, 31, 0.0f, 0.75f, 0.075f)).xi0(this.WW(16, f, f2, f3, color)).xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1420;
        n2 = 1;
        n3 = 16;
        f4 = 166.66667f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF));
        n = 1426;
        n2 = 2;
        n3 = 16;
        f4 = 333.33334f;
        f5 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f4, f5, pF)).y80(this.Qh0(167));
        n = 167;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f5 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 167;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f5 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f5));
        n = 167;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f5 = 0.5f;
        float f6 = 0.25f;
        float f7 = 0.625f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(31);
        this.E8 = Zw0.H(HB.p30(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f5)).xi0(this.nM(16, 1)), this.EN(16, 2, 12, 0.0f, 0.032f, 0.5f, 0.0f)).xi0(this.tP(0.4f)).mz0().Xf0().y80(this.E2(18, false)).xi0(this.nM(16, 0)).xi0(this.WW(16, f6, f7, f8, color2)), this.Ue0(4, 31, 0.75f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

