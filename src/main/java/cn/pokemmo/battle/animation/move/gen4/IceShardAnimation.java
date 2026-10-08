/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen4;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.MU;
import f.PF;
import f.Zw0;
import f.pk_1;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.Hp
 */
/**
 * 宝可梦对战技能招式动画 - 冰砾 (IceShard)
 * 技能编号: 420
 * 原始类: f.hp_0
 */
public class IceShardAnimation
extends MU {
    public IceShardAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        int n = 1440;
        int n2 = 2;
        int n3 = 14;
        float f = 0.0f;
        float f2 = 0.9375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = pw_1.xC().Xf0().xi0(this.Ue0(4, 0, 0.0f, 0.8125f, 0.075f)).y80(this.Qh0(595)).xi0(this.Wt(0, 0.4f)).y80(this.E2(18, true)).mz0().Xf0().xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1488;
        n2 = 2;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1488;
        n2 = 2;
        n3 = 14;
        f = 1333.3334f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1449;
        n2 = 1;
        n3 = 14;
        f = 666.6667f;
        f2 = 0.9375f;
        pF = this.Vz0;
        pw_1 pw_15 = pw_14.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1945;
        n2 = 0;
        n3 = 14;
        f = 1000.0f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_16 = pw_15.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1521;
        n2 = 1;
        n3 = 16;
        f = 2083.3333f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_17 = pw_16.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 1549;
        n2 = 2;
        n3 = 16;
        f = 2333.3333f;
        f2 = 0.78125f;
        pF = this.Vz0;
        pw_1 pw_18 = pw_17.xi0(this.i6((byte)2, (short)n, n2, n3, f, f2, pF));
        n = 595;
        n2 = 1;
        n3 = 9;
        int n4 = 8;
        f2 = 0.5f;
        pw_1 pw_19 = pw_18.xi0(this.fE0(-1, n, n2, n3, n4, f2)).xi0(this.dA0(595, 2, 9, 11, 0.5f, 0.0f));
        n = 595;
        n2 = 3;
        n3 = 9;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_110 = A2.Kj0(pw_19, this.fE0(-1, n, n2, n3, n4, f2), 1.8f).xi0(this.Wt(1, 0.2f)).mz0().mz0().TD0().p1(1.88f).Xf0();
        n = 595;
        n2 = 0;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        pw_1 pw_111 = pw_110.xi0(this.fE0(-1, n, n2, n3, n4, f2));
        n = 595;
        n2 = 4;
        n3 = 11;
        n4 = 8;
        f2 = 0.5f;
        float f3 = 0.75f;
        float f4 = 0.0f;
        float f5 = 0.8125f;
        Color color = px_1.ep0(Short.MAX_VALUE);
        pw_1 pw_112 = pk_1.el(pw_111.xi0(this.fE0(-1, n, n2, n3, n4, f2)), this.WW(16, f3, f4, f5, color));
        f3 = 0.75f;
        f4 = 0.8125f;
        f5 = 0.0f;
        color = px_1.ep0(Short.MAX_VALUE);
        this.E8 = Zw0.H(pw_112.xi0(this.WW(16, f3, f4, f5, color)).xi0(this.tP(0.25f)).y80(this.E2(18, false)), this.Ue0(4, 0, 0.8125f, 0.0f, 0.075f));
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

