package cn.pokemmo.ui.widget.slider;

import f.*;

import f.org.json.*;

public class SliderDragInputListener extends vc_0 {
    public float PK;
    public final U10 qr;

    public SliderDragInputListener(U10 u10) {
        this.qr = u10;
    }

    public final boolean DP(ni_1 ni_1Var, float f, float f2, int i, int i2) {
        U10 u10 = this.qr;
        if (u10.FD != -1) {
            return false;
        }
        if (i == 0 && i2 != 0) {
            return false;
        }
        ir_0 ir_0Var = u10.uP;
        if (ir_0Var != null) {
            ir_0Var.Cl(u10);
        }
        if (!this.qr.FH) {
            this.qr.Jo();
        }
        if (this.qr.aI == 0.0F) {
            return false;
        }
        if (this.qr.ht && this.qr.bc0 && this.qr.vQ.Ur0(f, f2)) {
            ni_1Var.s10 = true;
            this.qr.Jo();
            if (this.qr.wv0.Ur0(f, f2)) {
                this.qr.IE0.x = f;
                this.qr.IE0.y = f2;
                this.PK = this.qr.wv0.j80;
                this.qr.A70 = true;
                this.qr.FD = i;
                return true;
            }
            float f3 = f >= this.qr.wv0.j80 ? 1.0F : -1.0F;
            this.qr.t60 = LW.r1(this.qr.t60 + (this.qr.vJ.IA * f3), 0.0F, this.qr.mI);
            return true;
        }
        if (this.qr.ht && this.qr.xU && this.qr.Eg.Ur0(f, f2)) {
            ni_1Var.s10 = true;
            this.qr.Jo();
            if (this.qr.Z5.Ur0(f, f2)) {
                this.qr.IE0.x = f;
                this.qr.IE0.y = f2;
                this.PK = this.qr.Z5.Wm0;
                this.qr.qQ = true;
                this.qr.FD = i;
                return true;
            }
            float f4 = f2 >= this.qr.Z5.Wm0 ? -1.0F : 1.0F;
            this.qr.gQ = LW.r1(this.qr.gQ + (this.qr.vJ.Eu0 * f4), 0.0F, this.qr.lp0);
            return true;
        }
        return false;
    }

    public final void static$(ni_1 ni_1Var, float f, float f2, int i, int i2) {
        if (i != this.qr.FD) {
            return;
        }
        this.qr.FD = -1;
        this.qr.A70 = false;
        this.qr.qQ = false;
        this.qr.D20.kJ0.rI0.ky0();
        this.qr.D20.kJ0.t8 = true;
    }

    public final void Ri0(ni_1 ni_1Var, float f, float f2, int i) {
        if (i != this.qr.FD) {
            return;
        }
        if (this.qr.A70) {
            float f3 = this.PK + (f - this.qr.IE0.x);
            this.PK = f3;
            float max = Math.max(this.qr.vQ.j80, f3);
            float min = Math.min((this.qr.vQ.j80 + this.qr.vQ.IA) - this.qr.wv0.IA, max);
            float f4 = this.qr.vQ.IA - this.qr.wv0.IA;
            if (f4 != 0.0F) {
                this.qr.t60 = LW.r1((min - this.qr.vQ.j80) / f4, 0.0F, 1.0F) * this.qr.mI;
            }
            this.qr.IE0.x = f;
            this.qr.IE0.y = f2;
        } else if (this.qr.qQ) {
            float f5 = this.PK + (f2 - this.qr.IE0.y);
            this.PK = f5;
            float max2 = Math.max(this.qr.Eg.Wm0, f5);
            float min2 = Math.min((this.qr.Eg.Wm0 + this.qr.Eg.Eu0) - this.qr.Z5.Eu0, max2);
            float f6 = this.qr.Eg.Eu0 - this.qr.Z5.Eu0;
            if (f6 != 0.0F) {
                this.qr.gQ = LW.r1(1.0F - ((min2 - this.qr.Eg.Wm0) / f6), 0.0F, 1.0F) * this.qr.lp0;
            }
            this.qr.IE0.x = f;
            this.qr.IE0.y = f2;
        }
    }

    public final void BW() {
        if (!this.qr.FH) {
            this.qr.Jo();
        }
    }
}
