/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.N4;
import f.PF;
import f.ao_1;
import f.lpt4__4;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Kp
 */
/**
 * 宝可梦对战技能招式动画 - 大爆炸 (Explosion)
 * 技能编号: 153
 * 原始类: f.kp_0
 */
public class ExplosionAnimation
extends MU {
    public ExplosionAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 2;
        boolean bl = true;
        lpt4__4 lpt4__42 = new lpt4__4(this, n, bl);
        n = 1497;
        int f4 = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(this.QO(0)).y80(ao_1.pc(lpt4__42)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, f4, n2, f, f2, pF));
        n = 1376;
        int bl2 = 1;
        n2 = 14;
        f = 1166.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, bl2, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 960.0f));
        n = 1475;
        int f7 = 1;
        n2 = 14;
        f = 1333.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, f7, n2, f, f2, pF));
        n = 1418;
        int n3 = 3;
        n2 = 14;
        f = 1083.3334f;
        f2 = 0.859375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n3, n2, f, f2, pF));
        n = 1376;
        int n4 = 3;
        n2 = 14;
        f = 3000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n4, n2, f, f2, pF)).xi0(this.Sv0(3, 1, 2240.0f, 640.0f)).y80(this.Qh0(317));
        n = 317;
        int n5 = 5;
        n2 = 9;
        int n6 = 8;
        f2 = 0.5f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n5, n2, n6, f2));
        n = 317;
        int n7 = 1;
        n2 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n7, n2, n6, f2));
        n = 317;
        int n8 = 2;
        n2 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n8, n2, n6, f2));
        n = 317;
        int n9 = 3;
        n2 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = pw_19.xi0(this.fE0(-1, n, n9, n2, n6, f2));
        n = 317;
        int n10 = 6;
        n2 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n10, n2, n6, f2));
        n = 317;
        int n11 = 0;
        n2 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_112 = pw_111.xi0(this.fE0(-1, n, n11, n2, n6, f2));
        n = 317;
        int n12 = 4;
        n2 = 9;
        n6 = 8;
        f2 = 0.5f;
        pw_1 pw_113 = N4.zr(A2.Kj0(pw_112, this.fE0(-1, n, n12, n2, n6, f2), 1.4f), this.Ue0(2, Short.MAX_VALUE, 0.0f, 0.8125f, 0.075f), 1.48f).y80(this.E2(14, true)).y80(this.E2(16, true));
        n = 0;
        boolean bl3 = false;
        lpt4__4 lpt4__43 = new lpt4__4(this, n, bl3);
        n = 1;
        boolean bl4 = false;
        float f3 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.625f;
        Color color = px_1.ep0(31);
        int n42 = 0;
        boolean bl5 = true;
        lpt4__4 lpt4__44 = new lpt4__4(this, n42, bl5);
        n42 = 1;
        boolean bl6 = true;
        pw_1 pw_114 = N4.zr(pw_113.y80(ao_1.pc(lpt4__43)).y80(ao_1.pc(new lpt4__4(this, n, bl4))).xi0(this.WW(14, f3, f5, f6, color)).xi0(this.nM(16, 1)), this.Xq0(14, 2, 1, 0.032f, 0.16f, 0.30004883f, -0.30004883f), 2.88f).y80(ao_1.pc(lpt4__44)).y80(ao_1.pc(new lpt4__4(this, n42, bl6))).xi0(this.Ue0(2, Short.MAX_VALUE, 0.8125f, 0.0f, 0.1f)).y80(this.E2(14, false)).y80(this.E2(16, false)).mz0().mz0().mz0().Xf0();
        float f62 = 0.75f;
        float f8 = 0.625f;
        f6 = 0.0f;
        color = px_1.ep0(31);
        this.E8 = pw_114.xi0(this.WW(14, f62, f8, f6, color)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

