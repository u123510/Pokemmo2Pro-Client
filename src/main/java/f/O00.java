package f;

import cn.pokemmo.util.math.FastRandom;

/**
 * 兼容垫片 (Shim) - 高性能伪随机数生成器 (Fast Pseudo-Random)
 * 实际实现已迁移至 {@link FastRandom}
 */
public final class O00 extends FastRandom {
    public O00() { super(); }
    public O00(long l) { super(l); }
    public O00(long l, long l2) { super(l, l2); }
}
