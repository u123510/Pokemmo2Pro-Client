package cn.pokemmo.ui.layout.twl;

import f.Ou0;
import f.gw_0;
import f.k70_0;

public class LayoutToggleAction implements gw_0 {
    public final k70_0 hF0;
    public final Ou0 TQ;

    public LayoutToggleAction(k70_0 k70_0, Ou0 ou0) {
        this.hF0 = k70_0;
        this.TQ = ou0;
    }

    @Override
    public void lS() {
        this.hF0.y50.sj0(this.TQ, true);
    }

    @Override
    public void em() {
    }
}
