package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.ww_2
 */
public class Modern_Col_ww_2 {

    public final Oq[] lpt9;
    public final MD0[] Y4;
    public final short[] BB0;

    public Modern_Col_ww_2(Oq ... oqArray) {
        this.lpt9 = oqArray;
        this.Y4 = null;
        this.BB0 = null;
    }

    public final int X30() {
        return this.lpt9.length;
    }

    public final int Cy(rb_1 rb_12) {
        int n;
        if (this.Y4 != null) {
            int n2 = 0;
            do {
                if (rb_12 != null && rb_12.t5(this.Y4[n2 >> 1])) continue;
                ++n2;
            } while ((n2 = this.BB0[n2]) >= 0);
            return n2 & Short.MAX_VALUE;
        }
        int n3 = this.lpt9.length;
        for (n = 0; n < n3 && !this.lpt9[n].mk0(rb_12); ++n) {
        }
        return n;
    }
}


