/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.MU;
import f.N4;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.rJ0
 */
/**
 * 宝可梦对战技能招式动画 - 雪崩 (Avalanche)
 * 技能编号: 419
 * 原始类: f.rj0_1
 */
public class AvalancheAnimation
extends MU {
    public AvalancheAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1417;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.8125f, 0.025f)).xi0(this.Wt(1, 0.4f)).TD0().p1(0.32f).Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1416;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 2833.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1536;
        n2 = 1;
        n3 = 16;
        f = 1500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 2080.0f, 768.0f)).xi0(this.Sv0(2, 1, 1760.0f, 480.0f)).y80(this.Qh0(594));
        n = 594;
        n2 = 5;
        n3 = 11;
        int n4 = 8;
        f2 = 0.0f;
        pw_1 pw_16 = N4.zr(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.42f);
        n = 594;
        n2 = 5;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 594;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 594;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 594;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_110 = N4.zr(pw_19, this.fE0(-1, n, n2, n3, n4, f2), 0.52f);
        n = 594;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 594;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.25f;
        pw_1 pw_112 = N4.zr(pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Wt(1, 0.8f)).mz0().mz0().TD0().p1(0.72f).Xf0().xi0(this.nM(16, 1)), this.Xq0(16, 2, 6, 0.016f, 0.032f, 0.30004883f, -0.30004883f), 1.12f);
        n = 594;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = pw_112.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 594;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = Zw0.H(pk_1.el(pw_113, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.tP(0.4f)).y80(this.E2(18, false)).xi0(this.nM(16, 0)), this.Ue0(4, Short.MAX_VALUE, 0.8125f, 0.0f, 0.025f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

