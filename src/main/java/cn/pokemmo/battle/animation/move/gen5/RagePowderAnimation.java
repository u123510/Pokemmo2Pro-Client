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
 * Renamed from f.mH0
 */
/**
 * 宝可梦对战技能招式动画 - 愤怒粉 (RagePowder)
 * 技能编号: 476
 * 原始类: f.mh0_1
 */
public class RagePowderAnimation
extends MU {
    public RagePowderAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 649;
        int n = 0;
        int n2 = 11;
        int n3 = 8;
        float f = 0.75f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(649)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 649;
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.75f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f)).xi0(this.nM(16, 1));
        s = 1718;
        n = 2;
        n2 = 16;
        float f2 = 0.0f;
        f = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1718;
        n = 1;
        n2 = 16;
        f2 = 333.33334f;
        f = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1452;
        n = 2;
        n2 = 16;
        f2 = 666.6667f;
        f = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1452;
        n = 1;
        n2 = 16;
        f2 = 833.3333f;
        f = 0.3125f;
        pF = this.Vz0;
        float f3 = 3.25f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(30);
        pw_1 pw_17 = A2.Kj0(pw_16, this.i6((byte)2, s, n, n2, f2, f, pF), 0.6f).xi0(this.WW(16, f3, f4, f5, color));
        f3 = 3.25f;
        f4 = 0.5f;
        f5 = 0.0f;
        color = px_1.ep0(30);
        this.E8 = pk_1.el(pw_17.xi0(this.WW(16, f3, f4, f5, color)), this.Xq0(16, 2, 6, 0.032f, 0.016f, 0.020019531f, -0.020019531f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

