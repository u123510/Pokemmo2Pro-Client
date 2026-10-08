/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

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
 * Renamed from f.f7
 */
/**
 * 宝可梦对战技能招式动画 - 治愈铃声 (HealBell)
 * 技能编号: 215
 * 原始类: f.f7_0
 */
public class HealBellAnimation
extends MU {
    public HealBellAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 381;
        int n2 = 0;
        int n3 = 9;
        int n4 = 8;
        float f = 0.625f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).y80(this.Qh0(381)).xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 381;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f = 0.625f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f)).xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.5f, 0.05f));
        n = 1540;
        n2 = 1;
        n3 = 14;
        float f2 = 0.0f;
        f = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f2 = 2166.6667f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF)).xi0(this.Sv0(1, 1, 1440.0f, 640.0f));
        n = 1541;
        n2 = 2;
        n3 = 14;
        f2 = 0.0f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f2 = 750.0f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 381;
        n2 = 2;
        n3 = 9;
        int n5 = 8;
        f = 0.5f;
        pw_1 pw_18 = pw_17.xi0(this.fE0(-1, n, n2, n3, n5, f));
        n = 381;
        n2 = 3;
        n3 = 9;
        n5 = 8;
        f = 0.5f;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.5f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_19 = A2.Kj0(pw_18.xi0(this.fE0(-1, n, n2, n3, n5, f)), this.WW(14, f3, f4, f5, color), 0.32f);
        f3 = 0.5f;
        f4 = 0.5f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        int n6 = 381;
        int n7 = 2;
        int n8 = 9;
        int n9 = 8;
        f = 0.5f;
        pw_1 pw_110 = N4.zr(pw_19.xi0(this.WW(14, f3, f4, f5, color)), this.Ue0(4, Short.MAX_VALUE, 0.5f, 0.0f, 0.05f), 0.64f).xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.5f, 0.05f)).xi0(this.fE0(-1, n6, n7, n8, n9, f));
        n6 = 381;
        n7 = 3;
        n8 = 9;
        n9 = 8;
        f = 0.5f;
        float f6 = 0.5f;
        float f7 = 0.0f;
        float f8 = 0.5f;
        Color color2 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_111 = N4.zr(pw_110.xi0(this.fE0(-1, n6, n7, n8, n9, f)), this.WW(14, f6, f7, f8, color2), 0.96f).xi0(this.Ue0(4, Short.MAX_VALUE, 0.5f, 0.0f, 0.05f));
        f6 = 0.5f;
        f7 = 0.5f;
        f8 = 0.0f;
        color2 = px_1.ep0(Short.MAX_VALUE);
        int n10 = 381;
        int n11 = 2;
        int n12 = 9;
        int n13 = 8;
        f = 0.5f;
        pw_1 pw_112 = N4.zr(pw_111, this.WW(14, f6, f7, f8, color2), 1.28f).xi0(this.Ue0(4, Short.MAX_VALUE, 0.0f, 0.5f, 0.05f)).xi0(this.fE0(-1, n10, n11, n12, n13, f));
        n10 = 381;
        n11 = 3;
        n12 = 9;
        n13 = 8;
        f = 0.5f;
        float f9 = 0.5f;
        float f10 = 0.0f;
        float f11 = 0.5f;
        Color color3 = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_113 = N4.zr(pw_112.xi0(this.fE0(-1, n10, n11, n12, n13, f)), this.WW(14, f9, f10, f11, color3), 1.6f).xi0(this.Ue0(4, Short.MAX_VALUE, 0.5f, 0.0f, 0.05f));
        f9 = 0.5f;
        f10 = 0.5f;
        f11 = 0.0f;
        color3 = px_1.ep0(Short.MAX_VALUE);
        this.E8 = pk_1.el(pw_113, this.WW(14, f9, f10, f11, color3)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

