package cn.pokemmo.ui.widget.component;

import f.ML0;
import f.ak0_2;
import f.b30_0;
import f.i70_0;
import f.lpt6__0;

public class FilterRadioButtonActionListener extends ak0_2 {
    public final ML0 OO;
    public final b30_0 At;
    public final byte sQ;

    public FilterRadioButtonActionListener(ML0 v1, int i2, int i3, b30_0 v4, byte i5) {
        super("", i2, i3);
        this.OO = v1;
        this.At = v4;
        this.sQ = i5;
    }

    public void hs() {
        if (this.OO.r7) {
            this.OO.H20.clear();
            this.OO.H20.add(this.At);
        }
    }

    @Override
    public boolean nd0(i70_0 v1) {
        if (v1.zu == 1) {
            lpt6__0.v90(this);
            this.OO.tG0 = this.sQ;
        }
        return super.nd0(v1);
    }
}
