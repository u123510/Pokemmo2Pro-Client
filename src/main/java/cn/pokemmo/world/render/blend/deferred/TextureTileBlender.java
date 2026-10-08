package cn.pokemmo.world.render.blend.deferred;

import cn.pokemmo.world.render.blend.BaseDeferredTileBlender;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.BJ0;
import f.ER;
import f.LT;
import f.Ou0;
import f.U5;
import f.fi_0;
import f.hk0_1;
import f.lg_0;
import f.mb_2;


public class TextureTileBlender
extends BaseDeferredTileBlender {
    public final LT Vx;
    public final Ou0 l0;
    public final long BJ0 = hk0_1.lQ();
    public float Fo0;

    public TextureTileBlender(LT lT) {
        this.Vx = lT;
        this.l0 = fi_0.xL().hI();
        this.l0.TU(0, false);
    }

    @Override
    public final void gd(ER eR, U5 u5, BJ0 bJ0, float f, float f2, float f3) {
        if (hk0_1.KG - this.BJ0 < (long)0) {
            return;
        }
        TextureTileBlender hc0_02 = this;
        TextureTileBlender hc0_03 = this;
        float f4 = hc0_03.Vx.S80() * 0.25f;
        hc0_02.l0.ho.Yp0((float)this.Vx.Tz() * 0.25f, f4, (float)hc0_03.Vx.HR() * 0.25f);
        hc0_02.l0.ho.el0(0.125f, 0.1f, 0.2f);
        hc0_02.l0.ho.w2(0.75f, 1.25f, 1.25f);
        hc0_02.Fo0 = f4 = hc0_02.Fo0 + lg_0.S4.uL;
        hc0_02.l0.P30(f4, null);
        eR.Lh0(hc0_02.l0, u5);
    }

    @Override
    public final boolean qR() {
        return hk0_1.KG - this.BJ0 > 500L;
    }
}
