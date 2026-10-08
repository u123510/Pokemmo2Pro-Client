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
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.jE
 */
/**
 * 宝可梦对战技能招式动画 - 冲浪 (Surf)
 * 技能编号: 57
 * 原始类: f.je_1
 */
public class SurfAnimation
extends MU {
    public SurfAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1897;
        int n2 = 1;
        int n3 = 14;
        float f = 500.0f;
        float f2 = 0.46875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1511;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1511;
        n2 = 2;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.nM(14, 1)).y80(this.E2(18, true)).xi0(this.Xq0(14, 2, 1, 0.016f, 0.192f, 0.30004883f, -0.30004883f)).y80(this.Qh0(218));
        n = 218;
        n2 = 3;
        n3 = 9;
        int n4 = 8;
        f2 = 0.0f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 218;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 218;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f2 = 0.0f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 218;
        n2 = 5;
        n3 = 9;
        n4 = 11;
        f2 = 0.0f;
        pw_1 pw_18 = A2.Kj0(pw_17, this.fE0(-1, n, n2, n3, n4, f2), 0.4f).xi0(this.Wt(0, 1.0f)).mz0().mz0().TD0().p1(1.0f).Xf0().xi0(this.Wt(1, 0.8f)).xi0(this.Xq0(14, 2, 1, 0.016f, 0.08f, -0.30004883f, 0.30004883f));
        n = 1511;
        n2 = 1;
        n3 = 16;
        float f3 = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1897;
        n2 = 2;
        n3 = 16;
        f3 = 500.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f3, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 16;
        f3 = 1666.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_111 = N4.zr(pw_110, this.i6((byte)2, (short)n, n2, n3, f3, f2, pF), 1.4f);
        n = 218;
        n2 = 2;
        n3 = 11;
        int n5 = 8;
        f2 = 0.0f;
        float f4 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_112 = N4.zr(N4.zr(pw_111.xi0(this.fE0(-1, n, n2, n3, n5, f2)), this.Sv0(2, 1, 320.0f, 400.0f), 1.6f).xi0(this.nM(16, 1)).xi0(this.WW(16, f4, f5, f6, color)), this.EN(16, 2, 8, 0.032f, 0.016f, 0.30004883f, 0.0f), 2.04f);
        f4 = 0.75f;
        f5 = 0.75f;
        f6 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pk_1.el(pw_112, this.WW(16, f4, f5, f6, color)).xi0(this.tP(0.4f)).TD0().p1(0.12f).Xf0().y80(this.E2(18, false)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).mz0().mz0().mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

