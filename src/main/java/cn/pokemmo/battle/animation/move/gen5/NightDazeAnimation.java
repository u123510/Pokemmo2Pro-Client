/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen5;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.MU;
import f.N4;
import f.PF;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.uk
 */
/**
 * 宝可梦对战技能招式动画 - 暗黑爆破 (NightDaze)
 * 技能编号: 539
 * 原始类: f.uk_1
 */
public class NightDazeAnimation
extends MU {
    public NightDazeAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1455;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9921875f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).mz0().Xf0().xi0(this.Ue0(4, 10570, 0.0f, 0.8125f, 0.1f)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1427;
        n = 2;
        n2 = 14;
        f = 0.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1427;
        n = 2;
        n2 = 14;
        f = 500.0f;
        f2 = 0.546875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(574));
        s = 574;
        n = 0;
        n2 = 9;
        int n3 = 8;
        f2 = 0.25f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 574;
        n = 1;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, s, n, n2, n3, f2));
        s = 574;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, s, n, n2, n3, f2)).xi0(this.tP(0.75f)).TD0().p1(0.48f).Xf0();
        s = 574;
        n = 2;
        n2 = 9;
        n3 = 8;
        f2 = 0.25f;
        pw_1 pw_18 = N4.zr(pw_17, this.fE0(-1, s, n, n2, n3, f2), 1.68f);
        s = 1450;
        n = 2;
        n2 = 16;
        float f3 = 0.0f;
        f2 = 0.390625f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.Sv0(2, 1, 560.0f, 400.0f));
        s = 1376;
        n = 2;
        n2 = 16;
        f3 = 1000.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f4 = 0.75f;
        float f5 = 0.0f;
        float f6 = 0.375f;
        Color color = px_1.ep0(5125);
        pw_1 pw_110 = pk_1.el(pw_19.xi0(this.i6((byte)2, s, n, n2, f3, f2, pF)).xi0(this.WW(16, f4, f5, f6, color)).xi0(this.nM(16, 1)), this.EN(16, 2, 12, 0.016f, 0.016f, 0.19995117f, 0.0f)).xi0(this.Ue0(4, 10570, 0.8125f, 0.0f, 0.1f));
        f4 = 0.75f;
        f5 = 0.375f;
        f6 = 0.0f;
        color = px_1.ep0(5125);
        this.E8 = pw_110.xi0(this.WW(16, f4, f5, f6, color)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

