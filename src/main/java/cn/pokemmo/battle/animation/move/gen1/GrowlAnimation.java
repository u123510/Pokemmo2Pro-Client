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
 * Renamed from f.ek
 */
/**
 * 宝可梦对战技能招式动画 - 叫声 (Growl)
 * 技能编号: 45
 * 原始类: f.ek_2
 */
public class GrowlAnimation
extends MU {
    public GrowlAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        GrowlAnimation ek_22 = this;
        int n = 0;
        int n2 = 9;
        int n3 = 8;
        float f = 0.5f;
        pw_1 pw_13 = pw_1.xC().Xf0().xi0(this.Uv(true, 0.0f)).xi0(this.Uv(false, 233.33333f)).xi0(this.Wt(0, 0.4f)).mz0().Xf0().y80(this.Qh0(206)).xi0(this.fE0(-1, 206, n, n2, n3, f));
        n = 1;
        n2 = 9;
        n3 = 8;
        f = 0.5f;
        this.E8 = pw_12 = HB.p30(HB.p30(pw_13, this.fE0(-1, 206, n, n2, n3, f)).xi0(this.tP(0.25f)).xi0(this.nM(16, 1)), this.EN(16, 2, 4, 0.016f, 0.032f, 0.30004883f, 0.0f)).xi0(this.nM(16, 0)).mz0().Xf0().mz0().Xf0().mz0();
        pw_12.Ms(this.Vs.wP);
        ek_22.Vs.jH(this.E8);
        ek_22.Vc();
        return ek_22;
    }
}

