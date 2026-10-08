package cn.pokemmo.ui.widget.model;

import f.E90;
import f.J4;
import f.JY;
import f._else;
import f.bi0_1;
import f.g2_0;
import f.tw0_0;
import f.yt_1;

public class GameOptionConditionPredicateE implements g2_0 {
    public final JY bz0;
    public final bi0_1 K80;

    public GameOptionConditionPredicateE(JY v1, E90 v2) {
        this.bz0 = v1;
        this.K80 = v2;
    }

    @Override
    public boolean H2(boolean i1, int i2) {
        yt_1 yt = tw0_0.e60;
        if (yt != null && yt.N60() != null) {
            _else el = tw0_0.e60.N60();
            if (J4.p5(el.Bm0, el.case$) == this.bz0.yf0.gq0()) {
                return this.bz0.ir == this.K80;
            }
        }
        return false;
    }
}
