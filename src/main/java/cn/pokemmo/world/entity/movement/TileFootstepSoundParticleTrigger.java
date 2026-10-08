package cn.pokemmo.world.entity.movement;

import f.*;

public class TileFootstepSoundParticleTrigger extends I00 {
    public static final C8 W2 = new C8();
    public final int try$;
    public com3__3 pRN;
    public final byte Hg;

    public TileFootstepSoundParticleTrigger(byte b, int i) {
        this.Hg = b;
        this.try$ = i;
    }

    @Override
    public final boolean Xc() {
        return false;
    }

    @Override
    public final boolean xB(LT lt, LT lt2, bi0_1 bi0_1Var, byte b) {
        if (bi0_1Var.vx0() && !tw0_0.LD0.nv()) {
            int i2 = 75;
            if (bi0_1Var.oI0()) {
                i2 = 0;
            } else if (bi0_1Var.uv()) {
                i2 = 35;
            }
            int i4 = 0;
            byte b2 = bi0_1Var.ba0.Y30;
            if (b2 == 1) {
                i4 = 150;
            } else if (b2 == 0) {
                i4 = -300;
            }
            if (bi0_1Var.il0.BQ) {
                i4 += 500;
            }
            int i5 = this.try$;
            if (this.Hg == 2) {
                i5 += c8_0.JD0.YG();
            }
            lt.ZD0(new hm_1(this.Hg, i4, i2, i5));
            if (bi0_1Var.Ou()) {
                tw0_0.RE0.d00(true, (byte) 2, (short) 1658, 0.0f);
            }
        }
        return false;
    }

    @Override
    public final void PI0(LT lt, bi0_1 bi0_1Var, ER er, U5 u5, BJ0 bj0, float f, float f2, float f3) {
        if (lt.lW() || !bi0_1Var.vx0()) {
            return;
        }
        int i1 = this.try$;
        if (this.Hg == 2) {
            i1 += c8_0.JD0.YG();
        }
        LPT6_[] lpt6_Arr = fi_0.xL().LPT6(this.Hg, i1);
        if (this.pRN == null) {
            this.pRN = com3__3.Pd(lpt6_Arr[1]);
        } else {
            this.pRN.bq0.R4(lpt6_Arr[1]);
        }
        W2.x = f;
        W2.y = f2;
        W2.z = f3 + 0.066f;
        W2.na(vo_2.ez.x, vo_2.ez.y, vo_2.ez.z);
        this.pRN.qq0(vo_2.z0);
        if (this.Hg == 2) {
            this.pRN.OF0(0.012f);
            this.pRN.zf0(f, f2, f3 + 0.095f);
        } else {
            this.pRN.OF0(0.014f);
            this.pRN.zf0(f, f2, f3 + 0.176f);
        }
        this.pRN.DB0(bj0.v40, bj0.St0);
        this.pRN.Vg();
        er.Lh0(this.pRN, u5);
    }

    @Override
    public final boolean LI() {
        return false;
    }
}
