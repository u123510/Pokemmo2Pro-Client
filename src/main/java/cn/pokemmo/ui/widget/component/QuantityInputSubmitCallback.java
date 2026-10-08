package cn.pokemmo.ui.widget.component;

import f.HD0;
import f.K5;
import f.LW;
import f.O00;
import f.jc_2;
import f.uw_0;

public class QuantityInputSubmitCallback implements uw_0 {
    public final HD0 oQ;
    public final K5 Hh;

    public QuantityInputSubmitCallback(HD0 v1, K5 v2) {
        this.oQ = v1;
        this.Hh = v2;
    }

    @Override
    public void Q(int i1) {
        jc_2 jc = (jc_2) this.oQ.K20;
        K5 k = this.Hh;
        O00 dummy = LW.Yu;
        if (i1 < 1) {
            i1 = 1;
        } else if (i1 > 9999) {
            i1 = 9999;
        }
        jc.NUL(k, (short) i1);
    }

    @Override
    public void run() {}
}
