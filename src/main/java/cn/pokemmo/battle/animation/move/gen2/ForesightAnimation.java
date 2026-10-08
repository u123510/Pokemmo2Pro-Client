/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

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
 * Renamed from f.qs0
 */
/**
 * 宝可梦对战技能招式动画 - 识破 (Foresight)
 * 技能编号: 193
 * 原始类: f.qs0_0
 */
public class ForesightAnimation
extends MU {
    public ForesightAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1489;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1489;
        n = 2;
        n2 = 16;
        f = 500.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(359));
        s = 359;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 359;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 359;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 359;
        n = 3;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = A2.Kj0(pw_16, this.fE0(-1, s, n, n2, n3, f2), 1.0f);
        s = 1358;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_18 = N4.zr(pw_17.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)), this.WW(16, f4, f5, f6, color), 1.6f);
        f4 = 0.5f;
        f5 = 0.75f;
        f6 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pk_1.el(pw_18, this.WW(16, f4, f5, f6, color)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

