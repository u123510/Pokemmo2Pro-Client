/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.ip
 */
/**
 * 宝可梦对战技能招式动画 - 瞬间失忆 (Amnesia)
 * 技能编号: 133
 * 原始类: f.ip_1
 */
public class AmnesiaAnimation
extends MU {
    public AmnesiaAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        AmnesiaAnimation ip_12 = this;
        AmnesiaAnimation ip_13 = this;
        short s = 1452;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = ip_13.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.25f)), this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).xi0(ip_13.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(298));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 298, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(pw_14.xi0(this.fE0(-1, 298, s, n, n2, f)).xi0(this.nM(16, 1)), this.Xq0(16, 2, 1, 0.016f, 0.032f, 0.30004883f, -0.30004883f)).xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f)).xi0(this.tP(0.25f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ip_12.Vs.jH(this.E8);
        ip_12.Vc();
        return ip_12;
    }
}

