/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.f20
 */
/**
 * 宝可梦对战技能招式动画 - 浊流 (MuddyWater)
 * 技能编号: 330
 * 原始类: f.f20_0
 */
public class MuddyWaterAnimation
extends MU {
    public MuddyWaterAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1897;
        int n2 = 1;
        int n3 = 14;
        float f = 83.333336f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.Xq0(14, 2, 1, 0.016f, 0.192f, 0.30004883f, -0.30004883f)).y80(this.E2(18, true)).y80(this.Qh0(500)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 80.0f, 1184.0f));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1493;
        n2 = 2;
        n3 = 14;
        f = 500.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f = 2333.3333f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1849;
        n2 = 1;
        n3 = 16;
        f = 1333.3334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 500;
        n2 = 2;
        n3 = 11;
        int n4 = 8;
        f2 = 0.0f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 500;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 500;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 500;
        n2 = 5;
        n3 = 9;
        n4 = 11;
        f2 = 0.0f;
        pw_1 pw_110 = N4.zr(A2.Kj0(pw_19, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.Wt(0, 1.0f)).mz0().mz0().TD0().p1(1.0f).Xf0().xi0(this.Wt(1, 0.8f)), this.Xq0(14, 2, 1, 0.016f, 0.08f, -0.30004883f, 0.30004883f), 1.4f);
        n = 500;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(13023);
        pw_1 pw_111 = N4.zr(N4.zr(pw_110, this.fE0(-1, n, n2, n3, n4, f2), 1.6f).xi0(this.nM(16, 1)).xi0(this.WW(16, f3, f4, f5, color)), this.EN(16, 2, 8, 0.032f, 0.016f, 0.30004883f, 0.0f), 2.04f);
        f3 = 0.75f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(13023);
        this.E8 = pk_1.el(pw_111, this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.4f)).TD0().p1(0.12f).Xf0().y80(this.E2(18, false)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

