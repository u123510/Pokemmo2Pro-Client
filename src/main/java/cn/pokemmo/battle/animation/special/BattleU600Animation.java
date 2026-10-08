/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.special;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.HB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.u60
 */
/**
 * 宝可梦对战特殊事件/状态动画 - BattleU600Animation
 * 原始类: f.u60_0
 */
public class BattleU600Animation
extends MU {
    public BattleU600Animation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1555;
        int n = 1;
        int n2 = 14;
        float f = 0.0f;
        float f2 = 0.78125f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.nM(14, 1)).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1555;
        n = 1;
        n2 = 14;
        f = 433.33334f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        float f3 = 0.25f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_13 = HB.p30(pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.WW(14, f3, f4, f5, color)), this.Xq0(14, 2, 2, 0.0f, 0.192f, -0.30004883f, 0.30004883f));
        f3 = 0.25f;
        f4 = 0.75f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        int n3 = 1554;
        int n4 = 1;
        int n5 = 14;
        float f6 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.WW(14, f3, f4, f5, color)).y80(this.Qh0(151)).xi0(this.i6((byte)2, (short)n3, n4, n5, f6, f2, pF));
        n3 = 151;
        n4 = 0;
        n5 = 9;
        int n6 = 8;
        f2 = 0.4f;
        pw_1 pw_15 = HB.p30(pw_14, this.fE0(-1, n3, n4, n5, n6, f2)).xi0(this.nM(14, 0)).mz0().Xf0().y80(this.Qh0(155)).mz0().Xf0();
        n3 = 1559;
        n4 = 1;
        n5 = 14;
        float f7 = 0.0f;
        f2 = 0.9921875f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n3, n4, n5, f7, f2, pF));
        n3 = 155;
        n4 = 1;
        n5 = 9;
        int n7 = 8;
        f2 = 0.4f;
        pw_1 pw_17 = pw_16.xi0(this.fE0(-1, n3, n4, n5, n7, f2)).TD0().p1(0.6f).Xf0();
        n3 = 155;
        n4 = 0;
        n5 = 9;
        n7 = 8;
        f2 = 0.4f;
        this.E8 = pw_17.xi0(this.fE0(-1, n3, n4, n5, n7, f2)).mz0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }

    @Override
    public final boolean Bv0(boolean bl) {
        return false;
    }
}

