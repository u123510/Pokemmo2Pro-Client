package cn.pokemmo.ui.widget.model;

import f.J4;
import f.OH0;
import f._else;
import f.g2_0;
import f.tw0_0;
import f.yt_1;

public class GameOptionConditionPredicateF implements g2_0 {
    public final OH0 ym;

    public GameOptionConditionPredicateF(OH0 v1) {
        this.ym = v1;
    }

    @Override
    public boolean H2(boolean i1, int i2) {
        yt_1 yt = tw0_0.e60;
        if (yt != null && yt.N60() != null) {
            _else el = tw0_0.e60.N60();
            if (J4.p5(el.Bm0, el.case$) == this.ym.gq0()) {
                if (this.ym.vh0 == this.ym.jz && this.ym.lPt3 == this.ym.qL) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
