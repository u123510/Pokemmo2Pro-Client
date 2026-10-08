package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class VerticalBoxContainerLayout extends BaseLayoutBox {
    public final es_1 CZ;

    public VerticalBoxContainerLayout() {
        this.CZ = new es_1(le0_2.class);
        this.uf("dialoglayout");
        this.x40(this.H10());
        this.WQ(this.lo0());
    }

    @Override
    public final String Ck() {
        return "rowdialoglayout";
    }

    public final void ps() {
        if (this.CZ.isEmpty()) {
            return;
        }
        le0_2[] children = (le0_2[]) this.CZ.Mo0(this.CZ.rZ.getClass().getComponentType());
        this.qG0(children);
        this.CZ.clear();
    }

    public final void qG0(le0_2... children) {
        this.L4.X20(this.hb(children));
        this.pJ0.X20(this.C7(children));
    }

    @Override
    public final void em() {
        super.em();
        this.x40(new I7(this));
        this.WQ(new Hm0(this));
    }
}
