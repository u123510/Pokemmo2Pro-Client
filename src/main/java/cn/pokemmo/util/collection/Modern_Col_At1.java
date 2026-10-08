package cn.pokemmo.util.collection;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.at_1
 */
public class Modern_Col_At1
extends i4_0 {

    public Modern_Col_At1(int[] nArray, int n, int n2, ix0_0 ix0_02) {
        super(n, n2, ix0_02);
        for (int j = 0; j < n2; ++j) {
            for (int k = 0; k < n; ++k) {
                int n3 = nArray[j * n + k];
                this.oZ(k, j, n3 >> 24 & 0xFF | n3 << 8 & 0xFFFFFF00);
            }
        }
    }
}


