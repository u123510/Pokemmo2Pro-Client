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

/**
 * 宝可梦对战技能招式动画 - 电击波 (ShockWave)
 * 技能编号: 351
 * 原始类: f.Q9
 */
public class ShockWaveAnimation
extends MU {
    public ShockWaveAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 524;
        int n2 = 2;
        int n3 = 9;
        int n4 = 8;
        float f = 0.5f;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).y80(this.Qh0(524)).xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 524;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_13 = pw_12.xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 524;
        n2 = 4;
        n3 = 9;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 524;
        n2 = 0;
        n3 = 9;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, n, n2, n3, n4, f));
        n = 524;
        n2 = 1;
        n3 = 9;
        n4 = 8;
        f = 0.5f;
        pw_1 pw_16 = pw_15.xi0(this.fE0(-1, n, n2, n3, n4, f)).xi0(this.Ue0(4, 0, 0.0f, 0.75f, 0.05f));
        n = 1497;
        n2 = 1;
        n3 = 14;
        float f2 = 666.6667f;
        f = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1376;
        n2 = 1;
        n3 = 14;
        f2 = 2000.0f;
        f = 0.0f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF)).xi0(this.Sv0(1, 0, 0.0f, 1280.0f));
        n = 1458;
        n2 = 2;
        n3 = 14;
        f2 = 1166.6666f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_19 = pw_18.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1458;
        n2 = 2;
        n3 = 14;
        f2 = 1500.0f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_110 = pw_19.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1683;
        n2 = 1;
        n3 = 14;
        f2 = 2166.6667f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_111 = pw_110.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1682;
        n2 = 2;
        n3 = 14;
        f2 = 2166.6667f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_112 = pw_111.xi0(this.i6((byte)2, (short)n, n2, n3, f2, f, pF));
        n = 1458;
        n2 = 2;
        n3 = 16;
        f2 = 2916.6667f;
        f = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_113 = A2.Kj0(pw_112, this.i6((byte)2, (short)n, n2, n3, f2, f, pF), 3.0f).xi0(this.Wt(1, 0.4f)).mz0().mz0().TD0().p1(3.4f).Xf0();
        n = 524;
        n2 = 5;
        n3 = 11;
        int n5 = 8;
        f = 0.5f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(1023);
        pw_1 pw_114 = pk_1.el(pw_113.xi0(this.fE0(-1, n, n2, n3, n5, f)).xi0(this.WW(16, f3, f4, f5, color)), this.EN(16, 2, 8, 0.032f, 0.016f, 0.30004883f, 0.0f));
        f3 = 0.5f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(1023);
        this.E8 = pw_114.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.tP(0.4f)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

