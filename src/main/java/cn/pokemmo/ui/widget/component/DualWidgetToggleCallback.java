package cn.pokemmo.ui.widget.component;

import f.KB;
import f.bb0_2;
import f.lo0_0;
import f.xe_1;

public class DualWidgetToggleCallback implements bb0_2 {
    public final lo0_0 pI0;

    public DualWidgetToggleCallback(lo0_0 v1) {
        this.pI0 = v1;
    }

    @Override
    public void oj() {
        KB nh0 = this.pI0.nh0;
        nh0.ax0.M.j70(xe_1.LPt7, true);
        nh0.RY.oj();
        KB g1 = this.pI0.g1;
        g1.ax0.M.j70(xe_1.LPt7, true);
        g1.RY.oj();
    }

    @Override
    public void Rw(int i1, int i2) {
        this.pI0.nh0.RY.Rw(i1, i2);
        this.pI0.g1.RY.Rw(i1, i2);
    }

    @Override
    public void zR() {
        this.pI0.nh0.ax0.M.j70(xe_1.LPt7, false);
        this.pI0.g1.ax0.M.j70(xe_1.LPt7, false);
    }
}
