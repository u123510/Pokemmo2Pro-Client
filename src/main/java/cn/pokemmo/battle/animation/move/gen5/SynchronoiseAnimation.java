/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.aw
 */
/**
 * 宝可梦对战技能招式动画 - 同步干扰 (Synchronoise)
 * 技能编号: 485
 * 原始类: f.aw_2
 */
public class SynchronoiseAnimation
extends MU {
    public SynchronoiseAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1672;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.3f)), this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1250.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1467;
        n2 = 2;
        n3 = 14;
        f = 333.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 1120.0f, 160.0f)).y80(this.Qh0(655));
        n = 655;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5250244f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 655;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5750122f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.12f);
        n = 655;
        n2 = 2;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 655;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5250244f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2)).mz0().mz0().TD0().p1(0.32f).Xf0().p1(0.25f);
        n = 1423;
        n2 = 1;
        n3 = 16;
        float f3 = 1350.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1423;
        n2 = 2;
        n3 = 16;
        f3 = 1433.3334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1423;
        n2 = 1;
        n3 = 16;
        f3 = 1516.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1423;
        n2 = 2;
        n3 = 16;
        f3 = 1616.6666f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(1.32f).Xf0().xi0(this.Wt(1, 0.3f)).mz0().mz0().TD0().p1(1.72f).Xf0().xi0(this.EN(16, 2, 3, 0.0f, 0.032f, 0.30004883f, 0.0f));
        n = 655;
        n2 = 3;
        n3 = 11;
        int n5 = 8;
        f2 = 0.5f;
        this.E8 = Zw0.H(pk_1.el(pw_112, this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)), this.Ue0(4, 0, 0.75f, 0.0f, 0.05f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

