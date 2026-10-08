package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class RustlingGrassTileBehavior extends BaseTileBehavior {
    public final int Sn0;
    public final byte Rq0;
    public final boolean W00;
    public final boolean vC;
    public com3__3 vB;

    public RustlingGrassTileBehavior(byte b, int i, boolean z) {
        this(b, i, z, true);
    }

    public RustlingGrassTileBehavior(byte b, int i, boolean z, boolean z2) {
        this.Rq0 = b;
        this.Sn0 = i;
        this.W00 = z;
        this.vC = z2;
    }

    public final boolean xB(LT lt, LT lt2, bi0_1 bi0_1Var, byte b) {
        int i = 75;
        if (bi0_1Var.oI0()) {
            i = 0;
        } else if (bi0_1Var.uv()) {
            i = 35;
        }
        int i2 = 0;
        byte b2 = bi0_1Var.ba0.Y30;
        if (b2 == 1) {
            i2 = 150;
        } else if (b2 == 0) {
            i2 = -300;
        }
        if (bi0_1Var.il0.BQ) {
            i2 += 500;
        }
        int i3 = this.Sn0;
        if (this.vC && this.Rq0 == 2) {
            c8_0 c8_0Var = c8_0.JD0;
            i3 += c8_0Var.YG();
            if (this.W00 && c8_0Var.YG() == 3) {
                i3++;
            }
        }
        if (bi0_1Var.vx0() && !tw0_0.LD0.nv()) {
            fz_1 fz_1Var = new fz_1(this.Rq0, i2, i, i3);
            int i4 = bi0_1Var.ba0.Y30 == 0 ? 50 : 75;
            fz_1Var.pz0 = i4;
            lt.ZD0(fz_1Var);
            if (bi0_1Var.Ou()) {
                tw0_0.RE0.d00(true, (byte) 2, (short) 1658, 0.0F);
            }
        }
        return false;
    }

    public final void PI0(LT lt, bi0_1 bi0_1Var, ER er, U5 u5, BJ0 bj0, float f, float f2, float f3) {
        if (lt.lW() || !bi0_1Var.vx0()) {
            return;
        }
        int i = this.Sn0;
        if (this.vC && this.Rq0 == 2) {
            c8_0 c8_0Var = c8_0.JD0;
            i += c8_0Var.YG();
            if (this.W00 && c8_0Var.YG() == 3) {
                i++;
            }
        } else if (this.Rq0 == 3 && bi0_1Var.ki0() == 87) {
            return;
        }
        LPT6_[] lpt6_Arr = fi_0.xL().LPT6(this.Rq0, i);
        if (this.vB == null) {
            this.vB = com3__3.Pd(lpt6_Arr[3]);
        }
        this.vB.Gb0(lpt6_Arr[3], false);
        this.vB.qq0(vo_2.z0);
        byte b = this.Rq0;
        if (b == 2) {
            this.vB.OF0(0.0127499998F);
            this.vB.zf0(f, f2 + 0.0250000004F, f3 + 0.125F);
            this.vB.DB0(bj0.v40, bj0.St0);
        } else if (b == 4) {
            this.vB.OF0(0.0125000002F);
            this.vB.zf0(f, f2, f3 + 0.0500000007F);
            this.vB.DB0(bj0.v40, bj0.St0);
        } else {
            this.vB.OF0(0.0151000004F);
            this.vB.zf0(f, f2 - 0.0649999976F, f3 + 0.0250000004F);
            this.vB.ej(bj0.St0);
        }
        this.vB.Vg();
        er.Lh0(this.vB, u5);
    }
}
