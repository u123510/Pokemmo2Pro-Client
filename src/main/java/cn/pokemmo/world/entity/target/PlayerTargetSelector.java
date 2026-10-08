package cn.pokemmo.world.entity.target;

import f.*;

public class PlayerTargetSelector extends EntityTargetSelector {
    public boolean jB;
    public final int p10;
    public final float Kg;
    public final float vj0;
    public final int M0;
    public boolean GX;
    public final float RA;
    public final float Un;
    public final boolean Jc;
    public final C8 bV;
    public final boolean M20;
    public final boolean B2;
    public final int Nv0;
    public boolean kK;
    public final int pC0;
    public boolean Bt;
    public final int aUx;
    public boolean DL0;
    public final int Z60;
    public boolean Db0;
    public final int HN;
    public boolean Ea;
    public final int Xb;
    public boolean Ho;
    public final BJ0 Q0;
    public int GC0;
    public float H1;
    public float QL0;
    public final C8 Bf0;
    public final C8 EW;
    public int By0;

    public PlayerTargetSelector(BJ0 v1) {
        super(new le0_1());
        this.jB = false;
        this.p10 = 2;
        this.Kg = 90.0f;
        this.vj0 = 10.0f;
        this.M0 = 1;
        this.RA = -0.1f;
        this.Un = 10.0f;
        this.Jc = true;
        this.bV = new C8();
        this.M20 = true;
        this.B2 = true;
        this.Nv0 = 51;
        this.pC0 = 47;
        this.aUx = 29;
        this.Z60 = 32;
        this.HN = 46;
        this.Xb = 34;
        this.GC0 = -1;
        this.Bf0 = new C8();
        this.EW = new C8();
        ((le0_1) this.UC0).ea0 = this;
        this.Q0 = v1;
    }

    public final boolean bu0() {
        if (Qy0.yI0.sO) {
            return false;
        }
        return this.jB;
    }

    public final boolean GH0(int i1) {
        if (bu0()) {
            if (i1 == 0) {
                this.GX = true;
            }
            if (i1 == this.Nv0) {
                this.kK = true;
            } else if (i1 == this.pC0) {
                this.Bt = true;
            } else if (i1 == this.aUx) {
                this.DL0 = true;
            } else if (i1 == this.Z60) {
                this.Db0 = true;
            } else if (i1 == this.HN) {
                this.Ea = true;
            } else if (i1 == this.Xb) {
                this.Ho = true;
            }
        }
        return false;
    }

    @Override
    public final boolean kh(int i1, int i2, int i3, int i4) {
        if (!bu0()) {
            return false;
        }
        this.By0 &= ~(1 << i3);
        LW.eh(this.By0);
        this.GC0 = -1;
        return super.jo0(i3, i4, (float) i1, (float) i2) || this.GX;
    }

    @Override
    public final boolean R8(int i1, int i2, int i3, int i4) {
        if (!bu0()) {
            return false;
        }
        if (tt0_0.C7()) {
            tt0_0 tt = tt0_0.j0;
            if (i1 < tt.d6.Mx || i1 > tt.Z20.A20 || i2 < tt.Dn0()) {
                return false;
            }
        }
        this.By0 |= (1 << i3);
        if (!LW.eh(this.By0)) {
            this.GC0 = -1;
        } else if (this.GC0 < 0) {
            this.GC0 = i4;
        }
        this.H1 = (float) i1;
        this.QL0 = (float) i2;
        super.Qh(i3, i4, this.H1, this.QL0);
        return false;
    }

    @Override
    public final boolean Ao0(int i1, int i2, int i3) {
        if (!bu0()) {
            return false;
        }
        if (tt0_0.C7()) {
            tt0_0 tt = tt0_0.j0;
            if (i1 < tt.d6.Mx || i1 > tt.Z20.A20 || i2 < tt.Dn0()) {
                return false;
            }
        }
        boolean handled = super.A(i3, (float) i1, (float) i2);
        if (handled || this.GC0 < 0) {
            return handled;
        }
        float dx = ((float) i1 - this.H1) / (float) lg_0.S4.Kr0();
        float dy = (this.QL0 - (float) i2) / (float) lg_0.S4.sD0();
        this.H1 = (float) i1;
        this.QL0 = (float) i2;
        int mode = this.GC0;
        if (mode == this.p10) {
            this.EW.np(this.Q0.v40);
            C8 jd = this.Q0.jd0;
            this.EW.na(jd.x, jd.y, jd.z);
            this.Bf0.np(this.Q0.jd0).Xv0(this.Q0.St0);
            this.Bf0.y = 0.0f;
            this.Q0.Aj(this.EW, this.Bf0.KM(), dy * this.Kg);
            this.Q0.Aj(this.EW, C8.Y, dx * -this.Kg);
        } else if (mode == 0) {
            this.Q0.Xw(this.Bf0.np(this.Q0.jd0).Xv0(this.Q0.St0).KM().Fg0(-dx * this.vj0));
            this.EW.x = 0.0f;
            this.EW.y = 0.0f;
            this.EW.z = dy * this.vj0;
            this.Q0.Xw(this.EW);
            if (this.M20) {
                C8 bV = this.bV;
                C8 bf0 = this.Bf0;
                bV.na(bf0.x, bf0.y, bf0.z);
                C8 ew = this.EW;
                bV.na(ew.x, ew.y, ew.z);
            }
        } else if (mode == this.M0) {
            this.Q0.Xw(this.Bf0.np(this.Q0.jd0).Fg0(dy * this.vj0));
            if (this.B2) {
                C8 bV = this.bV;
                C8 bf0 = this.Bf0;
                bV.na(bf0.x, bf0.y, bf0.z);
            }
        }
        if (this.Jc) {
            this.Q0.ye(true);
        }
        return true;
    }

    public final boolean pH0(int i1) {
        if (bu0()) {
            if (i1 == 0) {
                this.GX = false;
                this.GC0 = -1;
            }
            if (i1 == this.Nv0) {
                this.kK = false;
            } else if (i1 == this.pC0) {
                this.Bt = false;
            } else if (i1 == this.aUx) {
                this.DL0 = false;
            } else if (i1 == this.Z60) {
                this.Db0 = false;
            } else if (i1 == this.HN) {
                this.Ea = false;
            } else if (i1 == this.Xb) {
                this.Ho = false;
            }
        }
        return false;
    }

    @Override
    public final boolean gl0(float f1, float f2) {
        if (!bu0()) {
            return false;
        }
        float f = f2 * this.RA * this.vj0;
        if (!bu0()) {
            return false;
        }
        this.Q0.Xw(this.Bf0.np(this.Q0.jd0).Fg0(f));
        if (this.Jc) {
            this.Q0.ye(true);
        }
        return true;
    }
}
