package cn.pokemmo.ui.widget.dialog;

import f.*;

public abstract class AbstractMinimizableDialog extends cx_0 {
    public le0_2 Ia;
    public xe_1 oU;
    public final DE0 Hn0;
    public qj_2 w20;
    public final String fK;
    public final String IT;
    public int To0;
    public int gL;
    public int Nx0;

    public AbstractMinimizableDialog(String str) {
        this(str, false);
    }

    public AbstractMinimizableDialog(String str, boolean z) {
        super(z, false);
        this.oU = null;
        this.w20 = null;
        this.To0 = 0;
        this.gL = 0;
        this.Nx0 = 0;
        this.fK = str;
        this.IT = "shared-minimized";
        uf(str);
        if (tw0_0.kz0()) {
            this.Hn0 = new DE0(350, 120);
        } else {
            this.Hn0 = new DE0(212, 40);
        }
        this.Hn0.uf("dialoglayout");
    }

    @Override
    public void K8() {
        lt0();
        this.Ia.lt0();
        super.K8();
    }

    @Override
    public final void Iu() {
        if (!this.Hn0.eE) {
            if (this.A20 + this.Mx > tw0_0.LD0.ew0()) {
                E40(tw0_0.LD0.ew0() - this.Mx, this.SB0);
            }
            if (this.SB0 + this.OB > tw0_0.LD0.Hv0()) {
                E40(this.A20, tw0_0.LD0.Hv0() - this.OB);
            }
        }
        super.Iu();
    }

    public final void Yi0(boolean z, boolean z2) {
        if (z) {
            f00();
            this.To0 = this.A20;
            this.gL = this.SB0;
            this.Nx0 = this.NT;
            ff0(1);
        } else {
            if (this.w20 != null) {
                this.w20.tp0.ug = false;
            }
            if (this.To0 <= tw0_0.LD0.ew0() && this.gL <= tw0_0.LD0.Hv0()) {
                E40(this.To0, this.gL);
            } else {
                E40(tw0_0.LD0.ew0() / 2 - this.Mx / 2, tw0_0.LD0.Hv0() / 2 - this.OB / 2);
            }
            if (this.Nx0 != 0) {
                ff0(this.Nx0);
            }
        }
        if (tw0_0.kz0()) {
            if (!z && this.Ey) {
                Qy0.yI0.VX(this);
            } else {
                Qy0.yI0.tq.sj0(this, true);
            }
        }
        if (this.oU != null) {
            this.oU.Ll(!z);
        }
        this.Hn0.Ll(z);
        this.w20.Ll(z2);
        if (z) {
            u3(this.Ia);
        } else if (this.Ia.K20 == null) {
            F9(fU(), this.Ia);
        }
        COm3();
        if (z) {
            uf(this.IT);
        } else {
            uf(this.fK);
        }
        yI();
    }
}
