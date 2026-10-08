package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.vt_1
 */
public class Modern_Util_vt_1
extends q3_0 {

    public int qk0 = 0;

    public Modern_Util_vt_1(B5 b5) {
        super(b5);
    }

    @Override
    public final void r0() {
        int n;
        int n2 = this.kl0;
        if (this.xP == n2 && (n = this.qk0) > 0) {
            this.bq0 = hk0_1.KG;
            int n3 = (n & 1) == 0 ? 150 : 0;
            this.xP = n3;
            this.e2 = n2;
            this.qk0 = n - 1;
        }
        super.r0();
    }
}


