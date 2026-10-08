/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import f.FB;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.aE
 */
/**
 * 宝可梦对战技能招式动画 - 健美 (BulkUp)
 * 技能编号: 339
 * 原始类: f.ae_0
 */
public class BulkUpAnimation
extends MU {
    public BulkUpAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        BulkUpAnimation ae_02 = this;
        BulkUpAnimation ae_03 = this;
        short s = 1452;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.8984375f;
        PF pF = ae_03.Vz0;
        pw_1 pw_13 = FB.zd0(0.6f).xi0(this.nM(16, 1)).xi0(this.nM(14, 1)).xi0(ae_03.i6((byte)2, s, n, n2, f, f2, pF));
        BulkUpAnimation ae_04 = this;
        s = 1452;
        n = 2;
        n2 = 14;
        f = 333.33334f;
        f2 = 0.8984375f;
        pF = ae_04.Vz0;
        pw_1 pw_14 = pw_13.xi0(ae_04.i6((byte)2, s, n, n2, f, f2, pF));
        BulkUpAnimation ae_05 = this;
        s = 1452;
        n = 1;
        n2 = 14;
        f = 666.6667f;
        f2 = 0.8984375f;
        pF = ae_05.Vz0;
        pw_1 pw_15 = pw_14.xi0(ae_05.i6((byte)2, s, n, n2, f, f2, pF));
        BulkUpAnimation ae_06 = this;
        s = 1452;
        n = 2;
        n2 = 14;
        f = 1166.6666f;
        f2 = 0.8984375f;
        pF = ae_06.Vz0;
        this.E8 = pw_12 = HB.p30(HB.p30(pw_15.xi0(ae_06.i6((byte)2, s, n, n2, f, f2, pF)), this.Xq0(14, 3, 1, 0.016f, 0.096f, 0.39990234f, -0.39990234f)), this.Xq0(14, 2, 1, 0.016f, 0.096f, 0.39990234f, 0.39990234f)).xi0(this.nM(14, 0)).xi0(this.nM(16, 0)).mz0().Xf0().p1(0.6f).mz0().Xf0().mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ae_02.Vs.jH(this.E8);
        ae_02.Vc();
        return ae_02;
    }
}

