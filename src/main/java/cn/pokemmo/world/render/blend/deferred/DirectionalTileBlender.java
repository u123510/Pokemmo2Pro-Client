package cn.pokemmo.world.render.blend.deferred;

import cn.pokemmo.world.render.blend.BaseDeferredTileBlender;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class DirectionalTileBlender extends BaseDeferredTileBlender {
    public final long vM;
    public final cy0_0 ii;
    public final byte zN;
    public final byte N30;
    public final boolean je0;
    public com3__3 B8;

    public DirectionalTileBlender(cy0_0 cy0_0Var, byte b, byte b2, boolean z) {
        super();
        this.vM = hk0_1.lQ();
        this.ii = cy0_0Var;
        this.zN = b;
        this.N30 = b2;
        this.je0 = z;
    }

    @Override
    public final void gd(ER er, U5 u5, BJ0 bj0, float f, float f2, float f3) {
        int i7 = 19;
        switch (CB.ye[this.ii.Cu]) {
            case 1:
                i7 = this.je0 ? 23 : 19;
                break;
            case 2:
                i7 = 33;
                break;
            case 3:
                i7 = this.je0 ? 39 : 29;
                break;
            default:
                break;
        }
        if (!this.je0 && this.ii != cy0_0.Vr0) {
            i7 += this.zN;
            if (this.B8 != null) {
                long diff = hk0_1.KG - this.vM;
                if (diff > 500L) {
                    float alpha = ((1000.0f - (float) (diff - 500L)) / 1000.0f) * 1.0f;
                    this.B8.CQ.v50.set(1.0f, 1.0f, 1.0f, alpha);
                }
                this.B8.qq0(vo_2.z0);
                this.B8.DB0(bj0.v40, bj0.St0);
                er.Lh0(this.B8, u5);
                return;
            }
            com3__3 com3__3Var = com3__3.Pd(fi_0.xL().LPT6((byte) 2, i7)[0]);
            this.B8 = com3__3Var;
            com3__3Var.OF0(0.01275f);
            this.B8.qq0(vo_2.z0);
            this.B8.zf0(f, f2 + 0.06f, f3 + 0.025f);
            this.B8.DB0(bj0.v40, bj0.St0);
            er.Lh0(this.B8, u5);
            return;
        }
        int i8 = 0;
        byte b1 = this.N30;
        byte b2 = this.zN;
        if (b1 == b2) {
            if (b2 != 1 && b2 != 0) {
                i8 = 1;
            }
        } else {
            switch (b1) {
                case 0:
                    if (b2 == 3) {
                        i8 = 4;
                    } else if (b2 == 2) {
                        i8 = 5;
                    }
                    break;
                case 1:
                    if (b2 == 3) {
                        i8 = 2;
                    } else if (b2 == 2) {
                        i8 = 3;
                    }
                    break;
                case 2:
                    if (b2 == 1) {
                        i8 = 4;
                    } else if (b2 == 0) {
                        i8 = 2;
                    } else if (b2 == 3) {
                        i8 = 1;
                    }
                    break;
                case 3:
                    if (b2 == 1) {
                        i8 = 5;
                    } else if (b2 == 0) {
                        i8 = 3;
                    } else if (b2 == 2) {
                        i8 = 1;
                    }
                    break;
                default:
                    break;
            }
        }
        i7 += i8;
        if (this.B8 != null) {
            this.B8.qq0(vo_2.z0);
            this.B8.DB0(bj0.v40, bj0.St0);
            float alpha2 = ((750.0f - (float) (hk0_1.KG - this.vM)) / 750.0f) * 1.0f;
            this.B8.CQ.v50.set(1.0f, 1.0f, 1.0f, alpha2);
            er.Lh0(this.B8, u5);
            return;
        }
        LPT6_ lpt6_ = fi_0.xL().LPT6((byte) 2, i7)[0];
        com3__3 com3__3Var2 = new com3__3(1, 1, lpt6_, false);
        this.B8 = com3__3Var2;
        com3__3Var2.OF0(0.25f);
        this.B8.qq0(vo_2.z0);
        this.B8.zf0(f, f2 + 0.05f, f3 + 0.0225f);
        this.B8.DB0(bj0.v40, bj0.St0);
    }

    @Override
    public final boolean qR() {
        if (!this.je0 && this.ii != cy0_0.Vr0) {
            return hk0_1.KG - this.vM > 1500L;
        }
        return hk0_1.KG - this.vM > 750L;
    }
}
