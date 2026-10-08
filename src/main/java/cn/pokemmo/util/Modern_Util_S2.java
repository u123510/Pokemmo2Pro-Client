package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.S2
 */
public abstract class Modern_Util_S2 {

    public final boolean[] Ku0;
    public final boolean[] Ae;
    public final z5 Sp0 = new z5();
    public int pM;
    public boolean com1;

    public Modern_Util_S2() {
        this.Ku0 = new boolean[256];
        this.Ae = new boolean[256];
    }

    public final boolean eC0(int n) {
        if (n == -1) {
            return this.pM > 0;
        }
        if (n >= 0 && n <= 255) {
            return this.Ku0[n];
        }
        return false;
    }

    public final boolean nI0(int n) {
        if (n == -1) {
            return this.com1;
        }
        if (n >= 0 && n <= 255) {
            return this.Ae[n];
        }
        return false;
    }
}


