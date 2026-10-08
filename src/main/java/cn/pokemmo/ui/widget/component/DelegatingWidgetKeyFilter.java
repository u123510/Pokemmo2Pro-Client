package cn.pokemmo.ui.widget.component;

import f.E00;
import f.S70;
import f.i70_0;
import f.ng_2;

public class DelegatingWidgetKeyFilter extends S70 {
    public final ng_2 fH0;

    public DelegatingWidgetKeyFilter(ng_2 var1) {
        super(235, 230, 0);
        this.fH0 = var1;
    }

    public boolean nd0(i70_0 var1) {
        int i = var1.zu;
        return E00.C10(var1.zu) && i == 5 ? super.nd0(var1) : this.fH0.nd0(var1);
    }
}
