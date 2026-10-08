package cn.pokemmo.util.concurrent;

import f.Y90;
import f.fy0_0;
import f.nf_1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 异步资源加载线程池执行器
 * 原始类: f.rv_0
 */
public class AsyncLoadingExecutor implements fy0_0 {
    public final ExecutorService pe0;

    public AsyncLoadingExecutor(int threads) {
        this(threads, "AsynchExecutor-Thread");
    }

    public AsyncLoadingExecutor(int threads, String name) {
        super();
        this.pe0 = Executors.newFixedThreadPool(threads, new Y90(name));
    }

    @Override
    public final void dispose() {
        this.pe0.shutdown();
        try {
            this.pe0.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException exception) {
            throw new nf_1("Couldn't shutdown loading thread", exception);
        }
    }
}
