package cn.pokemmo.ui.widget.model;

import f.CJ;
import f.J4;
import f._else;
import f.g2_0;
import f.pd0_1;
import f.tw0_0;
import f.yt_1;

public class GameOptionConditionPredicateD implements g2_0 {
    public final CJ h6;
    public final pd0_1 Wh0;

    public GameOptionConditionPredicateD(CJ v1, pd0_1 v2) {
        this.h6 = v1;
        this.Wh0 = v2;
    }

    @Override
    public boolean H2(boolean i1, int i2) {
        yt_1 yt = tw0_0.e60;
        if (yt != null && yt.N60() != null) {
            _else el = tw0_0.e60.N60();
            if (J4.p5(el.Bm0, el.case$) == this.h6.eH0.gq0()) {
                return this.Wh0.JI != 0;
            }
        }
        return false;
    }
}
