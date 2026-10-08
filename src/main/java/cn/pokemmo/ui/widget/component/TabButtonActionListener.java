package cn.pokemmo.ui.widget.component;

import f.ak0_2;
import f.i70_0;
import f.lpt6__0;
import f.tf_1;

public class TabButtonActionListener extends ak0_2 {
    public final int Lc;
    public final tf_1 EJ0;

    public TabButtonActionListener(tf_1 tf_1, int i, int j, int k) {
        super("--", i, j);
        this.EJ0 = tf_1;
        this.Lc = k;
    }

    @Override
    public boolean nd0(i70_0 i70_0) {
        if (i70_0.zu == 1) {
            lpt6__0.v90(this);
            this.EJ0.nm0 = this.Lc;
        }
        return super.nd0(i70_0);
    }
}
