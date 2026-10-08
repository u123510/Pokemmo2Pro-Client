/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Wy
 */
/**
 * 宝可梦对战技能招式动画 - 吸取 (Absorb)
 * 技能编号: 71
 * 原始类: f.wy_0
 */
public class AbsorbAnimation
extends MU {
    public AbsorbAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1480;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.025f)).xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 480.0f, 480.0f));
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 916.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(232));
        n = 232;
        n2 = 0;
        n3 = 11;
        int n4 = 9;
        f2 = 0.4f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.8f);
        n = 232;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_17 = pk_1.el(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(14, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pw_17.xi0(this.WW(14, f3, f4, f5, color)).mz0().Xf0().xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.025f)).xi0(this.tP(0.6f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

