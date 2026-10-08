/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.er
 */
/**
 * 宝可梦对战技能招式动画 - 龙之舞 (DragonDance)
 * 技能编号: 349
 * 原始类: f.er_2
 */
public class DragonDanceAnimation
extends MU {
    public DragonDanceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1425;
        int n2 = 1;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f = 2166.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(1, 0, 0.0f, 2080.0f)).xi0(this.Sv0(1, 1, 1600.0f, 480.0f));
        n = 1445;
        n2 = 2;
        n3 = 14;
        f = 0.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1376;
        n2 = 2;
        n3 = 14;
        f = 2166.6667f;
        f2 = 0.0f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF)).xi0(this.Sv0(2, 0, 0.0f, 2080.0f)).xi0(this.Sv0(2, 1, 1600.0f, 480.0f)).y80(this.Qh0(522));
        n = 522;
        n2 = 0;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(31);
        pw_1 pw_16 = A2.Kj0(pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.WW(14, f3, f4, f5, color)), this.EN(14, 2, 16, 0.032f, 0.016f, 0.30004883f, 0.0f), 1.6f);
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(31);
        this.E8 = pk_1.el(pw_16, this.WW(14, f3, f4, f5, color)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

