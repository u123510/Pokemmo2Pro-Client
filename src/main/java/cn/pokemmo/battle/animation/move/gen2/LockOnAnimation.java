/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.bq
 */
/**
 * 宝可梦对战技能招式动画 - 锁定 (LockOn)
 * 技能编号: 199
 * 原始类: f.bq_2
 */
public class LockOnAnimation
extends MU {
    public LockOnAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1534;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1534;
        n2 = 1;
        n3 = 16;
        f = 500.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1534;
        n2 = 1;
        n3 = 16;
        f = 1000.0f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 2;
        n3 = 16;
        f = 1166.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(365));
        n = 365;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 365;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 365;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 365;
        n2 = 3;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(N4.zr(A2.Kj0(pw_18, this.fE0(-1, n, n2, n3, n4, f2), 1.2f), this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.75f, 0.05f), 1.28f), this.Ue0(4, Short.MAX_VALUE, 0.75f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

