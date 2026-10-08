package f;

import cn.pokemmo.ui.widget.component.HeadshotMenuItem;
import f.E90;
import f.TJ0;
import f.di_0;
import f.le0_2;

public final class ps_1 extends HeadshotMenuItem {
    public ps_1(E90 v1) {
        super(v1);
    }

    public ps_1(E90 v1, String v2) {
        super(v1, v2);
    }

    @Override
    public final le0_2 pl0(TJ0 v1, int i2) {
        di_0 di0 = new di_0(this, v1, i2, this.wE0);
        String f0 = this.F0;
        if (f0 != null) {
            di0.uf(f0);
        } else {
            di0.uf("headshot-menu-button");
        }
        return di0;
    }
}
