package f;

import cn.pokemmo.util.pool.ReflectionObjectPool;

public class bk0_0 extends ReflectionObjectPool {
    public bk0_0(Class type) {
        super(type);
    }
    public bk0_0(Class type, int initialCapacity) {
        super(type, initialCapacity);
    }
    public bk0_0(Class type, int initialCapacity, int maximumCapacity) {
        super(type, initialCapacity, maximumCapacity);
    }
}
