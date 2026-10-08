/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import f.MU;
import f.PF;
import f.pw_1;

/*
 * Renamed from f.j9
 */
/**
 * 宝可梦对战特殊技能招式动画 - Custom Move [1035, 1035]
 * 原始类: f.j9_0
 */
public class CustomMove1035Animation
extends MU {
    public CustomMove1035Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        pw_1 pw_12;
        CustomMove1035Animation j9_02 = this;
        CustomMove1035Animation j9_03 = this;
        short s = 1578;
        int n = 0;
        int n2 = 16;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = j9_03.Vz0;
        pw_1 pw_13 = pw_1.xC().xi0(this.Wt(0, 0.4f)).Xf0().y80(this.wn0("1035")).xi0(j9_03.i6((byte)2, s, n, n2, f, f2, pF));
        CustomMove1035Animation j9_04 = this;
        s = 1376;
        n = 0;
        n2 = 16;
        f = 2000.0f;
        f2 = 0.0f;
        pF = j9_04.Vz0;
        this.E8 = pw_12 = pw_13.xi0(j9_04.i6((byte)2, s, n, n2, f, f2, pF)).mz0().p1(1.35f).xi0(this.tP(0.4f));
        pw_12.Ms(this.Vs.wP);
        j9_02.Vs.jH(this.E8);
        j9_02.Vc();
        return j9_02;
    }
}

