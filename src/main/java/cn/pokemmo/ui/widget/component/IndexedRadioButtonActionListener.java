package cn.pokemmo.ui.widget.component;

import f.G20;
import f.i70_0;
import f.lpt6__0;
import f.u2_0;

public class IndexedRadioButtonActionListener extends G20 {
    public final int Tl;
    public final u2_0 ZD;

    public IndexedRadioButtonActionListener(u2_0 var1, int var2) {
        super("", "");
        this.ZD = var1;
        this.Tl = var2;
    }

    @Override
    public boolean nd0(i70_0 var1) {
        if (var1.zu == 1) {
            lpt6__0.v90(this);
            this.ZD.jO = this.Tl;
        }
        return super.nd0(var1);
    }
}
