package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.fg_1
 */
public class Modern_Util_Fg1
extends G40 {

    public final long XA;
    public final /* synthetic */ jn_0 K9;

    public Modern_Util_Fg1(jn_0 jn_02, long l) {
        this.K9 = jn_02;
        this.XA = System.currentTimeMillis() + l;
    }

    @Override
    public final void zR() {
        this.K9.js();
    }

    @Override
    public final byte tQ() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean Ob0() {
        return System.currentTimeMillis() >= this.XA;
    }
}


