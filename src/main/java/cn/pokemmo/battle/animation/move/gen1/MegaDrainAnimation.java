/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.ih0
 */
/**
 * 宝可梦对战技能招式动画 - 超级吸取 (MegaDrain)
 * 技能编号: 72
 * 原始类: f.ih0_2
 */
public class MegaDrainAnimation
extends MU {
    public MegaDrainAnimation(PF pF) {
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
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 960, 0.0f, 0.25f, 0.125f)).xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1440.0f));
        n = 1418;
        n2 = 3;
        n3 = 16;
        f = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 3;
        n3 = 16;
        f = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 1440.0f));
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 1666.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1358;
        n2 = 2;
        n3 = 14;
        f = 1916.6666f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(233));
        n = 233;
        n2 = 0;
        n3 = 11;
        int n4 = 9;
        f2 = 0.4f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 233;
        n2 = 1;
        n3 = 11;
        n4 = 9;
        f2 = 0.4f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).TD0().p1(1.8f).Xf0();
        n = 233;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_110 = pk_1.el(pw_19.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(14, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.5f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = HB.p30(pw_110, this.WW(14, f3, f4, f5, color)).xi0(this.Ue0(4, 960, 0.25f, 0.0f, 0.125f)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

