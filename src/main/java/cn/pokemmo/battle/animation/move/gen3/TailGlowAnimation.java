/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.qI0
 */
/**
 * 宝可梦对战技能招式动画 - 萤火 (TailGlow)
 * 技能编号: 294
 * 原始类: f.qi0_1
 */
public class TailGlowAnimation
extends MU {
    public TailGlowAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1461;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.625f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.1f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 2;
        n3 = 14;
        f = 83.333336f;
        f2 = 0.3125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 2;
        n3 = 14;
        f = 583.3333f;
        f2 = 0.234375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 1;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.1171875f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 1;
        n3 = 14;
        f = 1050.0f;
        f2 = 0.078125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1461;
        n2 = 2;
        n3 = 14;
        f = 1133.3334f;
        f2 = 0.0390625f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(460));
        n = 460;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        this.E8 = HB.p30(pw_17, this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.1f)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

