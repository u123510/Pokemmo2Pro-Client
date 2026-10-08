/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.map.chunk;

import f.*;

import f.Ll0;
import f.XF0;
import f.ab0_2;
import f.bm_1;
import f.lpt6__5;
import f.w6;

/*
 * Renamed from f.zB
 */
public class MapChunkTileMatrix
extends w6
implements bm_1 {
    public final short BJ0;
    public final short Vf;
    public final Ll0[][][] pH0;

    public MapChunkTileMatrix(short s, short s2, XF0 xF0, w6 w62) {
        super(w62);
        this.pH0 = new Ll0[this.r4.length][this.qB0][this.N70];
        for (byte by = 0; by < this.r4.length; by = (byte)((byte)(by + 1))) {
            for (short s3 = 0; s3 < this.qB0; s3 = (short)((short)(s3 + 1))) {
                for (short s4 = 0; s4 < this.N70; s4 = (short)(s4 + 1)) {
                    lpt6__5 lpt6__53 = new lpt6__5(xF0, (zb_0) this, s3, s4, by);
                    this.pH0[by][s3][s4] = lpt6__53;
                }
            }
        }
        this.BJ0 = (short)(s * this.qB0);
        this.Vf = (short)(s2 * this.N70);
        if (this.sK0() == 337) {
            this.n5((byte)0, (short)11, (short)25).ae0(1.0f);
            this.n5((byte)0, (short)11, (short)26).ae0(0.5f);
        }
        if (this.sK0() == 392) {
            this.n5((byte)0, (short)27, (short)20).ae0(1.0f);
            this.n5((byte)0, (short)27, (short)21).ae0(0.5f);
        }
        if (this.sK0() == 2) {
            this.n5((byte)0, (short)13, (short)27).ae0(1.0f);
            this.n5((byte)0, (short)13, (short)28).ae0(0.5f);
        }
        if (this.sK0() == 281) {
            this.n5((byte)0, (short)13, (short)11).ae0(1.0f);
            this.n5((byte)1, (short)13, (short)11).ae0(1.0f);
            this.n5((byte)0, (short)13, (short)12).ae0(0.5f);
            this.n5((byte)1, (short)13, (short)12).ae0(0.5f);
        }
        if (this.sK0() == 95) {
            this.n5((byte)0, (short)11, (short)31).ae0(1.0f);
        }
        if (this.sK0() == 98) {
            this.n5((byte)0, (short)11, (short)0).ae0(0.5f);
        }
        if (this.sK0() == 361) {
            this.n5((byte)0, (short)6, (short)3).ae0(1.0f);
            this.n5((byte)0, (short)6, (short)4).ae0(0.5f);
        }
        if (this.sK0() == 7) {
            this.n5((byte)0, (short)29, (short)15).ae0(1.0f);
            this.n5((byte)0, (short)29, (short)16).ae0(0.5f);
        }
        if (this.sK0() == 26) {
            this.n5((byte)0, (short)9, (short)10).ae0(1.0f);
            this.n5((byte)1, (short)9, (short)10).ae0(1.0f);
            this.n5((byte)0, (short)9, (short)11).ae0(0.5f);
            this.n5((byte)1, (short)9, (short)11).ae0(0.5f);
        }
        if (this.sK0() == 422) {
            this.n5((byte)0, (short)20, (short)24).ae0(1.0f);
            this.n5((byte)0, (short)20, (short)25).ae0(0.5f);
        }
        if (this.sK0() == 351) {
            this.n5((byte)0, (short)12, (short)4).ae0(1.0f);
            this.n5((byte)0, (short)12, (short)5).ae0(0.5f);
        }
        if (this.sK0() == 32) {
            this.n5((byte)0, (short)30, (short)25).ae0(1.0f);
            this.n5((byte)0, (short)30, (short)26).ae0(0.5f);
        }
        if (this.sK0() == 451) {
            this.n5((byte)0, (short)7, (short)30).ae0(1.0f);
            this.n5((byte)0, (short)7, (short)31).ae0(0.5f);
        }
    }

    @Override
    public final Ll0 n5(byte by, short s, short s2) {
        Ll0[][][] ll0Array = this.pH0;
        if (this.pH0 != null) {
            if (s >= 0 && s2 >= 0 && by < ll0Array.length && s < this.qB0 && s2 < this.N70) {
                return ll0Array[by][s][s2];
            }
            return null;
        }
        throw new RuntimeException("Not properly init");
    }

    @Override
    public final short OS() {
        return this.BJ0;
    }

    @Override
    public final short Yl0() {
        return this.Vf;
    }

    @Override
    public final ab0_2 wj0() {
        return this;
    }
}

