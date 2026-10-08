package cn.pokemmo.world.render.blend.deferred;

import cn.pokemmo.world.render.blend.BaseDeferredTileBlender;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class DurationTileBlender extends BaseDeferredTileBlender {
    public p_0 Zd0;
    public com3__3 C2;
    public float ML0;
    public final long O20;
    public final int bp;

    public DurationTileBlender(int duration) {
        super();
        this.O20 = hk0_1.lQ();
        this.bp = duration;
    }

    @Override
    public final void gd(ER renderer, U5 context, BJ0 transform, float x, float y, float z) {
        if (hk0_1.KG - this.O20 < (long) this.bp) {
            return;
        }
        if (this.C2 != null) {
            this.C2.DB0(transform.v40, transform.St0);
            this.ML0 += lg_0.S4.uL;
            this.C2.bq0.R4((LPT6_) this.Zd0.hE0(this.ML0));
            renderer.Lh0(this.C2, context);
            return;
        }
        LPT6_[] frames = fi_0.xL().LPT6((byte) 2, 46);
        this.C2 = com3__3.Pd(frames[0]);
        this.C2.zf0(x, y + 0.05f, z + 0.05f);
        this.C2.OF0(0.012f);
        this.C2.DB0(transform.v40, transform.St0);
        this.C2.qq0(vo_2.z0);
        renderer.Lh0(this.C2, context);
        if (this.Zd0 == null) {
            this.Zd0 = new p_0(0.125f, frames);
            this.Zd0.kK0 = OI0.DC;
        }
    }

    @Override
    public final boolean qR() {
        return this.Zd0 != null && this.Zd0.d40(this.ML0);
    }
}
