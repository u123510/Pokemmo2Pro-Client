package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.tu_2
 */
public class Modern_Col_tu_2 {

    public final int bs;
    public final byte tk;
    public final byte he;

    public Modern_Col_tu_2(byte by, byte by2, int n) {
        this.bs = n;
        this.tk = by;
        this.he = by2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof tu_2)) {
            return false;
        }
        object = (tu_2)object;
        return this.bs == ((tu_2)object).bs && this.tk == ((tu_2)object).tk && this.he == ((tu_2)object).he;
    }

    public final int hashCode() {
        return (this.bs * 31 + this.tk) * 31 + this.he;
    }

    public final String toString() {
        return tu_2.class.getSimpleName() + tx_1.kI0(this);
    }
}


