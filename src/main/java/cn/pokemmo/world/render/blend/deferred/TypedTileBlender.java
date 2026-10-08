package cn.pokemmo.world.render.blend.deferred;

import cn.pokemmo.world.render.blend.BaseDeferredTileBlender;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class TypedTileBlender extends BaseDeferredTileBlender {
    public final long Jx;
    public final byte iF;
    public final short Qo0;
    public com3__3 Dd;

    public TypedTileBlender(byte type, short id) {
        super();
        this.Jx = hk0_1.lQ();
        this.iF = type;
        this.Qo0 = id;
    }

    @Override
    public final void gd(ER renderer, U5 context, BJ0 transform, float x, float z, float y) {
        ht_0 table = QI.Py.kN((byte) 10, this.Qo0 == 40 ? 314 : 303, false);
        int frame = (int) ((hk0_1.KG - this.Jx) / 75L);
        frame = Math.max(0, Math.min(5, frame));
        float yOffset = 0.0f;
        float zOffset = 0.015f;
        if (this.iF == 4) {
            yOffset = 0.01f;
            zOffset = 0.1f;
        }

        if (this.Dd != null) {
            LPT6_ image = table.li0(frame).T20().d3();
            this.Dd.bq0.R4(image);
            this.Dd.qq0(false);
            this.Dd.OF0(0.1875f);
            this.Dd.zf0(x, y + 0.05f + yOffset, z + 0.0225f + zOffset);
            this.Dd.DB0(transform.v40, transform.St0);
            renderer.Lh0(this.Dd, context);
            return;
        }

        LPT6_ image = table.li0(frame).T20().d3();
        this.Dd = new com3__3(1, 1, image, false);
        this.Dd.OF0(0.1875f);
        this.Dd.qq0(false);
        this.Dd.zf0(x, y + 0.05f + yOffset, z + 0.0225f + zOffset);
        this.Dd.DB0(transform.v40, transform.St0);
    }

    @Override
    public final boolean qR() {
        return hk0_1.KG - this.Jx > 450L;
    }
}
