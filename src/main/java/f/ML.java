package f;

import cn.pokemmo.graphics.math.MatrixBufferCollection;

/**
 * 兼容垫片 (Shim) - 渲染变换矩阵缓冲集合 (Matrix Buffer Collection)
 * 实际实现已迁移至 {@link MatrixBufferCollection}
 */
public final class ML extends MatrixBufferCollection {
    public ML() { super(); }
    public ML(lt_2[] lt_2Array, int n, boolean bl) {
        super(lt_2Array, n, bl);
    }
}
