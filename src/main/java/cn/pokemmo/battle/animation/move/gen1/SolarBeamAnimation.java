/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.zK
 */
/**
 * 宝可梦对战技能招式动画 - 日光束 (SolarBeam)
 * 技能编号: 76
 * 原始类: f.zk_0
 */
public class SolarBeamAnimation
extends MU {
    public SolarBeamAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU Kh() {
        int n = 1497;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = HB.p30(pw_1.xC().Xf0().p1(0.6f), this.Ue0(2, 0, 0.0f, 0.625f, 0.075f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1480;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 1833.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 1920.0f)).xi0(this.Sv0(2, 0, 0.0f, 1920.0f)).xi0(this.Sv0(1, 1, 1120.0f, 640.0f)).xi0(this.Sv0(2, 1, 1120.0f, 640.0f)).y80(this.Qh0(239));
        n = 239;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.4f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.8125f;
        Color color = px_1.ep0(1023);
        pw_1 pw_16 = pk_1.el(A2.Kj0(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 0.6f), this.WW(14, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.8125f;
        f5 = 0.0f;
        color = px_1.ep0(1023);
        pw_1 pw_17 = HB.p30(pw_16, this.WW(14, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.0f;
        f5 = 0.8125f;
        color = px_1.ep0(1023);
        pw_1 pw_18 = HB.p30(pw_17, this.WW(14, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.8125f;
        f5 = 0.0f;
        color = px_1.ep0(1023);
        pw_1 pw_19 = HB.p30(pw_18, this.WW(14, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.0f;
        f5 = 0.8125f;
        color = px_1.ep0(1023);
        pw_1 pw_110 = HB.p30(pw_19, this.WW(14, f3, f4, f5, color));
        f3 = 0.25f;
        f4 = 0.8125f;
        f5 = 0.0f;
        color = px_1.ep0(1023);
        this.E8 = Zw0.H(pw_110.xi0(this.WW(14, f3, f4, f5, color)).mz0().Xf0().mz0().Xf0().p1(0.6f), this.Ue0(2, 0, 0.625f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        return this;
    }

    @Override
    public final MU us() {
        int n = 0;
        int n2 = 0;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 1475;
        n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(ao_1.pc(lpt4__42)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1505;
        n2 = 2;
        n3 = 14;
        f = 166.66667f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(240));
        n = 240;
        n2 = 2;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 240;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 240;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, n, n2, n3, n4, f2), 1.2f);
        n = 0;
        n2 = 1;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 1450;
        n2 = 2;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.y80(ao_1.pc(lpt4__43)).xi0(this.Wt(1, 0.2f)).mz0().mz0().TD0().p1(1.8f).Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1963;
        n2 = 1;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f3 = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF)).xi0(this.Sv0(2, 1, 960.0f, 320.0f));
        n = 240;
        n2 = 3;
        n3 = 11;
        int n5 = 8;
        f2 = 0.0f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 240;
        n2 = 4;
        n3 = 11;
        n5 = 8;
        f2 = 0.0f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n2, n3, n5, f2));
        n = 240;
        n2 = 5;
        n3 = 11;
        n5 = 8;
        f2 = 0.0f;
        float f4 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(1023);
        pw_1 pw_113 = pk_1.el(pw_112.xi0(this.fE0(-1, n, n2, n3, n5, f2)).xi0(this.nM(16, 1)).xi0(this.WW(16, f4, f5, f6, color)), this.Xq0(16, 2, 7, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0));
        f4 = 0.75f;
        f5 = 0.75f;
        f6 = 0.0f;
        color = px_1.ep0(1023);
        this.E8 = Zw0.H(pw_113, this.WW(16, f4, f5, f6, color));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

