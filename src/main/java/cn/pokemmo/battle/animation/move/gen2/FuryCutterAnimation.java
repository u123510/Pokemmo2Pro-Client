/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.rc0
 */
/**
 * 宝可梦对战技能招式动画 - 连斩 (FuryCutter)
 * 技能编号: 210
 * 原始类: f.rc0_2
 */
public class FuryCutterAnimation
extends MU {
    public FuryCutterAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1485;
        int n = 1;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(HB.p30(pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 1.0f, 0.025f)), this.i6((byte)2, s, n, n2, f, f2, pF)), this.Ue0(4, 0, 1.0f, 0.0f, 0.025f)).xi0(this.Ue0(4, 0, 0.0f, 1.0f, 0.025f));
        s = 1485;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(HB.p30(pw_12, this.i6((byte)2, s, n, n2, f, f2, pF)), this.Ue0(4, 0, 1.0f, 0.0f, 0.025f)).xi0(this.Wt(1, 0.4f)).mz0().Xf0().y80(this.Qh0(376));
        s = 376;
        n = 0;
        n2 = 11;
        int n3 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 376;
        n = 1;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 376;
        n = 2;
        n2 = 11;
        n3 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.Xq0(16, 2, 4, 0.016f, 0.016f, 0.100097656f, -0.100097656f));
        s = 1423;
        n = 1;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF));
        s = 1420;
        n = 2;
        n2 = 16;
        f3 = 0.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        this.E8 = HB.p30(pw_17, this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

