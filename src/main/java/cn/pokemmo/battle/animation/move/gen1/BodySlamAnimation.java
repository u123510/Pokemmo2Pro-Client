/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.yh
 */
/**
 * 宝可梦对战技能招式动画 - 泰山压顶 (BodySlam)
 * 技能编号: 34
 * 原始类: f.yh_1
 */
public class BodySlamAnimation
extends MU {
    public BodySlamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1426;
        int n = 2;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.703125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Xq0(14, 2, 1, 0.032f, 0.064f, 0.100097656f, 0.30004883f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1463;
        n = 1;
        n2 = 14;
        f = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 1;
        n2 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = HB.p30(pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1120.0f)), this.Sv0(1, 1, 800.0f, 320.0f)).xi0(this.Wt(1, 0.4f)).TD0().p1(0.2f).Xf0().y80(this.Qh0(196));
        s = 196;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 196;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 196;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.nM(16, 1)).xi0(this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f));
        s = 1705;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(pw_17, this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

