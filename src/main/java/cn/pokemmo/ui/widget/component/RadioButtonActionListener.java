package cn.pokemmo.ui.widget.component;

import f.G20;
import f.ML0;
import f.i70_0;
import f.lpt6__0;

public class RadioButtonActionListener extends G20 {
    public final int uq;
    public final ML0 iY;

    public RadioButtonActionListener(ML0 ml0, int i) {
        super("", "");
        this.iY = ml0;
        this.uq = i;
    }

    @Override
    public boolean nd0(i70_0 i70_0) {
        if (i70_0.zu == 1) {
            lpt6__0.v90(this);
            this.iY.tG0 = this.uq;
        }
        return super.nd0(i70_0);
    }
}
