package cn.pokemmo.ui.widget.model;

import f.J4;
import f.O7;
import f._else;
import f.g2_0;
import f.tw0_0;
import f.yt_1;

public class GameOptionConditionPredicateA implements g2_0 {
    public final O7 rF0;

    public GameOptionConditionPredicateA(O7 v1) {
        this.rF0 = v1;
    }

    @Override
    public boolean H2(boolean i1, int i2) {
        yt_1 yt = tw0_0.e60;
        if (yt != null && yt.N60() != null) {
            _else el = tw0_0.e60.N60();
            if (J4.p5(el.Bm0, el.case$) == this.rF0.mu0.gq0()) {
                return this.rF0.qk0;
            }
        }
        return false;
    }
}
