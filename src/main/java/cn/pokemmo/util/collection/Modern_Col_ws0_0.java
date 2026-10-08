package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.ws0_0
 */
public class Modern_Col_ws0_0 {

    public Modern_Col_ws0_0() {
        super();
    }

    public final long[] bD = new long[10];
    public int nu0 = 0;

    public final long wL0() {
        long[] lArray;
        long l = 0L;
        int n = 0;
        while (true) {
            lArray = this.bD;
            if (n >= this.bD.length) break;
            l += lArray[n];
            ++n;
        }
        return l / (long)lArray.length;
    }
}


