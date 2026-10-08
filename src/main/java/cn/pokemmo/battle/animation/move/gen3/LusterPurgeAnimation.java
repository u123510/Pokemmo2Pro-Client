/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.hp0
 */
/**
 * 宝可梦对战技能招式动画 - 洁净光芒 (LusterPurge)
 * 技能编号: 295
 * 原始类: f.hp0_0
 */
public class LusterPurgeAnimation
extends MU {
    public LusterPurgeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1504;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1505;
        n2 = 2;
        n3 = 14;
        f = 1166.6666f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(461));
        n = 461;
        n2 = 2;
        n3 = 9;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 461;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 461;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 461;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f2 = 0.4f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(14, f3, f4, f5, color));
        f3 = 1.0f;
        f4 = 0.0f;
        f5 = 0.75f;
        color = px_1.ep0(Short.MAX_VALUE);
        int n5 = 1475;
        int n6 = 1;
        int n7 = 16;
        float f6 = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.75f, 0.1f)).mz0().Xf0().p1(0.6f).mz0().Xf0().xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1475;
        n6 = 2;
        n7 = 16;
        f6 = 166.66667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1475;
        n6 = 1;
        n7 = 16;
        f6 = 333.33334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1475;
        n6 = 2;
        n7 = 16;
        f6 = 500.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF));
        n5 = 1475;
        n6 = 1;
        n7 = 16;
        f6 = 666.6667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n5, n6, n7, f6, f2, pF)).xi0(this.nM(16, 1)).xi0(this.EN(16, 2, 10, 0.0f, 0.048f, 0.8000488f, 0.0f));
        n5 = 461;
        n6 = 0;
        n7 = 11;
        int n8 = 8;
        f2 = 0.4f;
        float f7 = 1.0f;
        float f8 = 0.75f;
        float f9 = 0.0f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_113 = HB.p30(pw_112, this.fE0(-1, n5, n6, n7, n8, f2)).xi0(this.WW(14, f7, f8, f9, color2));
        f7 = 1.0f;
        f8 = 0.75f;
        f9 = 0.0f;
        color2 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pw_113.xi0(this.WW(16, f7, f8, f9, color2)).xi0(this.Ue0(4, Short.MAX_VALUE, 0.75f, 0.0f, 0.1f)).p1(0.6f).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

