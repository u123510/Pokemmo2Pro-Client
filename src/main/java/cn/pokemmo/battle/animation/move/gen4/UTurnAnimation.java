/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import f.MU;
import f.N4;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.x5
 */
/**
 * 宝可梦对战技能招式动画 - 急速折返 (UTurn)
 * 技能编号: 369
 * 原始类: f.x5_0
 */
public class UTurnAnimation
extends MU {
    public UTurnAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1505;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.25f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1510;
        n2 = 2;
        n3 = 16;
        f = 166.66667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1543;
        n2 = 1;
        n3 = 14;
        f = 750.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1420;
        n2 = 2;
        n3 = 16;
        f = 583.3333f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1452;
        n2 = 2;
        n3 = 14;
        f = 1416.6666f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(543));
        n = 543;
        n2 = 3;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.dA0(543, 1, 9, 11, 0.5f, 360.0f)).xi0(this.df0(14, 3)).TD0().p1(0.02f).Xf0().xi0(this.Wt(1, 0.25f)).mz0().mz0().TD0().p1(0.4f).Xf0();
        n = 543;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.dA0(543, 2, 11, 9, 0.5f, 600.0f));
        n = 543;
        n2 = 5;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(0.72f).Xf0().xi0(this.Wt(0, 0.25f));
        n = 543;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.75f;
        this.E8 = N4.zr(pw_19, this.fE0(-1, n, n2, n3, n4, f2), 1.72f).xi0(this.df0(14, 4)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().xi0(this.tP(0.3f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

