/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.bH
 */
/**
 * 宝可梦对战技能招式动画 - 龙之怒 (DragonRage)
 * 技能编号: 82
 * 原始类: f.bh_1
 */
public class DragonRageAnimation
extends MU {
    public DragonRageAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1492;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1344.0f)).xi0(this.Sv0(1, 1, 1120.0f, 160.0f));
        n = 1425;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1535;
        n2 = 1;
        n3 = 16;
        f = 750.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1535;
        n2 = 1;
        n3 = 16;
        f = 916.6667f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1535;
        n2 = 1;
        n3 = 16;
        f = 1083.3334f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1535;
        n2 = 1;
        n3 = 16;
        f = 1250.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1536;
        n2 = 2;
        n3 = 16;
        f = 1416.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_18 = A2.Kj0(pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(246)).xi0(this.dA0(246, 1, 9, 11, 0.5f, 0.0f)).xi0(this.dA0(246, 2, 9, 11, 0.5f, 0.0f)), this.dA0(246, 3, 9, 11, 0.5f, 0.0f), 0.2f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(0.6f).Xf0();
        n = 246;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 8, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.nM(16, 0)).mz0().Xf0().xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

