package cn.pokemmo.ui.widget.component;

import f.ML0;
import f.ak0_2;
import f.i70_0;
import f.lpt6__0;

public class ByteTabButtonActionListener extends ak0_2 {
    public final byte A3;
    public final ML0 Lj0;

    public ByteTabButtonActionListener(ML0 ml0, String str, int i, int j, byte b) {
        super(str, i, j);
        this.Lj0 = ml0;
        this.A3 = b;
    }

    @Override
    public boolean nd0(i70_0 i70_0) {
        if (i70_0.zu == 1) {
            lpt6__0.v90(this);
            this.Lj0.tG0 = this.A3;
        }
        return super.nd0(i70_0);
    }
}
