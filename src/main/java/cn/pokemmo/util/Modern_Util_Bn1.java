package cn.pokemmo.util;

import f.*;


/**
 * 现代化重构类 - 原始混淆类: f.bn_1
 */
public class Modern_Util_Bn1  {

    public final int mH;
    public final byte[] qo0;
    public final int[] wH0;

    public Modern_Util_Bn1(int n) {
        this.mH = n;
        this.qo0 = new byte[n * 2304];
        this.wH0 = new int[n];
        this.Ga();
    }

    public final byte[] Io0() {
        return this.qo0;
    }

    public final int Ga() {
        int n;
        // bn_1 bn_12 = this;
        // bn_1 bn_13 = bn_12;
        int n2 = this.mH - 1;
        try {
            n2 = this.wH0[n2] - n2 * 2;
            n = 0;
        }
        catch (Throwable throwable) {
            int n3 = 0;
            while (n3 < this.mH) {
                int n4 = n3++;
                this.wH0[n4] = n4 * 2;
            }
            throw throwable;
        }
        while (n < this.mH) {
            int n5 = n++;
            this.wH0[n5] = n5 * 2;
        }
        return n2;
    }
}


