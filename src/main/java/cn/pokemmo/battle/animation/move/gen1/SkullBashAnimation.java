/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/*
 * Renamed from f.um0
 */
/**
 * 宝可梦对战技能招式动画 - 火箭头锤 (SkullBash)
 * 技能编号: 130
 * 原始类: f.um0_0
 */
public class SkullBashAnimation
extends MU {
    public SkullBashAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        pw_1 pw_12;
        SkullBashAnimation um0_02 = this;
        SkullBashAnimation um0_03 = this;
        short s = 1421;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = um0_03.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.EN(14, 1, 1, 0.016f, 0.096f, -1.0f, 0.0f)), um0_03.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.nM(14, 1)).mz0().Xf0().TD0().p1(0.6f).Xf0();
        SkullBashAnimation um0_04 = this;
        s = 1524;
        n = 1;
        n2 = 14;
        f = 0.0f;
        f2 = 0.9375f;
        pF = um0_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(um0_04.i6((byte)2, s, n, n2, f, f2, pF));
        SkullBashAnimation um0_05 = this;
        s = 1524;
        n = 1;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = um0_05.Vz0;
        pw_1 pw_15 = pk_1.el(pw_14, um0_05.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.EN(14, 1, 1, 0.0f, 0.096f, 1.0f, 0.0f));
        SkullBashAnimation um0_06 = this;
        s = 1421;
        n = 1;
        n2 = 14;
        f = 0.0f;
        f2 = 0.859375f;
        pF = um0_06.Vz0;
        this.E8 = pw_12 = pw_15.xi0(um0_06.i6((byte)2, s, n, n2, f, f2, pF)).mz0().Xf0().mz0().Xf0().xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        um0_02.Vs.jH(this.E8);
        return um0_02;
    }

    @Override
    public final MU us() {
        int n = 1421;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.nM(14, 1)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).mz0().Xf0().mz0().Xf0().xi0(this.nM(14, 0)).mz0().Xf0().xi0(this.Wt(1, 0.4f)).mz0().Xf0();
        n = 1475;
        n2 = 1;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1424;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(295));
        n = 295;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 295;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 295;
        n2 = 2;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        this.E8 = pk_1.el(pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.nM(16, 1)).TD0().p1(0.2f).Xf0(), this.EN(16, 2, 9, 0.0f, 0.032f, 0.5f, 0.0f)).xi0(this.tP(0.4f)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

