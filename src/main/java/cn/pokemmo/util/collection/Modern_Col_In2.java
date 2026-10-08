package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.in_2
 */
public class Modern_Col_In2 {

    public int iA;
    public long ar = 0L;

    public Modern_Col_In2(int n) {
        this.iA = Math.toIntExact(n);
    }

    public final synchronized boolean ty0() {
        if (System.currentTimeMillis() < this.ar) {
            return false;
        }
        this.ar = System.currentTimeMillis() + (long)this.iA;
        return true;
    }

    public final boolean fy() {
        if (System.currentTimeMillis() < this.ar) {
            return false;
        }
        this.ar = System.currentTimeMillis() + (long)this.iA;
        return true;
    }

    public final in_2 ng0() {
        this.ar = System.currentTimeMillis() + (long)this.iA;
        return (in_2)this;
    }

    public final String toString() {
        return "MS Left: " + (this.ar - System.currentTimeMillis());
    }
}


