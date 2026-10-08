/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.Zw0;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.cE
 */
/**
 * 宝可梦对战技能招式动画 - 定身法 (Disable)
 * 技能编号: 50
 * 原始类: f.ce_0
 */
public class DisableAnimation
extends MU {
    public DisableAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        DisableAnimation ce_02 = this;
        DisableAnimation ce_03 = this;
        short s = 1509;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.859375f;
        PF pF = ce_03.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)), this.Ue0(4, 21140, 0.0f, 0.75f, 0.125f)).xi0(ce_03.i6((byte)2, s, n, n2, f, f2, pF)).y80(this.Qh0(211));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 211, s, n, n2, f));
        s = 1;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_15 = A2.Kj0(pw_14, this.fE0(-1, 211, s, n, n2, f), 0.2f).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0();
        DisableAnimation ce_04 = this;
        s = 1524;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = ce_04.Vz0;
        this.E8 = pw_12 = Zw0.H(HB.p30(pw_15.xi0(ce_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(16, 1.0f, 0.0f, 0.75f, px_1.ep0(0))), this.Xq0(16, 2, 1, 0.016f, 0.16f, 0.30004883f, 0.30004883f)).xi0(this.WW(16, 1.0f, 0.75f, 0.0f, px_1.ep0(0))), this.Ue0(4, 21140, 0.75f, 0.0f, 0.125f));
        pw_12.Ms(this.Vs.wP);
        ce_02.Vs.jH(this.E8);
        ce_02.Vc();
        return ce_02;
    }
}

