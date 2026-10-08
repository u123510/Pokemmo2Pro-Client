package cn.pokemmo.world.entity.movement;

import f.*;

public class EntityLinearMovementTracker extends vc_0 {
    public final float cc0;
    public float v80;
    public float Xl0;
    public int XJ;
    public final int HV;
    public boolean Si0;
    public boolean dt0;
    public long com1;

    public EntityLinearMovementTracker() {
        super();
        this.cc0 = 14.0F;
        this.v80 = -1.0F;
        this.Xl0 = -1.0F;
        this.XJ = -1;
        this.HV = 0;
    }

    public EntityLinearMovementTracker(int v1) {
        super();
        this.cc0 = 14.0F;
        this.v80 = -1.0F;
        this.Xl0 = -1.0F;
        this.XJ = -1;
        this.HV = v1;
    }

    @Override
    public final boolean DP(ni_1 v1, float f2, float f3, int i4, int i5) {
        if (this.Si0) {
            return false;
        }
        if (i4 == 0 && this.HV != -1 && i5 != this.HV) {
            return false;
        }
        this.Si0 = true;
        this.XJ = i4;
        this.v80 = f2;
        this.Xl0 = f3;
        this.com1 = System.currentTimeMillis() + (long)100.0F;
        return true;
    }

    @Override
    public final void Ri0(ni_1 v1, float f2, float f3, int i4) {
        if (i4 != this.XJ) {
            return;
        }
        this.Si0 = this.aK0(v1.vB0, f2, f3);
        if (!this.Si0) {
            this.v80 = -1.0F;
            this.Xl0 = -1.0F;
        }
    }

    @Override
    public final void static$(ni_1 v1, float f2, float f3, int i4, int i5) {
        if (i4 != this.XJ) {
            return;
        }
        boolean hit = this.aK0(v1.vB0, f2, f3);
        if (hit && i4 == 0 && this.HV != -1 && i5 != this.HV) {
            hit = false;
        }
        if (hit) {
            this.kc();
        }
        this.Si0 = false;
        this.XJ = -1;
    }

    @Override
    public final void GI(int i1) {
        if (i1 == -1) {
            this.dt0 = true;
        }
    }

    @Override
    public final void IF0(int i1) {
        if (i1 == -1) {
            this.dt0 = false;
        }
    }

    public void kc() {
    }

    public final boolean aK0(te0_0 target, float f2, float f3) {
        te0_0 current = target.nX(f2, f3, true);
        while (current != null) {
            if (current == target) {
                return true;
            }
            current = current.xO;
        }
        if (this.v80 == -1.0F && this.Xl0 == -1.0F) {
            return false;
        }
        return Math.abs(f2 - this.v80) < this.cc0 && Math.abs(f3 - this.Xl0) < this.cc0;
    }
}
