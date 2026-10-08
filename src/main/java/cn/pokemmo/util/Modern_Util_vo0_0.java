package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.vo0_0
 */
public abstract class Modern_Util_vo0_0 {

    public final Object sj0;
    public final int iY;
    public final int lpt6;
    public final String J2;

    public Modern_Util_vo0_0(Object object, int n, int n2, String string) {
        this.sj0 = object;
        this.iY = n;
        this.lpt6 = n2;
        if (string.length() > 100) {
            string = string.substring(0, 99);
        }
        this.J2 = string;
    }

    public abstract DG Bx0();

    public final int Fs() {
        return this.iY;
    }

    public final int Ry() {
        return this.lpt6;
    }

    public final String K00() {
        return this.J2;
    }
}


