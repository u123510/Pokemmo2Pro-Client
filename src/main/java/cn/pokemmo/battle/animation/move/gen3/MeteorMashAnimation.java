/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.oJ0
 */
/**
 * 宝可梦对战技能招式动画 - 彗星拳 (MeteorMash)
 * 技能编号: 309
 * 原始类: f.oj0_1
 */
public class MeteorMashAnimation
extends MU {
    public MeteorMashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1665;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.390625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.1f)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1780;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(476));
        n = 476;
        n2 = 3;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 476;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 476;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 476;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_19 = pk_1.el(pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 1)).TD0().p1(0.6f).Xf0(), this.Xq0(16, 2, 3, 0.016f, 0.032f, 0.19995117f, -0.19995117f)).xi0(this.tP(0.4f));
        f3 = 0.75f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = Zw0.H(pw_19.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.nM(16, 0)), this.Ue0(4, 0, 0.75f, 0.0f, 0.1f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

