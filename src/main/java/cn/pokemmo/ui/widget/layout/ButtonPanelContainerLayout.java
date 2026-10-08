package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class ButtonPanelContainerLayout extends BaseLayoutBox {
    public final int XA0;
    public final int yr;
    public final yi0_0 mS;
    public final yi0_0 oe;
    public final yi0_0 Nm0;

    public ButtonPanelContainerLayout() {
        super();
        uf("hud-panel");
        if (dw_2.U8) {
            uf("hud-panel-small");
            this.XA0 = 160;
            this.yr = 34;
        } else {
            this.XA0 = 630;
            this.yr = 42;
        }
        oY(this.XA0, this.yr);

        yi0_0 v1 = new yi0_0(dw_2.Vr0, sm0_0.c0(1100), (short) 5436);
        yi0_0 v2 = new yi0_0(dw_2.GL, sm0_0.c0(1), (short) 5431);
        yi0_0 v3 = new yi0_0(dw_2.Al0, sm0_0.c0(1101), (short) 5432);
        yi0_0 v4 = new yi0_0(dw_2.fs0, sm0_0.c0(1102), (short) 5626);
        this.mS = v4;
        yi0_0 v5 = new yi0_0(dw_2.fK, sm0_0.c0(1126), (short) 5437);
        this.oe = v5;
        yi0_0 v6 = new yi0_0(dw_2.DY, sm0_0.c0(8034), (short) 5471);
        v6.Xr0(sm0_0.c0(8000));
        yi0_0 v7 = new yi0_0(0, sm0_0.c0(2353), (short) 5452);
        yi0_0 v8 = new yi0_0(0, sm0_0.c0(1161), (short) 5001);
        this.Nm0 = v8;
        v3.RR(new Gs0((f.lc_2)(Object)this));
        yi0_0 v9 = new yi0_0(-1, sm0_0.c0(1116), (short) 5459);
        v9.RR(new K80((f.lc_2)(Object)this));
        v4.RR(new ph0_0((f.lc_2)(Object)this));
        v6.RR(new aj0_1((f.lc_2)(Object)this));
        v7.RR(new RC((f.lc_2)(Object)this));
        v2.RR(new bh_0((f.lc_2)(Object)this));
        v5.RR(new mr_0((f.lc_2)(Object)this));
        v8.RR(new fe0_2((f.lc_2)(Object)this));
        v1.RR(new ja_1((f.lc_2)(Object)this));

        le0_2[] arr = new le0_2[] {
            v1, v3, v5, v8, v2, v6, v7, v9, v4
        };
        x40(hb(arr));
        le0_2[] arr2 = new le0_2[] {
            v1, v3, v5, v8, v2, v6, v7, v9, v4
        };
        WQ(C7(arr2));
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT()) {
            int i = i70_0Var.finally$;
            rp_0 rp_0Var = rp_0.I90;
            int unused = dw_2.ff;
            if (rp_0Var != null && rp_0Var.Ov(i)) {
                Uz(-1, true);
                return true;
            }
            int i2 = i70_0Var.finally$;
            rp_0 rp_0Var2 = rp_0.Ni;
            if (rp_0Var2 != null && rp_0Var2.Ov(i2)) {
                Uz(1, true);
                return true;
            }
            int i3 = i70_0Var.finally$;
            rp_0 rp_0Var3 = rp_0.nK0;
            if (rp_0Var3 != null && rp_0Var3.Ov(i3)) {
                f00();
                return true;
            }
        }
        return super.nd0(i70_0Var);
    }

    @Override
    public final void a80(Jn0 jn0) {
        oY(this.XA0, 37);
    }

    @Override
    public final void K8() {
        super.K8();
        lt0();
        E40(this.K20.cz() - this.Mx, this.K20.VM() - this.OB);
    }
}
