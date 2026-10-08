package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Io0
 */
public class Modern_Col_Io0
extends TA {

    public Modern_Col_Io0() {
        super();
    }

    @Override
    public final int rJ(w90_0 w90_02, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (int j = 0; j < n; ++j) {
            if (nArray[j] == 0) continue;
            int n3 = n2 + 1;
            fArray[n2] = fArray[j];
            n2 = n3;
        }
        if (n2 != 0) {
            return TA.l00(w90_02, object, fArray, n2, 1);
        }
        return 0;
    }
}


