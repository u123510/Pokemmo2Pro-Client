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

/*
 * Renamed from f.dW
 */
public class BoundingBoxPool extends BaseObjectPool {
    public BoundingBoxPool() {
        super(16);
    }

    @Override
    public final Object newObject() {
        return new es_1(false, 100);
    }
}

