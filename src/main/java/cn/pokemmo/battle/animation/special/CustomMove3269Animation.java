/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

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
 * Renamed from f.kB0
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [3269]
 * 原始类: f.kb0_1
 */
public class CustomMove3269Animation
extends MU {
    public CustomMove3269Animation(PF pF) {
        super(pF);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final MU us() {
        pw_1 pw_12;
        int n;
        short s = 1438;
        int n2 = 1;
        int n3 = 14;
        float f = 166.66667f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.i6((byte)2, s, n2, n3, f, f2, pF));
        s = 1711;
        n2 = 2;
        n3 = 14;
        f = 833.3333f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n2, n3, f, f2, pF));
        s = 1711;
        n2 = 2;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        this.E8 = pw_14.xi0(this.i6((byte)2, s, n2, n3, f, f2, pF)).xi0(this.nM(14, 1)).xi0(this.nM(16, 1)).y80(this.Qh0(434)).y80(this.Qh0(435));
        if (!this.nn0()) {
            s = 434;
            n2 = 0;
            n3 = 9;
            n = 8;
            f2 = 0.75f;
            pw_1 pw_15 = this.E8.Xf0().xi0(this.fE0(-1, s, n2, n3, n, f2));
            s = 434;
            n2 = 1;
            n3 = 9;
            n = 8;
            f2 = 0.75f;
            pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n2, n3, n, f2));
            s = 434;
            n2 = 2;
            n3 = 9;
            n = 8;
            f2 = 0.75f;
            pw_12 = pw_16.xi0(this.fE0(-1, s, n2, n3, n, f2));
            s = 434;
            n2 = 3;
            n3 = 9;
            n = 8;
            f2 = 0.75f;
        } else {
            s = 434;
            n2 = 0;
            n3 = 9;
            n = 8;
            f2 = 0.75f;
            pw_1 pw_17 = this.E8.Xf0().xi0(this.fE0(-1, s, n2, n3, n, f2));
            s = 434;
            n2 = 1;
            n3 = 9;
            n = 8;
            f2 = 0.75f;
            pw_1 pw_18 = pw_17.xi0(this.fE0(-1, s, n2, n3, n, f2));
            s = 435;
            n2 = 1;
            n3 = 9;
            n = 8;
            f2 = 0.75f;
            pw_12 = pw_18.xi0(this.fE0(-1, s, n2, n3, n, f2));
            s = 435;
            n2 = 2;
            n3 = 9;
            n = 8;
            f2 = 0.75f;
        }
        pw_12.xi0(this.fE0(-1, s, n2, n3, n, f2)).mz0();
        s = 1463;
        n2 = 3;
        n3 = 16;
        float f3 = 0.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_19 = this.E8.mz0().Xf0().xi0(this.Wt(3, 0.4f)).xi0(this.i6((byte)2, s, n2, n3, f3, f2, pF));
        s = 1376;
        n2 = 3;
        n3 = 16;
        f3 = 916.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, s, n2, n3, f3, f2, pF)).xi0(this.Sv0(3, 0, 0.0f, 880.0f)).xi0(this.Sv0(3, 1, 640.0f, 160.0f));
        s = 1464;
        n2 = 1;
        n3 = 16;
        f3 = 0.0f;
        f2 = 0.625f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, s, n2, n3, f3, f2, pF));
        s = 1376;
        n2 = 1;
        n3 = 16;
        f3 = 916.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, s, n2, n3, f3, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 880.0f)).xi0(this.Sv0(1, 1, 640.0f, 160.0f));
        s = 1712;
        n2 = 2;
        n3 = 16;
        f3 = 333.33334f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_113 = pw_112.xi0(this.i6((byte)2, s, n2, n3, f3, f2, pF));
        s = 1712;
        n2 = 2;
        n3 = 16;
        f3 = 666.6667f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 0.75f;
        Color color = px_1.ep0(31);
        pw_1 pw_114 = A2.Kj0(pw_113.xi0(this.i6((byte)2, s, n2, n3, f3, f2, pF)), this.WW(16, f4, f5, f6, color), 0.4f);
        int n4 = 435;
        int n5 = 0;
        int n6 = 11;
        int n7 = 8;
        float f7 = 0.5f;
        pw_1 pw_115 = pw_1.gb0();
        int n8 = 0;
        while (true) {
            if (n8 >= this.aZ.KB) {
                float f8 = 0.5f;
                float f9 = 0.75f;
                float f10 = 0.0f;
                Color color2 = px_1.ep0(31);
                pk_1.el(N4.zr(pw_114.xi0(pw_115), this.EN(16, 2, 3, 0.032f, 0.016f, 0.30004883f, 0.0f), 0.8f), this.WW(16, f8, f9, f10, color2)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
                this.E8.Ms(this.Vs.wP);
                this.Vs.jH(this.E8);
                this.Vc();
                return this;
            }
            pw_115.xi0(this.fE0(n8, n4, n5, n6, n7, f7));
            ++n8;
        }
    }
}

