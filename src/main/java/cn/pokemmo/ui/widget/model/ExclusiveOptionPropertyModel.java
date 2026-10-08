package cn.pokemmo.ui.widget.model;

import f.J2;
import f.ie0_1;
import f.nf0_0;
import f.rp_0;
import f.sm0_0;
import f.tw0_0;
import f.up_0;

public class ExclusiveOptionPropertyModel extends J2 {
    public final up_0 dy0;

    public ExclusiveOptionPropertyModel(up_0 var1, rp_0 var2) {
        super(var2);
        this.dy0 = var1;
    }

    @Override
    public void Xy0(int var1) {
        this.iL = var1;
        this.SU(tw0_0.iE.oO(var1, sm0_0.c0(nf0_0.Po)));

        up_0 var2 = this.dy0;
        if (var2 != null && var2.fj0 != null && !var2.Qi0()) {
            for (up_0 var3 : var2.fj0) {
                if (var3 != var2) {
                    ie0_1 var4 = var3.Ag;
                    if (var4.iL == var2.Ag.iL) {
                        var4.iL = 0;
                        var4.SU(tw0_0.iE.oO(0, sm0_0.c0(nf0_0.Po)));
                    }
                }
            }
        }
    }
}
