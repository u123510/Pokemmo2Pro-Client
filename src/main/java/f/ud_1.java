package f;

import cn.pokemmo.collection.wrapper.RankedSortingOptions;
import java.util.Comparator;

public final class ud_1 extends RankedSortingOptions {
    public static final ud_1 po;
    public static final ud_1[] cl0;

    public ud_1(int i1, Comparator v2) {
        super(i1, v2);
    }

    static {
        ud_1 v0 = new ud_1(0, ss_0.WR);
        ud_1 v1 = new ud_1(1, ef_1.native$);
        ud_1 v2 = new ud_1(2, n80.CoM4);
        po = v2;
        cl0 = new ud_1[] { v0, v1, v2 }.clone();
        RankedSortingOptions.po = po;
        RankedSortingOptions.cl0 = cl0;
    }
}
