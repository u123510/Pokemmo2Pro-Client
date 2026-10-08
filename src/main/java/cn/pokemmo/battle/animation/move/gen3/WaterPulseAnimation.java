/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pk_1;
import f.pw_1;
import f.px_1;

/**
 * 宝可梦对战技能招式动画 - 水之波动 (WaterPulse)
 * 技能编号: 352
 * 原始类: f.Y10
 */
public class WaterPulseAnimation
extends MU {
    public WaterPulseAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        int n2 = 1;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, n2 != 0);
        n = 0;
        n2 = 0;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, n2 != 0);
        n = 1;
        n2 = 0;
        lpt4__4 lpt4__44 = new lpt4__4(this, n, n2 != 0);
        n = 1480;
        n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).y80(this.QO(28)).y80(ao_1.pc(lpt4__42)).xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).y80(ao_1.pc(lpt4__43)).mz0().Xf0().y80(ao_1.pc(lpt4__44)).xi0(this.Ue0(3, 0, 0.8125f, 0.0f, 0.075f)).xi0(this.mf0(2, 16, 0, 0.384f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 1, 960.0f, 480.0f));
        n = 1461;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1452;
        n2 = 2;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(525));
        n = 525;
        n2 = 0;
        n3 = 0;
        int n4 = 0;
        f2 = 0.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 525;
        n2 = 1;
        n3 = 0;
        n4 = 0;
        f2 = 0.0f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(32389);
        int n5 = 1;
        boolean bl = true;
        pw_1 pw_17 = HB.p30(pk_1.el(A2.Kj0(pw_16, this.fE0(-1, n, n2, n3, n4, f2), 0.6f).xi0(this.dA0(525, 2, 9, 11, 0.5f, 480.0f)).xi0(this.nM(16, 1)).mz0().mz0().TD0().p1(1.2f).Xf0().xi0(this.Wt(1, 0.6f)).xi0(this.EN(16, 2, 4, 0.016f, 0.048f, 0.19995117f, 0.0f)), this.WW(16, f3, f4, f5, color)), this.Ue0(3, 0, 0.0f, 0.8125f, 0.075f)).y80(ao_1.pc(new lpt4__4(this, n5, bl)));
        float f6 = 1.0f;
        float f7 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(32389);
        int n6 = 0;
        boolean bl2 = true;
        this.E8 = pw_17.xi0(this.WW(16, f6, f7, f5, color)).xi0(this.nM(16, 0)).xi0(this.Ue0(2, 0, 0.8125f, 0.0f, 0.075f)).y80(ao_1.pc(new lpt4__4(this, n6, bl2))).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

