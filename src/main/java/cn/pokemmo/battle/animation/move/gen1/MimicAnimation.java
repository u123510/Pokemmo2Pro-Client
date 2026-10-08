/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen1;

import f.*;

import f.A2;
import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.Xb
 */
/**
 * 宝可梦对战技能招式动画 - 模仿 (Mimic)
 * 技能编号: 102
 * 原始类: f.xb_0
 */
public class MimicAnimation
extends MU {
    public MimicAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MimicAnimation xb_02 = this;
        MimicAnimation xb_03 = this;
        short s = 1466;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = xb_03.Vz0;
        pw_1 pw_13 = A2.Kj0(FB.zd0(0.6f).y80(this.Qh0(269)).xi0(this.dA0(269, 1, 11, 9, 0.5f, 480.0f)), xb_03.i6((byte)2, s, n, n2, f, f2, pF), 0.32f).xi0(this.Wt(0, 0.5f)).xi0(this.nM(16, 1)).mz0().mz0().mz0().Xf0();
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        pw_1 pw_14 = pw_13.xi0(this.fE0(-1, 269, s, n, n2, f));
        MimicAnimation xb_04 = this;
        s = 1465;
        n = 2;
        n2 = 16;
        f = 0.0f;
        f2 = 0.9375f;
        pF = xb_04.Vz0;
        this.E8 = pw_12 = HB.p30(pw_14, xb_04.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.tP(0.4f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        xb_02.Vs.jH(this.E8);
        xb_02.Vc();
        return xb_02;
    }
}

