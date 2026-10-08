package cn.pokemmo.ui.layout.twl;

import f.LJ0;
import f.ZO;
import f.ql_0;
import f.vx_2;

public class PaddedWidgetContainer extends ZO {
    public final vx_2 Ee;

    public PaddedWidgetContainer(LJ0 owner) {
        super(owner);
        this.Ee = new vx_2();
        ql_0 bounds = this.Ee.K3;
        int padding = owner.Pp;
        bounds.j80 = padding;
        bounds.Wm0 = padding;
        bounds.IA = owner.Tx - padding * 2;
        bounds.Eu0 = owner.NZ - padding * 2;
    }
}
