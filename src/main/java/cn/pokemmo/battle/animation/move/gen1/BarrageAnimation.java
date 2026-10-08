/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.kH0
 */
/**
 * 宝可梦对战技能招式动画 - 投球 (Barrage)
 * 技能编号: 140
 * 原始类: f.kh0_1
 */
public class BarrageAnimation
extends MU {
    public BarrageAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BarrageAnimation kh0_12 = this;
        BarrageAnimation kh0_13 = this;
        int n = 1421;
        int n2 = 0;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = kh0_13.Vz0;
        pw_1 pw_13 = A2.Kj0(pw_1.xC().Xf0().y80(this.Qh0(305)), this.dA0(305, 1, 9, 11, 0.0f, 432.0f), 0.2f).xi0(kh0_13.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        BarrageAnimation kh0_14 = this;
        n = 1722;
        n2 = 2;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.9375f;
        pF = kh0_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(kh0_14.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        BarrageAnimation kh0_15 = this;
        n = 1420;
        n2 = 1;
        n3 = 16;
        f = 333.33334f;
        f2 = 0.390625f;
        pF = kh0_15.Vz0;
        pw_1 pw_15 = pw_14.xi0(kh0_15.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, 305, n, n2, n3, f));
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, 305, n, n2, n3, f));
        n = 3;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(pw_17.xi0(this.fE0(-1, 305, n, n2, n3, f)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(0.52f).Xf0(), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        kh0_12.Vs.jH(this.E8);
        kh0_12.Vc();
        return kh0_12;
    }
}

