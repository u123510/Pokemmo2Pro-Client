package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.N60
 */
public abstract class Modern_Util_N60 {

    public Modern_Util_N60() {
        super();
    }

    public long qI = System.currentTimeMillis();

    public abstract boolean lPt1();

    public abstract void ii();

    public abstract NU gJ0();

    public boolean NJ() {
        return System.currentTimeMillis() - this.qI > 90000L;
    }

    public void U40() {
        this.qI = System.currentTimeMillis();
    }

    public boolean gL0() {
        return this instanceof im0;
    }
}


