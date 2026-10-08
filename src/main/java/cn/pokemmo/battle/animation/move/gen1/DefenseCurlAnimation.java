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
 * Renamed from f.ps
 */
/**
 * 宝可梦对战技能招式动画 - 变圆 (DefenseCurl)
 * 技能编号: 111
 * 原始类: f.ps_2
 */
public class DefenseCurlAnimation
extends MU {
    public DefenseCurlAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 276;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(276)).xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 276;
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 276;
        n = 2;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, s, n, n2, n3, f));
        s = 276;
        n = 3;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f)).xi0(this.nM(14, 1));
        s = 1463;
        n = 2;
        n2 = 14;
        float f2 = 0.0f;
        f = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, s, n, n2, f2, f, pF));
        s = 1376;
        n = 2;
        n2 = 14;
        f2 = 1333.3334f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, s, n, n2, f2, f, pF)).xi0(this.Sv0(2, 0, 0.0f, 1280.0f));
        s = 1358;
        n = 1;
        n2 = 14;
        f2 = 1000.0f;
        f = 0.9375f;
        pF = this.Vz0;
        this.E8 = pk_1.el(A2.Kj0(pw_17, this.i6((byte)2, s, n, n2, f2, f, pF), 0.12f), this.Xq0(14, 2, 1, 0.016f, 0.144f, 0.100097656f, -0.100097656f)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

