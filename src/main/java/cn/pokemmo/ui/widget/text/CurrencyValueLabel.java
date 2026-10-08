package cn.pokemmo.ui.widget.text;

import f.*;
import java.util.*;

public class CurrencyValueLabel extends BaseLabel implements tr_1 {
    public static CurrencyValueLabel coM8;
    public final gc0_0 ox;
    public OW Kn0;
    public final rp_0 ts;
    public em_1 WI0;
    public CurrencyValueLabel[] Qy;

    public CurrencyValueLabel(gc0_0 gc0_0Var, rp_0 rp_0Var) {
        this.WI0 = null;
        uf("button");
        this.ox = gc0_0Var;
        this.ts = rp_0Var;
        rD0();
        RR(this::package$);
    }

    public final void rD0() {
        OW ow;
        if (this.ox == null) {
            ow = null;
        } else {
            ow = (OW) this.ox.QI.get(this.ts);
        }
        this.Kn0 = ow;
        if (ow == null) {
            SU("-");
        } else {
            SU(ow.cw0(this.ox.Dq0));
        }
    }

    public final void eF() {
        SU(sm0_0.c0(1323));
        this.WI0 = new em_1((f.cw_0)(Object)this);
        coM8 = this;
        lg_0.k.lPT5(this::nf0);
    }

    public final void coM1(OW v1) {
        if (this.K20 == null) {
            ((o3_0) this.ox.Dq0).Jk.we0.remove(this.WI0);
            return;
        }
        this.ox.QI.put(v1.CZ, v1);
        SU(v1.cw0(this.ox.Dq0));
        ((o3_0) this.ox.Dq0).Jk.we0.remove(this.WI0);
        this.WI0 = null;
        coM8 = null;
        CurrencyValueLabel[] cw_0Arr = this.Qy;
        if (cw_0Arr != null) {
            for (int i = 0; i < cw_0Arr.length; i++) {
                CurrencyValueLabel cw_0Var = cw_0Arr[i];
                if (cw_0Var != this) {
                    OW ow = cw_0Var.Kn0;
                    if (ow != null) {
                        OW ow2 = this.Kn0;
                        if (ow.Ik0 == ow2.Ik0 && ow.By == ow2.By && ow.HG0 == ow2.HG0 && ow.Zt0 == ow2.Zt0) {
                            cw_0Var.mp();
                        }
                    }
                }
            }
        }
        dw_2.al(el0_0.B60);
    }

    public final void vG0(CurrencyValueLabel[] v1) {
        this.Qy = v1;
    }

    @Override
    public final void N00(zk0_1 v1) {
        if (this.WI0 != null) {
            mp();
        }
        super.N00(v1);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (this.WI0 != null && E00.ZU(v1.zu)) {
            return true;
        }
        return super.nd0(v1);
    }

    public final void mp() {
        if (this.K20 == null) {
            ((o3_0) this.ox.Dq0).Jk.we0.remove(this.WI0);
            coM8 = null;
            return;
        }
        if (this.ox == null) {
            return;
        }
        this.ox.QI.remove(this.ts);
        SU("-");
        ((o3_0) this.ox.Dq0).Jk.we0.remove(this.WI0);
        this.WI0 = null;
        coM8 = null;
        dw_2.al(el0_0.B60);
    }

    public final void nf0() {
        ((o3_0) this.ox.Dq0).Jk.we0.add(this.WI0);
    }

    public final void package$() {
        CurrencyValueLabel cw_0Var = coM8;
        if (cw_0Var != null) {
            cw_0Var.mp();
            coM8 = null;
            return;
        }
        if (this.WI0 != null) {
            mp();
        } else {
            eF();
        }
    }
}
