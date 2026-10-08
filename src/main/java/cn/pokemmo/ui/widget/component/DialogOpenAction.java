package cn.pokemmo.ui.widget.component;

import f.GL;
import f.db0_1;
import f.eg0_0;
import f.gw_0;
import f.lg_0;

public class DialogOpenAction implements gw_0 {
    public final db0_1 LPT5;

    public DialogOpenAction(db0_1 v1) {
        this.LPT5 = v1;
    }

    public void lS() {
        eg0_0 eg = this.LPT5.Nc0;
        try {
            java.lang.reflect.Field f = eg0_0.class.getDeclaredField("dm0");
            f.setAccessible(true);
            f.get(null);
        } catch (Throwable ignored) {}
        eg.getClass();
        lg_0.k.lPT5(new GL(eg));
    }

    public void em() {
    }
}
