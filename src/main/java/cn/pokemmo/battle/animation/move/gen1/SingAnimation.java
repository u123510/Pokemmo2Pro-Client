/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 唱歌 (Sing)
 * 技能编号: 47
 * 原始类: f.M40
 */
public class SingAnimation
extends MU {
    public SingAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1523;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.625f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(208));
        n = 208;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 208;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.375f;
        Color color = px_1.ep0(15391);
        pw_1 pw_14 = N4.zr(A2.Kj0(pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.dA0(208, 2, 9, 11, 0.5f, 0.0f), 1.2f).xi0(this.tP(0.25f)).xi0(this.nM(16, 1)), this.WW(16, f3, f4, f5, color), 1.8f);
        f3 = 0.75f;
        f4 = 0.375f;
        f5 = 0.0f;
        color = px_1.ep0(15391);
        pw_1 pw_15 = pk_1.el(pw_14, this.WW(16, f3, f4, f5, color));
        f3 = 0.75f;
        f4 = 0.0f;
        f5 = 0.375f;
        color = px_1.ep0(15391);
        pw_1 pw_16 = HB.p30(pw_15, this.WW(16, f3, f4, f5, color));
        f3 = 0.75f;
        f4 = 0.375f;
        f5 = 0.0f;
        color = px_1.ep0(15391);
        this.E8 = Zw0.H(pw_16.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 0)), this.Ue0(4, Short.MAX_VALUE, 0.625f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

