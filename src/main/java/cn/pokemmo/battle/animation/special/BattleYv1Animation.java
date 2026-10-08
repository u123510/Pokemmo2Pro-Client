/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.yv
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleYv1Animation
 * 原始类: f.yv_1
 */
public class BattleYv1Animation
extends MU {
    public final PF[] TB;
    public final boolean JI;

    public BattleYv1Animation(PF pF, boolean bl, PF ... pFArray) {
        super(pF);
        this.TB = pFArray;
        this.JI = bl;
    }

    @Override
    public final MU us() {
        this.E8 = pw_1.xC().xi0(this.Wt(1, 0.4f)).Xf0();
        PF[] pFArray = this.TB;
        int n = this.TB.length;
        for (int j = 0; j < n; ++j) {
            Object object = pFArray[j];
            object = this.E8.xi0(this.kL0((PF)object)).TD0().Xf0().xi0(this.nM(14, 1));
            String string = this.JI ? "entangling_vines_proc" : "entangling_vines_start";
            ((pw_1)object).y80(this.wn0(string)).mz0().p1(0.4f);
            if (this.JI) {
                short s = 1441;
                int n2 = 1;
                int n3 = 16;
                float f = 0.0f;
                float f2 = 0.9765625f;
                PF pF = this.Vz0;
                pw_1 pw_12 = this.E8.Xf0().xi0(this.Xq0(16, 2, 3, 0.016f, 0.064f, -0.39990234f, 0.5f)).xi0(this.i6((byte)2, s, n2, n3, f, f2, pF));
                s = 1441;
                n2 = 2;
                n3 = 16;
                f = 250.0f;
                f2 = 0.9765625f;
                pF = this.Vz0;
                pw_12.xi0(this.i6((byte)2, s, n2, n3, f, f2, pF)).mz0();
            }
            this.E8.xi0(this.nM(14, 0)).mz0();
        }
        this.E8.mz0();
        this.E8.xi0(this.tP(0.4f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

