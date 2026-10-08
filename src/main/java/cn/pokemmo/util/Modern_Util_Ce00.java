package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.ce0_0
 */
public class Modern_Util_Ce00
implements wp_0,
Comparable {

    public final CH0 YX;
    public pg0_0 qf0;
    public final int ED;
    public boolean mo0;
    public cd0_2 GG0 = null;

    public Modern_Util_Ce00(CH0 cH0, pg0_0 pg0_02, int n) {
        this.YX = cH0;
        this.qf0 = pg0_02;
        this.ED = n;
    }

    @Override
    public final CH0 eU() {
        return this.YX;
    }

    @Override
    public final cd0_2 oV() {
        return this.GG0;
    }

    @Override
    public final void pD(cd0_2 cd0_22) {
        this.GG0 = cd0_22;
    }

    public final int compareTo(Object object) {
        object = (ce0_0)object;
        int n = ((ce0_0)object).mo0 ? 100 : 0;
        int n2 = n + ((ce0_0)object).qf0.b8;
        n = this.mo0 ? 100 : 0;
        return n2 - (n + this.qf0.b8);
    }
}


