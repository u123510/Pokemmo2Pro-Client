package cn.pokemmo.ui.client;

import f.ee_1;
import f.tq_0;
import f.v10_0;
import java.beans.PropertyChangeEvent;

public class BoundPropertyChangeListener extends ee_1 {
    public final v10_0 Lc;

    public BoundPropertyChangeListener(v10_0 v1) {
        super(v1);
        this.Lc = v1;
    }

    @Override
    public void propertyChange(PropertyChangeEvent v1) {
        this.a40();
        ((tq_0) this.ER).Hs(this.Lc.MF0);
    }
}
