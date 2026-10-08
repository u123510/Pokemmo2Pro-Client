package cn.pokemmo.ui.widget.model;

import f.J4;
import f._else;
import f.g2_0;
import f.rf_1;
import f.tw0_0;
import f.yt_1;

public class GameOptionConditionPredicateC implements g2_0 {
    public final rf_1 C3;

    public GameOptionConditionPredicateC(rf_1 state) {
        this.C3 = state;
    }

    @Override
    public boolean H2(boolean ignored, int ignoredIndex) {
        yt_1 current = tw0_0.e60;
        if (current != null && current.N60() != null) {
            _else mode = current.N60();
            if (J4.p5(mode.Bm0, mode.case$) == this.C3.gq0()) {
                return this.C3.j90;
            }
        }
        return false;
    }
}
