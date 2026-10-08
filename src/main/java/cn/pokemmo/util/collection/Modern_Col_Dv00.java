package cn.pokemmo.util.collection;

import f.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 现代化重构类 - 原始混淆类: f.dv0_0
 */
public class Modern_Col_Dv00 {

    public final a80_0[] NUL;
    public final a80_0 Tw0;
    public final AtomicBoolean tt = new AtomicBoolean(false);

    public Modern_Col_Dv00(long l, xo_1 xo_12) {
        co0[] co0Array = xo_12.je0();
        this.NUL = new a80_0[co0Array.length - 1];
        for (int j = 1; j < co0Array.length; ++j) {
            this.NUL[j - 1] = new a80_0(co0Array[j]);
        }
        this.Tw0 = new a80_0(co0Array[0]);
    }
}


