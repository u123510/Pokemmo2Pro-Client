package cn.pokemmo.text;

import f.ce0_0;
import f.tx_1;

public class PlayerSearchFilterPredicate {
    public boolean hx0 = false;
    public String Kj0 = "";

    public boolean iH0(ce0_0 ce0_02) {
        if (this.hx0 && !ce0_02.mo0) {
            return false;
        }
        return this.Kj0.isEmpty() || tx_1.qp0(ce0_02.oV().DR, this.Kj0);
    }
}
