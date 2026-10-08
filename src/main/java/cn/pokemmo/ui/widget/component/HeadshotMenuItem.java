package cn.pokemmo.ui.widget.component;

import f.E90;
import f.TJ0;
import f.Vt0;
import f.le0_2;

public abstract class HeadshotMenuItem extends Vt0 {
    public final E90 wE0;

    public HeadshotMenuItem(E90 v1) {
        super(v1.na0());
        this.wE0 = v1;
    }

    public HeadshotMenuItem(E90 v1, String v2) {
        super(v2);
        this.wE0 = v1;
    }

    public abstract le0_2 pl0(TJ0 v1, int i2);
}
