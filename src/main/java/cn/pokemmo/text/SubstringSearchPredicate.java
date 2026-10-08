package cn.pokemmo.text;

import f.e70_0;
import f.tx_1;

public class SubstringSearchPredicate {
    public String mi0 = "";

    public boolean matches(e70_0 e70_02) {
        return this.mi0.isEmpty() || tx_1.qp0(e70_02.zJ0, this.mi0);
    }

    public boolean wM(e70_0 e70_02) {
        return matches(e70_02);
    }
}
