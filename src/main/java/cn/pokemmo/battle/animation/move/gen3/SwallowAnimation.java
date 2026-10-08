/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

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
 * 宝可梦对战技能招式动画 - 吞下 (Swallow)
 * 技能编号: 256
 * 原始类: f.Pz0
 */
public class SwallowAnimation
extends MU {
    public SwallowAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1779;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1427;
        n2 = 1;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1473;
        n2 = 2;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1473;
        n2 = 1;
        n3 = 14;
        f = 1783.3334f;
        f2 = 0.15625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Xq0(14, 2, 1, 0.032f, 0.096f, -0.30004883f, 0.30004883f)).y80(this.Qh0(422));
        n = 422;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.8f);
        n = 422;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 422;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_18 = pk_1.el(N4.zr(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 1.6f), this.WW(14, f3, f4, f5, color));
        f3 = 0.75f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pw_18.xi0(this.WW(14, f3, f4, f5, color)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

