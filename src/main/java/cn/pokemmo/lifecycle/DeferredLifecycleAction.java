package cn.pokemmo.lifecycle;

import f.X6;
import f.p6_0;
import f.qj_0;

public class DeferredLifecycleAction extends qj_0 {
    public final p6_0 tn0;

    public DeferredLifecycleAction(X6 x6, X6 x62) {
        super(x62);
        this.tn0 = x6;
    }

    @Override
    public void LPt7() {
        X6 x6 = (X6) this.tn0;
        x6.Bd(x6.t);
        ((p6_0) x6).lK0.Md0();
    }
}
