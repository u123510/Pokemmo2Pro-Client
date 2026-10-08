package cn.pokemmo.world.render.blend.deferred;

import cn.pokemmo.world.render.blend.BaseDeferredTileBlender;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ModelTileBlender extends BaseDeferredTileBlender {
    public final LT XB;
    public final Ou0 com4;
    public final int b7;
    public final long xn;
    public float oc;

    public ModelTileBlender(LT texture, Ou0 model) {
        super();
        this.xn = hk0_1.lQ();
        this.XB = texture;
        this.com4 = model;
        this.b7 = 100;
        model.TU(0, false);
    }

    @Override
    public final void gd(ER renderer, U5 context, BJ0 transform,
                         float first, float second, float third) {
        if (hk0_1.KG - this.xn < (long) this.b7) {
            return;
        }
        this.com4.ho.Yp0(this.XB.Tz() * 0.25f,
                this.XB.S80() * 0.25f,
                this.XB.HR() * 0.25f);
        this.com4.ho.el0(0.125f, 0.1000000015f, 0.200000003f);
        this.com4.ho.w2(0.75f, 0.75f, 0.75f);
        this.oc += lg_0.S4.uL;
        this.com4.bo0(this.oc);
        renderer.Lh0(this.com4, context);
    }

    @Override
    public final boolean qR() {
        return hk0_1.KG - this.xn > 500L;
    }
}
