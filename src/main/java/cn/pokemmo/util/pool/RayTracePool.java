/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.pool;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.util.pool.BaseObjectPool;

import f.es_1;
import f.ju_0;
import f.tb0_0;

/*
 * Renamed from f.dz0
 */
public class RayTracePool extends BaseObjectPool {
    public final tb0_0 uV(tb0_0 tb0_02, tb0_0 tb0_03, es_1 es_12, int n) {
        tb0_0 tb0_04 = (tb0_0)super.obtain();
        tb0_04.Zw0 = tb0_02;
        tb0_04.AL = tb0_03;
        tb0_04.S8 = es_12;
        tb0_04.gd = n;
        return tb0_04;
    }

    @Override
    public final Object newObject() {
        return new tb0_0();
    }
}

