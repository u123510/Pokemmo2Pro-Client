/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.HB;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;

/*
 * Renamed from f.Zc0
 */
/**
 * 宝可梦对战技能招式动画 - 薄雾球 (MistBall)
 * 技能编号: 296
 * 原始类: f.zc0_0
 */
public class MistBallAnimation
extends MU {
    public MistBallAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1480;
        int bl = 1;
        int n2 = 14;
        float f = 583.3333f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().y80(this.E2(18, true)).xi0(this.Wt(0, 0.3f)).xi0(this.nM(14, 1)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, bl, n2, f, f2, pF)).xi0(this.Sv0(1, 1, 800.0f, 208.0f));
        n = 1376;
        int n3 = 1;
        n2 = 14;
        f = 1133.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF)).y80(this.QO(4));
        n = 2;
        boolean bl2 = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl2);
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 1;
        boolean bl4 = false;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, bl4);
        n = 1452;
        int n4 = 1;
        n2 = 16;
        f = 83.333336f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = HB.p30(pw_13.y80(ao_1.pc(lpt4__42)), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f)).y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.05f)).xi0(this.mf0(4, -20, 0, 2.4f)).y80(this.Qh0(462)).xi0(this.dA0(462, 0, 9, 11, 0.5f, 360.0f)).xi0(this.Wt(1, 0.25f)).TD0().p1(0.4f).Xf0().xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF));
        n = 1438;
        int n5 = 2;
        n2 = 16;
        f = 250.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n5, n2, f, f2, pF));
        n = 462;
        int n6 = 2;
        n2 = 11;
        int n7 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n6, n2, n7, f2));
        n = 462;
        int n8 = 3;
        n2 = 11;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n8, n2, n7, f2));
        n = 462;
        int n9 = 1;
        n2 = 0;
        n7 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = N4.zr(N4.zr(pw_17.xi0(this.fE0(-1, n, n9, n2, n7, f2)).xi0(this.nM(16, 1)), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f), 1.6f), this.Ue0(4, 0, 0.0f, 0.9375f, 0.05f), 2.2f);
        n = 1;
        boolean bl5 = true;
        lpt4__4 lpt4__45 = new lpt4__4(this, n, bl5);
        n = 0;
        boolean bl6 = true;
        this.E8 = pw_18.y80(ao_1.pc(lpt4__45)).y80(ao_1.pc(new lpt4__4(this, n, bl6))).mz0().mz0().TD0().p1(2.8f).Xf0().xi0(this.Ue0(4, 0, 0.9375f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).y80(this.E2(18, false)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

