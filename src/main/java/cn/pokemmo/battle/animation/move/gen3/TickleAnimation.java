/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.animation.move.gen3;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.A2;
import f.FB;
import f.MU;
import f.PF;
import f.pw_1;
import f.px_1;

/*
 * Renamed from f.l20
 */
/**
 * 宝可梦对战技能招式动画 - 挠痒 (Tickle)
 * 技能编号: 321
 * 原始类: f.l20_0
 */
public class TickleAnimation
extends MU {
    public TickleAnimation(PF pF) {
        super(pF);
    }

    @Override
    public final MU us() {
        short s = 1358;
        int n = 1;
        int n2 = 14;
        float f = 166.66667f;
        float f2 = 0.8984375f;
        PF pF = this.Vz0;
        pw_1 pw_12 = FB.zd0(0.6f).xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1714;
        n = 2;
        n2 = 16;
        f = 750.0f;
        f2 = 0.8984375f;
        pF = this.Vz0;
        pw_1 pw_13 = pw_12.xi0(this.i6((byte)2, s, n, n2, f, f2, pF));
        s = 1376;
        n = 2;
        n2 = 16;
        f = 1500.0f;
        f2 = 0.0f;
        pF = this.Vz0;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 0.75f;
        Color color = px_1.ep0(0);
        pw_1 pw_14 = pw_13.xi0(this.i6((byte)2, s, n, n2, f, f2, pF)).xi0(this.Sv0(2, 1, 1120.0f, 320.0f)).xi0(this.nM(14, 1)).xi0(this.nM(16, 1)).xi0(this.EN(14, 3, 1, 0.016f, 0.064f, 0.60009766f, 0.0f)).xi0(this.WW(14, f3, f4, f5, color)).y80(this.Qh0(491));
        int n3 = 491;
        int n4 = 0;
        int n5 = 9;
        int n6 = 8;
        f2 = 0.4f;
        float f6 = 0.5f;
        float f7 = 0.75f;
        float f8 = 0.0f;
        Color color2 = px_1.ep0(0);
        this.E8 = A2.Kj0(pw_14, this.fE0(-1, n3, n4, n5, n6, f2), 0.4f).xi0(this.WW(14, f6, f7, f8, color2)).mz0().mz0().TD0().p1(0.6f).Xf0().p1(0.6f).xi0(this.EN(16, 2, 2, 0.016f, 0.08f, 1.0f, 0.0f)).mz0().mz0().mz0().Xf0().p1(0.6f).xi0(this.nM(16, 0)).xi0(this.nM(14, 0)).mz0().Xf0().mz0();
        this.E8.Ms(this.Vs.wP);
        this.Vs.jH(this.E8);
        this.Vc();
        return this;
    }
}

