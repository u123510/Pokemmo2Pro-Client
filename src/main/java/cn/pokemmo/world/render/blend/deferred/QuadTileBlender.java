package cn.pokemmo.world.render.blend.deferred;

import cn.pokemmo.world.render.blend.BaseDeferredTileBlender;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class QuadTileBlender extends BaseDeferredTileBlender {
    public static final C8 DL0 = new C8();
    public final long vg;
    public final int o2;
    public final int D50;
    public final int uc0;
    public p_0 wh;
    public com3__3 Wx0;
    public float zv0;
    public final byte t0;

    public QuadTileBlender(byte b, int i, int i2, int i3) {
        this.vg = hk0_1.lQ();
        this.t0 = b;
        this.o2 = i;
        this.D50 = i2;
        this.uc0 = i3;
    }

    @Override
    public final void gd(ER er, U5 u5, BJ0 bj0, float f, float f2, float f3) {
        if (hk0_1.KG - this.vg < (long) (this.D50 + this.o2)) {
            return;
        }

        if (this.Wx0 != null) {
            DL0.x = f;
            DL0.y = f2 + 0.25f;
            DL0.z = f3 + 0.065f;
            vo_2.ez.na(vo_2.ez.x, vo_2.ez.y, vo_2.ez.z);
            this.Wx0.DB0(DL0, bj0.St0);
            float f4 = this.zv0 + lg_0.S4.uL;
            this.zv0 = f4;
            LPT6_ lpt6_ = (LPT6_) this.wh.hE0(f4);
            this.Wx0.bq0.R4(lpt6_);
            er.Lh0(this.Wx0, u5);
            return;
        }

        LPT6_[] arrlpt6_ = fi_0.xL().LPT6(this.t0, this.uc0);
        this.Wx0 = com3__3.Pd(arrlpt6_[0]);
        this.Wx0.qq0(vo_2.z0);

        if (this.t0 == 2) {
            this.Wx0.OF0(0.012f);
            float y = f2 + 0.25f;
            float z = f3 + 0.065f;
            this.Wx0.zf0(f, y, z);
            DL0.x = f;
            DL0.y = y;
            DL0.z = z;
            vo_2.ez.na(vo_2.ez.x, vo_2.ez.y, vo_2.ez.z);
        } else {
            this.Wx0.OF0(0.014f);
            float y = f2 + 0.25f;
            float z = f3 + 0.143f;
            this.Wx0.zf0(f, y, z);
            DL0.x = f;
            DL0.y = y;
            DL0.z = z;
            vo_2.ez.na(vo_2.ez.x, vo_2.ez.y, vo_2.ez.z);
        }

        this.Wx0.DB0(DL0, bj0.St0);

        LPT6_[] animFrames;
        if (this.o2 > 0) {
            animFrames = new LPT6_[] { arrlpt6_[0], arrlpt6_[1], arrlpt6_[0], arrlpt6_[1] };
        } else {
            animFrames = new LPT6_[] { arrlpt6_[0], arrlpt6_[1], arrlpt6_[0], arrlpt6_[1] };
        }

        if (this.wh == null) {
            p_0 p_0Var = new p_0(0.075f, animFrames);
            this.wh = p_0Var;
            p_0Var.kK0 = OI0.DC;
        }
    }

    public final boolean qR() {
        if (this.wh == null) {
            return false;
        }
        return this.wh.d40(this.zv0);
    }
}
