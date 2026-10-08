package cn.pokemmo.util.pool;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.util.pool.BaseObjectPool;

public class ReflectionObjectPool extends BaseObjectPool {
    public final I40 FJ;

    public ReflectionObjectPool(Class type) {
        this(type, 16, Integer.MAX_VALUE);
    }

    public ReflectionObjectPool(Class type, int initialCapacity) {
        this(type, initialCapacity, Integer.MAX_VALUE);
    }

    public ReflectionObjectPool(Class type, int initialCapacity, int maximumCapacity) {
        super(initialCapacity, maximumCapacity);
        this.FJ = zx(type);
        if (this.FJ == null) {
            throw new RuntimeException("Class cannot be created (missing no-arg constructor):".concat(type.getName()));
        }
    }

    public static I40 zx(Class type) {
        try {
            return rd_1.Vk0(type);
        } catch (Exception ignored) {
            try {
                return tryKl(type);
            } catch (ua_0 ignoredAgain) {
                return null;
            }
        }
    }

    private static I40 tryKl(Class type) throws ua_0 {
        I40 constructor = rd_1.kl(type, (Class[])null);
        constructor.cx.setAccessible(true);
        return constructor;
    }

    public final Object newObject() {
        try {
            return this.FJ.la((Object[])null);
        } catch (Exception exception) {
            throw new nf_1("Unable to create new instance:".concat(this.FJ.cx.getDeclaringClass().getName()), exception);
        }
    }
}


