/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.util.pool;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.util.pool.BaseObjectPool;

import f.Zn0;
import f.ju_0;

public class Matrix4Pool extends BaseObjectPool {
    @Override
    public final Object newObject() {
        return new Zn0();
    }
}

