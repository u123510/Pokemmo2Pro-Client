package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.jx_2
 */
public class Modern_Util_Jx2 {

    public final tu_0 RD;
    public final int zl;
    public final int qK;

    public Modern_Util_Jx2(tu_0 tu_02, int n, int n2) {
        this.RD = tu_02;
        this.zl = n;
        this.qK = n2;
    }

    public final boolean Be() {
        int n = (int)(System.currentTimeMillis() / 1000L);
        return n < this.qK && n >= this.zl;
    }
}


