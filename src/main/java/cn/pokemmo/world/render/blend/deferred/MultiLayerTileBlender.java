package cn.pokemmo.world.render.blend.deferred;

import cn.pokemmo.world.render.blend.BaseDeferredTileBlender;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MultiLayerTileBlender extends BaseDeferredTileBlender {
    public final long XY;
    public final int rT;
    public final int a0;
    public final int Z80;
    public int pz0;
    public final byte zY;
    public p_0 SM;
    public com3__3 k3;
    public float g80;

    public MultiLayerTileBlender(byte b1, int i2, int i3, int i4) {
        super();
        this.XY = hk0_1.lQ();
        this.pz0 = 100;
        this.zY = b1;
        this.rT = i2;
        this.a0 = i3;
        this.Z80 = i4;
    }

    @Override
    public final void gd(ER v1, U5 v2, BJ0 v3, float f4, float f5, float f6) {
        if (hk0_1.KG - this.XY < (long) (this.a0 + this.rT)) {
            return;
        }
        com3__3 v7 = this.k3;
        if (v7 != null) {
            byte b = this.zY;
            if (b == 3) {
                v7.ej(v3.St0);
            } else if (b == 2 || b == 4) {
                v7.DB0(v3.v40, v3.St0);
            }
            float f1 = this.g80 + lg_0.S4.uL;
            this.g80 = f1;
            this.k3.Gb0((LPT6_) this.SM.hE0(f1), false);
            v1.Lh0(this.k3, v2);
            return;
        }

        LPT6_[] v1_arr = fi_0.xL().LPT6(this.zY, this.Z80);
        LPT6_ v8 = v1_arr[0];
        com3__3 v9 = new com3__3(32, 32, v8, false);
        this.k3 = v9;
        v9.DB0(v3.v40, v3.St0);
        byte i2 = this.zY;
        if (i2 == 4) {
            this.k3.OF0(0.0125f);
            this.k3.zf0(f4, f5 + 0.24f, f6 + 0.08f);
            this.k3.DB0(v3.v40, v3.St0);
        } else if (i2 == 3) {
            if (this.Z80 == 9) {
                this.k3.OF0(0.00755f);
                this.k3.zf0(f4, f5 + 0.04f, f6 + 0.03f);
                this.k3.ej(v3.St0);
            } else {
                this.k3.OF0(0.0151f);
                this.k3.zf0(f4, f5 + 0.16f, f6 - 0.025f);
                this.k3.ej(v3.St0);
            }
        } else if (i2 == 2) {
            this.k3.zf0(f4, f5 + 0.25f, f6 + 0.075f);
            this.k3.OF0(0.01275f);
        }
        this.k3.qq0(vo_2.z0);
        if (this.SM == null) {
            p_0 p = new p_0(((float) this.pz0) / 1000.0f, v1_arr);
            this.SM = p;
            p.kK0 = OI0.DC;
        }
        float f1 = this.g80 + lg_0.S4.uL;
        this.g80 = f1;
        this.k3.Gb0((LPT6_) this.SM.hE0(f1), false);
    }

    public final boolean qR() {
        p_0 v1 = this.SM;
        if (v1 == null) {
            return false;
        }
        return v1.d40(this.g80);
    }
}
