package f;

import cn.pokemmo.util.concurrent.AsyncLoadingExecutor;

/**
 * 兼容垫片 (Shim) - 异步资源加载线程池执行器
 * 核心逻辑已迁移至 cn.pokemmo.util.concurrent.AsyncLoadingExecutor
 */
public final class rv_0 extends AsyncLoadingExecutor {
    public rv_0(int threads) {
        super(threads);
    }

    public rv_0(int threads, String name) {
        super(threads, name);
    }
}
