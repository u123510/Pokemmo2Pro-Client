package cn.pokemmo.ui.widget.model;

import f.J4;
import f.LW;
import f._else;
import f.cl0_1;
import f.g2_0;
import f.tw0_0;
import f.yt_1;

public class ViewportOptionConditionPredicate implements g2_0 {
    public final cl0_1 ws0;

    public ViewportOptionConditionPredicate(cl0_1 v1) {
        this.ws0 = v1;
    }

    @Override
    public boolean H2(boolean i1, int i2) {
        yt_1 e60 = tw0_0.e60;
        if (e60 != null && e60.N60() != null) {
            _else n60 = tw0_0.e60.N60();
            if (J4.p5(n60.Bm0, n60.case$) == this.ws0.gq0()) {
                return !LW.LH0(this.ws0.a2.y, this.ws0.hm0.y);
            }
        }
        this.ws0.stop();
        return false;
    }
}
