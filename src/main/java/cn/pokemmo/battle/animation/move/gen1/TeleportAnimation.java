/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.a10_0;
import f.pw_1;
import f.tw0_0;

/*
 * Renamed from f.ku
 */
/**
 * 宝可梦对战技能招式动画 - 瞬间移动 (Teleport)
 * 技能编号: 100
 * 原始类: f.ku_2
 */
public class TeleportAnimation
extends MU {
    public TeleportAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final void R10() {
        a10_0 a10_02 = tw0_0.PK0;
        if (a10_02 != null) {
            a10_02.Jm(this.Vz0);
        }
        super.R10();
    }

    @Override
    public final MU us() {
        int n = 1487;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(2, 0, 0.0f, 0.9375f, 0.025f)).p1(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 800.0f)), this.Sv0(1, 1, 480.0f, 320.0f));
        n = 1721;
        n2 = 2;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.5859375f;
        pF = this.Vz0;
        pw_1 pw_14 = N4.zr(A2.Kj0(pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)), this.Xq0(14, 1, 0, 0.0f, 0.096f, 0.100097656f, 1.0f), 0.06f), this.EN(14, 2, 2, 0.0f, 0.032f, 0.39990234f, 0.0f), 0.22f).xi0(this.EN(14, 1, 0, 0.0f, 0.32f, 0.0f, 10.0f)).y80(this.Qh0(268));
        n = 268;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.df0(14, 3)).xi0(this.EN(14, 5, 0, 0.0f, 0.32f, 0.0f, 0.0f)).p1(0.6f).mz0().mz0().mz0().Xf0().xi0(this.Ue0(2, 0, 0.9375f, 0.0f, 0.025f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

