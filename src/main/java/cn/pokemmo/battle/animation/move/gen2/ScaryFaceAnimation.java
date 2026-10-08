/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pk_1;
import f.pw_1;

/**
 * 宝可梦对战技能招式动画 - 可怕面孔 (ScaryFace)
 * 技能编号: 184
 * 原始类: f.Jo0
 */
public class ScaryFaceAnimation
extends MU {
    public ScaryFaceAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        ScaryFaceAnimation jo0 = this;
        ScaryFaceAnimation jo02 = this;
        short s = 1474;
        int n = 1;
        int n2 = 14;
        float f = 250.0f;
        float f2 = 0.8984375f;
        PF pF = jo02.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(0, 0.4f)).xi0(this.nM(14, 1)).y80(this.Qh0(350)), this.Ue0(4, 0, 0.0f, 0.75f, 0.05f)).xi0(jo02.i6((byte)2, s, n, n2, f, f2, pF));
        ScaryFaceAnimation jo03 = this;
        s = 1509;
        n = 2;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.78125f;
        pF = jo03.Vz0;
        pw_1 pw_14 = pw_13.xi0(jo03.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(1, 0, 240.0f, 800.0f));
        s = 0;
        n = 9;
        n2 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pk_1.el(A2.Kj0(pw_14.xi0(this.fE0(-1, 350, s, n, n2, f)), this.Xq0(14, 2, 1, 0.016f, 0.16f, 0.0f, 0.30004883f), 1.2f), this.Ue0(4, 0, 0.75f, 0.0f, 0.05f)).xi0(this.nM(14, 0)).xi0(this.tP(0.4f)).mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        jo0.Vs.jH(this.E8);
        jo0.Vc();
        return jo0;
    }
}

