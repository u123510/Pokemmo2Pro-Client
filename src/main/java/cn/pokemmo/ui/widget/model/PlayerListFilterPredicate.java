package cn.pokemmo.ui.widget.model;

import f.GR;
import f.tx_1;

public class PlayerListFilterPredicate {
    public boolean Tk = false;
    public String Ae = "";

    public boolean matches(GR gR) {
        if (this.Tk && !gR.qc) {
            return false;
        }
        return this.Ae.isEmpty() || tx_1.qp0(gR.oV().DR, this.Ae);
    }

    public boolean RZ(GR gR) {
        return matches(gR);
    }
}
