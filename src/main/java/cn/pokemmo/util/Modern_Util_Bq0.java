package cn.pokemmo.util;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.bq_0
 */
public class Modern_Util_Bq0 extends ak0_2 {

    public final b30_0 Nu0;
    public final int lt;
    public final ML0 sz0;

    public Modern_Util_Bq0(ML0 sz0, String name, int x, int y, b30_0 Nu0, int lt) {
        super(name, x, y);
        this.sz0 = sz0;
        this.Nu0 = Nu0;
        this.lt = lt;
    }

    @Override
    public final void hs() {
        ML0 mL0 = this.sz0;
        if (mL0.r7) {
            mL0.H20.clear();
            this.sz0.H20.add(this.Nu0);
        }
    }

    @Override
    public final boolean nd0(i70_0 input) {
        if (input.zu == 1) {
            lpt6__0.v90(this);
            this.sz0.tG0 = this.lt;
        }
        return super.nd0(input);
    }
}


