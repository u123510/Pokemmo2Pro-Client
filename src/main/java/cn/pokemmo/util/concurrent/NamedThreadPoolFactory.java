package cn.pokemmo.util.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadPoolFactory implements ThreadFactory {
    public final int nx0;
    public final String kz0;
    public final AtomicInteger Nv;
    public final ThreadGroup Jx;

    public NamedThreadPoolFactory() {
        this.Nv = new AtomicInteger(1);
        this.nx0 = 5;
        this.kz0 = "ThreadPool";
        this.Jx = new ThreadGroup("ThreadPool");
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.Jx, runnable);
        thread.setName(new StringBuilder(this.kz0).append('-').append(this.Nv.getAndIncrement()).toString());
        thread.setPriority(this.nx0);
        return thread;
    }
}
