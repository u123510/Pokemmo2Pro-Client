/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.pool;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.util.pool.BaseObjectPool;

import f.U4;
import f.ju_0;

/*
 * Renamed from f.cOM7
 */
public class ColorPool extends BaseObjectPool {
    @Override
    public final Object newObject() {
        return new U4();
    }
}

