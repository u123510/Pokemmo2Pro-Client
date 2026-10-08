package cn.pokemmo.ui.widget.component;

import f.Br0;
import f.E7;
import f.Jn0;
import f.W9;
import f.pa0_0;
import f.xe_1;
import f.zk0_1;

public class DynamicProgressBar extends W9 {
    public final Br0 Hx0;

    public DynamicProgressBar(E7 v1) {
        super(v1);
        Br0 br0 = new Br0(this);
        this.Hx0 = br0;
        pa0_0 pa = pa0_0.xE;
        br0.Gy0(14, 1);
    }

    @Override
    public void Ib(Jn0 v1) {
        super.Ib(v1);
        pa0_0 pa = pa0_0.xE;
    }

    public int zs0() {
        return this.Ob();
    }

    public int pi0() {
        return this.hr0();
    }

    public void K8() {
    }

    public void Dw0(zk0_1 v1) {
        boolean t5 = this.M.t5(xe_1.Cd);
        this.Hx0.oC0(t5 ? 1 : 0);
    }
}
