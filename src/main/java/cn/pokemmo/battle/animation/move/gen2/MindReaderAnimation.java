/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen2;

import f.*;

import f.A2;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.qD
 */
/**
 * 宝可梦对战技能招式动画 - 心之眼 (MindReader)
 * 技能编号: 170
 * 原始类: f.qd_1
 */
public class MindReaderAnimation
extends MU {
    public MindReaderAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        MindReaderAnimation qd_12 = this;
        MindReaderAnimation qd_13 = this;
        int n = 1473;
        int n2 = 1;
        int n3 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = qd_13.Vz0;
        pw_1 pw_13 = HB.p30(pw_1.xC().Xf0().xi0(this.Wt(1, 0.4f)), this.Ue0(4, 0, 0.0f, 0.8125f, 0.025f)).xi0(qd_13.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        MindReaderAnimation qd_14 = this;
        n = 1505;
        n2 = 2;
        n3 = 16;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = qd_14.Vz0;
        pw_1 pw_14 = pw_13.xi0(qd_14.i6((byte)2, (short)n, n2, n3, f, f2, pF)).y80(this.Qh0(337));
        n = 1;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_15 = pw_14.xi0(this.fE0(-1, 337, n, n2, n3, f));
        n = 0;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        pw_1 pw_16 = A2.Kj0(pw_15, this.fE0(-1, 337, n, n2, n3, f), 0.04f);
        n = 2;
        n2 = 11;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = pw_16.xi0(this.fE0(-1, 337, n, n2, n3, f)).mz0().mz0().mz0().Xf0().TD0().p1(0.4f).Xf0().xi0(this.Ue0(4, 0, 0.8125f, 0.0f, 0.025f)).xi0(this.tP(0.4f)).mz0().mz0().mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        qd_12.Vs.jH(this.E8);
        qd_12.Vc();
        return qd_12;
    }
}

