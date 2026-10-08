package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.dw0
 */
public class Modern_Util_Dw0 {

    public Modern_Util_Dw0() {
        super();
    }

    public int Xb0 = 0;
    public int HY = 0;
    public int pl = 0;
    public final int[] IH0 = new int[32768];

    public final int Z0(int n) {
        Modern_Util_Dw0 dw02 = this;
        dw02.HY += n;
        int n2 = 0;
        int n3 = dw02.pl;
        if (n3 + n < 32768) {
            while (true) {
                int n4 = n;
                n = n4 + -1;
                if (n4 > 0) {
                    n2 <<= 1;
                    int n5 = this.IH0[n3++] != 0 ? 1 : 0;
                    n2 |= n5;
                    continue;
                }
                break;
            }
        } else {
            while (true) {
                int n6 = n;
                n = n6 + -1;
                if (n6 <= 0) break;
                n2 <<= 1;
                int n7 = this.IH0[n3] != 0 ? 1 : 0;
                n2 |= n7;
                n3 = n3 + 1 & Short.MAX_VALUE;
            }
        }
        this.pl = n3;
        return n2;
    }

    public final int o8() {
        Modern_Util_Dw0 dw02 = this;
        ++dw02.HY;
        int n = this.pl;
        this.pl = n + 1 & Short.MAX_VALUE;
        return dw02.IH0[n];
    }
}


