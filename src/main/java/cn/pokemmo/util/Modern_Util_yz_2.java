package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.yz_2
 */
public class Modern_Util_yz_2 {

    public final int Ib;
    public final int import$;
    public int Xu = 0;

    public Modern_Util_yz_2(int n, int n2) {
        this.Ib = n;
        this.import$ = n2;
    }

    public final int uy0() {
        return this.Xu;
    }

    public final yz_2 lPt5(int n) {
        this.Xu = n;
        return (yz_2)this;
    }

    public final yz_2 Hu() {
        Modern_Util_yz_2 yz_22 = this;
        yz_22.Xu = rg0_2.r4(yz_22.import$);
        return (yz_2)yz_22;
    }

    public final int gZ() {
        return (int)((hk0_1.KG + (long)this.Xu) / (long)this.import$ % (long)this.Ib);
    }
}


