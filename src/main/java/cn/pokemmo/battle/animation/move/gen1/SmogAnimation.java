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

/**
 * 宝可梦对战技能招式动画 - 浊雾 (Smog)
 * 技能编号: 123
 * 原始类: f.Sa0
 */
public class SmogAnimation
extends MU {
    public SmogAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 288;
        int n = 0;
        int n2 = 11;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(288)).xi0(this.fE0(-1, s, n, n2, n3, f)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        s = 1478;
        n = 1;
        n2 = 16;
        float f2 = 0.0f;
        f = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1479;
        n = 2;
        n2 = 16;
        f2 = 0.0f;
        f = 0.625f;
        pF = this.Vz0;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(0);
        pw_1 pw_14 = HB.p30(pw_13.xi0(this.i6((byte)2, s, n, n2, f2, f, pF)), this.WW(16, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(0);
        pw_1 pw_15 = HB.p30(pw_14, this.WW(16, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.0f;
        f5 = 0.625f;
        color = px_1.ep0(0);
        pw_1 pw_16 = HB.p30(pw_15, this.WW(16, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(0);
        this.E8 = HB.p30(pw_16, this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

