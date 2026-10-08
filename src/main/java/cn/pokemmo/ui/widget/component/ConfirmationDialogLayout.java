package cn.pokemmo.ui.widget.component;

import f.dg0_0;
import f.dw_2;
import f.i70_0;
import f.rp_0;
import f.tw0_0;

public class ConfirmationDialogLayout extends dg0_0 {
    public ConfirmationDialogLayout() {
    }

    @Override
    public void Ol0() {
        super.Ol0();
        if (tw0_0.kz0()) {
            this.W10.E40(this.W10.A20, this.SB0 + this.y9 + 8);
            this.Xt.E40(this.Xt.A20, this.SB0 + this.y9 + 8);
            this.C5.E40(this.C5.A20, this.SB0 + this.y9 + 8);
        }
    }

    @Override
    public boolean BT(i70_0 var1) {
        if (var1.iT()) {
            int var2 = var1.finally$;
            rp_0 var3 = rp_0.sJ0;
            int var10000 = dw_2.ff;
            if (var3 != null && var3.Ov(var2)) {
                Runnable var4 = this.Nj;
                if (var4 != null) {
                    var4.run();
                }
                return true;
            }
        }
        return false;
    }
}
