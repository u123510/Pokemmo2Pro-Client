package cn.pokemmo.world.render.blend.deferred;

import cn.pokemmo.world.render.blend.BaseDeferredTileBlender;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class TimedTileBlender extends BaseDeferredTileBlender {
    public Ou0 zr;
    public float ho0;
    public final long rM;
    public final int Tb0;

    public TimedTileBlender(int timeout) {
        super();
        this.rM = hk0_1.lQ();
        this.Tb0 = timeout;
    }

    @Override
    public final void gd(ER renderer, U5 context, BJ0 ignored, float x, float z, float y) {
        if (hk0_1.KG - this.rM < (long) this.Tb0) {
            return;
        }
        if (this.zr != null) {
            this.ho0 += lg_0.S4.uL;
            this.zr.P30(this.ho0, null);
            renderer.Lh0(this.zr, context);
            return;
        }
        Ou0 base = fi_0.xL().P10;
        this.zr = tq0_0.ip0(base, base);
        this.zr.I0 = true;
        this.zr.ho.Yp0(x, z + 0.05F, y + 0.05F);
        this.zr.ho.w2(0.75F, 0.75F, 0.75F);
        this.zr.sC0(0, false, null);
        renderer.Lh0(this.zr, context);
    }

    @Override
    public final boolean qR() {
        return hk0_1.KG - this.rM > 600L;
    }
}
