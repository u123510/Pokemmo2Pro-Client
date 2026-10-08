package cn.pokemmo.ui.widget.component;

import f.K5;
import f.jc_2;
import f.uw_0;

public class QuantityInputDirectCallback implements uw_0 {
    public final jc_2 lpT3;
    public final K5 Ma0;

    public QuantityInputDirectCallback(jc_2 jc_2, K5 k5) {
        this.lpT3 = jc_2;
        this.Ma0 = k5;
    }

    @Override
    public void Q(int i) {
        int i1 = i;
        if (1 >= i1) {
            i1 = 1;
        } else if (i1 > 9999) {
            i1 = 9999;
        }
        this.lpT3.NUL(this.Ma0, (short) i1);
    }

    @Override
    public void run() {
    }
}
