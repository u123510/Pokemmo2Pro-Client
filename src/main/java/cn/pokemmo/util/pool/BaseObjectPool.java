package cn.pokemmo.util.pool;

import f.ju_0;

/**
 * BaseObjectPool - 客户端高频内存对象复用池抽象基类
 * 封装对象回收池化机制，避免高频粒子、向量和数学运算对象频繁触发 GC。
 */
public abstract class BaseObjectPool extends ju_0 {

    public BaseObjectPool() {
        super();
    }

    public BaseObjectPool(int initialCapacity) {
        super(initialCapacity);
    }

    public BaseObjectPool(int initialCapacity, int maximumCapacity) {
        super(initialCapacity, maximumCapacity);
    }
}
