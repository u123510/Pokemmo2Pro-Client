/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.s5
 */
/**
 * 宝可梦对战技能招式动画 - 电磁飘浮 (MagnetRise)
 * 技能编号: 393
 * 原始类: f.s5_0
 */
public class MagnetRiseAnimation
extends MU {
    public MagnetRiseAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MagnetRiseAnimation s5_02 = this;
        MagnetRiseAnimation s5_03 = this;
        short s = 1625;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.546875f;
        PF pF = s5_03.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(s5_03.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1024.0f)).xi0(this.Sv0(1, 1, 640.0f, 480.0f));
        MagnetRiseAnimation s5_04 = this;
        s = 1728;
        n = 2;
        n2 = 14;
        f = 500.0f;
        f2 = 0.9765625f;
        pF = s5_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(s5_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 960.0f, 800.0f)).y80(this.Qh0(568));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 568, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pw_15.xi0(this.fE0(-1, 568, s, n, n2, f)).TD0().p1(0.2f).Xf0().mz0().mz0().mz0().Xf0().xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        s5_02.Vs.jH(this.E8);
        s5_02.Vc();
        return s5_02;
    }
}

