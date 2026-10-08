package cn.pokemmo.ui.widget.model;

import f.Hy0;
import f.J4;
import f._else;
import f.g2_0;
import f.tw0_0;
import f.yt_1;

public class GameOptionConditionPredicateB implements g2_0 {
    public final Hy0 Com9;

    public GameOptionConditionPredicateB(Hy0 v1) {
        this.Com9 = v1;
    }

    @Override
    public boolean H2(boolean i1, int i2) {
        yt_1 yt = tw0_0.e60;
        if (yt != null && yt.N60() != null) {
            _else el = tw0_0.e60.N60();
            if (J4.p5(el.Bm0, el.case$) == this.Com9.eM0.gq0()) {
                return this.Com9.p30.continue$;
            }
        }
        return false;
    }
}
