package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class LongGrassTileBehavior extends BaseTileBehavior {
    public final boolean AE;
    public final float vu;
    public com3__3 MO;
    public final boolean yI;

    public LongGrassTileBehavior(boolean AE, float vu, boolean yI) {
        super();
        this.AE = AE;
        this.vu = vu;
        this.yI = yI;
    }

    @Override
    public final boolean aH(LT v1, bi0_1 v2, byte i3, byte i4) {
        if (v2.oI0()) {
            return true;
        }
        return (Object) this instanceof xm_2;
    }

    @Override
    public final boolean xB(LT v1, LT v2, bi0_1 v3, byte i4) {
        if (this.yI) {
            int i2 = 75;
            if (v3.oI0()) {
                i2 = 0;
            } else if (v3.uv()) {
                i2 = 35;
            }
            byte dummy1 = v3.ba0.Y30;
            boolean dummy2 = v3.il0.BQ;
            if (v3.vx0() && !tw0_0.LD0.nv()) {
                int i4_ = 3;
                int i5 = this.AE ? 600 : 50;
                fz_1 fz = new fz_1((byte) i4_, i5, i2, 9);
                if (v3.ba0.Y30 == 0) {
                    i2 = 35;
                } else {
                    i2 = 50;
                }
                fz.pz0 = i2;
                v1.ZD0(fz);
                if (v3.Ou()) {
                    tw0_0.RE0.d00(true, (byte) 2, (short) 1658, 0.0f);
                }
            }
        }
        return false;
    }

    @Override
    public final void PI0(LT v1, bi0_1 v2, ER v3, U5 v4, BJ0 v5, float f6, float f7, float f8) {
        if (this.yI && !v1.lW() && v2.vx0()) {
            LPT6_[] v1_arr = fi_0.xL().LPT6((byte) 3, 9);
            if (this.MO == null) {
                this.MO = com3__3.Pd(v1_arr[1]);
            }
            this.MO.Gb0(v1_arr[1], false);
            this.MO.qq0(vo_2.z0);
            this.MO.OF0(0.0151f);
            this.MO.zf0(f6, f7 - 0.025f, f8 + 0.08f);
            this.MO.ej(v5.St0);
            this.MO.Vg();
            v3.Lh0(this.MO, v4);
        }
    }

    @Override
    public final boolean fu(LT v1, bi0_1 v2, byte i3) {
        return v2.il0.Ba > 0;
    }

    @Override
    public final float Wk() {
        return this.vu;
    }

    @Override
    public final int zd0(boolean i1) {
        if (this.AE) {
            return 800;
        }
        return 0;
    }
}
