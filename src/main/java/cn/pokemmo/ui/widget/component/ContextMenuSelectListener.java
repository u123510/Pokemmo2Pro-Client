package cn.pokemmo.ui.widget.component;

import f.GR;
import f.Qy0;
import f.UA;
import f.Vt0;
import f.dp_2;
import f.i70_0;
import f.vl_0;
import f.we0_0;

public class ContextMenuSelectListener implements dp_2 {
    public final vl_0 oK0;

    public ContextMenuSelectListener(vl_0 var1) {
        this.oK0 = var1;
    }

    @Override
    public void H90() {
    }

    @Override
    public void oj0(int var1, i70_0 var2) {
        if (var1 >= 0) {
            we0_0 var3 = this.oK0.jP;
            if (var1 < var3.Dx0) {
                GR var4 = var3.Fp0.hu0[var1];
                Vt0 var5 = Qy0.yI0.KC(var2.f8, var2.AN, var4.QB0.DR);
                UA.rL(var5, this.oK0, var2.f8, var2.AN);
            }
        }
    }

    @Override
    public void CH() {
    }
}
