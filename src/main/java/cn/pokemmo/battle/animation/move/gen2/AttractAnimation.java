/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.qh
 */
/**
 * 宝可梦对战技能招式动画 - 迷人 (Attract)
 * 技能编号: 213
 * 原始类: f.qh_2
 */
public class AttractAnimation
extends MU {
    public AttractAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1777;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.6f)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 80.0f, 320.0f)).xi0(this.Sv0(1, 1, 320.0f, 400.0f));
        n = 1376;
        n2 = 1;
        n3 = 16;
        f = 1216.6666f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1517;
        n2 = 2;
        n3 = 16;
        f = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 1, 80.0f, 640.0f)).xi0(this.nM(14, 1)).mz0().Xf0().y80(this.Qh0(379));
        n = 379;
        n2 = 0;
        n3 = 11;
        int n4 = 8;
        f2 = 0.4f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 379;
        n2 = 1;
        n3 = 11;
        n4 = 8;
        f2 = 0.4f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.625f;
        Color color = px_1.ep0(16409);
        pw_1 pw_16 = HB.p30(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(16, f3, f4, f5, color)).xi0(this.nM(14, 0));
        f3 = 0.75f;
        f4 = 0.625f;
        f5 = 0.0f;
        color = px_1.ep0(16409);
        this.E8 = pw_16.xi0(this.WW(16, f3, f4, f5, color)).p1(0.6f).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

